package Restaurant.B16_Chain_of_Responsibility.observer;

public interface Subject {
    void trimiteNotificare(String mesaj);
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
}
