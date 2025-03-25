package Restaurant.B3_Factory_Method.clase;


import java.util.List;
import java.util.Map;

public class SupaLegume extends Preparat {
    public SupaLegume(List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        super(ingrediente, pret, valoriNutritionale);
    }

    @Override
    public void descrierePreparat() {
        System.out.println("----- Supa de legume -----");
        System.out.println(this.toString());
    }
}
