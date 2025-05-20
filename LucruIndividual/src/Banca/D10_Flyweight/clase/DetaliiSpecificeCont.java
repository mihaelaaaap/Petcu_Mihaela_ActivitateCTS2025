package Banca.D10_Flyweight.clase;

public class DetaliiSpecificeCont {
    protected String nrCont;
    protected double sold;
    protected Moneda moneda;

    public DetaliiSpecificeCont(String nrCont, double sold, Moneda moneda) {
        this.nrCont = nrCont;
        this.sold = sold;
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CONT ").append(this.nrCont).append(" | Sold: ")
                .append(this.sold).append(" ").append(this.moneda);
        return sb.toString();
    }
}
