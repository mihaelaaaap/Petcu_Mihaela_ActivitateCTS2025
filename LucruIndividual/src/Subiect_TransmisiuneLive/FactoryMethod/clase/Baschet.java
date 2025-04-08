package Subiect_TransmisiuneLive.FactoryMethod.clase;

public class Baschet extends Sport {

    public Baschet(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void detaliiMeci() {
        System.out.println("Meci de baschet intre " + getEchipaGazda() + " si " + getEchipaOaspete());
    }
}
