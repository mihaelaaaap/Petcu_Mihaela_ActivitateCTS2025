package Banca.D16_Chain_of_Responsibility.main;

import Banca.D16_Chain_of_Responsibility.clase.ContCredit;
import Banca.D16_Chain_of_Responsibility.clase.ContDebit;
import Banca.D16_Chain_of_Responsibility.clase.ContEconomii;
import Banca.D16_Chain_of_Responsibility.clase.HandlerPlata;

public class Main {
    public static void main(String[] args) {
        HandlerPlata contDebit = new ContDebit(200);
        HandlerPlata contEconomii = new ContEconomii(150);
        HandlerPlata contCredit = new ContCredit(1000);

        contDebit.setSuccesor(contEconomii);
        contEconomii.setSuccesor(contCredit);

        contDebit.gestioneazaPlata(100);
        System.out.println();
        contDebit.gestioneazaPlata(120);
        System.out.println();
        contDebit.gestioneazaPlata(200);
        System.out.println();
        contDebit.gestioneazaPlata(1000);
    }
}
