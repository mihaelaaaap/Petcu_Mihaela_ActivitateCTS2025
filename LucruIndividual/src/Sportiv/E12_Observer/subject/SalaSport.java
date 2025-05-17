package Sportiv.E12_Observer.subject;

import Sportiv.E12_Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SalaSport implements Subject {
    private String nume;
    private String adresa;
    private List<Observer> clienti;
    private List<Meci> meciuri;

    public SalaSport(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.clienti = new ArrayList<Observer>();
        this.meciuri = new ArrayList<Meci>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.clienti.remove(observer);
    }

    @Override
    public void notificaObserveri(Meci meci) {
        for(Observer client : this.clienti) {
            client.primesteNotificare("Va asteptam la meciul de " + meci.getTipMeci() + " " +  meci.getDescriere()
            + " din data de " + meci.getData() + " - ora " + meci.getOra()
            + "\n\tSala de sport " + this.nume + " | " + this.adresa);
        }
    }

    public void adaugaMeci(Meci meci) {
        this.meciuri.add(meci);
        this.notificaObserveri(meci);
    }
}
