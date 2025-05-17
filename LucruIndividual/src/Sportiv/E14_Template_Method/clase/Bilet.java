package Sportiv.E14_Template_Method.clase;

public class Bilet {
    private String idBilet;
    private String poartaAcces;
    private int numarLoc;

    public Bilet(String idBilet, String poartaAcces, int numarLoc) {
        this.idBilet = idBilet;
        this.poartaAcces = poartaAcces;
        this.numarLoc = numarLoc;
    }

    public String getPoartaAcces() {
        return poartaAcces;
    }

    public int getNumarLoc() {
        return numarLoc;
    }

    public String getIdBilet() {
        return idBilet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\tBiletul ");
        sb.append(this.idBilet).append(" | Acces: poarta ").append(this.poartaAcces);
        sb.append(" | locul ").append(this.numarLoc);
        return sb.toString();
    }
}
