package Subiect_TransmisiuneLive.FactoryMethod.clase;

public class Fotbal extends Sport {
    public Fotbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void detaliiMeci() {
        System.out.println("Meci de fotbal intre " + getEchipaGazda() + " si " + getEchipaOaspete());
    }
}
