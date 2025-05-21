package Subiect_SalaFitness.ChainOfResponsibility.clase;

public class FisaAccidentare {
    private String numeCursant;
    private GravitateAccidentare gravitate;

    public FisaAccidentare(String numeCursant, GravitateAccidentare gravitate) {
        this.numeCursant = numeCursant;
        this.gravitate = gravitate;
    }

    public String getNumeCursant() {
        return numeCursant;
    }

    public GravitateAccidentare getGravitate() {
        return gravitate;
    }
}
