package Sportiv.E6_Facade.main;


import Sportiv.E6_Facade.clase.FacadeAccesStadion;
import Sportiv.E6_Facade.clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1 = new Persoana("Popescu Ilie", "SZ583",
                true, false);
        Persoana persoana2 = new Persoana("Mihalache Ioana", "XY902",
                false, false);
        Persoana  persoana3 = new Persoana("Gheorghe Melania", "BZ123",
                false, true);
        Persoana persoana4 = new Persoana("Ionescu Gigel", "SZ112",
                true, true);

        FacadeAccesStadion facade = new FacadeAccesStadion();
        facade.setPersoana(persoana1);
        facade.permiteAccesIntrare(persoana1.getSerieBuletin(), "BILET1");

        facade.setPersoana(persoana2);
        facade.permiteAccesIntrare(persoana2.getSerieBuletin(), "BILET2");

        facade.setPersoana(persoana3);
        facade.permiteAccesIntrare(persoana3.getSerieBuletin(), "BILET3");

        facade.setPersoana(persoana4);
        facade.permiteAccesIntrare("SERIE_NECUNOSCUTA", "BILET4");
    }
}
