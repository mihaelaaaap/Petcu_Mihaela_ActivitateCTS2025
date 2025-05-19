package STB.F7_Decorator.main;

import STB.F7_Decorator.clase.BiletSTB;
import STB.F7_Decorator.clase.BiletSarbatoare;
import STB.F7_Decorator.clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new BiletSTB(10);
        IBilet biletDecorat = new BiletSarbatoare(bilet, "1 iunie - Ziua Copilului");
        biletDecorat.descriereBilet();
    }
}
