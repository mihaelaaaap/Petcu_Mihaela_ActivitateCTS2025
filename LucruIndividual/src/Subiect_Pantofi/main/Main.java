package Subiect_Pantofi.main;

import Subiect_Pantofi.clase.Pantof;
import Subiect_Pantofi.clase.PantofiException;
import Subiect_Pantofi.clase.TipMaterialBaza;
import Subiect_Pantofi.clase.TipPantof;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pantof> listaPantofi = new ArrayList<Pantof>();
        try {
            Pantof pereche1 = new Pantof.BuilderPantofi(37,8.5, TipMaterialBaza.PIELE)
                    .adaugaMesaj("The devil wears Prada")
                    .adaugaMesaj("Adorable")
                    .build(TipPantof.STILETTO);
            listaPantofi.add(pereche1);
            Pantof pereche2 = new Pantof.BuilderPantofi(38,2, TipMaterialBaza.PIELE)
                    .adaugaMaterialSuplimentar("Blana")
                    .adaugaMaterialSuplimentar("Piele intoarsa")
                    .build(TipPantof.GHETE);
            listaPantofi.add(pereche2);
            Pantof pereche3 = new Pantof.BuilderPantofi(36,5.5, TipMaterialBaza.CAUCIUC)
                    .build(TipPantof.BALERINI);
            listaPantofi.add(pereche3);
            Pantof pereche4 = new Pantof.BuilderPantofi(39, 10, TipMaterialBaza.PANZA)
                    .adaugaMaterialSuplimentar("Satin")
                    .build(TipPantof.STILETTO);
            listaPantofi.add(pereche4);
            Pantof pereche5 = new Pantof.BuilderPantofi(32,13, TipMaterialBaza.PANZA)
                    .adaugaMaterialSuplimentar("Satin").adaugaMaterialSuplimentar("Blana").adaugaMaterialSuplimentar("Piele intoarsa")
                    .adaugaMesaj("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA")
                    .build(TipPantof.TENISI);
            listaPantofi.add(pereche5);
        } catch (PantofiException exception) {
            exception.printStackTrace();
        }

        for (Pantof pantof : listaPantofi) {
            pantof.descrierePantofi();
        }
    }
}
