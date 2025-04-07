package Subiect_CalitateAer.SimpleFactory.clase;

public class RaportAerCurat extends Raport {
    public RaportAerCurat(int valoarePM25) {
        super(valoarePM25);
    }

    @Override
    public void afisareRaport() {
        this.detaliiRaport();
        System.out.println("=====> AER CURAT");
    }
}
