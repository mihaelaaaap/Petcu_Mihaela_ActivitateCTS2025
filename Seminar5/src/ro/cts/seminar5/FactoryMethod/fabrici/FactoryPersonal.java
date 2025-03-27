package ro.cts.seminar5.FactoryMethod.fabrici;


import ro.cts.seminar5.FactoryMethod.clase.PersonalSpital;

public interface FactoryPersonal {
    PersonalSpital creazaPersonalSpital(TipPersonalSpital tip, String nume, double salariu);
}
