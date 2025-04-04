package Banca.D2_FactoryMethod.clase;



public class PersoanaFizica extends Client {
    private String CNP;

    public PersoanaFizica(String nume, String adresa, String CNP) {
        super(nume, adresa);
        this.CNP = CNP;
    }

    @Override
    public void profilClient() {
        StringBuilder stringBuilder = new StringBuilder("--- PROFIL PERSOANA FIZICA ---");
        stringBuilder.append("\nNume client: ").append(this.getNume())
                .append("\nCNP: ").append(this.CNP)
                .append("\nAdresa: ").append(this.getAdresa());
        System.out.println(stringBuilder.toString());
    }
}
