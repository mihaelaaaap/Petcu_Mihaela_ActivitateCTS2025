package Sportiv.E6_Facade.clase;

public class Persoana {
    protected String nume;
    protected String serieBuletin;
    protected boolean esteCautataDePolitie;
    protected boolean areAntecedente;

    public Persoana(String nume, String serieBuletin, boolean esteCautataDePolitie, boolean areAntecedente) {
        this.nume = nume;
        this.serieBuletin = serieBuletin;
        this.esteCautataDePolitie = esteCautataDePolitie;
        this.areAntecedente = areAntecedente;
    }

    protected boolean verificaIdentitate(String serieBuletin) {
        return serieBuletin.equals(this.serieBuletin);
    }

    public String getSerieBuletin() {
        return serieBuletin;
    }
}
