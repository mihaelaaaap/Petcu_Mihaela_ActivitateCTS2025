package Subiect_Bicicleta.SimpleFactory.clase;

import Subiect_Bicicleta.Builder.clase.AbstractBuilder;

public abstract class Bicicleta implements IBicicleta {
    private float diametruRoti;
    private float pret;
    private TipFrana tipFrana;
    private boolean areCascaProtectie;
    private boolean areOchelari;
    private boolean areCotiere;
    private boolean areGenunchiere;

    public Bicicleta(float diametruRoti, float pret, TipFrana tipFrana, boolean areCascaProtectie,
                     boolean areOchelari, boolean areCotiere, boolean areGenunchiere) {
        this.diametruRoti = diametruRoti;
        this.pret = pret;
        this.tipFrana = tipFrana;
        this.areCascaProtectie = areCascaProtectie;
        this.areOchelari = areOchelari;
        this.areCotiere = areCotiere;
        this.areGenunchiere = areGenunchiere;
    }

    private String decizieOptiuneExtra(boolean optiune) {
        return optiune ? "DA" : "NU";
    }

    @Override
    public void descriere() {
        StringBuilder stringBuilder = new StringBuilder("\tDiametru roti: ");
        stringBuilder.append(this.diametruRoti).append(" cm")
                .append("\n\tPret: ").append(this.pret).append(" RON")
                .append("\n\tTip frana: ").append(this.tipFrana)
                .append("\n\tCasca de protectie inclusa: ").append(decizieOptiuneExtra(this.areCascaProtectie))
                .append("\n\tOchelari inclusi: ").append(decizieOptiuneExtra(this.areOchelari))
                .append("\n\tCotiere incluse: ").append(decizieOptiuneExtra(this.areCotiere))
                .append("\n\tGenunchiere incluse: ").append(decizieOptiuneExtra(this.areGenunchiere)).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
