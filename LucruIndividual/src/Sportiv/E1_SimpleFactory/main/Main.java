package Sportiv.E1_SimpleFactory.main;

import Sportiv.E1_SimpleFactory.clase.Jucator;
import Sportiv.E1_SimpleFactory.factory.FactoryJucatori;
import Sportiv.E1_SimpleFactory.factory.TipJucator;

public class Main {
    public static void main(String[] args) {
        FactoryJucatori factory = new FactoryJucatori();
        Jucator portar = factory.creeazaJucator(TipJucator.PORTAR, "Florin NITA",
                false, 1, 9);
        Jucator fundas = factory.creeazaJucator(TipJucator.FUNDAS, "Radu DRAGUSIN",
                false, 3, 5);
        Jucator atacant = factory.creeazaJucator(TipJucator.ATACANT, "Dennis MAN",
                false, 20, 3);
        Jucator mijlocas = factory.creeazaJucator(TipJucator.MIJLOCAS, "Nicolae STANCIU",
                true, 21, 25);
        portar.descriereProfilJucator();
        mijlocas.descriereProfilJucator();
        fundas.descriereProfilJucator();
        atacant.descriereProfilJucator();
    }
}
