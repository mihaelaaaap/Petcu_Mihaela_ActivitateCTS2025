package Restaurant.B3_Factory_Method.factories;

import Restaurant.B3_Factory_Method.clase.Cheesecake;
import Restaurant.B3_Factory_Method.clase.Clatite;
import Restaurant.B3_Factory_Method.clase.Papanasi;
import Restaurant.B3_Factory_Method.clase.Preparat;

import java.util.List;
import java.util.Map;

import static Restaurant.B3_Factory_Method.factories.TipDesert.*;

public class FactoryDeserturi implements FactoryPreparate {
    @Override
    public Preparat createPreparat(TipPreparat preparat, List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        return switch ((TipDesert)preparat) {
            case PAPANASI -> new Papanasi(ingrediente, pret, valoriNutritionale);
            case CLATITE ->  new Clatite(ingrediente, pret, valoriNutritionale);
            case CHEESECAKE -> new Cheesecake(ingrediente, pret, valoriNutritionale);
            default -> null;
        };
    }
}
