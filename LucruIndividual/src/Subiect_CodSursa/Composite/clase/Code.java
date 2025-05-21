package Subiect_CodSursa.Composite.clase;

public interface Code {
    void adaugaUnitateCod(Code unitateCod);
    void stergeUnitateCod(Code unitateCod);
    void parseazaUnitateCod(String indent);
    Code getUnitateCod(int index);
}
