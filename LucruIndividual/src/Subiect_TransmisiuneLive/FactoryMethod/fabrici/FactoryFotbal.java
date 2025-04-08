package Subiect_TransmisiuneLive.FactoryMethod.fabrici;

import Subiect_TransmisiuneLive.FactoryMethod.clase.Fotbal;
import Subiect_TransmisiuneLive.FactoryMethod.clase.Sport;

public class FactoryFotbal implements FactorySport {
    @Override
    public Sport creeazaMeci(String echipaGazda, String echipaOaspete) {
        return new Fotbal(echipaGazda, echipaOaspete);
    }
}
