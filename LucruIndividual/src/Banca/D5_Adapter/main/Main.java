package Banca.D5_Adapter.main;

import Banca.D5_Adapter.clase.AdapterCredite;
import Banca.D5_Adapter.clase.CreditareLeasing;
import Banca.D5_Adapter.clase.ICreditare;

public class Main {
    public static void main(String[] args) {
        CreditareLeasing leasing = new CreditareLeasing();
        ICreditare adapter = new AdapterCredite(leasing);
        adapter.acordaCredit("Gigel", 15000);
        adapter.acordaCredit("Marcel", 400000);
    }
}
