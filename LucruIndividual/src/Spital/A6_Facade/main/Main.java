package Spital.A6_Facade.main;

import Spital.A6_Facade.clase.*;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Salon salon = new Salon(1, new ArrayList<>(Arrays.asList(true, false, false)));

        Medic medic = new Medic("Marius Sava");

        Pacient pacientOK = new Pacient("Maria Ionescu", StarePacient.BUNA, 30);
        Pacient pacientGRAV1 = new Pacient("Ionel Popescu", StarePacient.GRAVA, 55);
        Pacient pacientGRAV2 = new Pacient("Gigel Petre", StarePacient.GRAVA, 60);

        FacadeInternare facade = new FacadeInternare(medic, salon);

        facade.protocolInternarePacient(pacientOK);
        System.out.println();

        facade.protocolInternarePacient(pacientGRAV1);
        System.out.println();

        facade.protocolInternarePacient(pacientGRAV2);
        System.out.println();

        facade.setSalon(new Salon(2, new ArrayList<>(Arrays.asList(true, true, false))));
        facade.protocolInternarePacient(pacientGRAV2);
    }
}
