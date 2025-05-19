package Farmacie.C10_Flyweight.clase;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> reteteClienti;

    public FlyweightFactory() {
        this.reteteClienti = new HashMap<>();
    }

    public int getNumarReteteClienti() {
        return reteteClienti.size();
    }

    public Flyweight getFlyweight(String cnp, String numeClient, int nrAsigurare) {
        if (!this.reteteClienti.containsKey(cnp)) {
            this.reteteClienti.put(cnp, new ClientFlyweight(cnp, numeClient, nrAsigurare));
        }
        return this.reteteClienti.get(cnp);
    }
}
