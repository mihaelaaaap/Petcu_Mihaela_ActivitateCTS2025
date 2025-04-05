package STB.F3_Builder.clase;

public class AutobuzLinie {
    private final String modelAutobuz;
    private final String numeSofer;
    private final int linie;
    private final boolean opresteLaCapatDeLinie;
    private final boolean areDeschidereAutomataUsi;
    private final String textEcran;
    private final boolean areAC;

    private AutobuzLinie(Builder builder) {
        this.modelAutobuz = builder.modelAutobuz;
        this.numeSofer = builder.numeSofer;
        this.linie = builder.linie;
        this.opresteLaCapatDeLinie = builder.opresteLaCapatDeLinie;
        this.areDeschidereAutomataUsi = builder.areDeschidereAutomataUsi;
        this.textEcran = builder.textEcran;
        this.areAC = builder.areAC;
    }

    public static class Builder implements AbstractBuilderAutobuz{
        private final String modelAutobuz;
        private final String numeSofer;
        private final int linie;
        private boolean opresteLaCapatDeLinie = false;
        private boolean areDeschidereAutomataUsi = false;
        private String textEcran = "Linie STB standard";
        private boolean areAC = false;

        public Builder(String modelAutobuz, String numeSofer, int linie) {
            this.modelAutobuz = modelAutobuz;
            this.numeSofer = numeSofer;
            this.linie = linie;
        }

        public Builder setOpresteLaCapatDeLinie(boolean opresteLaCapatDeLinie) {
            this.opresteLaCapatDeLinie = opresteLaCapatDeLinie;
            return this;
        }

        public Builder setAreDeschidereAutomataUsi(boolean areDeschidereAutomataUsi) {
            this.areDeschidereAutomataUsi = areDeschidereAutomataUsi;
            return this;
        }

        public Builder setTextEcran(String text) {
            this.textEcran = text;
            return this;
        }

        public Builder setAreAC(boolean areAC) {
            this.areAC = areAC;
            return this;
        }

        public AutobuzLinie build() {
            return new AutobuzLinie(this);
        }
    }

    public String areFunctionalitate(boolean functionalitate){
        return functionalitate ? "DA" : "NU";
    }

    public void descriereAutobuz() {
        StringBuilder stringBuilder = new StringBuilder("Autobuzul ");
        stringBuilder.append(modelAutobuz).append(" condus pe linia ").append(linie)
                .append(" de catre ").append(numeSofer).append(" are urmatoarele functionalitati:");
        stringBuilder.append("\n\t-> Opreste la capat de linie: ").append(areFunctionalitate(opresteLaCapatDeLinie))
                .append("\n\t-> Deschidere automata a usilor: ").append(areFunctionalitate(areDeschidereAutomataUsi))
                .append("\n\t-> Aer conditionat: ").append(areFunctionalitate(areAC))
                .append("\n").append(textEcran);
        System.out.println(stringBuilder.toString());
    }
}
