package Strategy_Hotel.clase;

public class Client {
    private String numeClient;
    private VerificareActe verificareActe;

    public Client(String numeClient, VerificareActe verificareActe) {
        this.numeClient = numeClient;
        this.verificareActe = verificareActe;
    }

    public void setVerificareActe(VerificareActe verificareActe) {
        this.verificareActe = verificareActe;
    }

    public void prezintaActe() {
        this.verificareActe.verificaActe(this.numeClient);
    }
}
