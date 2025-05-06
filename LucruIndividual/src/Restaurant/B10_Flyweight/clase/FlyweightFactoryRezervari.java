package Restaurant.B10_Flyweight.clase;

import java.util.HashMap;

public class FlyweightFactoryRezervari {
    private HashMap<String, IClient> clienti;

    public FlyweightFactoryRezervari() {
        clienti = new HashMap<>();
    }

    public IClient getClient(String nume, String email, String telefon) {
        String cheie = nume + email + telefon;
        if (!clienti.containsKey(cheie)) {
            clienti.put(cheie, new Client(nume, email, telefon));
        }
        return clienti.get(cheie);
    }
}
