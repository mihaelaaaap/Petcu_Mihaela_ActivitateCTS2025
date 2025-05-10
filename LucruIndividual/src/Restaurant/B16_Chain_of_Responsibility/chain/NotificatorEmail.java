package Restaurant.B16_Chain_of_Responsibility.chain;

import Restaurant.B16_Chain_of_Responsibility.observer.Client;

public class NotificatorEmail extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail() != null){
            client.primesteEmail(mesaj);
        } else {
            this.getNext().notifica(client, mesaj);
        }
    }
}
