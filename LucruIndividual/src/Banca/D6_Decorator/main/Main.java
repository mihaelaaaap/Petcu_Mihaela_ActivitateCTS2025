package Banca.D6_Decorator.main;

import Banca.D6_Decorator.clase.CardContactless;
import Banca.D6_Decorator.clase.CardFizic;
import Banca.D6_Decorator.clase.ICardBancar;

public class Main {
    public static void main(String[] args) {
        ICardBancar cardBancar = new CardFizic();
        CardContactless cardDecorat = new CardContactless(cardBancar);
        cardDecorat.platesteOnline(100.95);
        cardDecorat.platesteNormal(35.7);
        cardDecorat.platesteContactless(40.0);
    }
}
