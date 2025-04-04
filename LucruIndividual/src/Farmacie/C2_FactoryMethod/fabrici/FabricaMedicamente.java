package Farmacie.C2_FactoryMethod.fabrici;


import Farmacie.C2_FactoryMethod.clase.Medicament;

public interface FabricaMedicamente {
    Medicament creeazaMedicament(float pret, String denumire);
}
