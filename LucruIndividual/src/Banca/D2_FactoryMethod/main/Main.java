package Banca.D2_FactoryMethod.main;

import Banca.D2_FactoryMethod.clase.Client;
import Banca.D2_FactoryMethod.fabrici.FactoryClienti;
import Banca.D2_FactoryMethod.fabrici.FactoryPF;
import Banca.D2_FactoryMethod.fabrici.FactoryPJ;

public class Main {
    public static void main(String[] args) {
        FactoryClienti factoryPJ = new FactoryPJ();
        FactoryClienti factoryPF = new FactoryPF();
        Client pf = factoryPF.creeazaClient("Andrei", "Str.Bucuresti, Bl.409, Sc.20, Ap.15, Et.3, loc.Braila",
                "5000320211211");
        Client pj = factoryPJ.creeazaClient("SC Beautify SRL", "Bd.Unirii, Nr.15, Bucuresti",
                "J28/123/2025");
        pf.profilClient();
        pj.profilClient();
    }
}
