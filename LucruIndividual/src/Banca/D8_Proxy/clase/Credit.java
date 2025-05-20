package Banca.D8_Proxy.clase;

public class Credit implements ICredit {
    private double suma;
    private Moneda moneda;

    public Credit(double suma, Moneda moneda) {
        this.suma = suma;
        this.moneda = moneda;
    }

    public double getSuma() {
        return suma;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    @Override
    public void acordaCredit(String numeClient) {
        System.out.println("Solicitarea clientului " + numeClient
        + " pentru un credit in valoare de " + this.suma + " " + this.moneda + " a fost acceptata!");
    }
}
