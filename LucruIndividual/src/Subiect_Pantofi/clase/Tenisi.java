package Subiect_Pantofi.clase;

public class Tenisi extends Pantof {
    public Tenisi(BuilderPantofi builder) {
        super(builder);
    }

    @Override
    public void descrierePantofi() {
        System.out.println("\n----- TENISI -----");
        this.detaliiGenerale();
    }
}
