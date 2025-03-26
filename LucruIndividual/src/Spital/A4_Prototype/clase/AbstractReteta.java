package Spital.A4_Prototype.clase;

import java.util.Map;

public abstract class AbstractReteta {
    private String denumireMedicament;
    private Map<String, Double> compozitieMedicament;

    public AbstractReteta() {
    }

    public AbstractReteta(String denumireMedicament, Map<String, Double> compozitieMedicament) {
        this.denumireMedicament = denumireMedicament;
        this.compozitieMedicament = compozitieMedicament;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public Map<String, Double> getCompozitieMedicament() {
        return compozitieMedicament;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public void setCompozitieMedicament(Map<String, Double> compozitieMedicament) {
        this.compozitieMedicament = compozitieMedicament;
    }

    public void modificareCantitateSolutie(String solutie, double cantitate) {
        if (compozitieMedicament.containsKey(solutie)) {
            compozitieMedicament.put(solutie, cantitate);
        } else {
            System.out.println("Solutia " + solutie + " nu exista in compozitia medicamentului " + denumireMedicament);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("RETETA ");
        builder.append(this.getDenumireMedicament().toUpperCase()).append(":\n");
        for (Map.Entry<String, Double> entry : this.getCompozitieMedicament().entrySet()) {
            builder.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return builder.toString();
    }

    public abstract AbstractReteta clone();
}
