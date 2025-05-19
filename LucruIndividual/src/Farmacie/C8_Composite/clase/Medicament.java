package Farmacie.C8_Composite.clase;

public class Medicament implements ComponentaGrupare {
    private String denumire;
    private double pret;

    public Medicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriereComponenta(String indent) {
        System.out.println(indent + this.denumire + " - " + this.pret + " RON");
    }

    @Override
    public void adaugaComponenta(ComponentaGrupare componenta) {
        throw new RuntimeException("Aceasta operatiune nu este permisa!");
    }

    @Override
    public void stergeComponenta(ComponentaGrupare componenta) {
        throw new RuntimeException("Aceasta operatiune nu este permisa!");
    }
}
