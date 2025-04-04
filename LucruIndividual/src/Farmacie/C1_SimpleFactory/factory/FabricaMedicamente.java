package Farmacie.C1_SimpleFactory.factory;

import Farmacie.C1_SimpleFactory.clase.Medicament;
import Farmacie.C1_SimpleFactory.clase.MedicamentBody;
import Farmacie.C1_SimpleFactory.clase.MedicamentDurere;
import Farmacie.C1_SimpleFactory.clase.MedicamentRaceala;

public class FabricaMedicamente {
    private String denumireFabrica;

    public FabricaMedicamente(String denumireFabrica) {
        this.denumireFabrica = denumireFabrica;
    }

    public String getDenumireFabrica() {
        return denumireFabrica;
    }

    public Medicament creeazaMedicament(TipMedicament tipMedicament, float pret, String denumire) {
        return switch(tipMedicament) {
            case RACEALA -> new MedicamentRaceala(pret, denumire);
            case DURERE -> new MedicamentDurere(pret, denumire);
            case BODY -> new MedicamentBody(pret, denumire);
            default -> null;
        };
    }
}
