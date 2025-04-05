package Sportiv.E2_FactoryMethod.clase;

public abstract class Jucator {
    private String nume;
    private int numarTricou;
    private boolean esteCapitanulEchipei;

    public Jucator(String nume, int numarTricou, boolean esteCapitanulEchipei) {
        this.nume = nume;
        this.numarTricou = numarTricou;
        this.esteCapitanulEchipei = esteCapitanulEchipei;
    }

    public String informatiiGeneraleJucator() {
        StringBuilder stringBuilder = new StringBuilder(nume);
        stringBuilder.append(" - jucatorul numarul ").append(numarTricou);
        if(esteCapitanulEchipei) {
            stringBuilder.append("\n(Este capitanul echipei)");
        }
        return stringBuilder.toString();
    }

    public abstract void descriereProfilJucator();
}
