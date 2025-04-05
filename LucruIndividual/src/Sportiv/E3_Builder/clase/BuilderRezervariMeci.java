package Sportiv.E3_Builder.clase;

public class BuilderRezervariMeci implements AbstractBuilder {
    private boolean areAccesVIP;
    private boolean comentariuAudioLiveInCasti;
    private boolean doresteGustariSiBauturiRacoritoare;
    private boolean areAccesLaSesiuneaDeAutografe;

    public BuilderRezervariMeci() {
        this.areAccesVIP = false;
        this.comentariuAudioLiveInCasti = false;
        this.doresteGustariSiBauturiRacoritoare = false;
        this.areAccesLaSesiuneaDeAutografe = false;
    }

    public BuilderRezervariMeci setAreAccesVIP(boolean areAccesVIP) {
        this.areAccesVIP = areAccesVIP;
        return this;
    }

    public BuilderRezervariMeci setComentariuAudioLiveInCasti(boolean comentariuAudioLiveInCasti) {
        this.comentariuAudioLiveInCasti = comentariuAudioLiveInCasti;
        return this;
    }

    public BuilderRezervariMeci setDoresteGustariSiBauturiRacoritoare(boolean doresteGustariSiBauturiRacoritoare) {
        this.doresteGustariSiBauturiRacoritoare = doresteGustariSiBauturiRacoritoare;
        return this;
    }

    public BuilderRezervariMeci setAreAccesLaSesiuneaDeAutografe(boolean areAccesLaSesiuneaDeAutografe) {
        this.areAccesLaSesiuneaDeAutografe = areAccesLaSesiuneaDeAutografe;
        return this;
    }

    @Override
    public RezervareMeci build(String numeSuporter) {
        return new RezervareMeci(numeSuporter, this.areAccesVIP, this.comentariuAudioLiveInCasti,
                this.doresteGustariSiBauturiRacoritoare, this.areAccesLaSesiuneaDeAutografe);
    }
}
