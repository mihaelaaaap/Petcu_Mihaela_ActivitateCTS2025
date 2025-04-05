package STB.F1_SimpleFactory.clase;

public class Autobuz extends MijlocTransport {

    public Autobuz(String numeSofer, int linie) {
        super(numeSofer, linie);
    }

    @Override
    public void descriereMijlocTransport() {
        System.out.println("Autobuzul condus de " + this.getNumeSofer() + " circula pe linia " + this.getLinie());
    }
}
