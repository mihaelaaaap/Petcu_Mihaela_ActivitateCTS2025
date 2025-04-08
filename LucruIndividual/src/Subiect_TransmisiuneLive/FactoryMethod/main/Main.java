package Subiect_TransmisiuneLive.FactoryMethod.main;

import Subiect_TransmisiuneLive.FactoryMethod.clase.Sport;
import Subiect_TransmisiuneLive.FactoryMethod.fabrici.FactoryBaschet;
import Subiect_TransmisiuneLive.FactoryMethod.fabrici.FactoryFotbal;
import Subiect_TransmisiuneLive.FactoryMethod.fabrici.FactoryHandbal;
import Subiect_TransmisiuneLive.FactoryMethod.fabrici.FactorySport;

public class Main {
    public static void main(String[] args) {
        FactorySport fotbal = new FactoryFotbal();
        FactorySport handbal = new FactoryHandbal();
        FactorySport baschet = new FactoryBaschet();

        Sport meciFotbal = fotbal.creeazaMeci("FCSB", "Farul Constanta");
        Sport meciHandbal = handbal.creeazaMeci("CSM Unirea", "Rapid Bucuresti");
        Sport meciBaschet = baschet.creeazaMeci("Vulturii", "Soimii");

        meciHandbal.detaliiMeci();
        meciFotbal.detaliiMeci();
        meciBaschet.detaliiMeci();
    }
}
