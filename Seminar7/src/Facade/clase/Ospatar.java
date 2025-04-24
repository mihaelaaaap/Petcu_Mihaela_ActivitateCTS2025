package Facade.clase;

public class Ospatar {

    // numerele pare -> mese debarasate
    // numerele divizibile cu 4 -> sunt si aranjate
    public boolean esteAranjata(Masa masa) {
        return masa.getNumarMasa()%4==0;
    }
}
