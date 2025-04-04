package Farmacie.C2_FactoryMethod.clase;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip medicament: RACEALA";
    }
}
