package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    protected int varsta;

    // constructori
    public Persoana() {
        this.nume = "necunoscut";
        this.varsta = 0;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // metodele din interfata implementata
    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    // setters
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public abstract float calculVenit();
}
