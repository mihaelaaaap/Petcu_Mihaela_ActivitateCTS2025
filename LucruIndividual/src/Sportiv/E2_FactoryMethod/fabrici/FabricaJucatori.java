package Sportiv.E2_FactoryMethod.fabrici;

import Sportiv.E2_FactoryMethod.clase.Jucator;

public interface FabricaJucatori {
    Jucator creeazaJucator(String nume, int numarTricou, boolean esteCapitanulEchipei);
}
