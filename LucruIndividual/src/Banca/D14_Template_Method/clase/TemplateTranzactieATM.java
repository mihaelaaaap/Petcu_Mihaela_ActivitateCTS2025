package Banca.D14_Template_Method.clase;

public abstract class TemplateTranzactieATM {
    protected Client client;

    public final void retrageBani(Client client) {
        this.client = client;

        introducereCard();
        introducerePin();
        if(verificarePin()) {
            solicitaSuma();
            if(verificareSold()) {
                retragereBani();
            } else {
                System.out.println("Fonduri insuficiente! Sold: " + client.getSold() + " RON");
            }
        } else {
            System.out.println("Ati introdus un cod PIN incorect!");
        }
        retragereCard();
    }

    protected abstract void introducereCard();
    protected abstract void introducerePin();
    protected abstract boolean verificarePin();
    protected abstract void solicitaSuma();
    protected abstract boolean verificareSold();
    protected abstract void retragereBani();
    protected abstract void retragereCard();
}
