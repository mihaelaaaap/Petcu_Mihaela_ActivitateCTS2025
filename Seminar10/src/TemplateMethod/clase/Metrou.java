package TemplateMethod.clase;

public class Metrou extends AMetrou {
    public Metrou(int numarMagistrala) {
        super(numarMagistrala);
    }

    @Override
    protected void opresteStatia1() {
        System.out.println("Urmeaza STATIA 1 - PIPERA cu peronul pe partea DREAPTA");
    }

    @Override
    protected void opresteStatia2() {
        System.out.println("Urmeaza STATIA 2 -AVIATORILOR cu peronul pe partea STANGA");
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
    protected void opresteStatia6() {
        System.out.println("Urmeaza STATIA 6 - BERCENI cu peronul pe partea DREAPTA");
    }
}
