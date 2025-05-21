package Subiect_CodSursa.Composite.clase;

public class NodFrunzaUnitateCod implements Code {
    private TipNodFrunza tip;
    private String antet;

    public NodFrunzaUnitateCod(TipNodFrunza tip, String antet) {
        this.tip = tip;
        this.antet = antet;
    }

    @Override
    public void adaugaUnitateCod(Code unitateCod) {
        throw new RuntimeException("Operatie interzisa pe acest nivel!");
    }

    @Override
    public void stergeUnitateCod(Code unitateCod) {
        throw new RuntimeException("Operatie interzisa pe acest nivel!");
    }

    @Override
    public void parseazaUnitateCod(String indent) {
        System.out.println(indent + "Se parseaza " + this.tip + " " + this.antet + "...");
    }

    @Override
    public Code getUnitateCod(int index) {
        throw new RuntimeException("Operatie interzisa pe acest nivel!");
    }
}
