package Farmacie.C12_Observer.subject;

import Farmacie.C12_Observer.observer.ObserverFarmacie;

public interface SubjectFarmacie {
    void adaugaClient(ObserverFarmacie observer);
    void stergeClient(ObserverFarmacie observer);
    void trimiteNotificareOfertaNoua(String mesaj);
}
