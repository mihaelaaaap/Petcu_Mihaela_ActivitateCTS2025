package Restaurant.B16_Chain_of_Responsibility.observer;

import Restaurant.B16_Chain_of_Responsibility.chain.Notificator;
import Restaurant.B16_Chain_of_Responsibility.chain.NotificatorEmail;
import Restaurant.B16_Chain_of_Responsibility.chain.NotificatorManager;
import Restaurant.B16_Chain_of_Responsibility.chain.NotificatorSMS;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {
    private List<Observer> clientiFideli;

    public Restaurant() {
        this.clientiFideli = new ArrayList<>();
    }


    @Override
    public void trimiteNotificare(String mesaj) {
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setNext(notificatorEmail);
        notificatorEmail.setNext(notificatorManager);

        for (Observer observer : clientiFideli) {
            notificatorSMS.notifica((Client) observer, mesaj);
        }
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.clientiFideli.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.clientiFideli.remove(observer);
    }
}
