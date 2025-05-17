package Farmacie.C14_Template_Method.clase;

import java.util.Map;

public abstract class TemplateAchizitie {
    protected Map<Medicament, Integer> stocFarmacie;
    protected Reteta reteta;

    public TemplateAchizitie(Map<Medicament, Integer> stocFarmacie) {
        this.stocFarmacie = stocFarmacie;
    }

    public final void achizitieReteta(Reteta reteta) {
        this.reteta = reteta;
        primesteReteta();
        if(verificaStoc()) {
            aduMedicamente();
            incaseazaBanii();
            actualizeazaStoc();
            emiteBonFiscal();
        } else {
            System.out.println("Nu se poate realiza achizitia in acest moment: stoc insuficient!");
        }
    }

    protected abstract void primesteReteta();
    protected abstract boolean verificaStoc();
    protected abstract void aduMedicamente();
    protected abstract void incaseazaBanii();
    protected abstract void actualizeazaStoc();
    protected abstract void emiteBonFiscal();
}
