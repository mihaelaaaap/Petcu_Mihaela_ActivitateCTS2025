package Banca.D9_Composite.clase;

public interface UnitateBancara {
    void adaugaComponenta(UnitateBancara unitate);
    void stergeComponenta(UnitateBancara unitate);
    void descrieStructura(String indent);
}
