package Spital.A6_Facade.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FacadeInternare {
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public void protocolInternarePacient(Pacient pacient) {
        System.out.println(pacient.toString());
        if(this.medic.confirmaNecesitateInternare(pacient)) {
            System.out.println("Medicul " + this.medic.nume + " solicita internarea de urgenta a pacientului.");

            if(this.salon.verificaDisponibilitatePaturi() > 0) {
                System.out.println("In salonul numarul " + this.salon.numarSalon + " sunt " + this.salon.verificaDisponibilitatePaturi()
                + " paturi disponibile.");

                List<Integer> paturiLibere = new ArrayList<>();
                for (int i = 0; i < this.salon.disponibilitatePaturi.size(); i++) {
                    if (this.salon.disponibilitatePaturi.get(i)) {
                        paturiLibere.add(i);
                    }
                }
                int indexRandom = new Random().nextInt(paturiLibere.size());
                int patAles = paturiLibere.get(indexRandom);
                System.out.println("Pacientului i-a fost repartizat patul numarul " + (patAles+1));
                this.salon.modificaDisponibilitatePat(patAles, false);
            } else {
                System.out.println("Nu sunt paturi libere in salonul " + this.salon.numarSalon + "!");
            }
        } else {
            System.out.println("Nu este necesara internarea pacientului!");
        }
    }
}
