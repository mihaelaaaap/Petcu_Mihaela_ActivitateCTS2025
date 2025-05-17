package Sportiv.E12_Observer.main;

import Sportiv.E12_Observer.observer.Client;
import Sportiv.E12_Observer.observer.Observer;
import Sportiv.E12_Observer.subject.Meci;
import Sportiv.E12_Observer.subject.SalaSport;
import Sportiv.E12_Observer.subject.Subject;
import Sportiv.E12_Observer.subject.TipMeci;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new Client("Popescu Mihai");
        Observer observer2 = new Client("Ionescu Luciana");
        Observer observer3 = new Client("Petrescu Nicolae");

        Meci meciFotbal = new Meci("FC Unirea Slobozia - FC Victoria Tandarei", "17 mai 2025",
                "16:00", TipMeci.fotbal);
        Meci meciHandbal = new Meci("CSM Steaua - CSM Bacau", "24 mai 2025",
                "15:30", TipMeci.handbal);
        Meci meciVolei = new Meci("CS DINAMO BUCURESTI - CS Stiinta Bacau", "1 iunie 2025",
                "14:00", TipMeci.volei);

        Subject sala = new SalaSport("SportArena", "Bucuresti, Sector 1, Bd.Magheru, Nr.20");
        sala.adaugaObserver(observer1);
        sala.adaugaObserver(observer2);
        sala.adaugaObserver(observer3);

        ((SalaSport) sala).adaugaMeci(meciFotbal);
        System.out.println();

        ((SalaSport) sala).adaugaMeci(meciVolei);
        System.out.println();

        sala.stergeObserver(observer1);
        ((SalaSport) sala).adaugaMeci(meciHandbal);

    }
}
