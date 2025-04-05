package Sportiv.E2_FactoryMethod.fabrici;

import Sportiv.E2_FactoryMethod.clase.Fundas;
import Sportiv.E2_FactoryMethod.clase.Jucator;


public class FabricaFundasi implements FabricaJucatori {
    private int numarDeposedari;

    public FabricaFundasi(int numarDeposedari) {
        this.numarDeposedari = numarDeposedari;
    }

    public void setNumarDeposedari(int numarDeposedari) {
        this.numarDeposedari = numarDeposedari;
    }

    @Override
    public Jucator creeazaJucator(String nume, int numarTricou, boolean esteCapitanulEchipei) {
        return new Fundas(nume, numarTricou, esteCapitanulEchipei, numarDeposedari);
    }
}
