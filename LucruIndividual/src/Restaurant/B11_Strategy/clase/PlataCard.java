package Restaurant.B11_Strategy.clase;

public class PlataCard implements MetodaPlata {
    @Override
    public void plateste(String numeClient, double sumaDePlata) {
        System.out.println("Clientul " + numeClient + " plateste cu cardul suma de " + sumaDePlata + " RON");
    }
}
