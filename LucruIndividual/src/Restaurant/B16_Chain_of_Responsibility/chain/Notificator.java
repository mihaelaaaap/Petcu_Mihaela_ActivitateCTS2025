package Restaurant.B16_Chain_of_Responsibility.chain;

import Restaurant.B16_Chain_of_Responsibility.observer.Client;

public abstract class Notificator {
    private Notificator next;

    public Notificator getNext() {
        return next;
    }

    public void setNext(Notificator next) {
        this.next = next;
    }

    public abstract void notifica(Client client, String mesaj);
}
