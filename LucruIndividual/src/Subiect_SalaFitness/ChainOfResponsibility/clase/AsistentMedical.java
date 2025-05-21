package Subiect_SalaFitness.ChainOfResponsibility.clase;

public class AsistentMedical extends HandlerAccidentare {
    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        System.out.println("Asistentul medical verifica gravitatea accidentarii cursantului " + accidentare.getNumeCursant());
        if (accidentare.getGravitate() == GravitateAccidentare.USOARA) {
            System.out.println("     -> Asistentul medical trateaza accidentarea...");
        } else {
            if (this.getUrmatorul() != null) {
                this.getUrmatorul().trateazaAccidentare(accidentare);
            } else {
                System.out.println("Nu avem medic care sa evalueze si sa trateze accidentarea cursantului "
                + accidentare.getNumeCursant() + "!");
            }
        }
    }
}
