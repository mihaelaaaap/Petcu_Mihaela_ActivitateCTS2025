package Subiect_Masina.FactoryMethod.clase;

public class VAN extends AMasina {
    public VAN(String numarInmatriculare, String marca, double kilometraj) throws Exception {
        super(numarInmatriculare, marca, kilometraj);
    }

    @Override
    public void detaliiMasina() {
        descriereMasina();
        System.out.println("Tip masina: VAN\n");
    }
}
