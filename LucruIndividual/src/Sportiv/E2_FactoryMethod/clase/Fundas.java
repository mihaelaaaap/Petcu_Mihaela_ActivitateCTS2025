package Sportiv.E2_FactoryMethod.clase;

public class Fundas extends Jucator {
    private int numarDeposedari;

    public Fundas(String nume, int numarTricou, boolean esteCapitanulEchipei, int numarDeposedari) {
        super(nume, numarTricou, esteCapitanulEchipei);
        this.numarDeposedari = numarDeposedari;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder stringBuilder = new StringBuilder(this.informatiiGeneraleJucator());
        stringBuilder.append("\nPozitie in teren: FUNDAS")
                .append("\nNumar deposedari: ").append(this.numarDeposedari).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
