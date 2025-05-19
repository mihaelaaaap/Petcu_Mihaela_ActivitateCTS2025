package STB.F5_Facade.clase;

public class UsaSpate implements UsaAutobuz {
    @Override
    public void deschideLiber() {
        System.out.println("Calatorii solicita deschiderea libera a usii din spate...");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Usa din spate a fost deschisa fortat!");
    }
}
