package Farmacie.C9_Proxy.main;

import Farmacie.C9_Proxy.clase.Achizitie;
import Farmacie.C9_Proxy.clase.Client;
import Farmacie.C9_Proxy.clase.IAchizitie;
import Farmacie.C9_Proxy.clase.ProxyAchizitieMedicament;

public class Main {
    public static void main(String[] args) {
        IAchizitie achizitie = new Achizitie();
        IAchizitie proxyAchizitie = new ProxyAchizitieMedicament(achizitie);
        proxyAchizitie.achizitioneazaMedicament("Biseptol", new Client("Popescu Ion", true));
        proxyAchizitie.achizitioneazaMedicament("Insulina", new Client("Ionescu Irina", false));
    }
}
