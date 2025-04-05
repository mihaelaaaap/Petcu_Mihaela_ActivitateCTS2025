package STB.F3_Builder.main;

import STB.F3_Builder.clase.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuz1 = new AutobuzLinie.Builder("Solaris", "Popescu Ionel", 97)
                .setAreDeschidereAutomataUsi(true).setOpresteLaCapatDeLinie(true).build();
        autobuz1.descriereAutobuz();
        AutobuzLinie autobuz2 = new AutobuzLinie.Builder("Mercedes Citaro", "Georgescu Marcel", 100)
                .setAreAC(true)
                .setTextEcran("Piata Unirii - Aeroport Henri Coanda").build();
        autobuz2.descriereAutobuz();
    }
}
