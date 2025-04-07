package Subiect_Pantofi.clase;

public class Stiletto extends Pantof {
    public Stiletto(BuilderPantofi builder) {
        super(builder);
    }

    @Override
    public void descrierePantofi() {
        System.out.println("\n----- STILETTO -----");
        this.detaliiGenerale();
    }
}
