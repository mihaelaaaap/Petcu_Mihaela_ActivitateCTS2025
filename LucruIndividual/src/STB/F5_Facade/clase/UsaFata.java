package STB.F5_Facade.clase;

public class UsaFata implements UsaAutobuz {
    @Override
    public void deschideLiber() {
        System.out.println("Calatorii solicita deschiderea libera a usii din fata...");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Usa din fata a fost deschisa fortat!");
    }
}
