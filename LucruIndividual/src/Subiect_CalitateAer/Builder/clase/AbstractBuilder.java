package Subiect_CalitateAer.Builder.clase;

public interface AbstractBuilder {
    AbstractAirQualitySensor build(int valoarePM25, double temperatura, double procentUmiditate);
}
