package Farmacie.C5_Adapter.clase;

import java.util.HashMap;
import java.util.Map;

public class Farmacie {
    private Map<Integer, Integer> stoc = new HashMap<>();

    public void adaugaStoc(Medicament medicament, int cantitate) {
        this.stoc.put(medicament.getId(), cantitate);
    }

    public boolean verificaStoc(int idMedicament, int cantitateDorita) {
        if(this.stoc.containsKey(idMedicament)) {
            return this.stoc.get(idMedicament) >= cantitateDorita;
        } else {
            throw new RuntimeException("Medicamentul cu id-ul " + idMedicament + " nu exista!");
        }
    }
}
