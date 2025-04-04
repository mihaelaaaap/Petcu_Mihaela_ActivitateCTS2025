package Farmacie.C2_FactoryMethod.clase;

public class MedicamentDurere extends Medicament {
    public MedicamentDurere(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip medicament: DURERE";
    }
}
