package Farmacie.C12_Observer.subject;

import Farmacie.C12_Observer.observer.ObserverFarmacie;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements SubjectFarmacie {
    private String denumire;
    private List<ObserverFarmacie> listaClienti;

    public Farmacie(String denumire) {
        this.denumire = denumire;
        this.listaClienti = new ArrayList<ObserverFarmacie>();
    }

    @Override
    public void adaugaClient(ObserverFarmacie observer) {
        this.listaClienti.add(observer);
    }

    @Override
    public void stergeClient(ObserverFarmacie observer) {
        this.listaClienti.remove(observer);
    }

    @Override
    public void trimiteNotificareOfertaNoua(String mesaj) {
        for (ObserverFarmacie client : this.listaClienti) {
            client.primesteMesaj("\n\tFarmacia " + this.denumire + " - " + mesaj);
        }
    }
}
