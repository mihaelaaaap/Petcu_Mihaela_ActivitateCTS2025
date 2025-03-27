package ro.cts.seminar5.FactoryMethod.main;


import ro.cts.seminar5.FactoryMethod.clase.PersonalSpital;
import ro.cts.seminar5.FactoryMethod.fabrici.FactoryPersonalMedical;
import ro.cts.seminar5.FactoryMethod.fabrici.FactoryPersonalNonMedical;
import ro.cts.seminar5.FactoryMethod.fabrici.TipPersonalMedical;
import ro.cts.seminar5.FactoryMethod.fabrici.TipPersonalNonMedical;

public class Main {
    public static void main(String[] args) {
        FactoryPersonalMedical factoryPersonalMedical = new FactoryPersonalMedical(10.4);
        FactoryPersonalNonMedical factoryPersonalNonMedical = new FactoryPersonalNonMedical(15);

        PersonalSpital medic = factoryPersonalMedical.creazaPersonalSpital(TipPersonalMedical.Medic, "Marcel", 10000);
        factoryPersonalMedical.setSpor(100);
        System.out.println(medic.toString());

        PersonalSpital portar = factoryPersonalNonMedical.creazaPersonalSpital(TipPersonalNonMedical.Portar, "Costel", 4000);
        factoryPersonalNonMedical.setVechime(34);
        System.out.println(portar.toString());
    }
}

