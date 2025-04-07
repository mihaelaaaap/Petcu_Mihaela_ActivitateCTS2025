package Subiect_Bicicleta.SimpleFactory.main;

import Subiect_Bicicleta.SimpleFactory.clase.IBicicleta;
import Subiect_Bicicleta.SimpleFactory.clase.TipFrana;
import Subiect_Bicicleta.SimpleFactory.factory.FactoryBiciclete;
import Subiect_Bicicleta.SimpleFactory.factory.TipBicicleta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryBiciclete fabrica = new FactoryBiciclete();
        List<IBicicleta> listaBiciclete = new ArrayList<IBicicleta>();

        try {
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.MTB, 30, 499.99f, TipFrana.DISC,
                    false, false, true, true));
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.ELECTRICA, 45, 1200, TipFrana.V_BRAKE,
                    true, true, true, true));
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.TREKKING, 47.5f, 1499.5f, TipFrana.DISC,
                    true, false, true, true));
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.MTB, 24.3f, 549.99f, TipFrana.TAMBUR,
                    false, false, false, false));
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.ELECTRICA, 39.8f, 1000, TipFrana.V_BRAKE,
                    false, false, true, true));

        } catch (Exception e) {
            e.printStackTrace();
        }

        int contor = 1;
        for (IBicicleta bicicleta : listaBiciclete) {
            System.out.println("Bicicleta " + contor + ":");
            bicicleta.descriere();
            contor++;
        }

    }
}
