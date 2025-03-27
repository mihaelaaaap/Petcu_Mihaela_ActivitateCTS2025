package ro.cts.seminar5.Builder.v1.clase;

public class Pacient {
    private String numePacient;
    private String numeInsotitor;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatInterior;

    protected Pacient(String numePacient, String numeInsotitor, boolean hasPatRabatabil, boolean hasMicDejun,
                   boolean hasPapuciDeCamera, boolean hasHalatInterior) {
        this.numePacient = numePacient;
        this.numeInsotitor = numeInsotitor;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatInterior = hasHalatInterior;
    }

    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    protected void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }

    protected void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    protected void setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
    }

    protected void setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
    }

    protected void setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient ");
        sb.append(numePacient.toUpperCase()).append(":\n");
        sb.append("\n - Nume insotitor: ").append(numeInsotitor);
        sb.append("\n - Pat rabatabil: ").append(hasPatRabatabil);
        sb.append("\n - Mic Dejun: ").append(hasMicDejun);
        sb.append("\n - Papuci de camera: ").append(hasPapuciDeCamera);
        sb.append("\n - Halat interior: ").append(hasHalatInterior);
        return sb.toString();
    }
}
