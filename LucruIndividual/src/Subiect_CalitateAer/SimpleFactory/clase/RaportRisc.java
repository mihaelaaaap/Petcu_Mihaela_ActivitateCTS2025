package Subiect_CalitateAer.SimpleFactory.clase;

public class RaportRisc extends Raport {
    public RaportRisc(int valoarePM25) {
        super(valoarePM25);
    }

    @Override
    public void afisareRaport() {
        this.detaliiRaport();
        System.out.println("=====> ATENTIE! ACESTA ESTE UN RAPORT DE RISC CU PRIVIRE LA CALITATEA AERULUI!");
    }
}
