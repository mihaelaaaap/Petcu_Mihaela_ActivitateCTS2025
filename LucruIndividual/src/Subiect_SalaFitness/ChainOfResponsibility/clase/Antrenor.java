package Subiect_SalaFitness.ChainOfResponsibility.clase;

public class Antrenor extends HandlerAccidentare {
    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        System.out.println("Antrenorul verifica situatia...");
        if (accidentare != null) {
            if (this.getUrmatorul() != null) {
                this.getUrmatorul().trateazaAccidentare(accidentare);
            } else {
                System.out.println("Nu avem asistent medical care sa trateze accidentarea!");
            }
        } else {
            System.out.println("Alarma falsa! Nu e vorba de nicio accidentare!");
        }
    }
}
