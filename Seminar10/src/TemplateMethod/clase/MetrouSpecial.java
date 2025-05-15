package TemplateMethod.clase;

public class MetrouSpecial extends Metrou {
    public MetrouSpecial(int numarMagistrala) {
        super(numarMagistrala);
    }

    @Override
    protected void opresteStatia1() {
        System.out.println("Urmeaza STATIA 1 - PIPERA cu peronul pe partea DREAPTA");
    }

    @Override
    protected void opresteStatia2() {
        System.out.println("STATIA 2 - AVIATORILOR - este in renovare!");
    }

    @Override
    protected void opresteStatia3() {
        System.out.println("Urmeaza STATIA 3 - PIATA VICTORIEI cu peronul pe partea DREAPTA");
    }

    @Override
    protected void opresteStatia4() {
        System.out.println("Urmeaza STATIA 4 - PIATA ROMANA cu peronul pe partea DREAPTA");
    }

    @Override
    protected void opresteStatia5() {
        System.out.println("Urmeaza STATIA 5 - PIATA UNIRII cu peronul pe partea STANGA");
    }

    @Override
    public void opresteStatia6() {
        System.out.println("Urmeaza STATIA 6 - BERCENI cu peronul pe partea DREAPTA");
    }
}
