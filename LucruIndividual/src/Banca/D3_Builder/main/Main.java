package Banca.D3_Builder.main;

import Banca.D3_Builder.clase.BuilderConturi;
import Banca.D3_Builder.clase.Cont;


public class Main {
    public static void main(String[] args) {
        BuilderConturi builder = new BuilderConturi("Maria");
        Cont cont1 = builder.setEsteContSalariu(true).setAreCardAtasat(true).build();
        System.out.println(cont1.toString());
    }
}
