package ro.cts.seminar6.AdapterObiecte_Spital.clase;

public class MedicamentFarmacie {
    private String denumire;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String denumire, float pret, boolean esteInStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament() {
        if (esteInStoc) {
            System.out.println("Se cumpara medicamentul " + denumire + " la pretul de " + pret + " RON");
        } else {
            System.out.println("Medicamentul " + denumire + " nu se afla momentan in stocul farmaciei!");
        }
    }
}
