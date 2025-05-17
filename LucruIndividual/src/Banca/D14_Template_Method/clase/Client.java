package Banca.D14_Template_Method.clase;

public class Client {
    private String nume;
    private String pin;
    private double sold;

    public Client(String nume, String pin, double sold) {
        this.nume = nume;
        this.pin = pin;
        this.sold = sold;
    }

    public String getNume() {
        return nume;
    }

    public double getSold() {
        return sold;
    }

    public boolean verificaPin(String pinIntrodus) {
        return this.pin.equals(pinIntrodus);
    }

    public boolean areSoldSuficient(double suma) {
        return this.sold >= suma;
    }

    public void actualizeazaSold(double suma) {
        this.sold -= suma;
    }

}
