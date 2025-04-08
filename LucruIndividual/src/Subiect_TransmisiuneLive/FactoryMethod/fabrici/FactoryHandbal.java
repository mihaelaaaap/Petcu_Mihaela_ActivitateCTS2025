package Subiect_TransmisiuneLive.FactoryMethod.fabrici;

import Subiect_TransmisiuneLive.FactoryMethod.clase.Handbal;
import Subiect_TransmisiuneLive.FactoryMethod.clase.Sport;

public class FactoryHandbal implements FactorySport {
    @Override
    public Sport creeazaMeci(String echipaGazda, String echipaOaspete) {
        return new Handbal(echipaGazda, echipaOaspete);
    }
}
