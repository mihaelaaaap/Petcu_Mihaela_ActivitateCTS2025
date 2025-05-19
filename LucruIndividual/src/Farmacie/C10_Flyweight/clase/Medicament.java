package Farmacie.C10_Flyweight.clase;

public class Medicament {
    private String denumire;
    private double pret;

    public Medicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }
}
