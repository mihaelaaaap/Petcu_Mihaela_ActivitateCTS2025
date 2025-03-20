package ro.cts.seminar4.SimpleFactory.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaDeGrame;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaDeGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
        this.ingrediente = ingrediente;
    }

    public abstract void preparareSupa();

    public double calculPret() {
        return pretPerSutaDeGrame * gramaj / 100.0;
    }

    public int getGramaj() {
        return gramaj;
    }

    public double getPretPerSutaDeGrame() {
        return pretPerSutaDeGrame;
    }

}
