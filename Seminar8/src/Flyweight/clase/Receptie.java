package Flyweight.clase;

import java.util.HashMap;

public class Receptie {
    private HashMap<String, PacientAbstract> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String cnp, String nume, String adresa, String numarTelefon) {
        if(!this.pacienti.containsKey(cnp)) {
            this.pacienti.put(cnp, new Pacient(cnp, nume, adresa, numarTelefon));
        }
        return this.pacienti.get(cnp);
    }

    public PacientAbstract getPacient(String cnp) throws Exception {
        if(this.pacienti.containsKey(cnp)) {
            return this.pacienti.get(cnp);
        } else {
            throw new Exception("Pacientul cu CNP-ul " + cnp + " nu exista!");
        }
    }
}
