package Composite.clase;

public interface Structura {
    void adaugaNod(Structura structura) throws Exception;
    void stergeNod(Structura structura) throws Exception;
    Structura getNodCopil(int index) throws Exception;
    void descriereStructura(String indent);
}
