package Restaurant.B14_Template_Method.clase;

public class OcupareMasa extends TemplateOcupareMasa {

    public OcupareMasa(Masa masa) {
        super(masa);
    }

    @Override
    protected void curataMasa() {
        System.out.println("\tSe curata masa...");
    }

    @Override
    protected void asazaServetele() {
        System.out.println("\tSe asaza servetelele...");
    }

    @Override
    protected void asazaTacamuri() {
        System.out.println("\tSe asaza tacamurile...");
    }

    @Override
    protected void invitaClientii() {
        System.out.println("\tBine ati venit! Va puteti aseza!");
    }
}
