package Subiect_Masina.FactoryMethod.main;

import Subiect_Masina.FactoryMethod.clase.AMasina;
import Subiect_Masina.FactoryMethod.fabrici.FactoryMasini;
import Subiect_Masina.FactoryMethod.fabrici.FactorySEDAN;
import Subiect_Masina.FactoryMethod.fabrici.FactorySUV;
import Subiect_Masina.FactoryMethod.fabrici.FactoryVAN;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMasini factorSUV = new FactorySUV();
        FactoryMasini factorSEDAN = new FactorySEDAN();
        FactoryMasini factorVAN = new FactoryVAN();

        List<AMasina> listaMasini = new ArrayList<>();

        try {
            AMasina m1 = factorSUV.creeazaMasina("IL10ROL", "BWM", 285000);
            AMasina m2 = factorSEDAN.creeazaMasina("BV23MMI", "Mercedes", 175000);
            AMasina m3 = factorVAN.creeazaMasina("B100WOW", "Audi", 97000);
            AMasina m4 = factorSUV.creeazaMasina("IF40HAH", "Volkswagen", 120000);

            listaMasini.add(m1);
            listaMasini.add(m2);
            listaMasini.add(m3);
            listaMasini.add(m4);

            for (AMasina m : listaMasini) {
                m.detaliiMasina();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
