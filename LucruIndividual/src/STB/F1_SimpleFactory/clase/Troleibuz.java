package STB.F1_SimpleFactory.clase;

public class Troleibuz extends MijlocTransport {

    public Troleibuz(String numeSofer, int linie) {
        super(numeSofer, linie);
    }

    @Override
    public void descriereMijlocTransport() {
        System.out.println("Troleibuzul condus de " + this.getNumeSofer() + " circula pe linia " + this.getLinie());
    }
}
