package Banca.D11_Strategy.clase;

public class Client {
    private String nume;
    private VerificareActe verificareActe;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVerificareActe(VerificareActe verificareActe) {
        this.verificareActe = verificareActe;
    }

    public void prezintaActe() {
        this.verificareActe.proceseazaDocumente(this);
    }
}
