package Farmacie.C2_FactoryMethod.clase;

public abstract class Medicament {
    private float pret;
    private String denumire;

    public Medicament(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nMedicamentul ");
        sb.append(this.denumire).append(" costa ").append(this.pret).append(" RON");
        return sb.toString();
    }
}

