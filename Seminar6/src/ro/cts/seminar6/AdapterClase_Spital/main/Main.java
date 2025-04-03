package ro.cts.seminar6.AdapterClase_Spital.main;


import ro.cts.seminar6.AdapterClase_Spital.clase.*;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paduden", 45.99f, true);
        farmacie.vindeMedicament(medicamentFarmacie);

        //MedicamentSpital medicamentSpital = new MedicamentSpital("Aspenter", 37.3f);
        //AdapterClaseMedicament adapter = new AdapterClaseMedicament(medicamentSpital.getDenumire(),
        //        medicamentSpital.getPret());
        AdapterClaseMedicament adapter = new AdapterClaseMedicament( "Parasinus", 20);

        farmacie.vindeMedicament(adapter);
        adapter.achizitioneazaMedicament();
    }
}
