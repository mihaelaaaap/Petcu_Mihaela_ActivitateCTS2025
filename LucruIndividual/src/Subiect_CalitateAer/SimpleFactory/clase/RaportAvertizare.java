package Subiect_CalitateAer.SimpleFactory.clase;

public class RaportAvertizare extends Raport {
    public RaportAvertizare(int valoarePM25) {
        super(valoarePM25);
    }

    @Override
    public void afisareRaport() {
        this.detaliiRaport();
        System.out.println("=====> ATENTIE! ACESTA ESTE UN RAPORT DE AVERTIZARE!");
    }
}
