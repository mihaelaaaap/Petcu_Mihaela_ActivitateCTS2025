package Subiect_CodSursa.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeUnitateCod implements Code {
    private String nume;
    private List<Code> componenteCod;

    public CompositeUnitateCod(String nume) {
        this.nume = nume;
        this.componenteCod = new ArrayList<Code>();
    }

    @Override
    public void adaugaUnitateCod(Code unitateCod) {
        this.componenteCod.add(unitateCod);
    }

    @Override
    public void stergeUnitateCod(Code unitateCod) {
        this.componenteCod.remove(unitateCod);
    }

    @Override
    public void parseazaUnitateCod(String indent) {
        System.out.println(indent + "Se parseaza clasa " + this.nume + "...");
        System.out.println(indent + "Componente ale clasei " + this.nume  + ":");
        for (Code componenteCod : this.componenteCod) {
            componenteCod.parseazaUnitateCod(indent + indent);
        }
        System.out.println();
    }

    @Override
    public Code getUnitateCod(int index) {
        if(index>=0 && index <this.componenteCod.size()) {
            return this.componenteCod.get(index);
        } else {
            throw new RuntimeException("Ati introdus un index invalid!");
        }
    }
}
