package Restaurant.B2_Builder.clase;

public class Rezervare {
    private int codRezervare;
    private String numeClient;
    private String data;
    private boolean hasAsezareLaGeam;
    private boolean hasScauneErgonomice;
    private boolean hasMasaDecorata;
    private boolean hasMuzicaAmbientala;
    private GenMuzica genMuzica;

    public Rezervare(int codRezervare, String numeClient, String data,
                     boolean hasAsezareLaGeam, boolean hasScauneErgonomice, boolean hasMasaDecorata,
                     boolean hasMuzicaAmbientala, GenMuzica genMuzica) {
        this.codRezervare = codRezervare;
        this.numeClient = numeClient;
        this.data = data;
        this.hasAsezareLaGeam = hasAsezareLaGeam;
        this.hasScauneErgonomice = hasScauneErgonomice;
        this.hasMasaDecorata = hasMasaDecorata;
        this.hasMuzicaAmbientala = hasMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHasAsezareLaGeam(boolean hasAsezareLaGeam) {
        this.hasAsezareLaGeam = hasAsezareLaGeam;
    }

    public void setHasScauneErgonomice(boolean hasScauneErgonomice) {
        this.hasScauneErgonomice = hasScauneErgonomice;
    }

    public void setHasMasaDecorata(boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
    }

    public void setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
        this.hasMuzicaAmbientala = hasMuzicaAmbientala;
    }

    public void setGenMuzica(GenMuzica genMuzica) {
        if(hasMuzicaAmbientala) {
            this.genMuzica = genMuzica;
        }else {
            this.genMuzica = null;
        }
    }

    public String decizieOptiuneAleasa(boolean decizie) {
        return decizie ? "DA" : "NU";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rezervarea numarul ");
        sb.append(codRezervare).append(":\n")
                .append("\nCLIENT: " + numeClient)
                .append("\nDATA: " + data)
                .append("\nPersoana a rezervat loc la geam: " + decizieOptiuneAleasa(hasAsezareLaGeam))
                .append("\nPersoana a optat pentru scaune ergonomice: " + decizieOptiuneAleasa(hasScauneErgonomice))
                .append("\nMasa este decorata: " + decizieOptiuneAleasa(hasMasaDecorata))
                .append("\nPersoana doreste muzica ambientala personalizata: " + decizieOptiuneAleasa(hasMuzicaAmbientala));
        if(hasMuzicaAmbientala) {
            sb.append("\nGen muzical dorit: " + genMuzica);
        }
        return sb.toString();
    }
}
