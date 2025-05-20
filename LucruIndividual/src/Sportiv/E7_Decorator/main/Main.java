package Sportiv.E7_Decorator.main;

import Sportiv.E7_Decorator.clase.BiletSimplu;
import Sportiv.E7_Decorator.clase.BiletSustinere;
import Sportiv.E7_Decorator.clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1 = new BiletSimplu("FCSB", "Dinamo");
        IBilet bilet2 = new BiletSimplu("Rapid", "Farul Constanta");

        IBilet bilet1Decorat = new BiletSustinere(bilet1, "FCSB");
        bilet1Decorat.printeaza();
        System.out.println();

        IBilet bilet2Decorat = new BiletSustinere(bilet2, "FCSB");
        bilet2Decorat.printeaza();
    }
}
