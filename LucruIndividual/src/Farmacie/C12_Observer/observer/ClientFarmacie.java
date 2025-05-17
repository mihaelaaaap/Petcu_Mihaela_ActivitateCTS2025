package Farmacie.C12_Observer.observer;

public class ClientFarmacie implements ObserverFarmacie {
    private String nume;

    public ClientFarmacie(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume + ", ai primit urmatorul mesaj: " + mesaj);
    }
}
