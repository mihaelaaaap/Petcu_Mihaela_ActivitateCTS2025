package Banca.D4_Prototype.main;

import Banca.D4_Prototype.clase.Cont;
import Banca.D4_Prototype.clase.PrototypeCont;
import Banca.D4_Prototype.clase.Valuta;

public class Main {
    public static void main(String[] args) {
        PrototypeCont prototype = new Cont("Ionel", "RO93 RNCB 0002 B000 5347 4306", Valuta.RON, 1245.5f );
        System.out.println(prototype);
        PrototypeCont clona = prototype.clone();
        clona.setIBAN("RO93 RNCB 0002 B000 5347 4000");
        clona.setSold(0);
        System.out.println(clona.toString());
    }
}
