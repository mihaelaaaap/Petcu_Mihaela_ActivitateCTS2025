package Banca.D2_FactoryMethod.clase;

public abstract class Client {
    private String nume;
    private String adresa;

    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa.toUpperCase();
    }

    public abstract void profilClient();
}
