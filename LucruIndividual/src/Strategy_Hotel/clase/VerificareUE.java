package Strategy_Hotel.clase;

public class VerificareUE implements VerificareActe {
    @Override
    public void verificaActe(String numeClient) {
        System.out.println(numeClient + ", va rog sa prezentati buletinul pentru a fi scanat, conform protocolului de cazare a clientilor europeni UE.");
    }
}
