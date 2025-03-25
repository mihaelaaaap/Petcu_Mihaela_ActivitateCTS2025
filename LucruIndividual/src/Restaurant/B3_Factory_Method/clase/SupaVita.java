package Restaurant.B3_Factory_Method.clase;

import java.util.List;
import java.util.Map;

public class SupaVita extends Preparat {
    public SupaVita(List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        super(ingrediente, pret, valoriNutritionale);
    }

    @Override
    public void descrierePreparat() {
        System.out.println("----- Supa de vita -----");
        System.out.println(this.toString());
    }
}
