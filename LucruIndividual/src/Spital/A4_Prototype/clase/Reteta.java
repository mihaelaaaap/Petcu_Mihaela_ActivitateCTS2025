package Spital.A4_Prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta extends AbstractReteta {
    public Reteta() {
        super();
    }

    public Reteta(String denumireMedicament, Map<String, Double> compozitieMedicament) {
        super(denumireMedicament, compozitieMedicament);
    }

    @Override
    public AbstractReteta clone() {
        Reteta reteta = new Reteta();
        Map<String, Double> compozitieClona = new HashMap<>(this.getCompozitieMedicament());
        reteta.setCompozitieMedicament(compozitieClona);
        reteta.setDenumireMedicament(this.getDenumireMedicament());
        return reteta;
    }
}
