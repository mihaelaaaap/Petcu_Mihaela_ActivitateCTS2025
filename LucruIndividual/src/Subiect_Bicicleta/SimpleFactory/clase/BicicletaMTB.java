package Subiect_Bicicleta.SimpleFactory.clase;

public class BicicletaMTB extends Bicicleta {
    public BicicletaMTB(float diametruRoti, float pret, TipFrana tipFrana, boolean areCascaProtectie,
                        boolean areOchelari, boolean areCotiere, boolean areGenunchiere) {
        super(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
    }

    @Override
    public void descriere() {
        System.out.println("Bicicleta MTB pentru teren accidentat");
        super.descriere();
    }
}
