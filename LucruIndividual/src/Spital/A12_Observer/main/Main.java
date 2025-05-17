package Spital.A12_Observer.main;

import Spital.A12_Observer.observer.ObserverSpital;
import Spital.A12_Observer.observer.Pacient;
import Spital.A12_Observer.subject.Spital;
import Spital.A12_Observer.subject.SubjectSpital;

public class Main {
    public static void main(String[] args) {
        SubjectSpital spital = new Spital("SANADOR Victoriei");

        ObserverSpital observer1 = new Pacient("Popescu Gigel");
        ObserverSpital observer2 = new Pacient("Ionescu Maria");
        ObserverSpital observer3 = new Pacient("Zaharia Eugen");

        spital.adaugaPacient(observer1);
        spital.adaugaPacient(observer2);
        spital.adaugaPacient(observer3);

        ((Spital)spital).trimiteAlertaEpidemie();
        System.out.println();

        spital.stergePacient(observer2);
        ((Spital)spital).trimiteAlertaVirus();
    }
}
