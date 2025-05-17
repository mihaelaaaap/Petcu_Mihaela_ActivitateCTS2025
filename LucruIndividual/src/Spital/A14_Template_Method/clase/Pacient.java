package Spital.A14_Template_Method.clase;

public class Pacient {
    private String nume;
    private StarePacient starePacient;

    public Pacient(String nume, StarePacient starePacient) {
        this.nume = nume;
        this.starePacient = starePacient;
    }

    public void setStarePacient(StarePacient starePacient) {
        this.starePacient = starePacient;
    }

    public String getNume() {
        return nume;
    }

    public StarePacient getStarePacient() {
        return starePacient;
    }
}
