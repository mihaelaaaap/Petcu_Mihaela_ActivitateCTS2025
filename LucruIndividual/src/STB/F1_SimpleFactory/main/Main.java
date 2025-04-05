package STB.F1_SimpleFactory.main;

import STB.F1_SimpleFactory.clase.MijlocTransport;
import STB.F1_SimpleFactory.factory.FactoryMijloaceTransport;
import STB.F1_SimpleFactory.factory.TipMijlocTransport;

public class Main {
    public static void main(String[] args) {
        FactoryMijloaceTransport factory = new FactoryMijloaceTransport();
        MijlocTransport autobuz = factory.creeazaMijlocTransport(TipMijlocTransport.autobuz,
                97, "Mihai");
        autobuz.descriereMijlocTransport();
        MijlocTransport troleibuz = factory.creeazaMijlocTransport(TipMijlocTransport.troleibuz,
                86, "Ionel");
        troleibuz.descriereMijlocTransport();
        MijlocTransport tramvai = factory.creeazaMijlocTransport(TipMijlocTransport.tramvai,
                41, "Gigel");
        tramvai.descriereMijlocTransport();

    }
}
