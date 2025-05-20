package Banca.D7_Facade.clase;

public class Persoana {
    protected String nume;
    protected int varsta;
    protected boolean esteUrmaritaDePolitie;
    protected boolean areCreanteLaAlteBanci;

    public Persoana(String nume, int varsta, boolean esteUrmaritaDePolitie, boolean areCreanteLaAlteBanci) {
        this.nume = nume;
        this.varsta = varsta;
        this.esteUrmaritaDePolitie = esteUrmaritaDePolitie;
        this.areCreanteLaAlteBanci = areCreanteLaAlteBanci;
    }
}
