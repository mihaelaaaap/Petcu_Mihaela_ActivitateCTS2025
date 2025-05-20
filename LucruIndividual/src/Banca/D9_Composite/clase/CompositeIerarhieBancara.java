package Banca.D9_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeIerarhieBancara implements UnitateBancara {
    private String denumire;
    private String adresa;
    private List<UnitateBancara> unitati;

    public CompositeIerarhieBancara(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
        this.unitati = new ArrayList<UnitateBancara>();
    }

    public String getDenumire() {
        return denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public List<UnitateBancara> getUnitati() {
        return unitati;
    }

    @Override
    public void adaugaComponenta(UnitateBancara unitate) {
        this.unitati.add(unitate);
    }

    @Override
    public void stergeComponenta(UnitateBancara unitate) {
        this.unitati.remove(unitate);
    }

    public abstract void descrieStructura(String indent);
}
