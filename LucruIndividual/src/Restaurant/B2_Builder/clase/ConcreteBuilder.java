package Restaurant.B2_Builder.clase;

public class ConcreteBuilder implements AbstractBuilder {

    private Rezervare rezervare;

    public ConcreteBuilder(int codRezervare, String numeClient, String data) {
        rezervare = new Rezervare(codRezervare, numeClient, data, false,
                false, false, false, null);
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }

    public ConcreteBuilder setHasAsezareLaGeam(boolean hasAsezareLaGeam) {
        this.rezervare.setHasAsezareLaGeam(hasAsezareLaGeam);
        return this;
    }

    public ConcreteBuilder setHasScauneErgonomice(boolean hasScauneErgonomice) {
        this.rezervare.setHasScauneErgonomice(hasScauneErgonomice);
        return this;
    }

    public ConcreteBuilder setHasMasaDecorata(boolean hasMasaDecorata) {
        this.rezervare.setHasMasaDecorata(hasMasaDecorata);
        return this;
    }

    public ConcreteBuilder setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
        this.rezervare.setHasMuzicaAmbientala(hasMuzicaAmbientala);
        return this;
    }
}
