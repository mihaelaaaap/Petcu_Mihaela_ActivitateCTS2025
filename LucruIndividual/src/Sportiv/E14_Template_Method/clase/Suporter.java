package Sportiv.E14_Template_Method.clase;

public class Suporter {
    private String nume;
    private Bilet bilet;

    public Suporter(String nume, Bilet bilet) {
        this.nume = nume;
        this.bilet = bilet;
    }

    public String getNume() {
        return nume;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }
}
