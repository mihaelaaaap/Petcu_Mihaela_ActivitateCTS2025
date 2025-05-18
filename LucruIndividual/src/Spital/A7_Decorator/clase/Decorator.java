package Spital.A7_Decorator.clase;

public abstract class Decorator implements IRaportAnalize {
    private IRaportAnalize raportAnalize;

    public Decorator(IRaportAnalize raportAnalize) {
        this.raportAnalize = raportAnalize;
    }

    @Override
    public void livreazaRaport() {
        this.raportAnalize.livreazaRaport();
        vizualizareRaportOnline();
    }

    protected abstract void vizualizareRaportOnline();
}
