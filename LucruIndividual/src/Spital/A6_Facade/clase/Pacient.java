package Spital.A6_Facade.clase;

public class Pacient {
    private String nume;
    private StarePacient stare;
    private int varsta;

    public Pacient(String nume, StarePacient stare, int varsta) {
        this.nume = nume;
        this.stare = stare;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public StarePacient getStare() {
        return stare;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean verificaGravitateStare() {
        return this.stare == StarePacient.GRAVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacientul ");
        sb.append(this.nume).append(" in varsta de ").append(this.varsta)
                .append(" este in stare ").append(this.stare.toString().toLowerCase());
        return sb.toString();
    }
}
