package ro.cts.seminar4.Prototype.main;

import ro.cts.seminar4.Prototype.clase.ARezervare;
import ro.cts.seminar4.Prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare("Mihaela", 8, "06.04.2025", "15:30");
        ARezervare rezervare2 = rezervare.copiaza();
        ARezervare rezervare3 = rezervare.copiaza();

        rezervare2.setNrPersoane(2);
        rezervare2.setData("14.04.2025");
        rezervare2.setOra("12:00");

        rezervare3.setNrPersoane(4);
        rezervare3.setData("10.05.2025");
        rezervare3.setOra("16:30");

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());
    }
}
