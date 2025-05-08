package Flyweight.clase;

public class Spitalizare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Spitalizare(int numarSalon, int numarPat, int numarZileSpitalizare) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("  Spitalizare: ");
        sb.append("salonul numarul ").append(numarSalon);
        sb.append(", patul numarul ").append(numarPat);
        sb.append(", ").append(numarZileSpitalizare).append(" zile spitalizare");
        return sb.toString();
    }
}
