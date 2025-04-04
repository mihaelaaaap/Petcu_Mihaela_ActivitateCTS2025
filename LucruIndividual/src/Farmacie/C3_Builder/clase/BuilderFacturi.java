package Farmacie.C3_Builder.clase;

public class BuilderFacturi implements Builder {
    private int numarPungi;
    private boolean platesteCuCardul;
    private boolean areCardDeFidelitate;
    private int cotaTVA;

    public BuilderFacturi() {
        numarPungi = 0;
        platesteCuCardul = false;
        areCardDeFidelitate = false;
        cotaTVA = 0;
    }

    public BuilderFacturi setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
        return this;
    }

    public BuilderFacturi setPlatesteCuCardul(boolean platesteCuCardul) {
        this.platesteCuCardul = platesteCuCardul;
        return this;
    }

    public BuilderFacturi setAreCardDeFidelitate(boolean areCardDeFidelitate) {
        this.areCardDeFidelitate = areCardDeFidelitate;
        return this;
    }

    public BuilderFacturi setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
        return this;
    }

    @Override
    public Factura build(String idFactura, String numeClient) {
        return new Factura(idFactura, numeClient, this.numarPungi, this.platesteCuCardul,
                this.areCardDeFidelitate, this.cotaTVA);
    }
}
