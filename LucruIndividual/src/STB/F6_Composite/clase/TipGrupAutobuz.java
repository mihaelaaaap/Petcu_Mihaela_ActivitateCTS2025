package STB.F6_Composite.clase;

public enum TipGrupAutobuz {
    MIC(10),
    MEDIU(30),
    MARE(50);

    private final int nrLocuri;

    TipGrupAutobuz(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public static TipGrupAutobuz getGrupPentruLocuri(int nrLocuri) {
        if (nrLocuri <= 10) return MIC;
        else if (nrLocuri > 10 && nrLocuri <= 30) return MEDIU;
        else return MARE;
    }
}
