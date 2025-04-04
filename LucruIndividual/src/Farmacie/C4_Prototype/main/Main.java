package Farmacie.C4_Prototype.main;

import Farmacie.C4_Prototype.clase.RetetaAbstracta;
import Farmacie.C4_Prototype.clase.RetetaConcreta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> compozitieMedicament = new HashMap<>();
        compozitieMedicament.put("Solutie 1", 10.4);
        compozitieMedicament.put("Solutie 2", 0.55);
        compozitieMedicament.put("Solutie 3", 9.0);
        compozitieMedicament.put("Solutie 4", 13.6);
        RetetaAbstracta prototip = new RetetaConcreta("MedicamentMagic", compozitieMedicament);
        RetetaAbstracta clona = prototip.clone();
        clona.modificareCompozitieMedicament("Solutie 1", 11.7);

        System.out.println("--- PROTOTIP ---");
        System.out.println(prototip.toString());
        System.out.println("\n--- CLONA ---");
        System.out.println(clona.toString());
    }
}
