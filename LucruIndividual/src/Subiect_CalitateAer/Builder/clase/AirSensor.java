package Subiect_CalitateAer.Builder.clase;


public class AirSensor implements AbstractAirQualitySensor {
    private final int valoarePM25;
    private final double temperatura;
    private final double procentUmiditate;
    private final boolean areNivelPM10;
    private final boolean areNivelVOC;
    private final boolean areNivelCO2;
    private final boolean areNivelCO;

    public AirSensor(int valoarePM25, double temperatura, double procentUmiditate,
                     boolean areNivelPM10, boolean areNivelVOC, boolean areNivelCO2, boolean areNivelCO) {
        this.valoarePM25 = valoarePM25;
        this.temperatura = temperatura;
        this.procentUmiditate = procentUmiditate;
        this.areNivelPM10 = areNivelPM10;
        this.areNivelVOC = areNivelVOC;
        this.areNivelCO2 = areNivelCO2;
        this.areNivelCO = areNivelCO;
    }

    @Override
    public void descriereSenzor() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t-> Valoare PM 2.5: " + valoarePM25);
        stringBuilder.append("\n\t-> Temperatura: " + temperatura + " grade Celsius");
        stringBuilder.append("\n\t-> Umiditate: " + procentUmiditate + "%");
        stringBuilder.append("\n\t-> Are nivel PM10: " + detineFunctionalitate(areNivelPM10));
        stringBuilder.append("\n\t-> Are nivel VOC: " + detineFunctionalitate(areNivelVOC));
        stringBuilder.append("\n\t-> Are nivel CO2: " + detineFunctionalitate(areNivelCO2));
        stringBuilder.append("\n\t-> Are nivel CO: " + detineFunctionalitate(areNivelCO));
        System.out.println(stringBuilder.toString());
    }

    @Override
    public String detineFunctionalitate(boolean functionalitate) {
        return functionalitate ? "DA" : "NU";
    }

    public static class AirSensorBuilder implements AbstractBuilder {
        private boolean areNivelPM10;
        private boolean areNivelVOC;
        private boolean areNivelCO2;
        private boolean areNivelCO;

        public AirSensorBuilder() {
            this.areNivelPM10 = false;
            this.areNivelVOC = false;
            this.areNivelCO2 = false;
            this.areNivelCO = false;
        }

        public AirSensorBuilder setAreNivelPM10(boolean areNivelPM10) {
            this.areNivelPM10 = areNivelPM10;
            return this;
        }

        public AirSensorBuilder setAreNivelVOC(boolean areNivelVOC) {
            this.areNivelVOC = areNivelVOC;
            return this;
        }

        public AirSensorBuilder setAreNivelCO2(boolean areNivelCO2) {
            this.areNivelCO2 = areNivelCO2;
            return this;
        }

        public AirSensorBuilder setAreNivelCO(boolean areNivelCO) {
            this.areNivelCO = areNivelCO;
            return this;
        }

        @Override
        public AbstractAirQualitySensor build(int valoarePM25, double temperatura,
                                              double procentUmiditate) {
            return new AirSensor(valoarePM25, temperatura, procentUmiditate,
                    this.areNivelPM10, this.areNivelVOC, this.areNivelCO2, this.areNivelCO);
        }
    }
}
