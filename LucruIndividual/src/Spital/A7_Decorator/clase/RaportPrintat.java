package Spital.A7_Decorator.clase;

import java.util.Map;

public class RaportPrintat implements IRaportAnalize {
    private String numePacient;
    private String data;
    private Map<String, Double> analize;

    public RaportPrintat(String numePacient, String data, Map<String, Double> analize) {
        this.numePacient = numePacient;
        this.data = data;
        this.analize = analize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RAPORT DE ANALIZE\n\n");
        sb.append("Nume pacient: ").append(this.numePacient)
                .append("\nData: ").append(this.data)
                .append("\n\nLista analizelor efectuate:\n");
        int count = 1;
        for (Map.Entry<String, Double> entry : this.analize.entrySet()) {
            sb.append("\t" + count + ") " + entry.getKey() + " - " + entry.getValue() + "mg/ml\n");
            count++;
        }
        return sb.toString();
    }

    @Override
    public void livreazaRaport() {
        System.out.println("Se printeaza raportul...");
        System.out.println(this.toString());
    }
}
