package Subiect_Masina.Singleton.main;

import Subiect_Masina.Singleton.clase.AMasina;
import Subiect_Masina.Singleton.clase.IService;
import Subiect_Masina.Singleton.clase.Masina;
import Subiect_Masina.Singleton.clase.Service;

public class Main {
    public static void main(String[] args) {
        IService service = Service.getInstance("CarFix", "Strada Oituz 2U, Bucuresti");

        try {
            AMasina masina1 = new Masina("B123XYZ", "Dacia", 128000);
            AMasina masina2 = new Masina("CJ45ABC", "Volkswagen", 84000);

            service.adaugaMasinaInService(masina1);
            service.afiseazaDetaliiService();

            service.adaugaMasinaInService(masina2);

            service.scoateMasinaDinService();
            service.adaugaMasinaInService(masina2);

            service.afiseazaDetaliiService();
            AMasina masina3 = new Masina("IL64MX", "Pegeout", 115000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
