package Farmacie.C6_Facade.clase;

public class Client {
    protected String nume;
    protected boolean areCardSanatate;

    public Client(String nume, boolean areCardSanatate) {
        this.nume = nume;
        this.areCardSanatate = areCardSanatate;
    }

    public void verificaCardSanatate() {
        System.out.println("\nSe verifica daca clientul " + this.nume + " are card de sanatate... ");
        if (this.areCardSanatate) {
            System.out.println("   ===> DA");
        } else {
            System.out.println("   ===> NU");
        }
    }
}
