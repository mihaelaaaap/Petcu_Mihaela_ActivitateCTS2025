package Farmacie.C2_FactoryMethod.clase;

public class MedicamentBody extends Medicament {
    public MedicamentBody(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip medicament: BODY";
    }
}
