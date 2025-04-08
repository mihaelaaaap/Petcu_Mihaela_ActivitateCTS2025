package Subiect_Masina.FactoryMethod.fabrici;

import Subiect_Masina.FactoryMethod.clase.AMasina;
import Subiect_Masina.FactoryMethod.clase.SEDAN;

public class FactorySEDAN implements FactoryMasini {
    @Override
    public AMasina creeazaMasina(String numarInmatriculare, String marca, double kilometraj) throws Exception {
        return new SEDAN(numarInmatriculare, marca, kilometraj);
    }
}
