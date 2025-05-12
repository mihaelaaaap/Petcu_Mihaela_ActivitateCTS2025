package Strategy.clase;

public class CardBancar implements IMetodaPlata {
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.sold >= pretBilet) {
            this.sold -= pretBilet;
            System.out.println("Plata cu cardul bancar validata! Sold ramas: " + this.sold + " RON" );
        } else {
            System.out.println("Sold insuficient!");
        }
    }
}
