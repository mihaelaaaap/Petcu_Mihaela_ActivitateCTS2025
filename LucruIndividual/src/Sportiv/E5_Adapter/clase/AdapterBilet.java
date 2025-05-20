package Sportiv.E5_Adapter.clase;

public class AdapterBilet implements IBilet {
    private eBiletRO bilet;

    public AdapterBilet(eBiletRO bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet(String meci, String data) {
        this.bilet.rezervaBiletOnline(meci, data);
    }

    @Override
    public void vindeBilet(String meci, String data) {
        this.bilet.vindeBiletOnline(meci, data);
    }
}
