package Farmacie.C1_SimpleFactory.main;

import Farmacie.C1_SimpleFactory.clase.Medicament;
import Farmacie.C1_SimpleFactory.factory.FabricaMedicamente;
import Farmacie.C1_SimpleFactory.factory.TipMedicament;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FabricaMedicamente fabrica = new FabricaMedicamente("SC Zentiva SRL");
        Medicament m1 = fabrica.creeazaMedicament(TipMedicament.RACEALA, 35, "Parasinus");
        Medicament m2 = fabrica.creeazaMedicament(TipMedicament.DURERE, 37.99f, "Nurofen");
        Medicament m3 = fabrica.creeazaMedicament(TipMedicament.DURERE, 40, "Paduden");
        Medicament m4 = fabrica.creeazaMedicament(TipMedicament.BODY, 29.5f, "Mydocalm");
        Medicament m5 = fabrica.creeazaMedicament(TipMedicament.RACEALA, 28.75f, "Nurofen raceala si gripa");

        List<Medicament> listaMedicamente = new ArrayList<>();
        listaMedicamente.add(m1);
        listaMedicamente.add(m2);
        listaMedicamente.add(m3);
        listaMedicamente.add(m4);
        listaMedicamente.add(m5);

        System.out.println("Fabrica " + fabrica.getDenumireFabrica() + " produce urmatoarele medicamente:\n\n");
        listaMedicamente.forEach(medicament -> System.out.println(medicament.toString()));
    }
}
