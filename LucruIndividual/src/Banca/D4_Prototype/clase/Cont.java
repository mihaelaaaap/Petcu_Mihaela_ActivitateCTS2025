package Banca.D4_Prototype.clase;

public class Cont implements PrototypeCont {
    private String numeClient;
    private String IBAN;
    private Valuta valuta;
    private float sold;

    public Cont() {
    }

    public Cont(String numeClient, String IBAN, Valuta valuta, float sold) {
        this.numeClient = numeClient;
        this.IBAN = IBAN;
        this.valuta = valuta;
        this.sold = sold;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contul clientului ");
        sb.append(this.numeClient).append(':')
                .append("\n -> IBAN: ").append(this.IBAN)
                .append("\n -> Valuta: ").append(this.valuta)
                .append("\n -> Sold: ").append(this.sold);
        return sb.toString();
    }

    @Override
    public PrototypeCont clone() {
        Cont clona = new Cont();
        clona.setNumeClient(this.numeClient);
        clona.setIBAN(this.IBAN);
        clona.setValuta(this.valuta);
        clona.setSold(this.sold);
        return clona;
    }
}
