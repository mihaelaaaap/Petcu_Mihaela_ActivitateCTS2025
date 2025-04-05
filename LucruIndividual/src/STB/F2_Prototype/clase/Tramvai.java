package STB.F2_Prototype.clase;

public class Tramvai extends MijlocTransport {
    public Tramvai() {
        super();
    }

    public Tramvai(String numeSofer, int linie) {
        super(numeSofer, linie);
    }

    @Override
    public void descriereMijlocTransport() {
        System.out.println("Tramvaiul condus de " + this.getNumeSofer() + " circula pe linia " + this.getLinie());
    }

    @Override
    public PrototypeMijlocTransport clone() {
        Tramvai clona = new Tramvai();
        clona.setNumeSofer(this.getNumeSofer());
        clona.setLinie(this.getLinie());
        return clona;
    }
}
