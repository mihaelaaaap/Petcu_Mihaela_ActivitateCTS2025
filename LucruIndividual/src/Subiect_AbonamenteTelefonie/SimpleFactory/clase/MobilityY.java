package Subiect_AbonamenteTelefonie.SimpleFactory.clase;

public class MobilityY implements Subscription {
    private final double costPeLuna;

    public MobilityY(double costPeLuna) {
        this.costPeLuna = costPeLuna;
    }

    @Override
    public void detaliiAbonament() {
        System.out.println("Abonament de tip MobilityY avand incluse doar servicii de date");
    }

    @Override
    public double calculeazaCostulAbonamentului(int numarLuniContractuale) {
        return costPeLuna * numarLuniContractuale;
    }
}
