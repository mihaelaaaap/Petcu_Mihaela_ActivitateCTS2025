package Subiect_AbonamenteTelefonie.SimpleFactory.factory;

import Subiect_AbonamenteTelefonie.SimpleFactory.clase.MobilityX;
import Subiect_AbonamenteTelefonie.SimpleFactory.clase.MobilityY;
import Subiect_AbonamenteTelefonie.SimpleFactory.clase.MobilityZ;
import Subiect_AbonamenteTelefonie.SimpleFactory.clase.Subscription;

public class FactoryAbonamente {
    public Subscription creeazaAbonament(TipAbonament abonament, double pretPeLuna) {
        return switch (abonament) {
          case X -> new MobilityX(pretPeLuna);
          case Y -> new MobilityZ(pretPeLuna);
          case Z -> new MobilityY(pretPeLuna);
          default -> null;
        };
    }
}
