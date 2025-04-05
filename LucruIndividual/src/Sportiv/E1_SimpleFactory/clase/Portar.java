package Sportiv.E1_SimpleFactory.clase;

public class Portar extends Jucator {
    private int numarParade;

    public Portar(String nume, int numarTricou, boolean esteCapitanulEchipei, int numarParade) {
        super(nume, numarTricou, esteCapitanulEchipei);
        this.numarParade = numarParade;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder stringBuilder = new StringBuilder(this.informatiiGeneraleJucator());
        stringBuilder.append("\nPozitie in teren: PORTAR")
                .append("\nNumar parade: ").append(this.numarParade).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
