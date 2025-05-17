package Spital.A12_Observer.subject;

import Spital.A12_Observer.observer.ObserverSpital;

import java.util.ArrayList;
import java.util.List;

public class Spital implements SubjectSpital {
    private String denumireSpital;
    private List<ObserverSpital> listaPacienti;

    public Spital(String denumireSpital) {
        this.denumireSpital = denumireSpital;
        this.listaPacienti = new ArrayList<ObserverSpital>();
    }

    @Override
    public void adaugaPacient(ObserverSpital observer) {
        this.listaPacienti.add(observer);
    }

    @Override
    public void stergePacient(ObserverSpital observer) {
        this.listaPacienti.remove(observer);
    }

    @Override
    public void trimiteAlerta(String mesaj) {
        for (ObserverSpital pacient : this.listaPacienti) {
            pacient.primesteAlerta(mesaj);
        }
    }

    public void trimiteAlertaEpidemie() {
        trimiteAlerta("Spitalul " + this.denumireSpital +
                " va anunta ca ne confruntam cu o noua epidemie de COVID-19! Aveti grija de dvs!");
    }

    public void trimiteAlertaVirus() {
        trimiteAlerta("Spitalul " + this.denumireSpital +
                " va anunta ca tot mai multi pacienti prezinta simptome specifice infectarii cu virusul gripal A! Aveti grija de dvs!");
    }
}
