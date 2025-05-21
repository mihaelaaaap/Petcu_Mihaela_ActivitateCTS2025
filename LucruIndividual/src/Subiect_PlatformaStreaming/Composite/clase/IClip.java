package Subiect_PlatformaStreaming.Composite.clase;

public interface IClip {
    void afiseazaDetalii(String indent);
    void adaugaElement(IClip clip);
    void stergeElement(IClip clip);
    IClip getClip(int index);
    int getNumarComponente();
}
