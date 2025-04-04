package Banca.D1_SimpleFactory.main;

import Banca.D1_SimpleFactory.clase.Credit;
import Banca.D1_SimpleFactory.factory.FactoryCredite;
import Banca.D1_SimpleFactory.factory.TipCredit;

public class Main {
    public static void main(String[] args) {
        FactoryCredite factoryCredite = new FactoryCredite();
        Credit creditNevoiPersonale = factoryCredite.creeazaCredit(TipCredit.NEVOI, "Ionel",
                5000, 24, "STUDII");
        Credit creditIpotecar = factoryCredite.creeazaCredit(TipCredit.IPOTECAR, "Gigel",
                75000, 120, "Str. Amurgului, Nr. 26, loc. Popesti-Leordeni, jud. IF");
        creditNevoiPersonale.descriereCredit();
        creditIpotecar.descriereCredit();
    }
}
