package Banca.D10_Flyweight.clase;

public class Detinator {
    protected String nume;
    protected String cnp;
    protected String adresa;
    protected String adresaEmail;
    protected String nrTelefon;

    public Detinator(String nume, String cnp, String adresa, String adresaEmail, String nrTelefon) {
        this.nume = nume;
        this.cnp = cnp;
        this.adresa = adresa;
        this.adresaEmail = adresaEmail;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DETINATOR: ");
        sb.append(this.nume).append(" | CNP: ")
                .append(this.cnp).append("\nAdresa: ").append(adresa)
                .append("\nEmail: ").append(this.adresaEmail).append(" | Telefon: ").append(this.nrTelefon);
        return sb.toString();
    }
}
