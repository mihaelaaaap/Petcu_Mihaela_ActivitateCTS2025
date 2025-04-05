package Sportiv.E2_FactoryMethod.fabrici;

import Sportiv.E2_FactoryMethod.clase.Jucator;
import Sportiv.E2_FactoryMethod.clase.Portar;

public class FabricaPortari implements FabricaJucatori {
    private int numarParade;

    public FabricaPortari(int numarParade) {
        this.numarParade = numarParade;
    }

    public void setNumarParade(int numarParade) {
        this.numarParade = numarParade;
    }

    @Override
    public Jucator creeazaJucator(String nume, int numarTricou, boolean esteCapitanulEchipei) {
        return new Portar(nume, numarTricou, esteCapitanulEchipei, numarParade);
    }
}
