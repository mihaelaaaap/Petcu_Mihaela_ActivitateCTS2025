package Farmacie.C3_Builder.main;

import Farmacie.C3_Builder.clase.BuilderFacturi;
import Farmacie.C3_Builder.clase.Factura;

public class Main {
    public static void main(String[] args) {
        BuilderFacturi builder = new BuilderFacturi();
        Factura factura = builder.setPlatesteCuCardul(true).setNumarPungi(2).setCotaTVA(5)
                .build("F1", "Petcu Mihaela");
        System.out.println(factura.toString());
        Factura factura2 = builder.setPlatesteCuCardul(false).
                setAreCardDeFidelitate(true)
                .setCotaTVA(0)
                .build("F2", "Popescu Gigel");
        System.out.println(factura2.toString());
    }
}
