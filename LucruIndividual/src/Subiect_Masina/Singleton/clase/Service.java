package Subiect_Masina.Singleton.clase;

public class Service implements IService {
    private String numeService;
    private String adresa;
    private AMasina masinaInService;
    private static Service instance = null;

    private Service(String numeService, String adresa) {
        this.numeService = numeService;
        this.adresa = adresa;
        this.masinaInService = null;
    }

    public static Service getInstance(String numeService, String adresa) {
        if (instance == null) {
            instance = new Service(numeService, adresa);
        }
        return instance;
    }

    @Override
    public void adaugaMasinaInService(AMasina masina) {
        if(masinaInService == null) {
            this.masinaInService = masina;
        } else {
            System.out.println("Momentan, se afla deja o masina in service!");
        }
    }

    @Override
    public void scoateMasinaDinService() {
        if(masinaInService != null) {
            this.masinaInService = null;
            System.out.println("... Service-ul este disponibil!");
        }
    }

    @Override
    public void afiseazaDetaliiService() {
        StringBuilder stringBuilder = new StringBuilder("Service ");
        stringBuilder.append(this.numeService)
                .append("\nAdresa: ").append(this.adresa.toUpperCase())
                .append("\nDisponibilitate: ").append(this.masinaInService == null ? "DA" : "NU");
        System.out.println(stringBuilder.toString());
        if(this.masinaInService != null) {
            this.masinaInService.detaliiMasina();
        }
    }
}
