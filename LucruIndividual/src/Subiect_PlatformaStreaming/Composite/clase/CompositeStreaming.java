package Subiect_PlatformaStreaming.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeStreaming implements IClip {
    private TipComposite tip;
    private String nume;
    private List<IClip> componente;

    public CompositeStreaming(TipComposite tip, String nume) {
        this.tip = tip;
        this.nume = nume;
        this.componente = new ArrayList<IClip>();
    }

    @Override
    public void afiseazaDetalii(String indent) {
        System.out.println(indent + this.tip + " - " + this.nume + " (" +
                this.getNumarComponente() + " elemente)");
        for (IClip componenta : this.componente) {
            componenta.afiseazaDetalii(indent + indent);
        }
    }

    @Override
    public void adaugaElement(IClip clip) {
        this.componente.add(clip);
    }

    @Override
    public void stergeElement(IClip clip) {
        this.componente.remove(clip);
    }

    @Override
    public IClip getClip(int index) {
        if(index >= 0 && index < this.componente.size()) {
            return this.componente.get(index);
        } else {
            throw new RuntimeException("Indexul este in afara limitelor!");
        }
    }


    @Override
    public int getNumarComponente() {
        int total = 0;
        for (IClip componenta : this.componente) {
            total += componenta.getNumarComponente();
        }
        return total;
    }
}
