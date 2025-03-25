package Restaurant.B3_Factory_Method.factories;

import Restaurant.B3_Factory_Method.clase.*;

import java.util.List;
import java.util.Map;

public class FactorySupe implements FactoryPreparate {

    @Override
    public Preparat createPreparat(TipPreparat preparat, List<String> ingrediente, float pret, Map<String, String> valoriNutritionale) {
        return switch ((TipSupa)preparat) {
            case CIUPERCI -> new SupaCiuperci(ingrediente, pret, valoriNutritionale);
            case LEGUME ->  new SupaLegume(ingrediente, pret, valoriNutritionale);
            case VITA -> new SupaVita(ingrediente, pret, valoriNutritionale);
            default -> null;
        };
    }
}
