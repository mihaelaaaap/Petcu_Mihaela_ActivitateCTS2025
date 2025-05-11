package Strategy_Hotel.clase;

public class VerificareAmericani implements VerificareActe {
    @Override
    public void verificaActe(String numeClient) {
        System.out.println(numeClient + ", va rog sa prezentati viza pentru a fi scanata, conform protocolului de cazare a clientilor americani");
    }
}
