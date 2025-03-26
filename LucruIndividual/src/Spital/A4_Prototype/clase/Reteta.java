package Spital.A4_Prototype.clase;

import java.util.Map;

public class Reteta extends AbstractReteta {
    public Reteta() {
        super();
    }

    public Reteta(String denumireMedicament, Map<String, Double> compozitieMedicament) {
        super(denumireMedicament, compozitieMedicament);
    }

    @Override
    public AbstractReteta clone() {
        Reteta reteta = new Reteta();
        reteta.setCompozitieMedicament(this.getCompozitieMedicament());
        reteta.setDenumireMedicament(this.getDenumireMedicament());
        return reteta;
    }
}
