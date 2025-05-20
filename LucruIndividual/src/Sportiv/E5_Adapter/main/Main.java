package Sportiv.E5_Adapter.main;

import Sportiv.E5_Adapter.clase.AdapterBilet;
import Sportiv.E5_Adapter.clase.IBilet;
import Sportiv.E5_Adapter.clase.eBiletRO;

public class Main {
    public static void main(String[] args) {
        eBiletRO bilet = new eBiletRO();
        IBilet adapter = new AdapterBilet(bilet);
        adapter.vindeBilet("Romania - Cipru", "10 iunie 2025");
        adapter.rezervaBilet("FCSB - Farul Constanta", "22 mai 2025");
    }
}
