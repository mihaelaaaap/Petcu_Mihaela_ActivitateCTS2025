package Sportiv.E4_Prototype.main;

import Sportiv.E4_Prototype.clase.AbstractCont;
import Sportiv.E4_Prototype.clase.Cont;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> istoricRezervari = new HashMap<>();
        istoricRezervari.put(1, "Meci Romania - Bosnia-Hertegovina");
        AbstractCont prototip = new Cont("Mihaela", "mihaela@gmail.com", "05/04/2025",
                istoricRezervari);
        AbstractCont clona = prototip.clone();
        clona.adaugaRezervare("Meci FCSB - Farul Constanta");
        System.out.println(prototip.toString());
        System.out.println(clona.toString());
    }
}
