package Spital.A2_Simple_Factory.main;

import Spital.A2_Simple_Factory.clase.Personal;
import Spital.A2_Simple_Factory.factory.FactoryPersonal;
import Spital.A2_Simple_Factory.factory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factory = new FactoryPersonal();

        Personal asistent1 = factory.createPersonal(TipPersonal.ASISTENT, "Popescu", "Maria", 4000, 5, null);
        Personal asistent2 = factory.createPersonal(TipPersonal.ASISTENT, "Grigore", "Rares", 3700, 3, null);
        Personal brancardier = factory.createPersonal(TipPersonal.BRANCARDIER, "Popa", "Ion", 3000, 1, null);
        Personal medic1 = factory.createPersonal(TipPersonal.MEDIC, "Sava", "Diana", 8000, 6, "diabetolog");
        Personal medic2 = factory.createPersonal(TipPersonal.MEDIC, "Oprea", "Mihai", 10000, 10, "chirurg estetician");

        asistent1.descriereProfilAngajat();
        asistent2.descriereProfilAngajat();
        brancardier.descriereProfilAngajat();
        medic1.descriereProfilAngajat();
        medic2.descriereProfilAngajat();
    }
}
