package Composite.main;

import Composite.clase.Departament;
import Composite.clase.Sectie;
import Composite.clase.Structura;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Structura departament1 = new Departament("Medicina pediatrica");
            Structura departament2 = new Departament("Medicina generala");
            Structura departament3 = new Departament("Bloc operator");
            Structura departament4= new Departament("Nutritie");

            Structura sectie1 = new Sectie("Chirurgie generala", 35);
            Structura sectie2 = new Sectie("ATI", 10);
            Structura sectie3 = new Sectie("UPU", 50);
            Structura sectie4 = new Sectie("Diabet zaharat", 15);
            Structura sectie5 = new Sectie("Endocrinologie", 10);
            Structura sectie6 = new Sectie("Pediatrie", 30);
            Structura sectie7 = new Sectie("Chirurgie pediatrica", 20);
            Structura sectie8 = new Sectie("Gastroenterologie", 17);

            departament3.adaugaNod(sectie1);
            departament3.adaugaNod(sectie2);
            departament3.adaugaNod(sectie3);

            departament4.adaugaNod(sectie4);
            departament4.adaugaNod(sectie5);
            departament4.adaugaNod(sectie8);

            departament1.adaugaNod(sectie6);
            departament1.adaugaNod(sectie7);

            departament2.adaugaNod(departament3);

            List<Structura> departamenteSpital = new ArrayList<Structura>();
            departamenteSpital.add(departament1);
            departamenteSpital.add(departament2);
            departamenteSpital.add(departament4);
            for (Structura structura : departamenteSpital) {
                structura.descriereStructura("");
            }

            System.out.println("\n\n-------------------------------\n\n");
            departament1.stergeNod(sectie7);
            departament3.adaugaNod(sectie7);
            for (Structura structura : departamenteSpital) {
                structura.descriereStructura("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
