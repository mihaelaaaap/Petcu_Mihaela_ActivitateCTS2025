package ro.cts.seminar3.SingletonRegistry;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;
    private static AutoritatePescuit instance;

    public static AutoritatePescuit getInstance() {
        if (instance == null) {
            instance = new AutoritatePescuit("Autoritate Pescuit", "www.site.ro", 15);
        }
        return instance;
    }

    private AutoritatePescuit(String denumire, String website, int nrAngajati) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    private Map<String, Autorizatie> registry = new HashMap<String, Autorizatie>();

    public Autorizatie emiteAutorizatie(String numePersoana) {
        if(!registry.containsKey(numePersoana)) {
            registry.put(numePersoana, new Autorizatie(numePersoana,registry.size() +1, new Date().toString()));
        }
        return registry.get(numePersoana);
    }

}
