import ro.cts.seminar3.clase.AutoritatePescuitEager;
import ro.cts.seminar3.clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.concediaza(2);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.setDenumire("ANpPA");
        autoritatePescuitEager.setWebsite("www.anppa.ro");
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutorizatie("Popescu Ion");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager altaAutoritateEager = AutoritatePescuitEager.getInstance();
        altaAutoritateEager.emiteAutorizatie("Popa Gigel");
        System.out.println(altaAutoritateEager.toString());

        AutoritatePescuitLazy autoritatePescuitLazy = AutoritatePescuitLazy.getInstance("ANPA", "www.anpa.ro", 10, 150);
        System.out.println(autoritatePescuitLazy.toString());
        AutoritatePescuitLazy altaAutoritateLazy = AutoritatePescuitLazy.getInstance("mihaela", "mihaela.ro", 15, 100);
        altaAutoritateLazy.angajeaza(2);
        System.out.println(autoritatePescuitLazy.toString());
    }
}