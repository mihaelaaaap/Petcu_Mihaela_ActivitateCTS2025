package STB.F1_SimpleFactory.clase;

public class Tramvai extends MijlocTransport {
    public Tramvai(String numeSofer, int linie) {
        super(numeSofer, linie);
    }

    @Override
    public void descriereMijlocTransport() {
        System.out.println("Tramvaiul condus de " + this.getNumeSofer() + " circula pe linia " + this.getLinie());
    }
}
