package Spital.A7_Decorator.clase;

public class RaportOnline extends Decorator {
    public RaportOnline(IRaportAnalize raportAnalize) {
        super(raportAnalize);
    }

    @Override
    protected void vizualizareRaportOnline() {
        System.out.println("Acum puteti vizualiza raportul de analize doar la un click distanta, online, din contul dvs!");
    }
}
