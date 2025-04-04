package Farmacie.C4_Prototype.clase;

import java.util.Map;

public abstract class RetetaAbstracta {
    private String denumireMedicament;
    private Map<String, Double> compozitieMedicament;

    public RetetaAbstracta(String denumireMedicament, Map<String, Double> compozitieMedicament) {
        this.denumireMedicament = denumireMedicament;
        this.compozitieMedicament = compozitieMedicament;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public Map<String, Double> getCompozitieMedicament() {
        return compozitieMedicament;
    }

    public void setCompozitieMedicament(Map<String, Double> compozitieMedicament) {
        this.compozitieMedicament = compozitieMedicament;
    }

    public void modificareCompozitieMedicament(String denumireSolutie, double cantitateNoua){
        if(compozitieMedicament.containsKey(denumireSolutie)){
            compozitieMedicament.put(denumireSolutie, cantitateNoua);
        } else {
            System.out.println("Medicamentul " + this.denumireMedicament + " nu contine "
            + denumireSolutie);
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nRETETA PENTRU ");
        sb.append(denumireMedicament).append(':');
        for(Map.Entry<String, Double> entry : compozitieMedicament.entrySet()) {
            sb.append("\n - " + entry.getKey()).append(": ").append(entry.getValue());
        }
        return sb.toString();
    }

    public abstract RetetaAbstracta clone();
}
