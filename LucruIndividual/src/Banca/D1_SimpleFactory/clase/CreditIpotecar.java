package Banca.D1_SimpleFactory.clase;

public class CreditIpotecar extends Credit {
    private String adresaImobil;

    public CreditIpotecar(String numeClient, int valoare, int durataInLuni, String adresaImobil) {
        super(numeClient, valoare, durataInLuni);
        this.adresaImobil = adresaImobil;
    }

    @Override
    public void descriereCredit() {
        StringBuilder stringBuilder = new StringBuilder("CREDIT IPOTECAR: ");
        stringBuilder.append(this.detaliiGeneraleCredit())
                .append("\n - Adresa imobilului pentru care s-a contractat creditul: ")
                .append(this.adresaImobil.toUpperCase());
        System.out.println(stringBuilder.toString());
    }
}
