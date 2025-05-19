package Farmacie.C7_Decorator.main;

import Farmacie.C7_Decorator.clase.BonDeCasa;
import Farmacie.C7_Decorator.clase.FelicitareAnNou;
import Farmacie.C7_Decorator.clase.IBon;

public class Main {
    public static void main(String[] args) {
        IBon bon = new BonDeCasa(1, 99.5f);
        IBon bonFinalAn = new FelicitareAnNou(bon);
        bonFinalAn.printeazaBon();
    }
}
