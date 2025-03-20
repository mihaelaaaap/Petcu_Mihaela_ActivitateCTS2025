package ro.cts.seminar4.SimpleFactory.clase;

public class SupaDeCiuperci extends Supa {
    private int cantitateCiuperci;

    public SupaDeCiuperci(int gramaj, double pretPerSutaDeGrame, String ingrediente, int cantitateCiuperci) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu " + cantitateCiuperci + "g ciuperci este gata!");
    }

    @Override
    public double calculPret() {
        return super.calculPret() + getPretPerSutaDeGrame() * cantitateCiuperci / 100.0;
    }
}
