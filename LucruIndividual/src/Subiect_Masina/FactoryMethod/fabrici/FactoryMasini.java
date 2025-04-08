package Subiect_Masina.FactoryMethod.fabrici;

import Subiect_Masina.FactoryMethod.clase.AMasina;

public interface FactoryMasini {
    AMasina creeazaMasina(String numarInmatriculare, String marca, double kilometraj) throws Exception;
}
