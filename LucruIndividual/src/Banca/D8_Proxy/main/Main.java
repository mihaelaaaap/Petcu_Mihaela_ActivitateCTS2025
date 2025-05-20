package Banca.D8_Proxy.main;

import Banca.D8_Proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        Credit credit1 = new Credit(15000, Moneda.EUR);
        Credit credit2 = new Credit(8000, Moneda.RON);
        Credit credit3 = new Credit(80000, Moneda.RON);

        ICredit proxySumaSolicitata = new ProxySumaSolicitata(credit1);
        ICredit proxyMoneda = new ProxyMoneda(proxySumaSolicitata);

        proxyMoneda.acordaCredit("Popescu Maria");

        ((ProxySumaSolicitata)proxySumaSolicitata).setCredit(credit2);
        proxyMoneda.acordaCredit("Ionescu Laura");

        ((ProxySumaSolicitata)proxySumaSolicitata).setCredit(credit3);
        proxyMoneda.acordaCredit("Georgescu Aurel");
    }
}
