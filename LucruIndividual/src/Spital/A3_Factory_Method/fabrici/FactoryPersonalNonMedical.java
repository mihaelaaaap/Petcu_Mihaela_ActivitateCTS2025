package Spital.A3_Factory_Method.fabrici;

import Spital.A3_Factory_Method.clase.*;

public class FactoryPersonalNonMedical implements FactoryPersonal {
    @Override
    public Personal creeazaPersonal(TipPersonal tipPersonal, String nume, String prenume,
                                    int salariu, int aniVechime, String informatiiAditionale) {
        if (!(tipPersonal instanceof TipPersonal)) {
            throw new IllegalArgumentException("Tip incorect pentru personal!");
        }

        return switch ((TipPersonalNonMedical)tipPersonal){
            case SECRETAR -> new Secretar(nume, prenume, salariu, aniVechime);
            case REGISTRATOR -> new Registrator(nume, prenume, salariu, aniVechime);
            default -> null;
        };
    }
}
