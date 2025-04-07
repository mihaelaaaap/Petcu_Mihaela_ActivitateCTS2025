package Subiect_Bicicleta.SimpleFactory.clase;

public class BicicletaElectrica extends Bicicleta {

    public BicicletaElectrica(float diametruRoti, float pret, TipFrana tipFrana, boolean areCascaProtectie,
                              boolean areOchelari, boolean areCotiere, boolean areGenunchiere) {
        super(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
    }

    @Override
    public void descriere() {
        System.out.println("Bicicleta electrica, cu motor asistat");
        super.descriere();
    }
}
