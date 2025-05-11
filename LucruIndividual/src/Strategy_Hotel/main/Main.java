package Strategy_Hotel.main;

import Strategy_Hotel.clase.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VerificareActe verificareUE = new VerificareUE();
        VerificareActe verificareNonUE = new VerificareNonUE();
        VerificareActe verificareAmericani = new VerificareAmericani();

        Client client1 = new Client("Popescu Ion",  verificareUE);
        Client client2 = new Client("Kiril Anastasia",  verificareNonUE);
        Client client3 = new Client("John Doe",  verificareAmericani);

        List<Client> clienti = Arrays.asList(client1, client2, client3);
        for(Client client : clienti) {
            client.prezintaActe();
        }
        System.out.println();
        client1.setVerificareActe(verificareAmericani);
        client1.prezintaActe();
    }
}
