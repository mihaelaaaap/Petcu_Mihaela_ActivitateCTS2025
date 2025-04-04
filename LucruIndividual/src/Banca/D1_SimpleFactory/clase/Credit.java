package Banca.D1_SimpleFactory.clase;

public abstract class Credit {
    private String numeClient;
    private int valoare;
    private int durataInLuni;

    public Credit(String numeClient, int valoare, int durataInLuni) {
        this.numeClient = numeClient;
        this.valoare = valoare;
        this.durataInLuni = durataInLuni;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getValoare() {
        return valoare;
    }

    public int getDurataInLuni() {
        return durataInLuni;
    }

    public String detaliiGeneraleCredit() {
        StringBuilder stringBuilder = new StringBuilder("\n - Nume client: ");
        stringBuilder.append(getNumeClient().toUpperCase())
                .append("\n - Valoare: ").append(getValoare()).append(" RON")
                .append("\n - Durata: ").append(getDurataInLuni()).append(" luni");
        return stringBuilder.toString();
    }

    public abstract void descriereCredit();
}
