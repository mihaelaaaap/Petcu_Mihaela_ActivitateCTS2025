package Farmacie.C11_Strategy.clase;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Medicament ");
        sb.append(this.denumire).append(" - ").append(this.pret).append(" RON");
        return sb.toString();
    }
}
