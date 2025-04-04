package Farmacie.C2_FactoryMethod.fabrici;

import Farmacie.C2_FactoryMethod.clase.Medicament;
import Farmacie.C2_FactoryMethod.clase.MedicamentDurere;

public class FabricaMedicamenteDurere implements FabricaMedicamente {
    @Override
    public Medicament creeazaMedicament(float pret, String denumire) {
        return new MedicamentDurere(pret, denumire);
    }
}
