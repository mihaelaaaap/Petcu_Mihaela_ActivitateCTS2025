package Banca.D12_Observer.subject;

import Banca.D12_Observer.observer.ObserverBanca;

public interface SubjectBanca {
    void adaugaObserver(ObserverBanca observer);
    void stergeObserver(ObserverBanca observer);
    void trimiteNotificare(String mesaj);
}
