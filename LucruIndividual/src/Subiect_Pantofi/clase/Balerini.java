package Subiect_Pantofi.clase;

public class Balerini extends Pantof {
    public Balerini(BuilderPantofi builder) {
        super(builder);
    }

    @Override
    public void descrierePantofi() {
        System.out.println("\n----- BALERINI -----");
        this.detaliiGenerale();
    }
}
