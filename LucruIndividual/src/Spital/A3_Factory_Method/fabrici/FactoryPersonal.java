package Spital.A3_Factory_Method.fabrici;

import Spital.A3_Factory_Method.clase.Personal;

public interface FactoryPersonal {
    Personal creeazaPersonal(TipPersonal tipPersonal, String nume, String prenume,
                             int salariu, int aniVechime, String informatiiAditionale);
}
