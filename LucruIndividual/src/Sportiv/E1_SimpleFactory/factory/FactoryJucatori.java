package Sportiv.E1_SimpleFactory.factory;

import Sportiv.E1_SimpleFactory.clase.*;

public class FactoryJucatori {
    public Jucator creeazaJucator(TipJucator tipJucator, String nume,
                                  boolean esteCapitanulEchipei, int numarTricou, int extra)
            throws IllegalArgumentException {
        return switch (tipJucator) {
            case FUNDAS -> new Fundas(nume, numarTricou, esteCapitanulEchipei, extra);
            case PORTAR -> new Portar(nume, numarTricou, esteCapitanulEchipei, extra);
            case ATACANT -> new Atacant(nume, numarTricou, esteCapitanulEchipei, extra);
            case MIJLOCAS -> new Mijlocas(nume, numarTricou, esteCapitanulEchipei, extra);
            default -> throw new IllegalArgumentException("Tipul de jucator " + tipJucator.toString().toUpperCase() + " nu exista!");
        };
    }
}
