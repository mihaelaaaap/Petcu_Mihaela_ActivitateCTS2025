package Farmacie.C7_Decorator.clase;

public class BonDeCasa implements IBon {
    private int nrBon;
    private double sumaPlata;

    public BonDeCasa(int nrBon, double sumaPlata) {
        this.nrBon = nrBon;
        this.sumaPlata = sumaPlata;
    }

    @Override
    public void printeazaBon() {
        System.out.println("Bonul numarul " + this.nrBon + " - total de plata: " + this.sumaPlata + " RON");
    }
}
