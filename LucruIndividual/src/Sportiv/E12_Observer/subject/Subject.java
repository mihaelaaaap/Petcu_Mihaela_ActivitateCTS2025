package Sportiv.E12_Observer.subject;

import Sportiv.E12_Observer.observer.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaObserveri(Meci meci);
}
