package STB.F7_Decorator.clase;

public abstract class DecoratorBilet implements IBilet {
    private IBilet biletDecorat;

    public DecoratorBilet(IBilet biletDecorat) {
        this.biletDecorat = biletDecorat;
    }

    @Override
    public void descriereBilet() {
        biletDecorat.descriereBilet();
    }

    public abstract void afiseazaUrare();
}
