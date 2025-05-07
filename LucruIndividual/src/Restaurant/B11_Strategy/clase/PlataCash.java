package Restaurant.B11_Strategy.clase;

public class PlataCash implements MetodaPlata {

    @Override
    public void plateste(String numeClient, double sumaDePlata) {
        System.out.println("Clientul " + numeClient + " plateste cash " + sumaDePlata + " RON");
    }
}
