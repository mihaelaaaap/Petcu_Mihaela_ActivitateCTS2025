package Farmacie.C14_Template_Method.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta {
    private Map<Medicament, Integer> medicamente = new HashMap<Medicament, Integer>();

    public Reteta() {
    }

    public Map<Medicament, Integer> getMedicamente() {
        return medicamente;
    }

    public void adaugaMedicament(Medicament medicament, int cantitate) {
        if (cantitate > 0) {
            medicamente.put(medicament, cantitate);
        }
    }

    public double calculTotalReteta() {
        double total = 0;
        for (Map.Entry<Medicament, Integer> entry : medicamente.entrySet()) {
            total += entry.getValue() * entry.getKey().getPret();
        }
        return total;
    }

    public void printareContinutReteta() {
        System.out.println("--- CONTINUT RETETA ---");
        for (Map.Entry<Medicament, Integer> entry : medicamente.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue() + " buc.");
        }
    }
}
