package Farmacie.C14_Template_Method.main;

import Farmacie.C14_Template_Method.clase.AchizitieReteta;
import Farmacie.C14_Template_Method.clase.Medicament;
import Farmacie.C14_Template_Method.clase.Reteta;
import Farmacie.C14_Template_Method.clase.TemplateAchizitie;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Medicament paracetamol = new Medicament(15.5f, "Paracetamol");
        Medicament strepsils = new Medicament(35, "Strepsils");
        Medicament vitaminaC = new Medicament(10.3f, "Vitamina C");

        Map<Medicament, Integer> stoc = new HashMap<>();
        stoc.put(paracetamol, 10);
        stoc.put(strepsils, 3);
        stoc.put(vitaminaC, 2);

        TemplateAchizitie achizitie = new AchizitieReteta(stoc);

        Reteta reteta1 = new Reteta();
        reteta1.adaugaMedicament(vitaminaC, 2);
        reteta1.adaugaMedicament(strepsils, 1);
        reteta1.adaugaMedicament(paracetamol, 1);

        achizitie.achizitieReteta(reteta1);
        System.out.println();

        Reteta reteta2 = new Reteta();
        reteta2.adaugaMedicament(paracetamol, 2);
        reteta2.adaugaMedicament(vitaminaC, 1);

        achizitie.achizitieReteta(reteta2);
    }
}
