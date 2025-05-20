package Sportiv.E7_Decorator.clase;

public class BiletSustinere extends DecoratorBilet {
    private String echipaLocala;

    public BiletSustinere(IBilet bilet, String echipaLocala) {
        super(bilet);
        this.echipaLocala = echipaLocala;
    }

    @Override
    public void printeazaMesajSustinere() {
        if (((BiletSimplu) biletDecorat).getEchipaGazda().equalsIgnoreCase(echipaLocala)) {
            System.out.println("Hai " + echipaLocala + "! Fiti alaturi de echipa noastra in acest meci!");
        }
    }
}
