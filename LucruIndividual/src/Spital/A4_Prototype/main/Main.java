package Spital.A4_Prototype.main;

import Spital.A4_Prototype.clase.AbstractReteta;
import Spital.A4_Prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> compozitieMedicament = new HashMap<>();
        compozitieMedicament.put("Paracetamol", 500.0);
        compozitieMedicament.put("Stearat de magneziu", 5.0);
        compozitieMedicament.put("Amidon de porumb", 50.0);
        Reteta retetaParacetamol = new Reteta("Paracetamol", compozitieMedicament);

        AbstractReteta clonaRetetaParacetamol = retetaParacetamol.clone();
        System.out.println("----- RETETA PROTOTIP -----");
        System.out.println(retetaParacetamol.toString());
        clonaRetetaParacetamol.modificareCantitateSolutie("Paracetamol", 450.0);
        clonaRetetaParacetamol.modificareCantitateSolutie("Ibuprofen", 345.5);
        System.out.println("\n----- CLONA RETETA -----");
        System.out.println(clonaRetetaParacetamol.toString());
    }
}
