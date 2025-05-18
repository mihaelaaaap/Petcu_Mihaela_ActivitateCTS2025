package Spital.A9_Proxy.main;

import Spital.A9_Proxy.clase.ConcreteInternare;
import Spital.A9_Proxy.clase.Internare;
import Spital.A9_Proxy.clase.Pacient;
import Spital.A9_Proxy.clase.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ionescu Mihai", 23, true);
        Pacient pacient2 = new Pacient("Popescu Ioana", 40, false);

        Internare internare = new ConcreteInternare();
        Internare proxyInternare = new ProxyInternare(internare);

        proxyInternare.interneazaPacient(pacient1);
        proxyInternare.interneazaPacient(pacient2);
    }
}
