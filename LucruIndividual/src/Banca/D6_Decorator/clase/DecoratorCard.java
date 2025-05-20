package Banca.D6_Decorator.clase;

public abstract class DecoratorCard implements ICardBancar {
    private ICardBancar cardBancarDecorat;

    public DecoratorCard(ICardBancar cardBancarDecorat) {
        this.cardBancarDecorat = cardBancarDecorat;
    }

    @Override
    public void platesteOnline(double suma) {
        this.cardBancarDecorat.platesteOnline(suma);
    }

    @Override
    public void platesteNormal(double suma) {
        this.cardBancarDecorat.platesteOnline(suma);
    }

    public abstract void platesteContactless(double suma);
}
