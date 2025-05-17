package Spital.A12_Observer.subject;

import Spital.A12_Observer.observer.ObserverSpital;

public interface SubjectSpital {
    void adaugaPacient(ObserverSpital observer);
    void stergePacient(ObserverSpital observer);
    void trimiteAlerta(String mesaj);
}
