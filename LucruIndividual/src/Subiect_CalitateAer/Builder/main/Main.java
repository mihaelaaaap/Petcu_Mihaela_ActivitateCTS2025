package Subiect_CalitateAer.Builder.main;

import Subiect_CalitateAer.Builder.clase.AbstractAirQualitySensor;
import Subiect_CalitateAer.Builder.clase.AirSensor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractAirQualitySensor> senzori = new ArrayList<AbstractAirQualitySensor>();
        senzori.add(new AirSensor.AirSensorBuilder().build(31, 19.2, 50));
        senzori.add(new AirSensor.AirSensorBuilder().setAreNivelCO(true).setAreNivelPM10(true).build(48, 30, 35.6));
        senzori.add(new AirSensor.AirSensorBuilder().setAreNivelVOC(true).setAreNivelCO2(true).build(19, 29.5, 76));
        senzori.add(new AirSensor.AirSensorBuilder().setAreNivelPM10(true).build(72, 28, 65));

        int contor = 1;
        for(AbstractAirQualitySensor senzor : senzori) {
            System.out.println("Senzorul " + contor + ": ");
            senzor.descriereSenzor();
            contor++;
        }
    }
}
