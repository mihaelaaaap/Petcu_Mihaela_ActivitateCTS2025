package Subiect_AbonamenteTelefonie.SimpleFactory.clase;

public class MobilityZ implements Subscription {
    private final double costPeLuna;

    public MobilityZ(double costPeLuna) {
        this.costPeLuna = costPeLuna;
    }

    @Override
    public void detaliiAbonament() {
        System.out.println("Abonament de tip MobilityZ avand incluse servicii de voce, servicii de date si tv online");
    }

    @Override
    public double calculeazaCostulAbonamentului(int numarLuniContractuale) {
        return numarLuniContractuale > 12 ? 0.9 * costPeLuna  * numarLuniContractuale : costPeLuna * numarLuniContractuale;
    }

}
