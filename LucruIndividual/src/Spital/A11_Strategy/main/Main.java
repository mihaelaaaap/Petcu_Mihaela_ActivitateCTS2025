package Spital.A11_Strategy.main;

import Spital.A11_Strategy.clase.ModPlata;
import Spital.A11_Strategy.clase.Pacient;
import Spital.A11_Strategy.clase.PlataCard;
import Spital.A11_Strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Maria Oprea", 10);
        Pacient pacient2 = new Pacient("Ionel Popescu", 5);

        ModPlata modPlataCard = new PlataCard();
        ModPlata modPlataCash = new PlataCash();

        pacient1.setModPlata(modPlataCard);
        pacient1.plateste();
        System.out.println();

        pacient2.setModPlata(modPlataCash);
        pacient2.plateste();
        System.out.println();

        pacient2.setNumarZileSpitalizare(7);
        pacient2.setModPlata(modPlataCard);
        pacient2.plateste();
    }
}
