package Farmacie.C3_Builder.clase;

public class Factura {
    private String idFactura;
    private String numeClient;
    private int numarPungi;
    private boolean platesteCuCardul;
    private boolean areCardDeFidelitate;
    private int cotaTVA;

    public Factura(String idFactura, String numeClient, int numarPungi, boolean platesteCuCardul, boolean areCardDeFidelitate, int cotaTVA) {
        this.idFactura = idFactura;
        this.numeClient = numeClient;
        this.numarPungi = numarPungi;
        this.platesteCuCardul = platesteCuCardul;
        this.areCardDeFidelitate = areCardDeFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setPlatesteCuCardul(boolean platesteCuCardul) {
        this.platesteCuCardul = platesteCuCardul;
    }

    public void setAreCardDeFidelitate(boolean areCardDeFidelitate) {
        this.areCardDeFidelitate = areCardDeFidelitate;
    }

    public void setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public String decizieOptiuneExtra(boolean decizie) {
        return decizie ? "DA" : "NU";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nDetalii ale facturii ");
        sb.append(idFactura).append(" emisa pentru clientul ");
        sb.append(numeClient).append(":");
        sb.append("\n - Numar pungi: ").append(numarPungi);
        sb.append("\n - Plata cu cardul: ").append(decizieOptiuneExtra(platesteCuCardul));
        sb.append("\n - Card de fidelitate: ").append(decizieOptiuneExtra(areCardDeFidelitate));
        sb.append("\n - Cota TVA: ").append(cotaTVA + "%");
        return sb.toString();
    }
}
