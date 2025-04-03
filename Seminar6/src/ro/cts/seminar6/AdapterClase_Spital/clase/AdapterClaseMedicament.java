package ro.cts.seminar6.AdapterClase_Spital.clase;



public class AdapterClaseMedicament extends MedicamentSpital implements IMedicamentFarmacie {
    public AdapterClaseMedicament(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
