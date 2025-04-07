package Subiect_Bicicleta.Builder.main;

import Subiect_Bicicleta.Builder.clase.Bicicleta;
import Subiect_Bicicleta.Builder.clase.IBicicleta;
import Subiect_Bicicleta.Builder.clase.TipFrana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IBicicleta> listaBiciclete = new ArrayList<IBicicleta>();

        listaBiciclete.add(new Bicicleta.BuilderBiciclete().construiesteBicicleta());
        listaBiciclete.add(new Bicicleta.BuilderBiciclete()
                .setDiametruRoti(20).setPret(250).setAreCascaProtectie(true)
                .setTipFrana(TipFrana.DISC).construiesteBicicleta());
        listaBiciclete.add(new Bicicleta.BuilderBiciclete()
                .setDiametruRoti(25.8f).setPret(800)
                .setTipFrana(TipFrana.V_BRAKE).setAreCotiere(true)
                .setAreGenunchiere(true).construiesteBicicleta());
        listaBiciclete.add(new Bicicleta.BuilderBiciclete()
                .setDiametruRoti(45.9f).setPret(1250).setAreCascaProtectie(true)
                .setTipFrana(TipFrana.TAMBUR).setAreCotiere(true)
                .setAreGenunchiere(true).construiesteBicicleta());
        listaBiciclete.add(new Bicicleta.BuilderBiciclete()
                .setDiametruRoti(39).setPret(920)
                .setTipFrana(TipFrana.DISC).setAreOchelari(true)
                .construiesteBicicleta());

        int contor = 1;
        for(IBicicleta bicicleta : listaBiciclete) {
            System.out.println("Bicicleta " + contor + ":");
            bicicleta.descriere();
            contor++;
        }
    }
}
