package ro.cts.seminar5.FactoryMethod.fabrici;

import FactoryMethod.clase.Asistent;
import FactoryMethod.clase.Medic;
import FactoryMethod.clase.PersonalSpital;

public class FactoryPersonalMedical implements FactoryPersonal {

    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    @Override
    public PersonalSpital creazaPersonalSpital(TipPersonalSpital tip, String nume, double salariu) {
        return switch((TipPersonalMedical)tip){
            case Medic -> new Medic(nume, salariu, spor);
            case Asistent ->  new Asistent(nume, salariu, spor);
            default -> null;
        };
    }
}
