package Subiect_Bicicleta.Builder.clase;

public class Bicicleta implements IBicicleta {
    private final float diametruRoti;
    private final float pret;
    private final TipFrana tipFrana;
    private final boolean areCascaProtectie;
    private final boolean areOchelari;
    private final boolean areCotiere;
    private final boolean areGenunchiere;

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

    public static class BuilderBiciclete implements AbstractBuilder {
        private float diametruRoti;
        private float pret;
        private TipFrana tipFrana;
        private boolean areCascaProtectie;
        private boolean areOchelari;
        private boolean areCotiere;
        private boolean areGenunchiere;

        public BuilderBiciclete() {
            this.diametruRoti = 10;
            this.pret = 0;
            this.tipFrana= TipFrana.NICIUNA;
            this.areCascaProtectie = false;
            this.areOchelari = false;
            this.areCotiere = false;
            this.areGenunchiere = false;
        }

        public BuilderBiciclete setDiametruRoti(float diametruRoti) {
            this.diametruRoti = diametruRoti;
            return this;
        }

        public BuilderBiciclete setPret(float pret) {
            this.pret = pret;
            return this;
        }

        public BuilderBiciclete setTipFrana(TipFrana tipFrana) {
            this.tipFrana = tipFrana;
            return this;
        }

        public BuilderBiciclete setAreCascaProtectie(boolean areCascaProtectie) {
            this.areCascaProtectie = areCascaProtectie;
            return this;
        }

        public BuilderBiciclete setAreOchelari(boolean areOchelari) {
            this.areOchelari = areOchelari;
            return this;
        }

        public BuilderBiciclete setAreCotiere(boolean areCotiere) {
            this.areCotiere = areCotiere;
            return this;
        }

        public BuilderBiciclete setAreGenunchiere(boolean areGenunchiere) {
            this.areGenunchiere = areGenunchiere;
            return this;
        }

        @Override
        public IBicicleta construiesteBicicleta() {
            return new Bicicleta(this.diametruRoti, this.pret, this.tipFrana, this.areCascaProtectie,
                    this.areOchelari, this.areCotiere, this.areGenunchiere);
        }
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
