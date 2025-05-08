package Flyweight.clase;

public class Pacient implements PacientAbstract {
    private String cnp;
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String cnp, String nume, String numarTelefon, String adresa) {
        this.cnp = cnp;
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public void detaliiPacient(Spitalizare spitalizare) {
        System.out.println("Pacient " + this.nume + " - CNP: " + this.cnp
                + ", telefon:  " + this.numarTelefon + ", adresa: " + this.adresa);
        System.out.println(spitalizare.toString());
    }
}
