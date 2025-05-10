package Restaurant.B14_Template_Method.clase;

public class Masa {
    private int numarMasa;
    private boolean esteRezervata;

    public Masa(int numarMasa, boolean esteRezervata) {
        this.numarMasa = numarMasa;
        this.esteRezervata = esteRezervata;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public boolean getEsteRezervata() {
        return esteRezervata;
    }
}
