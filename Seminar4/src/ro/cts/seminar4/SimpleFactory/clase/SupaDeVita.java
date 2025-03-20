package ro.cts.seminar4.SimpleFactory.clase;

public class SupaDeVita extends Supa {
    private double pretExtra;

    public SupaDeVita(int gramaj, double pretPerSutaDeGrame, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita cu smantana la pret de " + pretExtra + " este gata!");
    }

    @Override
    public double calculPret() {
        return super.calculPret() + pretExtra;
    }
}
