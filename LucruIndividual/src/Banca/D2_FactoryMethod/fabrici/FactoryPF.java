package Banca.D2_FactoryMethod.fabrici;

import Banca.D2_FactoryMethod.clase.Client;
import Banca.D2_FactoryMethod.clase.PersoanaFizica;

public class FactoryPF implements FactoryClienti {
    @Override
    public Client creeazaClient(String nume, String adresa, String informatiiSuplimentare) {
        return new PersoanaFizica(nume, adresa, informatiiSuplimentare);
    }
}
