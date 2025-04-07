package Subiect_CalitateAer.SimpleFactory.factory;

import Subiect_CalitateAer.SimpleFactory.clase.AbstractAirQualityReport;
import Subiect_CalitateAer.SimpleFactory.clase.RaportAerCurat;
import Subiect_CalitateAer.SimpleFactory.clase.RaportAvertizare;
import Subiect_CalitateAer.SimpleFactory.clase.RaportRisc;

public class FactoryRapoarte {
    private static final int LIMITA_INFERIOARA = 0;
    private static final int LIMITA_MIJLOC = 30;
    private static final int LIMITA_SUPERIOARA = 70;

    public AbstractAirQualityReport creeazaRaport(int valoarePM25) throws Exception {
        if(valoarePM25 >= LIMITA_INFERIOARA && valoarePM25 <= LIMITA_MIJLOC) {
            return new RaportAerCurat(valoarePM25);
        } else if(valoarePM25 >= LIMITA_MIJLOC + 1 && valoarePM25 <= LIMITA_SUPERIOARA) {
            return new RaportAvertizare(valoarePM25);
        } else if(valoarePM25 >= LIMITA_SUPERIOARA + 1) {
            return new RaportRisc(valoarePM25);
        } else {
            throw new Exception("Valoare PM 2.5 sub limita minima admisa!");
        }
    }
}
