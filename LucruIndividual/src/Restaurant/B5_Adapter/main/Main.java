package Restaurant.B5_Adapter.main;

import Restaurant.B5_Adapter.clase.AdapterBar;
import Restaurant.B5_Adapter.clase.SoftBar;
import Restaurant.B5_Adapter.clase.SoftBucatarie;
import Restaurant.B5_Adapter.clase.SoftFacturi;

public class Main {
    public static void main(String[] args) {
        SoftFacturi softVechi = new SoftBucatarie();
        softVechi.printeazaFactura("Paste Carbonara");
        SoftFacturi adapter = new AdapterBar(new SoftBar());
        adapter.printeazaFactura("Sampanie Moet");
        adapter.printeazaFactura("Gin");
        adapter.printeazaFactura("Cocktail");
    }
}
