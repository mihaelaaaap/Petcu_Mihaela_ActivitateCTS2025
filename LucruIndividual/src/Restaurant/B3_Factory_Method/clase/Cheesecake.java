package Restaurant.B3_Factory_Method.clase;

import java.util.List;
import java.util.Map;

public class Cheesecake extends Preparat {
    public Cheesecake(List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        super(ingrediente, pret, valoriNutritionale);
    }

    @Override
    public void descrierePreparat() {
        System.out.println("----- Cheesecake -----");
        System.out.println(this.toString());
    }
}
