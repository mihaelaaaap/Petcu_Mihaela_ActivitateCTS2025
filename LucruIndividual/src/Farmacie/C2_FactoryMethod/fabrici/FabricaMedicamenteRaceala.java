package Farmacie.C2_FactoryMethod.fabrici;

import Farmacie.C2_FactoryMethod.clase.Medicament;
import Farmacie.C2_FactoryMethod.clase.MedicamentRaceala;

public class FabricaMedicamenteRaceala implements FabricaMedicamente {
    public FabricaMedicamenteRaceala() {
    }

    @Override
    public Medicament creeazaMedicament(float pret, String denumire) {
        return new MedicamentRaceala(pret, denumire);
    }
}
