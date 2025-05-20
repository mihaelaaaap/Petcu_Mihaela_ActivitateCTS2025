package Banca.D9_Composite.clase;

public class Sucursala extends CompositeIerarhieBancara {
    public Sucursala(String denumire, String adresa) {
        super(denumire, adresa);
    }

    @Override
    public void descrieStructura(String indent) {
        System.out.println(indent + "Sucursala " + this.getDenumire() + " | Adresa: " + this.getAdresa());
        for (UnitateBancara unitate : this.getUnitati()) {
            unitate.descrieStructura(indent+indent);
        }
    }
}
