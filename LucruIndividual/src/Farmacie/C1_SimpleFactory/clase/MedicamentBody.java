package Farmacie.C1_SimpleFactory.clase;

public class MedicamentBody extends Medicament {
    public MedicamentBody(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip medicament: BODY";
    }
}
