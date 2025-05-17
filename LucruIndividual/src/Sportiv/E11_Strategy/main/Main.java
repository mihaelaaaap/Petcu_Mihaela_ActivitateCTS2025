package Sportiv.E11_Strategy.main;

import Sportiv.E11_Strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        VerificareSpectator verificareVIP = new VerificareVIP();
        VerificareSpectator verificareTribuna = new VerificareTribuna();
        VerificareSpectator verificarePeluza = new VerificarePeluza();

        Spectator spectator = new Spectator("Ionel");
        spectator.setTipVerificare(verificareVIP);
        spectator.controlAcces();
        System.out.println();

        spectator.setTipVerificare(verificareTribuna);
        spectator.controlAcces();
        System.out.println();

        spectator.setTipVerificare(verificarePeluza);
        spectator.controlAcces();
        System.out.println();
    }
}
