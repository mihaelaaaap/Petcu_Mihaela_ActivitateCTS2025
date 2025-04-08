package Subiect_Masina.Singleton.clase;

public abstract class AMasina {
    private String numarInmatriculare;
    private String marca;
    private double kilometraj;

    public AMasina(String numarInmatriculare, String marca, double kilometraj) throws Exception {
        if(numarInmatriculare.length() == 7) {
            this.numarInmatriculare = numarInmatriculare;
        } else throw new Exception("Format invalid pentru numarul de inmatriculare!");
        this.marca = marca;
        this.kilometraj = kilometraj;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public double getKilometraj() {
        return kilometraj;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void detaliiMasina();
}
