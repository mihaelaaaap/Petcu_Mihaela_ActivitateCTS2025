package Farmacie.C2_FactoryMethod.main;

import Farmacie.C2_FactoryMethod.clase.Medicament;
import Farmacie.C2_FactoryMethod.fabrici.FabricaMedicamente;
import Farmacie.C2_FactoryMethod.fabrici.FabricaMedicamenteBody;
import Farmacie.C2_FactoryMethod.fabrici.FabricaMedicamenteDurere;
import Farmacie.C2_FactoryMethod.fabrici.FabricaMedicamenteRaceala;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabricaMedicamenteRaceala = new FabricaMedicamenteRaceala();
        FabricaMedicamente fabricaMedicamenteBody = new FabricaMedicamenteBody();
        FabricaMedicamente fabricaMedicamenteDurere = new FabricaMedicamenteDurere();

        List<Medicament> medicamente = new ArrayList<>();

        medicamente.add(fabricaMedicamenteRaceala.creeazaMedicament(32.5f, "Fervex"));
        medicamente.add(fabricaMedicamenteRaceala.creeazaMedicament(40, "Coldrex"));
        medicamente.add(fabricaMedicamenteBody.creeazaMedicament(39, "Sindolor"));
        medicamente.add(fabricaMedicamenteBody.creeazaMedicament(75, "Urimil Gel"));
        medicamente.add(fabricaMedicamenteDurere.creeazaMedicament(39.55f, "Nurofen"));
        medicamente.add(fabricaMedicamenteDurere.creeazaMedicament(20, "Ibuprofen"));

        System.out.println("Sunt disponibile urmatoarele medicamente:");
        medicamente.forEach(medicament -> System.out.println(medicament.toString()));
    }
}
