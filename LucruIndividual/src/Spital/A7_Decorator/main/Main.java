package Spital.A7_Decorator.main;

import Spital.A7_Decorator.clase.IRaportAnalize;
import Spital.A7_Decorator.clase.RaportOnline;
import Spital.A7_Decorator.clase.RaportPrintat;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> analize = new HashMap<>();
        analize.put("Glicemie", 101.0);
        analize.put("Vitamina D", 23.7);
        analize.put("Colesterol", 150.2);

        IRaportAnalize raportPrintat = new RaportPrintat("Popescu Maria",
                "18/05/2025", analize);
        IRaportAnalize raportOnline = new RaportOnline(raportPrintat);
        raportOnline.livreazaRaport();
    }
}
