package Sportiv.E1_SimpleFactory.clase;

public class Mijlocas extends Jucator {
    private int numarPaseReusite;

    public Mijlocas(String nume, int numarTricou, boolean esteCapitanulEchipei, int numarPaseReusite) {
        super(nume, numarTricou, esteCapitanulEchipei);
        this.numarPaseReusite = numarPaseReusite;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder stringBuilder = new StringBuilder(this.informatiiGeneraleJucator());
        stringBuilder.append("\nPozitie in teren: MIJLOCAS")
                .append("\nNumar pase reusite: ").append(this.numarPaseReusite).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
