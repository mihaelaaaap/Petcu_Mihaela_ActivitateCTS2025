package Farmacie.C8_Composite.main;

import Farmacie.C8_Composite.clase.ComponentaGrupare;
import Farmacie.C8_Composite.clase.CompositeSectiune;
import Farmacie.C8_Composite.clase.Medicament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComponentaGrupare sectiuneRaceala = new CompositeSectiune("Raceala");
        ComponentaGrupare sectiuneDurere = new CompositeSectiune("Durere");
        ComponentaGrupare sectiuneAntibiotice = new CompositeSectiune("Antibiotice");

        ComponentaGrupare copii = new CompositeSectiune("Copii");
        ComponentaGrupare adulti = new CompositeSectiune("Adulti");


        ComponentaGrupare medicament1 = new Medicament("Paduden", 15.5f);
        ComponentaGrupare medicament2 = new Medicament("Sindolor", 35.75f);
        ComponentaGrupare medicament3 = new Medicament("Dolorgit", 40f);
        ComponentaGrupare medicament4 = new Medicament("Panadol adulti", 30f);

        ComponentaGrupare medicament5 = new Medicament("Panadol Baby", 35.5f);
        ComponentaGrupare medicament6 = new Medicament("Calgel", 26f);

        ComponentaGrupare medicament7 = new Medicament("TheraFlu", 49.5f);
        ComponentaGrupare medicament8 = new Medicament("Coldrex", 27f);
        ComponentaGrupare medicament9 = new Medicament("Strepsils", 30f);

        ComponentaGrupare medicament10 = new Medicament("Ospen", 45.5f);
        ComponentaGrupare medicament11 = new Medicament("Amoxicilina", 36f);

        sectiuneRaceala.adaugaComponenta(medicament7);
        sectiuneRaceala.adaugaComponenta(medicament8);
        sectiuneRaceala.adaugaComponenta(medicament9);

        adulti.adaugaComponenta(medicament1);
        adulti.adaugaComponenta(medicament2);
        adulti.adaugaComponenta(medicament3);
        adulti.adaugaComponenta(medicament4);

        copii.adaugaComponenta(medicament5);
        copii.adaugaComponenta(medicament6);

        sectiuneDurere.adaugaComponenta(adulti);
        sectiuneDurere.adaugaComponenta(copii);

        sectiuneAntibiotice.adaugaComponenta(medicament10);
        sectiuneAntibiotice.adaugaComponenta(medicament11);

        List<ComponentaGrupare> arbore = new ArrayList<>(Arrays.asList(sectiuneRaceala,
                sectiuneDurere, sectiuneAntibiotice));

        for (ComponentaGrupare componenta : arbore) {
            componenta.descriereComponenta("\t");
        }
    }
}
