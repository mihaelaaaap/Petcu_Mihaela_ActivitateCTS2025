package Restaurant.B5_Adapter.clase;

public class AdapterBar implements SoftFacturi {
    private SoftBar soft;

    public AdapterBar(SoftBar soft) {
        this.soft = soft;
    }

    @Override
    public void printeazaFactura(String produs) {
        this.soft.printeazaFacturaBautura(produs);
    }
}
