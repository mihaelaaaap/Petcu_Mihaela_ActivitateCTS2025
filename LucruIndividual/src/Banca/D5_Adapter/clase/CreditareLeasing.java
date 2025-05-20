package Banca.D5_Adapter.clase;

public class CreditareLeasing {
    public void acordaCreditLeasing(String numeClient, double suma) {
        if (suma < 250000) {
            System.out.println("Clientul " + numeClient + " primeste un credit de leasing in valoare de " + suma + " RON");
        } else {
            System.out.println("Suma de creditare leasing solicitata depaseste pragul admis!");
        }
    }
}
