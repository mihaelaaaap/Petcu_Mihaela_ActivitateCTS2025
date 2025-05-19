package Farmacie.C6_Facade.clase;

public class FacadeFarmacie {
    private Reteta reteta;
    private Client client;

    public FacadeFarmacie(Reteta reteta, Client client) {
        this.reteta = reteta;
        this.client = client;
    }

    public void setReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void achizitioneazaReteta() {
        this.reteta.verificaReteta();
        for (Medicament medicament : this.reteta.medicamente) {
            medicament.verificaDisponibilitateMedicament();
        }
        this.client.verificaCardSanatate();
    }
}
