package STB.F1_SimpleFactory.clase;

public abstract class MijlocTransport {
    private int linie;
    private String numeSofer;

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

    public abstract void descriereMijlocTransport();
}
