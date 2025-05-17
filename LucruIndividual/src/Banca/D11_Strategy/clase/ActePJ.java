package Banca.D11_Strategy.clase;

public class ActePJ implements VerificareActe {
    @Override
    public void proceseazaDocumente(Client client) {
        System.out.println("--- PROTOCOL PERSOANE JURIDICE ---");
        System.out.println("Stimate client " + client.getNume()
                + ", va rugam sa prezentati cererea de inregistrare la ONRC");
    }
}
