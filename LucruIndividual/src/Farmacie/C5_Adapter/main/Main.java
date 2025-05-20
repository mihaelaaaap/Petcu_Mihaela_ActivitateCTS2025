package Farmacie.C5_Adapter.main;

import Farmacie.C5_Adapter.clase.*;

public class Main {
    public static void afiseazaDisponibilitate(IVanzare soft, int idMedicament, int cantitate) {
        soft.setareMedicament(idMedicament);
        boolean estePeStoc = soft.verificareDisponibilitate(cantitate);
        if (estePeStoc) {
            System.out.println("Medicamentul " + idMedicament + " este pe stoc");
        } else {
            System.out.println("Medicamentul " + idMedicament + " NU este pe stoc.");
        }
    }

    public static void main(String[] args) {
        Medicament m1 = new Medicament(1, "Paduden");
        Medicament m2 = new Medicament(2, "Nurofen");

        Farmacie farmacie = new Farmacie();
        farmacie.adaugaStoc(m1, 2);
        farmacie.adaugaStoc(m2, 0);

        GestiuneStocuriMedicamente gestiune = new GestiuneStocuriMedicamente(farmacie);
        IVanzare adapterFarmacie = new AdapterGestiuneFarmacie(gestiune);

        afiseazaDisponibilitate(adapterFarmacie, m1.getId(), 1);
        afiseazaDisponibilitate(adapterFarmacie, m2.getId(), 2);
        afiseazaDisponibilitate(adapterFarmacie, 3, 2);
    }
}
