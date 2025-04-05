package Sportiv.E2_FactoryMethod.clase;

public class Atacant extends Jucator {
    private int numarGoluri;

    public Atacant(String nume, int numarTricou, boolean esteCapitanulEchipei, int numarGoluri) {
        super(nume, numarTricou, esteCapitanulEchipei);
        this.numarGoluri = numarGoluri;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder stringBuilder = new StringBuilder(this.informatiiGeneraleJucator());
        stringBuilder.append("\nPozitie in teren: ATACANT")
                .append("\nNumar goluri: ").append(this.numarGoluri).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
