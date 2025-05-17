package Spital.A11_Strategy.clase;

public class Pacient {
    public static final double SPITALIZARE_PE_ZI = 15.5;
    private String nume;
    private int numarZileSpitalizare;
    private ModPlata modPlata;

    public Pacient(String nume, int numarZileSpitalizare) {
        this.nume = nume;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void setNumarZileSpitalizare(int numarZileSpitalizare) {
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    public double calculSumaDePlata() {
        return this.numarZileSpitalizare * SPITALIZARE_PE_ZI;
    }

    public void plateste(){
        this.modPlata.platesteSpitalizare(this);
    }
}
