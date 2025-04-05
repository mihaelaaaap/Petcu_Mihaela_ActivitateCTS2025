package STB.F2_Prototype.clase;

public abstract class MijlocTransport implements PrototypeMijlocTransport {
    private int linie;
    private String numeSofer;

    public MijlocTransport() {
    }

    public MijlocTransport(String numeSofer, int linie) {
        this.numeSofer = numeSofer;
        this.linie = linie;
    }

    public int getLinie() {
        return linie;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public void setLinie(int linie) {
        this.linie = linie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    @Override
    public abstract PrototypeMijlocTransport clone();

}
