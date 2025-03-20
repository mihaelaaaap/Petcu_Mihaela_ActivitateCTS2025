package ro.cts.seminar4.SimpleFactory.clase;

public class SupaDeLegume extends Supa{
    private double gramajCrutoane;

    public SupaDeLegume(int gramaj, double pretPerSutaDeGrame, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu " + gramajCrutoane + "g de crutoane este gata!");
    }

    @Override
    public double calculPret(){
        return super.calculPret() + gramajCrutoane * (getPretPerSutaDeGrame() / 100.0)/2;
    }
}
