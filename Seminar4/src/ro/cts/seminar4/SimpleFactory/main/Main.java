package ro.cts.seminar4.SimpleFactory.main;

import ro.cts.seminar4.SimpleFactory.clase.Supa;
import ro.cts.seminar4.SimpleFactory.factory.FactorySupe;
import ro.cts.seminar4.SimpleFactory.factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {
        FactorySupe fabrica = new FactorySupe(300, 10);
        Supa supa1 = fabrica.getSupa(TipuriSupe.supaDeLegume, "Ardei kapia, dovlecel, cartof", 100);
        Supa supa2 = fabrica.getSupa(TipuriSupe.supaDeCiuperci, "Ciuperci Champignon", 200);
        Supa supa3 = fabrica.getSupa(TipuriSupe.supaDeVita, "Antricot de vita", 25);

        supa1.preparareSupa();
        supa2.preparareSupa();
        supa3.preparareSupa();
    }
}