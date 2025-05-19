package STB.F6_Composite.clase;

public class Autobuz implements ComponentaFlota {
    private String nrInmatriculare;
    private String producator;
    private String marca;
    private int nrLocuri;

    public Autobuz(String nrInmatriculare, String producator, String marca, int nrLocuri) {
        this.nrInmatriculare = nrInmatriculare;
        this.producator = producator;
        this.marca = marca;
        this.nrLocuri = nrLocuri;
    }

    public int getNrLocuri() {
        return this.nrLocuri;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    @Override
    public void descriere(String indent) {
        System.out.println(indent + "Autobuzul " + this.nrInmatriculare
         + " | Producator: " + this.producator + " | Marca: " + this.marca
                + " | " + this.nrLocuri + " locuri");
    }

    @Override
    public void adaugaComponenta(ComponentaFlota componenta) {
        throw new RuntimeException("OOPS! Aceasta operatiune nu este permisa!");
    }

    @Override
    public void stergeComponenta(ComponentaFlota componenta) {
        throw new RuntimeException("OOPS! Aceasta operatiune nu este permisa!");
    }
}
