package Farmacie.C11_Strategy.clase;

import java.util.List;

public class Client {
    private String nume;
    private List<Medicament> reteta;
    private ModPlata modPlata;

    public Client(String nume, List<Medicament> reteta) {
        this.nume = nume;
        this.reteta = reteta;
    }

    public void setReteta(List<Medicament> reteta) {
        this.reteta = reteta;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public String getNume() {
        return nume;
    }

    public double totalReteta() {
       double total = 0;
       for (Medicament medicament : reteta) {
           total += medicament.getPret();
       }
       return total;
    }

    public void sumarReteta() {
        System.out.println("\tSumar reteta:");
        for (int i = 0; i < reteta.size(); i++) {
            System.out.println("\t" + (i+1) + ") " + reteta.get(i).toString());
        }
    }

    public void plateste() {
        this.modPlata.platesteReteta(this);
    }
}
