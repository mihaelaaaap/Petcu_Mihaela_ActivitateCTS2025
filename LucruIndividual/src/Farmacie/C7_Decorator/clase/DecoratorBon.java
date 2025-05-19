package Farmacie.C7_Decorator.clase;

public abstract class DecoratorBon implements IBon {
    private IBon bonDecorat;

    public DecoratorBon(IBon bonDecorat) {
        this.bonDecorat = bonDecorat;
    }

    @Override
    public void printeazaBon() {
        this.bonDecorat.printeazaBon();
        printeazaFelicitare();
    }

    public abstract void printeazaFelicitare();
}
