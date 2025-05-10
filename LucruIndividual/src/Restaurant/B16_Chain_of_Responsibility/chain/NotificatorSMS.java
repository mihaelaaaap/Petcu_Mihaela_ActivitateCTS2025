package Restaurant.B16_Chain_of_Responsibility.chain;

import Restaurant.B16_Chain_of_Responsibility.observer.Client;

public class NotificatorSMS extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getTelefon() != null){
            client.primesteSMS(mesaj);
        } else {
            this.getNext().notifica(client, mesaj);
        }
    }
}
