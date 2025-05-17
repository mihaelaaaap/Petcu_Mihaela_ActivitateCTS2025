package Sportiv.E12_Observer.subject;

public class Meci {
    private String descriere;
    private String data;
    private String ora;
    private TipMeci tipMeci;

    public Meci(String descriere, String data, String ora, TipMeci tipMeci) {
        this.descriere = descriere;
        this.data = data;
        this.ora = ora;
        this.tipMeci = tipMeci;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public TipMeci getTipMeci() {
        return tipMeci;
    }
}
