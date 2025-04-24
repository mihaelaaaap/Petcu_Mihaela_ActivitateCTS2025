package Facade.clase;

public class Masa {
    private int numarMasa;
    private boolean esteLibera;

    public Masa(int numarMasa, boolean esteLibera) {
        this.numarMasa = numarMasa;
        this.esteLibera = esteLibera;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public boolean getEsteLibera() {
        return esteLibera;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa numarul ");
        sb.append(numarMasa);
        sb.append(esteLibera ? " este libera" : " nu este libera");
        return sb.toString();
    }
}
