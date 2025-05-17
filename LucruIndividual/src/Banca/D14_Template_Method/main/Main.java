package Banca.D14_Template_Method.main;

import Banca.D14_Template_Method.clase.Client;
import Banca.D14_Template_Method.clase.RetragereATM;
import Banca.D14_Template_Method.clase.TemplateTranzactieATM;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Mihaela", "0604", 100);
        TemplateTranzactieATM template = new RetragereATM();

        for(int i = 0; i<3; i++) {
            template.retrageBani(client);
            System.out.println();
        }
    }
}
