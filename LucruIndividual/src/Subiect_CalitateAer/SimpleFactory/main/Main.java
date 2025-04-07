package Subiect_CalitateAer.SimpleFactory.main;

import Subiect_CalitateAer.SimpleFactory.clase.AbstractAirQualityReport;
import Subiect_CalitateAer.SimpleFactory.factory.FactoryRapoarte;

public class Main {
    public static void main(String[] args) {
        FactoryRapoarte factory = new FactoryRapoarte();
        try {
            AbstractAirQualityReport r1 = factory.creeazaRaport(25);
            r1.afisareRaport();
            AbstractAirQualityReport r2 = factory.creeazaRaport(46);
            r2.afisareRaport();
            AbstractAirQualityReport r3 = factory.creeazaRaport(89);
            r3.afisareRaport();
            AbstractAirQualityReport r4 = factory.creeazaRaport(-5);
            r4.afisareRaport();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
