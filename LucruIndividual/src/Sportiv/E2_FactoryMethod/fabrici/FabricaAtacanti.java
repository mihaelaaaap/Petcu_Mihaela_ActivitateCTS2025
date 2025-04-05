package Sportiv.E2_FactoryMethod.fabrici;

import Sportiv.E2_FactoryMethod.clase.Atacant;
import Sportiv.E2_FactoryMethod.clase.Jucator;

public class FabricaAtacanti implements FabricaJucatori {
    private int numarGoluri;

    public FabricaAtacanti(int numarGoluri) {
        this.numarGoluri = numarGoluri;
    }

    public void setNumarGoluri(int numarGoluri) {
        this.numarGoluri = numarGoluri;
    }

    @Override
    public Jucator creeazaJucator(String nume, int numarTricou, boolean esteCapitanulEchipei) {
        return new Atacant(nume, numarTricou, esteCapitanulEchipei, numarGoluri);
    }
}
