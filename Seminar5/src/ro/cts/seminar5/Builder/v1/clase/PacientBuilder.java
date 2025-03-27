package ro.cts.seminar5.Builder.v1.clase;

public class PacientBuilder implements AbstractBuilder {
    private Pacient pacient;

    public PacientBuilder(String numePacient) {
        this.pacient = new Pacient(numePacient, "un alt pacient", false, false,
                false, false);
    }

    public PacientBuilder setHasMicDejun(boolean hasMicDejun) {
        this.pacient.setHasMicDejun(hasMicDejun);
        return this;
    }

    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.pacient.setHasPatRabatabil(hasPatRabatabil);
        return this;
    }

    public PacientBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.pacient.setHasPapuciDeCamera(hasPapuciDeCamera);
        return this;
    }

    public PacientBuilder setHasHalatInterior(boolean hasHalatInterior) {
        this.pacient.setHasHalatInterior(hasHalatInterior);
        return this;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor) {
        this.pacient.setNumeInsotitor(numeInsotitor);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
