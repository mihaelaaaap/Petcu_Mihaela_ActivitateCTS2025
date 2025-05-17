package Banca.D11_Strategy.clase;

public class ActePF implements VerificareActe {
    @Override
    public void proceseazaDocumente(Client client) {
        System.out.println("--- PROTOCOL PERSOANE FIZICE ---");
        System.out.println("Stimate client " + client.getNume()
                + ", va rugam sa prezentati buletinul si adeverinta de salariat");
    }
}
