package Restaurant.B10_Flyweight.clase;

public class Client implements IClient {
    private String nume;
    private String email;
    private String telefon;

    public Client(String nume, String email, String telefon) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
    }

    @Override
    public void descriere(Rezervare rezervare) {
        System.out.println(this.nume + " - " + this.email + " - " + this.telefon);
        rezervare.detaliiRezervare();
    }
}
