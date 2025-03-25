package Restaurant.B3_Factory_Method.factories;

import Restaurant.B3_Factory_Method.clase.Preparat;

import java.util.List;
import java.util.Map;

public interface FactoryPreparate {
    Preparat createPreparat(TipPreparat preparat, List<String> ingrediente, float pret, Map<String, String> valoriNutritionale);
}
