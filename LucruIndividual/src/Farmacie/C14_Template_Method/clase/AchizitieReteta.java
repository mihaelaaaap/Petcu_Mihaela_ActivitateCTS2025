package Farmacie.C14_Template_Method.clase;

import java.util.Map;

public class AchizitieReteta extends TemplateAchizitie {
    public AchizitieReteta(Map<Medicament, Integer> stocFarmacie) {
        super(stocFarmacie);
    }

    @Override
    protected void primesteReteta() {
        System.out.println("Reteta a fost primita si contine " +
                reteta.getMedicamente().size() + " medicamente");
    }

    @Override
    protected boolean verificaStoc() {
        for (Map.Entry<Medicament, Integer> entry : reteta.getMedicamente().entrySet()) {
            Medicament medicament = entry.getKey();
            int cantitateCeruta = entry.getValue();
            int cantitateDisponibila = stocFarmacie.getOrDefault(medicament, 0);
            if (cantitateDisponibila < cantitateCeruta) {
                System.out.println("Stoc insuficient pentru " + medicament.getDenumire() +
                        " (cantitate disponibila: " + cantitateDisponibila + " buc.)");
                return false;
            }
        }
        return true;
    }

    @Override
    protected void aduMedicamente() {
        System.out.println("Se aduc din depozit medicamentele cerute...");
    }

    @Override
    protected void incaseazaBanii() {
        System.out.printf("Se incaseaza banii... Total de plata: %.2f RON%n", reteta.calculTotalReteta());
    }

    @Override
    protected void actualizeazaStoc() {
        for (Map.Entry<Medicament, Integer> entry : reteta.getMedicamente().entrySet()) {
            Medicament medicament = entry.getKey();
            int cantitate = entry.getValue();
            stocFarmacie.put(medicament, stocFarmacie.get(medicament) - cantitate);
        }
        System.out.println("Stocul de medicamente a fost actualizat!");
    }

    @Override
    protected void emiteBonFiscal() {
        reteta.printareContinutReteta();
    }
}
