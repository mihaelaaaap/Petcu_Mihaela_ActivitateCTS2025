package Subiect_SalaFitness.ChainOfResponsibility.clase;

public class MedicSala extends HandlerAccidentare {
    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        System.out.println("Medicul verifica gravitatea accidentarii cursantului " + accidentare.getNumeCursant());
        if (accidentare.getGravitate() == GravitateAccidentare.MEDIE) {
            System.out.println("     -> Medicul trateaza accidentarea...");
        } else {
            if (this.getUrmatorul() != null) {
                this.getUrmatorul().trateazaAccidentare(accidentare);
            } else {
                System.out.println("Serviciul de ambulanta este prea solicitat in acest moment!");
            }
        }
    }
}
