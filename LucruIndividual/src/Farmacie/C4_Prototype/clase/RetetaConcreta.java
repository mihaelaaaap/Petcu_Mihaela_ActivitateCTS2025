package Farmacie.C4_Prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class RetetaConcreta extends RetetaAbstracta {
    public RetetaConcreta(String denumireMedicament, Map<String, Double> compozitieMedicament) {
        super(denumireMedicament, compozitieMedicament);
    }

    @Override
    public RetetaAbstracta clone() {
        Map<String, Double> compozitieClona = new HashMap<>(this.getCompozitieMedicament());
        return new RetetaConcreta(this.getDenumireMedicament(), compozitieClona);
    }
}
