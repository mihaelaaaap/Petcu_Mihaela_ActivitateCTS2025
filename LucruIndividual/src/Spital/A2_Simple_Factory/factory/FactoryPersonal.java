package Spital.A2_Simple_Factory.factory;

import Spital.A2_Simple_Factory.clase.Asistent;
import Spital.A2_Simple_Factory.clase.Brancardier;
import Spital.A2_Simple_Factory.clase.Medic;
import Spital.A2_Simple_Factory.clase.Personal;

public class FactoryPersonal {
    public Personal createPersonal(TipPersonal tipPersonal, String nume, String prenume,
                                   int salariu, int aniVechime, String informatiiAditionale) {
        if (!(tipPersonal instanceof TipPersonal)) {
            throw new IllegalArgumentException("Tip incorect pentru personal!");
        }

        return switch (tipPersonal){
            case ASISTENT -> new Asistent(nume, prenume, salariu, aniVechime);
            case MEDIC -> new Medic(nume, prenume, salariu, aniVechime, informatiiAditionale);
            case BRANCARDIER -> new Brancardier(nume, prenume, salariu, aniVechime);
            default -> null;
        };
    }
}
