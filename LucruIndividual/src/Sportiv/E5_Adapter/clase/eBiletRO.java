package Sportiv.E5_Adapter.clase;

public class eBiletRO {
   public void rezervaBiletOnline(String meci, String data) {
       System.out.println("Ati rezervat un bilet pentru meciul " + meci + " din data de " + data);
       System.out.println("Va multumim ca ati ales e.Bilet.ro!");
   }

    public void vindeBiletOnline(String meci, String data) {
        System.out.println("Ati cumparat un bilet pentru meciul " + meci + " din data de " + data);
        System.out.println("Va multumim ca ati ales e.Bilet.ro!");
    }
}
