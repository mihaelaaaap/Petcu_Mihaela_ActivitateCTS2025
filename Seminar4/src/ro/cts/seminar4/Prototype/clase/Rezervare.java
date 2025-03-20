package ro.cts.seminar4.Prototype.clase;

public class Rezervare extends ARezervare {

    public Rezervare() {
    }

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    @Override
    public void descriere() {
        System.out.println("Aceasta este o rezervare...");
    }

    @Override
    public ARezervare copiaza() {
       Rezervare rezervareNoua = new Rezervare();
       rezervareNoua.numeClient = this.numeClient;
       rezervareNoua.nrPersoane = this.nrPersoane;
       rezervareNoua.data = this.data;
       rezervareNoua.ora = this.ora;

       return rezervareNoua;
    }

}
