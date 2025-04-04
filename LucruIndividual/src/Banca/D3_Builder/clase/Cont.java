package Banca.D3_Builder.clase;

public class Cont {
    private String numeClient;
    private boolean esteContSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    public Cont(String numeClient, boolean esteContSalariu,
                boolean areCardAtasat, boolean areInternetBanking) {
        this.numeClient = numeClient;
        this.esteContSalariu = esteContSalariu;
        this.areCardAtasat = areCardAtasat;
        this.areInternetBanking = areInternetBanking;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setEsteContSalariu(boolean esteContSalariu) {
        this.esteContSalariu = esteContSalariu;
    }

    public void setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
    }

    public void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    public String decizieOptiuneExtra(boolean optiune) {
        return optiune ? "DA" : "NU";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contul clientului ");
        sb.append(numeClient)
                        .append("\n - Cont pentru salariu: ").append(decizieOptiuneExtra(esteContSalariu))
                        .append("\n - Card atasat contului: ").append(decizieOptiuneExtra(areCardAtasat))
                        .append("\n - Internet Banking: ").append(decizieOptiuneExtra(areInternetBanking));
        return(sb.toString());
    }
}
