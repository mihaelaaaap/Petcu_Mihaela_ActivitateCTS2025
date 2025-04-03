package ro.cts.seminar6.AdapterObiecte_Spital.main;


import ro.cts.seminar6.AdapterObiecte_Spital.clase.AdapterMedicament;
import ro.cts.seminar6.AdapterObiecte_Spital.clase.MedicamentFarmacie;
import ro.cts.seminar6.AdapterObiecte_Spital.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie) {
        System.out.println("Farmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Paracetamol", 15.5f, true);
        MedicamentFarmacie medicamentFarmacie2 = new MedicamentFarmacie("Nurofen", 32.95f, true);

        vindeMedicament(medicamentFarmacie1);
        vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital1 = new MedicamentSpital("Ibuprofen", 20);
        MedicamentSpital medicamentSpital2 = new MedicamentSpital("NoSpa", 36.99f);

        vindeMedicament(new AdapterMedicament(medicamentSpital1));
        vindeMedicament(new AdapterMedicament(medicamentSpital2));
    }
}
