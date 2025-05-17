package Spital.A12_Observer.observer;

public class Pacient implements ObserverSpital {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteAlerta(String mesaj) {
        System.out.println("ALERTA! " + this.nume + ", tocmai ai primit urmatorul mesaj:\n\t" + mesaj);
    }
}
