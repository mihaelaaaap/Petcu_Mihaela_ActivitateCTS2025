package Sportiv.E3_Builder.clase;

public class RezervareMeci {
    private String numeSuporter;
    private boolean areAccesVIP;
    private boolean comentariuAudioLiveInCasti;
    private boolean doresteGustariSiBauturiRacoritoare;
    private boolean areAccesLaSesiuneaDeAutografe;

    public RezervareMeci(String numeSuporter, boolean areAccesVIP, boolean comentariuAudioLiveInCasti,
                         boolean doresteGustariSiBauturiRacoritoare, boolean areAccesLaSesiuneaDeAutografe) {
        this.numeSuporter = numeSuporter;
        this.areAccesVIP = areAccesVIP;
        this.comentariuAudioLiveInCasti = comentariuAudioLiveInCasti;
        this.doresteGustariSiBauturiRacoritoare = doresteGustariSiBauturiRacoritoare;
        this.areAccesLaSesiuneaDeAutografe = areAccesLaSesiuneaDeAutografe;
    }

    private String decizieOptiuneExtra(boolean optiune) {
        return optiune ? "DA" : "NU";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare pentru suporterul ");
        sb.append(numeSuporter.toUpperCase())
                .append("\n-> Acces VIP: ").append(decizieOptiuneExtra(areAccesVIP))
                .append("\n-> Comentariu audio LIVE in casti: ").append(decizieOptiuneExtra(comentariuAudioLiveInCasti))
                .append("\n-> Gustari si bauturi racoritoare: ").append(decizieOptiuneExtra(doresteGustariSiBauturiRacoritoare))
                .append("\n-> Acces la sesiunea de autografe de la finalul meciului: ").append(decizieOptiuneExtra(areAccesLaSesiuneaDeAutografe))
                .append("\n");
        return sb.toString();
    }
}
