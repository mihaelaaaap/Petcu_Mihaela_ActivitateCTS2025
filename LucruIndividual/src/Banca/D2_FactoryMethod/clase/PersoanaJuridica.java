package Banca.D2_FactoryMethod.clase;

public class PersoanaJuridica extends Client {
    private String CUI;

    public PersoanaJuridica(String nume, String adresa, String CUI) {
        super(nume, adresa);
        this.CUI = CUI;
    }

    @Override
    public void profilClient() {
        StringBuilder stringBuilder = new StringBuilder("--- PROFIL PERSOANA JURIDICA ---");
        stringBuilder.append("\nNume client: ").append(this.getNume())
                .append("\nCUI: ").append(this.CUI)
                .append("\nAdresa firma: ").append(this.getAdresa());
        System.out.println(stringBuilder.toString());
    }
}
