package Banca.D10_Flyweight.clase;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> colectie;

    public FlyweightFactory() {
        this.colectie = new HashMap<>();
    }

    public Flyweight getFlyweight(Detinator detinator, Banca banca) {
        String cheie = detinator.cnp + banca.denumire;
        if (!this.colectie.containsKey(cheie)) {
            this.colectie.put(cheie, new ConcreteFlyweight(detinator, banca));
        }
        return this.colectie.get(cheie);
    }

    public int numarConturi() {
        return this.colectie.size();
    }
}
