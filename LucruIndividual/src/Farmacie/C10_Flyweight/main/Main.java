package Farmacie.C10_Flyweight.main;

import Farmacie.C10_Flyweight.clase.DetaliiReteta;
import Farmacie.C10_Flyweight.clase.Flyweight;
import Farmacie.C10_Flyweight.clase.FlyweightFactory;
import Farmacie.C10_Flyweight.clase.Medicament;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicament m1 = new Medicament("Parasinus", 15.5f);
        Medicament m2 = new Medicament("Coldrex", 29f);
        Medicament m3 = new Medicament("Xenalax", 34.2f);

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight client1 = factory.getFlyweight("6030406", "Mihaela", 1);
        client1.descriereReteta(new DetaliiReteta(1, List.of(m1, m2, m3)));
        client1.descriereReteta(new DetaliiReteta(2, List.of(m1, m2)));

        System.out.println("\n" + factory.getNumarReteteClienti() + " elemente");

        factory.getFlyweight("5020111", "Andrei", 2).descriereReteta(
                new DetaliiReteta(2, List.of(m2, m3))
        );
        System.out.println("\n" + factory.getNumarReteteClienti() + " elemente");
    }
}
