package Spital.A3_Factory_Method.main;

import Spital.A3_Factory_Method.clase.Personal;
import Spital.A3_Factory_Method.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonalSpital = new FactoryPersonalSpital();
        FactoryPersonal factoryPersonalNonMedical = new FactoryPersonalNonMedical();

        Personal registrator = factoryPersonalNonMedical.creeazaPersonal(TipPersonalNonMedical.REGISTRATOR, "Mihai", "Ioana", 3700, 5, null);
        Personal secretar = factoryPersonalNonMedical.creeazaPersonal(TipPersonalNonMedical.SECRETAR, "Andrei", "Lucretia", 6000, 15, null);
        Personal asistent = factoryPersonalSpital.creeazaPersonal(TipPersonalSpital.ASISTENT, "Popescu", "Maria", 4000, 5, null);
        Personal brancardier = factoryPersonalSpital.creeazaPersonal(TipPersonalSpital.BRANCARDIER, "Popa", "Ion", 3000, 1, null);
        Personal medic = factoryPersonalSpital.creeazaPersonal(TipPersonalSpital.MEDIC, "Pop", "Maria", 8000, 10, "dermatolog");

        registrator.descriereProfilAngajat();
        secretar.descriereProfilAngajat();
        asistent.descriereProfilAngajat();
        medic.descriereProfilAngajat();
        brancardier.descriereProfilAngajat();
    }
}
