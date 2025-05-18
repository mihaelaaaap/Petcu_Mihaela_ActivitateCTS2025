package Spital.A9_Proxy.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private boolean areAsigurare;

    public Pacient(String nume, int varsta, boolean areAsigurare) {
        this.nume = nume;
        this.varsta = varsta;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean getAreAsigurare() {
        return areAsigurare;
    }
}
