package ro.cts.seminar5.Builder.v2.clase;

public class PacientBuilder implements AbstractBuilder {
    private String numePacient;
    private String numeInsotitor;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatInterior;

    public PacientBuilder() {
        this.numePacient = "pacient";
        this.numeInsotitor = "alt pacient";
        this.hasPatRabatabil = false;
        this.hasMicDejun = false;
        this.hasPapuciDeCamera = false;
        this.hasHalatInterior = false;
    }

    public PacientBuilder setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
        return this;
    }

    public PacientBuilder setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public PacientBuilder setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
        return this;
    }

    public PacientBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        return this;
    }

    public PacientBuilder setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
        return this;
    }

    public PacientBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;
    }

    @Override
    public Pacient build(String numePacient) {
        return new Pacient(numePacient, numeInsotitor, hasPatRabatabil, hasMicDejun, hasPapuciDeCamera, hasHalatInterior);
    }
}
