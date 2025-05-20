package Banca.D9_Composite.clase;

public class Filiala implements UnitateBancara {
    private String denumire;
    private String adresa;

    public Filiala(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
    }

    @Override
    public void adaugaComponenta(UnitateBancara unitate) {
        throw new RuntimeException("Aceasta operatiune nu este permisa!");
    }

    @Override
    public void stergeComponenta(UnitateBancara unitate) {
        throw new RuntimeException("Aceasta operatiune nu este permisa!");
    }

    @Override
    public void descrieStructura(String indent) {
        System.out.println(indent + "Filiala " + this.denumire + " | Adresa: " + this.adresa);
    }
}
