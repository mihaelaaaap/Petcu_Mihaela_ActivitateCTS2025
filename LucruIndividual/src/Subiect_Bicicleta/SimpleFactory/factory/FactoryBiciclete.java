package Subiect_Bicicleta.SimpleFactory.factory;

import Subiect_Bicicleta.SimpleFactory.clase.*;

public class FactoryBiciclete {
    public IBicicleta creeazaBicicleta(TipBicicleta tipBicicleta, float diametruRoti, float pret, TipFrana tipFrana,
                                       boolean areCascaProtectie, boolean areOchelari, boolean areCotiere,
                                       boolean areGenunchiere) throws Exception {
        return switch (tipBicicleta) {
            case MTB -> new BicicletaMTB(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
            case ELECTRICA -> new BicicletaElectrica(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
            case TREKKING -> new BicicletaTrekking(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
            default -> throw new Exception("Tip de bicicleta invalid!");
        };
    }
}
