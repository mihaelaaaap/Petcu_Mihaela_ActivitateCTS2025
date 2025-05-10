package Restaurant.B16_Chain_of_Responsibility.main;

import Restaurant.B16_Chain_of_Responsibility.observer.Client;
import Restaurant.B16_Chain_of_Responsibility.observer.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Client client1=new Client("Popa Luminita", "popa.luminita@gmail.com", "0733111009");
        Client client2=new Client("Toma Eugen", null, "0799288780");
        Client client3=new Client("Petre Maria", null, null);

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client3);

        restaurant.trimiteNotificare("Avem o noua pizza in meniu! Consultati catalogul nostru pentru detalii!");
    }
}
