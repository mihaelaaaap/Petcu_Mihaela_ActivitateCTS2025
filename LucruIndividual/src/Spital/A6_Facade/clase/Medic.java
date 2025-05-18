package Spital.A6_Facade.clase;

public class Medic {
    protected String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean confirmaNecesitateInternare(Pacient pacient) {
        return pacient.verificaGravitateStare();
    }
}
