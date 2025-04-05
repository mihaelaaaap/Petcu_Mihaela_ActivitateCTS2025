package Sportiv.E3_Builder.main;

import Sportiv.E3_Builder.clase.BuilderRezervariMeci;
import Sportiv.E3_Builder.clase.RezervareMeci;

public class Main {
    public static void main(String[] args) {
        BuilderRezervariMeci builder = new BuilderRezervariMeci();
        RezervareMeci rezervare1 = builder.setAreAccesVIP(true).setComentariuAudioLiveInCasti(true)
                .build("Popescu Ionel");
        RezervareMeci rezervare2 = builder.setAreAccesVIP(false).setComentariuAudioLiveInCasti(false)
                .setDoresteGustariSiBauturiRacoritoare(true).build("Ionescu Gigel");
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
