package Restaurant.B3_Factory_Method.clase;

import java.util.List;
import java.util.Map;

public class Papanasi extends Preparat {
    public Papanasi(List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        super(ingrediente, pret, valoriNutritionale);
    }

    @Override
    public void descrierePreparat() {
        System.out.println("----- Papanasi -----");
        System.out.println(this.toString());
    }
}
