package STB.F4_Adapter.adapter_de_obiecte.main;

import STB.F4_Adapter.adapter_de_obiecte.clase.AdapterValidator;
import STB.F4_Adapter.adapter_de_obiecte.clase.ValidatorMetrou;

public class Main {
    public static void main(String[] args) {
        ValidatorMetrou validatorMetrou = new ValidatorMetrou();
        AdapterValidator adapterValidator = new AdapterValidator(validatorMetrou);
        adapterValidator.valideazaBilet();
    }
}
