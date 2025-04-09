package Subiect_AbonamenteTelefonie.SimpleFactory.main;

import Subiect_AbonamenteTelefonie.SimpleFactory.clase.Subscription;
import Subiect_AbonamenteTelefonie.SimpleFactory.factory.FactoryAbonamente;
import Subiect_AbonamenteTelefonie.SimpleFactory.factory.TipAbonament;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactoryAbonamente factoryAbonamente = new FactoryAbonamente();
        List<Subscription> listaAbonamente = new ArrayList<Subscription>();

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti numarul de abonamente: ");
            int numarAbonamente = scanner.nextInt();
            for(int i = 0; i < numarAbonamente; i++) {
                System.out.println("Introduceti detaliile corespunzatoare ABONAMENTULUI " + (i+1) + ":");
                System.out.println("\t-> Tip abonament (X, Y sau Z): ");
                TipAbonament tip = TipAbonament.valueOf(scanner.next().toUpperCase());
                System.out.println("\t-> Pretul pe luna: ");
                double pretPeLuna = scanner.nextDouble();
                listaAbonamente.add(factoryAbonamente.creeazaAbonament(tip, pretPeLuna));
            }

            System.out.println("Introduceti numarul de luni contractuale pentru a primi ofertele abonamentelor: ");
            int numarLuniContractuale = scanner.nextInt();

            System.out.println("LISTA ABONAMENTE:\n");
            for (int i = 0; i < listaAbonamente.size(); i++) {
                System.out.println("ABONAMENTUL " + (i+1) + ":");
                listaAbonamente.get(i).detaliiAbonament();
                System.out.println("Costul abonamentului pentru o perioada de " + numarLuniContractuale + " luni: "
                + Math.round(listaAbonamente.get(i).calculeazaCostulAbonamentului(numarLuniContractuale)) + " RON");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
