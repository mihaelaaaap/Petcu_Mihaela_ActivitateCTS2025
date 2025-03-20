package ro.cts.seminar4.SimpleFactory.factory;

import ro.cts.seminar4.SimpleFactory.clase.Supa;
import ro.cts.seminar4.SimpleFactory.clase.SupaDeCiuperci;
import ro.cts.seminar4.SimpleFactory.clase.SupaDeLegume;
import ro.cts.seminar4.SimpleFactory.clase.SupaDeVita;

public class FactorySupe {
    private int gramaj;
    private int pretPerSutaDeGrame;

    public FactorySupe(int gramaj, int pretPerSutaDeGrame) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
    }

    public Supa getSupa(TipuriSupe tipSupa, String ingrediente, double extraSupa) {
        switch (tipSupa) {
            case supaDeCiuperci:
                SupaDeCiuperci supaDeCiuperci = new SupaDeCiuperci(gramaj, pretPerSutaDeGrame, ingrediente, (int) extraSupa);
                return supaDeCiuperci;
            case supaDeLegume:
                SupaDeLegume supaDeLegume = new SupaDeLegume(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                return supaDeLegume;
            case supaDeVita:
                SupaDeVita supaDeVita = new SupaDeVita(gramaj, pretPerSutaDeGrame, ingrediente, extraSupa);
                return supaDeVita;
            default: return null;
        }
    }
}
