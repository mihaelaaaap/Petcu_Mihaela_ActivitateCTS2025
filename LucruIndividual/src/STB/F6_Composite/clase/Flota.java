package STB.F6_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements ComponentaFlota {
    private TipGrupAutobuz grup;
    private List<ComponentaFlota> autobuze;

    public Flota(TipGrupAutobuz grup) {
        this.grup = grup;
        this.autobuze = new ArrayList<ComponentaFlota>();
    }

    @Override
    public void descriere(String indent) {
        System.out.println("FLOTA AUTOBUZE GRUP " + this.grup.toString().toUpperCase() + ":");
        for(ComponentaFlota autobuz : this.autobuze) {
            autobuz.descriere(indent);
        }
    }

    @Override
    public void adaugaComponenta(ComponentaFlota componenta) {
        if (componenta instanceof Autobuz autobuz) {
            TipGrupAutobuz grupCorect = TipGrupAutobuz.getGrupPentruLocuri(autobuz.getNrLocuri());
            if (grupCorect != this.grup) {
                System.out.println("Autobuzul " + autobuz.getNrInmatriculare() + " nu corespunde categoriei de grup "
                        + this.grup + ". Se incadreaza la categoria de grup " + grupCorect);
                return;
            }
        }
        autobuze.add(componenta);
    }

    @Override
    public void stergeComponenta(ComponentaFlota componenta) {
        this.autobuze.remove(componenta);
    }
}
