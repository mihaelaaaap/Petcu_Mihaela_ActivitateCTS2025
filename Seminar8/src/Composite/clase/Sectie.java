package Composite.clase;

public class Sectie implements Structura {
    private String nume;
    private int numarLocuri;

    public Sectie(String nume, int numarLocuri) {
        this.nume = nume;
        this.numarLocuri = numarLocuri;
    }


    @Override
    public void adaugaNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        throw new Exception("Nu se poate realiza operatia!");
    }

    @Override
    public void descriereStructura(String indent) {
        System.out.println(indent + "Sectia " + this.nume + " - " + this.numarLocuri + " locuri");
    }
}
