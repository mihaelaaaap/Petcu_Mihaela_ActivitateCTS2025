package Banca.D10_Flyweight.clase;

public class ConcreteFlyweight implements Flyweight {
    private Detinator detinator;
    private Banca banca;

    protected ConcreteFlyweight(Detinator detinator, Banca banca) {
        this.detinator = detinator;
        this.banca = banca;
    }

    @Override
    public void descrieCont(DetaliiSpecificeCont detalii) {
        System.out.println(detalii.toString());
        System.out.println("-----------------------------------------------------------------");
        System.out.println(this.detinator.toString());
        System.out.println("-----------------------------------------------------------------");
        System.out.println(this.banca.toString());
    }
}
