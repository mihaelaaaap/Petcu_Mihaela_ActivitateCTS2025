package Farmacie.C6_Facade.main;

import Farmacie.C6_Facade.clase.FacadeFarmacie;
import Farmacie.C6_Facade.clase.Medicament;
import Farmacie.C6_Facade.clase.Reteta;
import Farmacie.C6_Facade.clase.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicament m1 = new Medicament("Parasinus", 15.5f, 2);
        Medicament m2 = new Medicament("Vitamina C", 20f, 1);
        Medicament m3 = new Medicament("Coldrex", 27.5f, 3);

        Reteta r1 = new Reteta(List.of(m1, m2, m3));
        Reteta r2 = new Reteta(List.of(m1, m2));

        Client c1 = new Client("John Doe", true);
        FacadeFarmacie facade = new FacadeFarmacie(r1, c1);
        facade.achizitioneazaReteta();
        System.out.println();

        facade.setReteta(r2);
        facade.achizitioneazaReteta();
    }
}
