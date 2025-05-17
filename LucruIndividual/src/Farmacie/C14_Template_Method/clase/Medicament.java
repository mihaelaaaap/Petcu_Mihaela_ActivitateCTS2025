package Farmacie.C14_Template_Method.clase;

public class Medicament {
    private String denumire;
    private float pret;

    public Medicament(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament ");
        sb.append(this.denumire).append(" - ");
        sb.append(this.pret).append(" RON");
        return sb.toString();
    }
}
