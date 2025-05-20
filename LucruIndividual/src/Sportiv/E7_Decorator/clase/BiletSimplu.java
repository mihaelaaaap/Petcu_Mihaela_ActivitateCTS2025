package Sportiv.E7_Decorator.clase;

public class BiletSimplu implements IBilet {
    private String echipaGazda;
    private String echipaOaspete;

    public BiletSimplu(String echipaGazda, String echipaOaspete) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    @Override
    public void printeaza() {
        System.out.println("Bilet pentru meciul: " + echipaGazda + " - " + echipaOaspete);
    }
}
