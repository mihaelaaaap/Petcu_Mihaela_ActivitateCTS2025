package STB.F5_Facade.clase;

public class UsaMijloc implements UsaAutobuz {
    @Override
    public void deschideLiber() {
        System.out.println("Calatorii solicita deschiderea libera a usii din mijloc...");
    }

    @Override
    public void deschideFortat() {
        System.out.println("Usa din mijloc a fost deschisa fortat!");
    }
}
