package Farmacie.C9_Proxy.clase;

public class Achizitie implements IAchizitie {
    @Override
    public void achizitioneazaMedicament(String denumireMedicament, Client client) {
        System.out.println("Clientul " + client.nume + " a achizitionat medicamentul " + denumireMedicament);
    }
}
