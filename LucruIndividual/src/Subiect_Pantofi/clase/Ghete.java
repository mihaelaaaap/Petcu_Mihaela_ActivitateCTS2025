package Subiect_Pantofi.clase;

public class Ghete extends Pantof {
    public Ghete(BuilderPantofi builder) {
        super(builder);
    }

    @Override
    public void descrierePantofi() {
        System.out.println("\n----- GHETE -----");
        this.detaliiGenerale();
    }
}

