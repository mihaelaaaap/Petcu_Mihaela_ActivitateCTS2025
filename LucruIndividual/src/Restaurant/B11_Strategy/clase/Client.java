package Restaurant.B11_Strategy.clase;

public class Client {
    private String nume;
    private MetodaPlata metodaPlata;

    public Client(String nume, MetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public Client(String nume) {
        this.nume = nume;
        this.metodaPlata = new PlataCard();
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void plateste(double sumaDePlata) {
        metodaPlata.plateste(this.nume, sumaDePlata);
    }
}
