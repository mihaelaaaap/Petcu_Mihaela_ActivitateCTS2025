package Restaurant.B8_Composite.clase;

public interface ComponentaMeniu {
    void adaugaElement(ComponentaMeniu componenta) throws Exception;
    void stergeElement(ComponentaMeniu componenta) throws Exception;
    ComponentaMeniu getComponentaMeniu(int index) throws Exception;
    void descriereElement(String indent);
}
