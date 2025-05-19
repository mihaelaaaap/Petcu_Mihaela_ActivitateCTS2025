package STB.F8_Proxy.main;

import STB.F8_Proxy.clase.Autobuz;
import STB.F8_Proxy.clase.IAutobuz;
import STB.F8_Proxy.clase.ProxyAutobuzNoapte;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("N101", 10, List.of("Piata Romana", "Ateneul Roman",
                 "Universitate", "Piata Unirii", "Cotroceni"));
        IAutobuz proxyAutobuz = new ProxyAutobuzNoapte(autobuz);
        proxyAutobuz.opresteInStatie();

    }
}
