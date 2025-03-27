package ro.cts.seminar5.FactoryMethod.fabrici;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.clase.Portar;
import FactoryMethod.clase.Secretar;

import java.net.PortUnreachableException;

public class FactoryPersonalNonMedical implements FactoryPersonal {
    private int vechime;

    public FactoryPersonalNonMedical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public PersonalSpital creazaPersonalSpital(TipPersonalSpital tip, String nume, double salariu) {
        return switch((TipPersonalNonMedical)tip){
            case Portar -> new Portar(nume, salariu, vechime);
            case Secretar ->  new Secretar(nume, salariu, vechime);
            default -> null;
        };
    }
}
