package ro.cts.seminar5.Builder.v2.main;

import ro.cts.seminar5.Builder.v2.clase.Pacient;
import ro.cts.seminar5.Builder.v2.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setHasPatRabatabil(true).setHasHalatInterior(true).setNumeInsotitor("Maria");
        Pacient pacient1 = pacientBuilder.setNumeInsotitor("Ioana").build("Pacient1");
        Pacient pacient2 = pacientBuilder.setNumeInsotitor("Elena").build("Pacient2");
        Pacient pacient3 = pacientBuilder.build("Pacient3");
        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
        System.out.println(pacient3.toString());
    }
}
