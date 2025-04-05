package Sportiv.E2_FactoryMethod.main;

import Sportiv.E2_FactoryMethod.clase.Jucator;
import Sportiv.E2_FactoryMethod.fabrici.FabricaAtacanti;
import Sportiv.E2_FactoryMethod.fabrici.FabricaFundasi;
import Sportiv.E2_FactoryMethod.fabrici.FabricaPortari;

public class Main {
    public static void main(String[] args) {
        FabricaPortari fabricaPortari = new FabricaPortari(8);
        FabricaAtacanti fabricaAtacanti = new FabricaAtacanti(1);
        FabricaFundasi fabricaFundasi = new FabricaFundasi(7);

        Jucator portar1 = fabricaPortari.creeazaJucator("Florin NITA", 1, false);
        portar1.descriereProfilJucator();
        fabricaPortari.setNumarParade(5);
        Jucator portar2 = fabricaPortari.creeazaJucator("Horatiu MOLDOVAN", 12, false);
        portar2.descriereProfilJucator();
        Jucator atacant1 = fabricaAtacanti.creeazaJucator("Dennis MAN", 20, false);
        Jucator atacant2 = fabricaAtacanti.creeazaJucator("Denis ALIBEC", 7, false);
        atacant1.descriereProfilJucator();
        atacant2.descriereProfilJucator();
        Jucator fundas = fabricaFundasi.creeazaJucator("Andrei RATIU", 2, true);
        fundas.descriereProfilJucator();



    }
}
