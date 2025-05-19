package STB.F7_Decorator.clase;

import Sportiv.E14_Template_Method.clase.Bilet;

public class BiletSarbatoare extends DecoratorBilet {
    private String sarbatoare;

    public BiletSarbatoare(IBilet biletDecorat, String sarbatoare) {
        super(biletDecorat);
        this.sarbatoare = sarbatoare;
    }

    @Override
    public void descriereBilet() {
        super.descriereBilet();
        this.afiseazaUrare();
    }

    @Override
    public void afiseazaUrare() {
        System.out.println("Cu ocazia zilei de " + this.sarbatoare + " compania STB va ureaza LA MULTI ANI!");
    }
}
