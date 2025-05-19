package STB.F6_Composite.main;

import STB.F6_Composite.clase.Autobuz;
import STB.F6_Composite.clase.ComponentaFlota;
import STB.F6_Composite.clase.Flota;
import STB.F6_Composite.clase.TipGrupAutobuz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComponentaFlota grupMic = new Flota(TipGrupAutobuz.MIC);
        ComponentaFlota grupMediu = new Flota(TipGrupAutobuz.MEDIU);
        ComponentaFlota grupMare = new Flota(TipGrupAutobuz.MARE);

        Autobuz autobuz1 = new Autobuz("B100STB", "Volvo", "Express", 10);
        Autobuz autobuz2 = new Autobuz("B101STB", "Mercedes", "Bus", 8);
        Autobuz autobuz3 = new Autobuz("B102STB", "Volvo", "Express", 10);
        grupMic.adaugaComponenta(autobuz1);
        grupMic.adaugaComponenta(autobuz2);
        grupMic.adaugaComponenta(autobuz3);

        Autobuz autobuz4 = new Autobuz("B103STB", "Mercedes", "Solaris", 20);
        Autobuz autobuz5 = new Autobuz("B104STB", "Mercedes", "Solaris", 30);
        grupMediu.adaugaComponenta(autobuz4);
        grupMediu.adaugaComponenta(autobuz5);

        Autobuz autobuz6 = new Autobuz("B105STB", "ISUZU", "Travel", 50);
        grupMare.adaugaComponenta(autobuz6);

        List<ComponentaFlota> flotaSTB = new ArrayList<>();
        flotaSTB.add(grupMic);
        flotaSTB.add(grupMediu);
        flotaSTB.add(grupMare);

        System.out.println("FLOTA AUTOBUZELOR STB\n");
        for (ComponentaFlota flota : flotaSTB) {
            flota.descriere("\t");
        }

        grupMic.adaugaComponenta(autobuz4);
        autobuz1.adaugaComponenta(autobuz2);
    }
}
