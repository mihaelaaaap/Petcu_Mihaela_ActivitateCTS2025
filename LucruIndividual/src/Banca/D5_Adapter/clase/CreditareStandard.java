package Banca.D5_Adapter.clase;

public class CreditareStandard implements ICreditare {
    @Override
    public void acordaCredit(String numeClient, double suma) {
        System.out.println("Clientul " + numeClient + " primeste un credit in valoare de " + suma + " RON");
    }
}
