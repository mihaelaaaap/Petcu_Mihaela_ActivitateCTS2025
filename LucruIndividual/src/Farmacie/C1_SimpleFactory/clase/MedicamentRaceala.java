package Farmacie.C1_SimpleFactory.clase;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip medicament: RACEALA";
    }
}
