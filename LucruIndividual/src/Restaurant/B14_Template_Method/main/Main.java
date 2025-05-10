package Restaurant.B14_Template_Method.main;

import Restaurant.B14_Template_Method.clase.Masa;
import Restaurant.B14_Template_Method.clase.OcupareMasa;
import Restaurant.B14_Template_Method.clase.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {
        Masa masaRezervata = new Masa(1, true);
        Masa masaLibera = new Masa(2, false);
        TemplateOcupareMasa template = new OcupareMasa(masaRezervata);
        template.ocupaMasa();
        template.setMasa(masaLibera);
        System.out.println("---------------------------------------------------------------");
        template.ocupaMasa();
    }
}
