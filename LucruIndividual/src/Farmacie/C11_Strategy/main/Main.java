package Farmacie.C11_Strategy.main;

import Farmacie.C11_Strategy.clase.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModPlata plataCard = new PlataCard();
        ModPlata plataCash = new PlataCash();

        Medicament m1 = new Medicament("Nurofen", 28.5f);
        Medicament m2 = new Medicament("Paracetamol", 12f);
        Medicament m3 = new Medicament("Sindolor Gel", 40f);
        Medicament m4 = new Medicament("Mydocalm", 20.9f);
        Medicament m5 = new Medicament("Paduden", 15.7f);

        Client client = new Client("Maria Popa", List.of(m1, m2));

        client.setModPlata(plataCard);
        client.plateste();
        System.out.println();

        client.setReteta(List.of(m3, m4, m5));
        client.setModPlata(plataCash);
        client.plateste();
    }
}
