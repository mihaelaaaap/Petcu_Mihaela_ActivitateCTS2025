package ro.cts.seminar5.FactoryMethod.fabrici;

import FactoryMethod.clase.PersonalSpital;

public interface FactoryPersonal {
    PersonalSpital creazaPersonalSpital(TipPersonalSpital tip, String nume, double salariu);
}
