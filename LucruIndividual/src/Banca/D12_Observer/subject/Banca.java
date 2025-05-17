package Banca.D12_Observer.subject;

import Banca.D12_Observer.observer.ObserverBanca;

import java.util.ArrayList;
import java.util.List;

public class Banca implements SubjectBanca {
    private String denumire;
    private String adresa;
    private String email;
    private String numarTelefon;

    private List<ObserverBanca> clienti;

    public Banca(String denumire, String adresa, String email, String numarTelefon) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.email = email;
        this.numarTelefon = numarTelefon;
        this.clienti = new ArrayList<ObserverBanca>();
    }

    @Override
    public void adaugaObserver(ObserverBanca observer) {
        this.clienti.add(observer);
    }

    @Override
    public void stergeObserver(ObserverBanca observer) {
        this.clienti.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (ObserverBanca client : this.clienti) {
            client.primesteNotificare(mesaj + this.mesajDateContact());
        }
    }

    private String mesajDateContact() {
        return "\n\tPentru mai multe detalii, echipa bancii " + this.denumire +
                " va asteapta in sediul de la adresa " + this.adresa +
                "\n\tEmail: " + this.email + " | Telefon: " + this.numarTelefon;
    }
}
