package ro.cts.seminar6.AdapterObiecte_Spital.clase;

public class MedicamentSpital {
    private String denumire;
    private float pret;

    public MedicamentSpital(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public void prezintaReteta() {
        System.out.println("Reteta pentru medicamentul " + denumire);
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Achizitionat la pretul de " + pret + " RON");
    }

    public float getPret() {
        return pret;
    }

    public String getDenumire() {
        return denumire;
    }
}
