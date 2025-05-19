package Farmacie.C8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeSectiune implements ComponentaGrupare {
    private String denumire;
    private List<ComponentaGrupare> arboresenta;

    public CompositeSectiune(String denumire) {
        this.denumire = denumire;
        this.arboresenta = new ArrayList<>();
    }

    @Override
    public void descriereComponenta(String indent) {
        System.out.println(indent + "Medicamente "+ this.denumire + ":");
        for (ComponentaGrupare componenta : this.arboresenta) {
            componenta.descriereComponenta(indent + indent);
        }
    }

    @Override
    public void adaugaComponenta(ComponentaGrupare componenta) {
        this.arboresenta.add(componenta);
    }

    @Override
    public void stergeComponenta(ComponentaGrupare componenta) {
        this.arboresenta.remove(componenta);
    }
}
