package STB.F2_Prototype.clase;

public class Autobuz extends MijlocTransport {

    public Autobuz() {
        super();
    }

    public Autobuz(String numeSofer, int linie) {
        super(numeSofer, linie);
    }

    @Override
    public void descriereMijlocTransport() {
        System.out.println("Autobuzul condus de " + this.getNumeSofer() + " circula pe linia " + this.getLinie());
    }

    @Override
    public PrototypeMijlocTransport clone() {
        Autobuz clona = new Autobuz();
        clona.setNumeSofer(this.getNumeSofer());
        clona.setLinie(this.getLinie());
        return clona;
    }
}
