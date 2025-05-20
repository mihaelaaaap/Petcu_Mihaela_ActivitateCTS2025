package Banca.D10_Flyweight.main;

import Banca.D10_Flyweight.clase.*;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Detinator d1 = new Detinator("Popescu Andrei", "5000120", "Str. Aviatorilor",
                "popescu@mail.com", "0765100456");
        Banca b1 = new Banca("BT", "Bucuresti", 10000000);

        Flyweight contFlyweight = factory.getFlyweight(d1, b1);

        DetaliiSpecificeCont detalii1 = new DetaliiSpecificeCont("ROBT001", 10000, Moneda.RON);
        DetaliiSpecificeCont detalii2 = new DetaliiSpecificeCont("ROBT002", 15000, Moneda.EUR);

        contFlyweight.descrieCont(detalii1);
        System.out.println();
        contFlyweight.descrieCont(detalii2);
        System.out.println();

        System.out.println("Numar total de conturi flyweight: " + factory.numarConturi());
    }
}
