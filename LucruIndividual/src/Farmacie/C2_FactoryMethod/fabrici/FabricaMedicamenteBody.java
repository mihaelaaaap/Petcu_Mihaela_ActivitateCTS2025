package Farmacie.C2_FactoryMethod.fabrici;

import Farmacie.C2_FactoryMethod.clase.Medicament;
import Farmacie.C2_FactoryMethod.clase.MedicamentBody;

public class FabricaMedicamenteBody implements FabricaMedicamente{
    @Override
    public Medicament creeazaMedicament(float pret, String denumire) {
        return new MedicamentBody(pret, denumire);
    }
}
