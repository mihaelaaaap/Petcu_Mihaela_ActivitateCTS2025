package Banca.D11_Strategy.main;

import Banca.D11_Strategy.clase.ActePF;
import Banca.D11_Strategy.clase.ActePJ;
import Banca.D11_Strategy.clase.Client;
import Banca.D11_Strategy.clase.VerificareActe;

public class Main {
    public static void main(String[] args) {
        VerificareActe actePF = new ActePF();
        VerificareActe actePJ = new ActePJ();

        Client client = new Client("Popescu Maria");
        client.setVerificareActe(actePF);
        client.prezintaActe();
        System.out.println();

        client.setVerificareActe(actePJ);
        client.prezintaActe();
    }
}
