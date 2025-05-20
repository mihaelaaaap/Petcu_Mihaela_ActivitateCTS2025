package Banca.D9_Composite.clase;

public class Agentie extends CompositeIerarhieBancara {
    public Agentie(String denumire, String adresa) {
        super(denumire, adresa);
    }

    @Override
    public void descrieStructura(String indent) {
        System.out.println(indent + "Agentia " + this.getDenumire() + " | Adresa: " + this.getAdresa());
        for (UnitateBancara unitate : this.getUnitati()) {
            unitate.descrieStructura(indent+indent);
        }
    }
}
