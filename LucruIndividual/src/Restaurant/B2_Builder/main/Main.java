package Restaurant.B2_Builder.main;

import Restaurant.B2_Builder.clase.ConcreteBuilder;
import Restaurant.B2_Builder.clase.GenMuzica;
import Restaurant.B2_Builder.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder(1, "Mihaela", "06.04.2025");
        Rezervare rezervare = builder.setHasAsezareLaGeam(true).setHasMasaDecorata(true)
                .setHasMuzicaAmbientala(true).build();
        rezervare.setGenMuzica(GenMuzica.POP);
        System.out.println(rezervare.toString());
    }
}
