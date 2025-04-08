package Subiect_Masina.FactoryMethod.clase;

public class SUV extends AMasina {
    public SUV(String numarInmatriculare, String marca, double kilometraj) throws Exception {
        super(numarInmatriculare, marca, kilometraj);
    }

    @Override
    public void detaliiMasina() {
        descriereMasina();
        System.out.println("Tip masina: SUV\n");
    }
}
