package Banca.D1_SimpleFactory.factory;

import Banca.D1_SimpleFactory.clase.Credit;
import Banca.D1_SimpleFactory.clase.CreditIpotecar;
import Banca.D1_SimpleFactory.clase.CreditNevoiPersonale;

public class FactoryCredite {
    public Credit creeazaCredit(TipCredit credit, String numeClient, int valoare,
                                int durataInLuni, String detaliiExtra) {
        return switch(credit) {
            case NEVOI ->  new CreditNevoiPersonale(numeClient, valoare, durataInLuni, detaliiExtra);
            case IPOTECAR -> new CreditIpotecar(numeClient, valoare, durataInLuni, detaliiExtra);
        };
    }
}
