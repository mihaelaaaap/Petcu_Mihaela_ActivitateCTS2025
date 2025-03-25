package Restaurant.B3_Factory_Method.clase;

import java.util.List;
import java.util.Map;

public class Clatite extends Preparat {
    public Clatite(List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        super(ingrediente, pret, valoriNutritionale);
    }

    @Override
    public void descrierePreparat() {
        System.out.println("----- Clatite -----");
        System.out.println(this.toString());
    }
}
