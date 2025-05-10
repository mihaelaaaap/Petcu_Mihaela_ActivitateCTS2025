package Restaurant.B16_Chain_of_Responsibility.chain;

import Restaurant.B16_Chain_of_Responsibility.observer.Client;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Clientul " + client.getNume() + " nu are date de contact!");
    }
}
