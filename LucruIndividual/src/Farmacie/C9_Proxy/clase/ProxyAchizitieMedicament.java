package Farmacie.C9_Proxy.clase;

public class ProxyAchizitieMedicament implements IAchizitie {
    private IAchizitie achizitie;

    public ProxyAchizitieMedicament(IAchizitie achizitie) {
        this.achizitie = achizitie;
    }

    @Override
    public void achizitioneazaMedicament(String denumireMedicament, Client client) {
        if(client.areReteta) {
            this.achizitie.achizitioneazaMedicament(denumireMedicament, client);
        } else {
            System.out.println("Medicamentul " + denumireMedicament
                    + " poate fi achizitionat doar in baza unei retete medicale!");
        }
    }
}
