package Farmacie.C10_Flyweight.clase;

import java.util.List;

public class DetaliiReteta {
    private int nrReteta;
    private List<Medicament> medicamente;

    public DetaliiReteta(int nrReteta, List<Medicament> medicamente) {
        this.nrReteta = nrReteta;
        this.medicamente = medicamente;
    }

    public int getNrReteta() {
        return this.nrReteta;
    }

    public List<Medicament> getMedicamente() {
        return this.medicamente;
    }

    public int numarMedicamente() {
        return this.medicamente.size();
    }

    public double totalDePlata() {
        double suma = 0;
        for (Medicament medicament : this.medicamente) {
            suma += medicament.getPret();
        }
        return suma;
    }

    public void afiseazaDetaliiReteta() {
        System.out.println("Reteta numarul " + this.nrReteta + " - " + this.numarMedicamente() + " medicamente");
        for (Medicament medicament : this.medicamente) {
            System.out.println("\t" + medicament.getDenumire() + " - " + medicament.getPret() + " RON");
        }
        System.out.println("Total de plata: " + this.totalDePlata());
    }
}
