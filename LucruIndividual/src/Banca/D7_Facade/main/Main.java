package Banca.D7_Facade.main;

import Banca.D7_Facade.clase.FacadeCreareCont;
import Banca.D7_Facade.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Popescu Ilie", 55,
                true, false);
        Persoana persoana2 = new Persoana("Mihalache Ioana", 16,
                false, false);
        Persoana  persoana3 = new Persoana("Gheorghe Melania", 67,
                false, true);
        Persoana persoana4 = new Persoana("Popa Octavian", 30,
                false, false);
        Persoana persoana5 = new Persoana("Ionescu Gigel", 29,
                true, true);
        Persoana persoana6 = new Persoana("Oprea Melania", 17,
                true, true);

        FacadeCreareCont facade = new FacadeCreareCont();
        facade.comunicareDecizieEligibilitate(persoana1);
        facade.comunicareDecizieEligibilitate(persoana2);
        facade.comunicareDecizieEligibilitate(persoana3);
        facade.comunicareDecizieEligibilitate(persoana4);
        facade.comunicareDecizieEligibilitate(persoana5);
        facade.comunicareDecizieEligibilitate(persoana6);

    }
}
