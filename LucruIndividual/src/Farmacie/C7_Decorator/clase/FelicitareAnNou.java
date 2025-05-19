package Farmacie.C7_Decorator.clase;

public class FelicitareAnNou extends DecoratorBon {
    public FelicitareAnNou(IBon bonDecorat) {
        super(bonDecorat);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Farmacia noastra va ureaza un An Nou fericit si prosper!");
    }
}
