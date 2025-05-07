package Restaurant.B12_Observer.subject;

import Restaurant.B12_Observer.observers.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificare(String mesaj);
}
