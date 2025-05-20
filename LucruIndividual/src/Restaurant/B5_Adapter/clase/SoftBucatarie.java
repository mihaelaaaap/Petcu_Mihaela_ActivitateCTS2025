package Restaurant.B5_Adapter.clase;

public class SoftBucatarie implements SoftFacturi {
    @Override
    public void printeazaFactura(String produs) {
        System.out.println("POFTA BUNA! Factura pentru " + produs);
    }
}
