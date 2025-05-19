package Farmacie.C6_Facade.clase;

import java.util.List;

public class Reteta {
    protected List<Medicament> medicamente;

    public Reteta(List<Medicament> medicamente) {
        this.medicamente = medicamente;
    }

    public void verificaReteta() {
        System.out.println("CONTINUT RETETA\n");
        int count = 1;
        for (Medicament medicament : medicamente) {
            System.out.println(count + ") " + medicament.nume + " - " + medicament.pret + " RON");
            count++;
        }
        System.out.println();
    }
}
