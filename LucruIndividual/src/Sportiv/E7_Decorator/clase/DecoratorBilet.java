package Sportiv.E7_Decorator.clase;

public abstract class DecoratorBilet implements IBilet {
    protected IBilet biletDecorat;

    public DecoratorBilet(IBilet bilet) {
        this.biletDecorat = bilet;
    }

    @Override
    public void printeaza() {
        this.biletDecorat.printeaza();
        printeazaMesajSustinere();
    }

    public abstract void printeazaMesajSustinere();
}
