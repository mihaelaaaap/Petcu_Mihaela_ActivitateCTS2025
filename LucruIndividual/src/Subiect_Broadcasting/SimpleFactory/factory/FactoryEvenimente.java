package Subiect_Broadcasting.SimpleFactory.factory;

import Subiect_Broadcasting.SimpleFactory.clase.Conferinta;
import Subiect_Broadcasting.SimpleFactory.clase.Event;
import Subiect_Broadcasting.SimpleFactory.clase.Webinar;
import Subiect_Broadcasting.SimpleFactory.clase.Workshop;

public class FactoryEvenimente {
    public Event creeazaEveniment(TipEveniment tipEveniment, String titlu) {
        return switch (tipEveniment) {
            case WEBINAR -> new Webinar(titlu);
            case CONFERINTA -> new Conferinta(titlu);
            case WORKSHOP -> new Workshop(titlu);
            default -> null;
        };
    }
}
