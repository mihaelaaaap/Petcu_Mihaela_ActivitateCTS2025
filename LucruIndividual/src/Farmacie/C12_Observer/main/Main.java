package Farmacie.C12_Observer.main;

import Farmacie.C12_Observer.observer.ClientFarmacie;
import Farmacie.C12_Observer.observer.ObserverFarmacie;
import Farmacie.C12_Observer.subject.Farmacie;
import Farmacie.C12_Observer.subject.SubjectFarmacie;

public class Main {
    public static void main(String[] args) {
        ObserverFarmacie client1 = new ClientFarmacie("Irina");
        ObserverFarmacie client2 = new ClientFarmacie("Mihai");
        ObserverFarmacie client3 = new ClientFarmacie("Laura");
        ObserverFarmacie client4 = new ClientFarmacie("Diana");

        SubjectFarmacie farmacie = new Farmacie("Dr.Max");
        farmacie.adaugaClient(client1);
        farmacie.adaugaClient(client2);
        farmacie.adaugaClient(client3);
        farmacie.adaugaClient(client4);
        farmacie.trimiteNotificareOfertaNoua("Avem o noua promotie la Paracetamol: 2 cutii la pret de una!");
        System.out.println();

        farmacie.stergeClient(client1);
        farmacie.trimiteNotificareOfertaNoua("Vino acum in farmacia noastra pentru a beneficia de 50% reducere la medicamentele pentru alergii!");
    }
}
