package Banca.D2_FactoryMethod.fabrici;

import Banca.D2_FactoryMethod.clase.Client;

public interface FactoryClienti {
    Client creeazaClient(String nume, String adresa, String informatiiSuplimentare);
}
