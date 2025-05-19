package STB.F7_Decorator.clase;

public class BiletSTB implements IBilet {
    private int nrCalatorii;

    public BiletSTB(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    @Override
    public void descriereBilet() {
        System.out.println("Bilet STB cu " + this.nrCalatorii + " calatorii");
    }
}
