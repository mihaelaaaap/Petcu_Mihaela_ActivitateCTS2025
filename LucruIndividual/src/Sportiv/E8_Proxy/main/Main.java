package Sportiv.E8_Proxy.main;

import Sportiv.E8_Proxy.clase.IVanzareBilet;
import Sportiv.E8_Proxy.clase.Persoana;
import Sportiv.E8_Proxy.clase.ProxyVarsta;
import Sportiv.E8_Proxy.clase.VanzareBilet;

public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Maria Popescu", 20);
        Persoana p2 = new Persoana("Mihai Ivan", 13);

        IVanzareBilet proxy = new ProxyVarsta(new VanzareBilet());
        proxy.vindeBilet(p1);
        proxy.vindeBilet(p2);
    }
}
