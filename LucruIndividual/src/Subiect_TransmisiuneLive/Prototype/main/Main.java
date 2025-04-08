package Subiect_TransmisiuneLive.Prototype.main;

import Subiect_TransmisiuneLive.Prototype.clase.Live;
import Subiect_TransmisiuneLive.Prototype.clase.TransmisiuneLive;

public class Main {
    public static void main(String[] args) {
        Live prototype = new TransmisiuneLive("Meci Romania - Ucraina", 450);
        prototype.adaugaComentariu("GOOOOOOL!");
        prototype.adaugaComentariu("Hai Romania!");
        prototype.adaugaComentariu("Vom castiga!");

        for(int i = 0; i<10; i++) {
            prototype.conectareSpectator();
        }
        prototype.transmiteEvenimentLive();

        Live clona = prototype.clone();
        for(int i = 0; i<5; i++) {
            clona.conectareSpectator();
        }
        clona.adaugaComentariu("Ce faza! Hai Romania!");
        clona.adaugaComentariu("Generatia de suflet");
        clona.transmiteEvenimentLive();
    }


}
