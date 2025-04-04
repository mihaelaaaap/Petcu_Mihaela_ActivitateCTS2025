package Banca.D1_SimpleFactory.clase;

public class CreditNevoiPersonale extends Credit {
    private String scopCredit;

    public CreditNevoiPersonale(String numeClient, int valoare, int durataInLuni, String scopCredit) {
        super(numeClient, valoare, durataInLuni);
        this.scopCredit = scopCredit;
    }

    @Override
    public void descriereCredit() {
        StringBuilder stringBuilder = new StringBuilder("CREDIT DE NEVOI PERSONALE: ");
        stringBuilder.append(this.detaliiGeneraleCredit())
                .append("\n - Scopul creditului: ").append(this.scopCredit);
        System.out.println(stringBuilder.toString());
    }
}
