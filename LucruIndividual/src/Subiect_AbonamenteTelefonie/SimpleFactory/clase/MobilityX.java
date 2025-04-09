package Subiect_AbonamenteTelefonie.SimpleFactory.clase;

public class MobilityX implements Subscription {
    private final double costPeLuna;

    public MobilityX(double costPeLuna) {
        this.costPeLuna = costPeLuna;
    }

    @Override
    public void detaliiAbonament() {
        System.out.println("Abonament de tip MobilityX avand incluse doar servicii de voce");
    }

    @Override
    public double calculeazaCostulAbonamentului(int numarLuniContractuale) {
        return numarLuniContractuale * costPeLuna;
    }
}
