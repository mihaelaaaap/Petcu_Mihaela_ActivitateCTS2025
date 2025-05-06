package Restaurant.B8_Composite.clase;

public class ItemMeniu implements ComponentaMeniu {
    private String denumire;
    private double pret;

    public ItemMeniu(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void adaugaElement(ComponentaMeniu componenta) throws Exception {
        throw new Exception("Operatiunea nu este permisa!");
    }

    @Override
    public void stergeElement(ComponentaMeniu componenta) throws Exception {
        throw new Exception("Operatiunea nu este permisa!");
    }

    @Override
    public ComponentaMeniu getComponentaMeniu(int index) throws Exception {
        throw new Exception("Operatiunea nu este permisa!");
    }

    @Override
    public void descriereElement(String indent) {
        System.out.println(indent + "- "+ this.denumire + " - " + this.pret + " RON");
    }
}
