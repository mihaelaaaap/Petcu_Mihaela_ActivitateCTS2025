package Restaurant.B12_Observer.main;

import Restaurant.B12_Observer.observers.ClientFidel;
import Restaurant.B12_Observer.observers.Observer;
import Restaurant.B12_Observer.subject.Restaurant;

public class Main {
    public static void main(String[] args) {
        Observer clientFidel1 = new ClientFidel("Manole Ioana");
        Observer clientFidel2 = new ClientFidel("Petre Alexandru");
        Observer clientFidel3 = new ClientFidel("Eremia Diana");

        Restaurant restaurant = new Restaurant("CTS Cuisine",
                "Bucuresti, Calea Dorobanti 15-17, Sala 2001A");

        restaurant.adaugaObserver(clientFidel1);
        restaurant.adaugaObserver(clientFidel2);
        restaurant.adaugaObserver(clientFidel3);
        restaurant.trimiteNotificareOfertaNoua();

        System.out.println("\n\n");
        restaurant.stergeObserver(clientFidel1);
        restaurant.trimiteNotificareMeniuNou();
    }
}
