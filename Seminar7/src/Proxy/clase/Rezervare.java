package Proxy.clase;

public class Rezervare implements IRezervare {
    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        System.out.println("Rezervare realizata pentru " + numeClient + " - " + numarPersoane + " persoane.");
    }
}
