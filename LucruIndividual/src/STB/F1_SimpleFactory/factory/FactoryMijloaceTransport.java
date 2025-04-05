package STB.F1_SimpleFactory.factory;

import STB.F1_SimpleFactory.clase.Autobuz;
import STB.F1_SimpleFactory.clase.MijlocTransport;
import STB.F1_SimpleFactory.clase.Tramvai;
import STB.F1_SimpleFactory.clase.Troleibuz;

public class FactoryMijloaceTransport {
    public MijlocTransport creeazaMijlocTransport(TipMijlocTransport tipMijlocTransport,
                                                  int linie, String numeSofer) throws IllegalArgumentException {
        return switch (tipMijlocTransport) {
            case autobuz -> new Autobuz(numeSofer, linie);
            case tramvai -> new Tramvai(numeSofer, linie);
            case troleibuz -> new Troleibuz(numeSofer, linie);
            default -> throw new IllegalArgumentException("Tipul mijlocului de transport este invalid!");
        };
    }
}
