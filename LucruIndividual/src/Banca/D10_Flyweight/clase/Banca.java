package Banca.D10_Flyweight.clase;

public class Banca {
    protected String denumire;
    protected String sucursala;
    protected double capital;

    public Banca(String denumire, String sucursala, double capital) {
        this.denumire = denumire;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BANCA ");
        sb.append(this.denumire).append("| Sucursala ")
                .append(this.sucursala).append(" | Capital: ").append(this.capital);
        return sb.toString();
    }
}
