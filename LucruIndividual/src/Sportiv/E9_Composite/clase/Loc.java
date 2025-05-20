package Sportiv.E9_Composite.clase;

public class Loc implements StructuraStadion {
    private int nrLoc;

    public Loc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    @Override
    public void adaugaElement(StructuraStadion element) {
        throw new RuntimeException("Operatiune interzisa!");
    }

    @Override
    public void stergeElement(StructuraStadion element) {
        throw new RuntimeException("Operatiune interzisa!");
    }

    @Override
    public void descriereElement(String indent) {
        System.out.println(indent + "Loc: " + nrLoc);
    }
}
