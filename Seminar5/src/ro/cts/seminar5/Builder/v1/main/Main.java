package ro.cts.seminar5.Builder.v1.main;

import ro.cts.seminar5.Builder.v1.clase.Pacient;
import ro.cts.seminar5.Builder.v1.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Ionel");
        Pacient pacient = pacientBuilder.setHasMicDejun(true).setHasHalatInterior(true).setHasPapuciDeCamera(true)
                .setNumeInsotitor("Gigel").build();
        System.out.println(pacient.toString());
        Pacient pacient2 = pacientBuilder.setHasMicDejun(true).setHasPapuciDeCamera(true)
                .setNumeInsotitor("Mihai").build();
        System.out.println(pacient.toString());
        System.out.println(pacient2.toString());
    }
}