package Sportiv.E9_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeStadion implements StructuraStadion {
    private String denumire;
    private List<StructuraStadion> elemente;

    public CompositeStadion(String denumire) {
        this.denumire = denumire;
        this.elemente = new ArrayList<StructuraStadion>();
    }

    @Override
    public void adaugaElement(StructuraStadion element) {
        this.elemente.add(element);
    }

    @Override
    public void stergeElement(StructuraStadion element) {
        this.elemente.remove(element);
    }

    @Override
    public void descriereElement(String indent) {
        System.out.println(indent + denumire);
        for (StructuraStadion element : elemente) {
            element.descriereElement(indent + indent);
        }
    }
}
