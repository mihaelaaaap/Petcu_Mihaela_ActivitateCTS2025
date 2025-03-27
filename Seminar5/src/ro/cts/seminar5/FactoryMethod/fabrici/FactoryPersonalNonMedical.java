package ro.cts.seminar5.FactoryMethod.fabrici;

import ro.cts.seminar5.FactoryMethod.clase.PersonalSpital;
import ro.cts.seminar5.FactoryMethod.clase.Portar;
import ro.cts.seminar5.FactoryMethod.clase.Secretar;



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
