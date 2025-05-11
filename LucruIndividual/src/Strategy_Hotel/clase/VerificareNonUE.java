package Strategy_Hotel.clase;

public class VerificareNonUE implements VerificareActe {
    @Override
    public void verificaActe(String numeClient) {
        System.out.println(numeClient + ", va rog sa prezentati pasaportul pentru a fi scanat, conform protocolului de cazare a clientilor europeni non-UE.");
    }
}
