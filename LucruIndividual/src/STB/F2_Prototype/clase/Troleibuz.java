package STB.F2_Prototype.clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz() {
        super();
    }

    public Troleibuz(String numeSofer, int linie) {
        super(numeSofer, linie);
    }

    @Override
    public void descriereMijlocTransport() {
        System.out.println("Troleibuzul condus de " + this.getNumeSofer() + " circula pe linia " + this.getLinie());
    }

    @Override
    public PrototypeMijlocTransport clone() {
        Troleibuz clona = new Troleibuz();
        clona.setNumeSofer(this.getNumeSofer());
        clona.setLinie(this.getLinie());
        return clona;
    }
}
