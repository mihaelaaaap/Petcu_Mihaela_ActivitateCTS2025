package Facade.main;

import Facade.clase.Facade;
import Facade.clase.Masa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1, true);
        Masa masa2 = new Masa(2, true);
        Masa masa3 = new Masa(3, false);
        Masa masa4 = new Masa(4, true);

        List<Masa> mese = new ArrayList<Masa>();
        mese.add(masa1);
        mese.add(masa2);
        mese.add(masa3);
        mese.add(masa4);

        Facade facade = new Facade();
        for(Masa masa : mese) {
            System.out.println(facade.verificaAfisareMasa(masa));
        }

    }
}
