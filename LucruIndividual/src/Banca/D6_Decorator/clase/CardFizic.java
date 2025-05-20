package Banca.D6_Decorator.clase;

public class CardFizic implements ICardBancar {

    @Override
    public void platesteOnline(double suma) {
        System.out.println("Ati efectuat o plata cu cardul online in valoare de " + suma + " RON!");
    }

    @Override
    public void platesteNormal(double suma) {
        System.out.println("Ati efectuat o plata cu cardul in valoare de " + suma + " RON!");
    }
}
