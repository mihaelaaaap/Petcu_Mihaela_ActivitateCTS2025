package Subiect_Masina.FactoryMethod.clase;

public class SEDAN extends AMasina {
    public SEDAN(String numarInmatriculare, String marca, double kilometraj) throws Exception {
        super(numarInmatriculare, marca, kilometraj);
    }

    @Override
    public void detaliiMasina() {
        descriereMasina();
        System.out.println("Tip masina: SEDAN\n");
    }
}
