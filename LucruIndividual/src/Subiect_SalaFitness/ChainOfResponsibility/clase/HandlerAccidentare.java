package Subiect_SalaFitness.ChainOfResponsibility.clase;

public abstract class HandlerAccidentare {
    private HandlerAccidentare urmatorul;

    public void setUrmatorul(HandlerAccidentare urmatorul) {
        this.urmatorul = urmatorul;
    }

    public HandlerAccidentare getUrmatorul() {
        return urmatorul;
    }

    public abstract void trateazaAccidentare(FisaAccidentare accidentare);
}
