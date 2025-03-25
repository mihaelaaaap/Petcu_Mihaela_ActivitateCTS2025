package Spital.A3_Factory_Method.fabrici;

import Spital.A3_Factory_Method.clase.Asistent;
import Spital.A3_Factory_Method.clase.Brancardier;
import Spital.A3_Factory_Method.clase.Medic;
import Spital.A3_Factory_Method.clase.Personal;

public class FactoryPersonalSpital implements FactoryPersonal {

    @Override
    public Personal creeazaPersonal(TipPersonal tipPersonal, String nume, String prenume,
                                    int salariu, int aniVechime, String informatiiAditionale) {
        if (!(tipPersonal instanceof TipPersonal)) {
            throw new IllegalArgumentException("Tip incorect pentru personal!");
        }

        return switch ((TipPersonalSpital)tipPersonal){
            case ASISTENT -> new Asistent(nume, prenume, salariu, aniVechime);
            case MEDIC -> new Medic(nume, prenume, salariu, aniVechime, informatiiAditionale);
            case BRANCARDIER -> new Brancardier(nume, prenume, salariu, aniVechime);
            default -> null;
        };
    }
}
