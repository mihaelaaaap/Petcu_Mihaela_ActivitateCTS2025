package Subiect_CalitateAer.SimpleFactory.clase;

public abstract class Raport implements AbstractAirQualityReport {
    private int valoarePM25;

    public Raport(int valoarePM25) {
        this.valoarePM25 = valoarePM25;
    }

    public void detaliiRaport() {
        System.out.println("Valoare PM 2.5: " + valoarePM25);
    }
}
