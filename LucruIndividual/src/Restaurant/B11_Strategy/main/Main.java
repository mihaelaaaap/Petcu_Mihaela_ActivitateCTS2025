package Restaurant.B11_Strategy.main;

import Restaurant.B11_Strategy.clase.Client;
import Restaurant.B11_Strategy.clase.PlataCard;
import Restaurant.B11_Strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Mirabela");
        client.plateste(100);

        Client client2 = new Client("Ionel", new PlataCash());
        client2.plateste(100);
        client2.setMetodaPlata(new PlataCard());
        client2.plateste(150);
    }
}
