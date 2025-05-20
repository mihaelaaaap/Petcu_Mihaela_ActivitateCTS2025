package Banca.D6_Decorator.clase;

public class CardContactless extends DecoratorCard {

    public CardContactless(ICardBancar cardBancarDecorat) {
        super(cardBancarDecorat);
    }

    @Override
    public void platesteContactless(double suma) {
        System.out.println("Ati efectuat o plata cu cardul contactless in valoare de " + suma + " RON!");
    }
}
