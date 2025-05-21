package Subiect_SalaFitness.ChainOfResponsibility.main;

import Subiect_SalaFitness.ChainOfResponsibility.clase.*;

public class Main {
    public static void main(String[] args) {
        HandlerAccidentare antrenor = new Antrenor();
        HandlerAccidentare asistent = new AsistentMedical();
        HandlerAccidentare medic = new MedicSala();
        HandlerAccidentare ambulanta = new Ambulanta();

        antrenor.setUrmatorul(asistent);
        asistent.setUrmatorul(medic);
        medic.setUrmatorul(ambulanta);

        System.out.println("Caz 1: Cursant neaccidentat");
        antrenor.trateazaAccidentare(null);

        System.out.println("\nCaz 2: Accidentare USOARA");
        FisaAccidentare fisa1 = new FisaAccidentare("Andrei", GravitateAccidentare.USOARA);
        antrenor.trateazaAccidentare(fisa1);

        System.out.println("\nCaz 3: Accidentare MEDIE");
        FisaAccidentare fisa2 = new FisaAccidentare("Maria", GravitateAccidentare.MEDIE);
        antrenor.trateazaAccidentare(fisa2);

        System.out.println("\nCaz 4: Accidentare GRAVA");
        FisaAccidentare fisa3 = new FisaAccidentare("Ioana", GravitateAccidentare.GRAVA);
        antrenor.trateazaAccidentare(fisa3);

        HandlerAccidentare antrenorFaraAsistent = new Antrenor();
        HandlerAccidentare medicDirect = new MedicSala();
        HandlerAccidentare ambulantaDirect = new Ambulanta();

        antrenorFaraAsistent.setUrmatorul(medicDirect);
        medicDirect.setUrmatorul(ambulantaDirect);

        System.out.println("\nCaz 5: Fara asistent medical - accidentare USOARA");
        FisaAccidentare fisa4 = new FisaAccidentare("George", GravitateAccidentare.USOARA);
        antrenorFaraAsistent.trateazaAccidentare(fisa4);

        System.out.println("\nCaz 6: Fara asistent medical - accidentare GRAVA");
        FisaAccidentare fisa5 = new FisaAccidentare("Irina", GravitateAccidentare.GRAVA);
        antrenorFaraAsistent.trateazaAccidentare(fisa5);
    }
}
