package ro.cts.seminar6.AdapterObiecte_Spital.clase;

public class AdapterMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicament;

    public AdapterMedicament(String denumire, float pret, boolean esteInStoc) {
        super(denumire, pret, esteInStoc);
    }

    public AdapterMedicament(MedicamentSpital medicament) {
        super(medicament.getDenumire(), medicament.getPret(), true);
        this.medicament = medicament;
    }

    public void cumparaMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
