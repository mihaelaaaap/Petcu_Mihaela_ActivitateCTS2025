package Banca.D5_Adapter.clase;

public class AdapterCredite implements ICreditare {
    private CreditareLeasing leasing;

    public AdapterCredite(CreditareLeasing leasing) {
        this.leasing = leasing;
    }

    @Override
    public void acordaCredit(String numeClient, double suma) {
        this.leasing.acordaCreditLeasing(numeClient, suma);
    }
}
