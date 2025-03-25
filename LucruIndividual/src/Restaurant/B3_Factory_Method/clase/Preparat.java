package Restaurant.B3_Factory_Method.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Preparat {
    private List<String> ingrediente = new ArrayList<>();
    private float pret;
    private Map<String, String> valoriNutritionale = new HashMap<>();

    public Preparat(List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        this.ingrediente = ingrediente;
        this.pret = pret;
        this.valoriNutritionale = valoriNutritionale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INGREDIENTE:\n");
        for(String ingredient : ingrediente) {
            sb.append(" - ").append(ingredient).append("\n");
        }

        sb.append("VALORI NUTRITIONALE:\n");
        for (Map.Entry<String, String> entry : valoriNutritionale.entrySet()) {
            sb.append(" - ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }

        sb.append("PRET: ").append(pret).append(" RON\n");
        return sb.toString();
    }

    public abstract void descrierePreparat();
}
