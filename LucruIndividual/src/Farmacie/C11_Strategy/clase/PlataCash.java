package Farmacie.C11_Strategy.clase;

public class PlataCash implements ModPlata {
    @Override
    public void platesteReteta(Client client) {
        System.out.println("Stimate client " + client.getNume() +
                ", ati efectuat o plata cash in valoare de " + client.totalReteta() + " RON");
        client.sumarReteta();
    }
}
