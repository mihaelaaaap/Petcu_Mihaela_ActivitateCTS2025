package Banca.D2_FactoryMethod.fabrici;

import Banca.D2_FactoryMethod.clase.Client;
import Banca.D2_FactoryMethod.clase.PersoanaJuridica;

public class FactoryPJ implements FactoryClienti {
    @Override
    public Client creeazaClient(String nume, String adresa, String informatiiSuplimentare) {
        return new PersoanaJuridica(nume, adresa, informatiiSuplimentare);
    }
}
