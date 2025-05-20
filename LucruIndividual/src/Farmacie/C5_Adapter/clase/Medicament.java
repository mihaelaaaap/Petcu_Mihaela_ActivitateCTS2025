package Farmacie.C5_Adapter.clase;

public class Medicament {
    private int id;
    private String denumire;

    public Medicament(int id, String denumire) {
        this.id = id;
        this.denumire = denumire;
    }

    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }
}

