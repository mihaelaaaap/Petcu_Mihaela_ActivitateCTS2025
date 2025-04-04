package Banca.D3_Builder.clase;

public class BuilderConturi implements AbstractBuilder {
    private Cont cont;

    public BuilderConturi(String numeClient) {
        this.cont = new Cont(numeClient, false, false, false);
    }

    public BuilderConturi setEsteContSalariu(boolean esteContSalariu) {
        this.cont.setEsteContSalariu(esteContSalariu);
        return this;
    }

    public BuilderConturi setAreCardAtasat(boolean areCardAtasat) {
        this.cont.setAreCardAtasat(areCardAtasat);
        return this;
    }

    public BuilderConturi setAreInternetBanking(boolean areInternetBanking) {
        this.cont.setAreInternetBanking(areInternetBanking);
        return this;
    }

    @Override
    public Cont build() {
        return cont;
    }
}
