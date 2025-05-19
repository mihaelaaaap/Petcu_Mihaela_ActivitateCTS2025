package Farmacie.C6_Facade.clase;

public class Medicament {
    protected String nume;
    protected double pret;
    protected int stoc;

    public Medicament(String nume, double pret, int stoc) {
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
    }

    public void verificaDisponibilitateMedicament() {
        System.out.println("Se verifica disponibilitatea medicamentului " + this.nume);
        if (this.stoc > 0) {
            System.out.println("   ===> STOC SUFICIENT (" + this.stoc + " bucati)");
            this.stoc--;
        } else {
            System.out.println("   ===> STOC INSUFICIENT");
        }
    }
}
