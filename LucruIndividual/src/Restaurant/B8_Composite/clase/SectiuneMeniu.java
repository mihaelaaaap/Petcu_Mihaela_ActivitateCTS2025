package Restaurant.B8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements ComponentaMeniu {
    private List<ComponentaMeniu> componente;
    private String denumire;

    public SectiuneMeniu(String denumire) {
        this.componente = new ArrayList<ComponentaMeniu>();
        this.denumire = denumire;
    }

    @Override
    public void adaugaElement(ComponentaMeniu componenta) {
        this.componente.add(componenta);
    }

    @Override
    public void stergeElement(ComponentaMeniu componenta) {
        this.componente.remove(componenta);
    }

    @Override
    public ComponentaMeniu getComponentaMeniu(int index) {
        return this.componente.get(index);
    }

    @Override
    public void descriereElement(String indent) {
        System.out.println(indent + this.denumire.toUpperCase());
        for (ComponentaMeniu componenta : this.componente) {
            componenta.descriereElement(indent + "    ");
        }

    }
}
