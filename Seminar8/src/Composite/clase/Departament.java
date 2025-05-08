package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String nume;
    private List<Structura> listaStructuri;

    public Departament(String nume) {
        this.nume = nume;
        this.listaStructuri = new ArrayList<Structura>();
    }


    @Override
    public void adaugaNod(Structura structura) throws Exception {
        this.listaStructuri.add(structura);
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        this.listaStructuri.remove(structura);
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        return this.listaStructuri.get(index);
    }

    @Override
    public void descriereStructura(String indent) {
        System.out.println(indent + "Departamentul " + this.nume + ": ");
        for (Structura structura : this.listaStructuri) {
            structura.descriereStructura(indent + "\t");
        }
    }
}
