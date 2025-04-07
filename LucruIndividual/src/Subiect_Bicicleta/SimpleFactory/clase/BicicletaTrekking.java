package Subiect_Bicicleta.SimpleFactory.clase;

public class BicicletaTrekking extends Bicicleta {
    public BicicletaTrekking(float diametruRoti, float pret, TipFrana tipFrana, boolean areCascaProtectie,
                             boolean areOchelari, boolean areCotiere, boolean areGenunchiere) {
        super(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
    }

    @Override
    public void descriere() {
        System.out.println("Bicicleta Trekking ideala pentru drumetii montane");
        super.descriere();
    }
}
