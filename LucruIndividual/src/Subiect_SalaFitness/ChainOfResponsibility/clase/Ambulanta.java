package Subiect_SalaFitness.ChainOfResponsibility.clase;

public class Ambulanta extends HandlerAccidentare {
    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        if (accidentare.getGravitate() == GravitateAccidentare.GRAVA) {
            System.out.println("Ambulanta transporta cursantul " + accidentare.getNumeCursant()
                    + " la spital, fiind grav accidentat!");
        }
    }
}
