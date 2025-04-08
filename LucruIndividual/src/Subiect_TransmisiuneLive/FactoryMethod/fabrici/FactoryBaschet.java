package Subiect_TransmisiuneLive.FactoryMethod.fabrici;

import Subiect_TransmisiuneLive.FactoryMethod.clase.Baschet;
import Subiect_TransmisiuneLive.FactoryMethod.clase.Sport;

public class FactoryBaschet implements FactorySport {
    @Override
    public Sport creeazaMeci(String echipaGazda, String echipaOaspete) {
        return new Baschet(echipaGazda, echipaOaspete);
    }
}
