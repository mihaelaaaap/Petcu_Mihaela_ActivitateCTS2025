package Banca.D12_Observer.main;

import Banca.D12_Observer.observer.ClientBanca;
import Banca.D12_Observer.observer.ObserverBanca;
import Banca.D12_Observer.subject.Banca;
import Banca.D12_Observer.subject.SubjectBanca;

public class Main {
    public static void main(String[] args) {
        ObserverBanca client1 = new ClientBanca("Popa Elena");
        ObserverBanca client2 = new ClientBanca("Eremia Liviu");
        ObserverBanca client3 = new ClientBanca("Teodorescu Alexandra");

        SubjectBanca banca = new Banca("BCR", "Bucuresti, Sector 1, Bd.Magheru, Nr.20",
                "contact@bcr.ro", "0243110100");
        banca.adaugaObserver(client1);
        banca.adaugaObserver(client2);
        banca.adaugaObserver(client3);

        banca.trimiteNotificare("Cu aplicatia George ai toate tranzactiile la un click distanta!");
        System.out.println();

        banca.stergeObserver(client2);
        banca.trimiteNotificare("Invita un prieten sa isi deschida cont BCR si poti castiga pana la 250 de lei!");
    }
}
