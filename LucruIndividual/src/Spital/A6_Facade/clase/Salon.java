package Spital.A6_Facade.clase;

import java.util.List;

public class Salon {
    protected int numarSalon;
    protected List<Boolean> disponibilitatePaturi;

    public Salon(int numarSalon, List<Boolean> disponibilitatePaturi) {
        this.numarSalon = numarSalon;
        this.disponibilitatePaturi = disponibilitatePaturi;
    }

    public void modificaDisponibilitatePat(int numarPat, boolean disponibilitatePat) {
        if(numarPat <= this.disponibilitatePaturi.size()) {
            this.disponibilitatePaturi.set(numarPat, disponibilitatePat);
        }
    }

    public int verificaDisponibilitatePaturi() {
        int count = 0;
        for (Boolean disponibil : this.disponibilitatePaturi) {
            if (disponibil) {
                count++;
            }
        }
        return count;
    }
}
