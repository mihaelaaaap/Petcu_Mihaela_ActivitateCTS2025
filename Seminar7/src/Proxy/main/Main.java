package Proxy.main;

import Proxy.clase.IRezervare;
import Proxy.clase.ProxyNumeClient;
import Proxy.clase.Rezervare;
import Proxy.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new RezervareProxy(rezervare);
        proxy.realizeazaRezervare("Mihai Popescu", 2);
        proxy.realizeazaRezervare("Gigel Ionescu", 5);

        IRezervare proxyCompus = new ProxyNumeClient(proxy);
        proxyCompus.realizeazaRezervare("Pop Irina", 2);
        proxyCompus.realizeazaRezervare("Pop", 5);
        proxyCompus.realizeazaRezervare("Pop Irina", 5);
    }
}
