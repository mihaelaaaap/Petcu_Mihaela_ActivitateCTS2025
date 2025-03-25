package Restaurant.B3_Factory_Method.main;

import Restaurant.B3_Factory_Method.clase.Preparat;
import Restaurant.B3_Factory_Method.factories.*;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FactoryPreparate factorySupe = new FactorySupe();
        FactoryPreparate factoryDeserturi = new FactoryDeserturi();

        Preparat supaCiuperci = factorySupe.createPreparat(TipSupa.CIUPERCI, List.of("Ciuperci", "Smantana", "Ceapa"),
                18.5f,
                Map.of("Carbohidrati", "12g", "Grasimi", "8g", "Proteine", "5g"));
        Preparat supaLegume = factorySupe.createPreparat(TipSupa.LEGUME, List.of("Morcov", "Cartof", "Telina"),
                15.0f,
                Map.of("Carbohidrati", "10g", "Grasimi", "3g", "Proteine", "2g"));
        Preparat supaVita = factorySupe.createPreparat(TipSupa.VITA, List.of("Carne vita", "Cartofi", "Morcov"),
                21.0f,
                Map.of("Carbohidrati", "9g", "Grasimi", "12g", "Proteine", "15g"));
        Preparat clatite = factoryDeserturi.createPreparat(TipDesert.CLATITE,  List.of("Faina", "Ou", "Lapte", "Gem"),
                14.0f,
                Map.of("Carbohidrati", "25g", "Grasimi", "7g", "Proteine", "6g"));
        Preparat papanasi = factoryDeserturi.createPreparat(TipDesert.PAPANASI, List.of("Branza", "Dulceata", "Smantana"),
                17.5f,
                Map.of("Carbohidrati", "22g", "Grasimi", "10g", "Proteine", "8g"));
        Preparat cheesecake = factoryDeserturi.createPreparat(TipDesert.CHEESECAKE, List.of("Branza", "Frisca", "Biscuiti"),
                20.0f,
                Map.of("Carbohidrati", "30g", "Grasimi", "15g", "Proteine", "9g"));

        supaCiuperci.descrierePreparat();
        supaLegume.descrierePreparat();
        supaVita.descrierePreparat();
        clatite.descrierePreparat();
        papanasi.descrierePreparat();
        cheesecake.descrierePreparat();
    }
}