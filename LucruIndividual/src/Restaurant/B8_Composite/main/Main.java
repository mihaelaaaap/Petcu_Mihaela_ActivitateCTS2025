package Restaurant.B8_Composite.main;

import Restaurant.B8_Composite.clase.ComponentaMeniu;
import Restaurant.B8_Composite.clase.ItemMeniu;
import Restaurant.B8_Composite.clase.SectiuneMeniu;


public class Main {
    public static void main(String[] args) {
        try {
            ComponentaMeniu meniu = new SectiuneMeniu("Meniu");

            ComponentaMeniu  startere = new SectiuneMeniu("Startere");
            ComponentaMeniu bauturi = new SectiuneMeniu("Bauturi");
            ComponentaMeniu desert = new SectiuneMeniu("Desert");

            ComponentaMeniu sucuri = new SectiuneMeniu("Sucuri");
            ComponentaMeniu bauturiAlcoolice = new SectiuneMeniu("Bauturi alcoolice");
            ComponentaMeniu cafea =  new SectiuneMeniu("Cafea");

            ComponentaMeniu cola = new ItemMeniu("Coca-Cola", 7.5);
            ComponentaMeniu schweppes  = new ItemMeniu("Schweppes", 10);
            ComponentaMeniu sprite = new ItemMeniu("Sprite", 7.5);
            sucuri.adaugaElement(cola);
            sucuri.adaugaElement(schweppes);
            sucuri.adaugaElement(sprite);
            bauturi.adaugaElement(sucuri);

            ComponentaMeniu hugo = new ItemMeniu("Hugo", 25);
            ComponentaMeniu vin = new ItemMeniu("Vin", 30);
            ComponentaMeniu sampanie = new ItemMeniu("Sampanie", 35);
            ComponentaMeniu whiskey = new ItemMeniu("Whiskey", 45.5);
            bauturiAlcoolice.adaugaElement(hugo);
            bauturiAlcoolice.adaugaElement(vin);
            bauturiAlcoolice.adaugaElement(sampanie);
            bauturiAlcoolice.adaugaElement(whiskey);
            bauturi.adaugaElement(bauturiAlcoolice);

            ComponentaMeniu apaPlata = new ItemMeniu("Apa plata", 10);
            ComponentaMeniu apaMinerala = new ItemMeniu("Apa minerala", 11.5);
            bauturi.adaugaElement(apaPlata);
            bauturi.adaugaElement(apaMinerala);

            ComponentaMeniu espresso = new ItemMeniu("Espresso", 20);
            ComponentaMeniu cappuccino = new ItemMeniu("Cappuccino", 30);
            ComponentaMeniu frappe = new ItemMeniu("Frappe", 16);
            cafea.adaugaElement(espresso);
            cafea.adaugaElement(cappuccino);
            cafea.adaugaElement(frappe);
            bauturi.adaugaElement(cafea);

            ComponentaMeniu salata = new ItemMeniu("Salata", 25);
            ComponentaMeniu bruschete = new ItemMeniu("Bruschete", 30);
            ComponentaMeniu platouSpaniol = new ItemMeniu("Platou spaniol", 99);
            ComponentaMeniu tartar = new ItemMeniu("Tartar", 65.5);
            startere.adaugaElement(salata);
            startere.adaugaElement(bruschete);
            startere.adaugaElement(platouSpaniol);
            startere.adaugaElement(tartar);

            ComponentaMeniu clatite = new ItemMeniu("Clatite", 20);
            ComponentaMeniu tiramisu = new ItemMeniu("Tiramisu", 25);
            ComponentaMeniu eclere =  new ItemMeniu("Eclere", 15);
            ComponentaMeniu cheesecake = new ItemMeniu("Cheesecake", 30);
            ComponentaMeniu brownie = new ItemMeniu("Brownie", 25.5);
            desert.adaugaElement(clatite);
            desert.adaugaElement(tiramisu);
            desert.adaugaElement(eclere);
            desert.adaugaElement(cheesecake);
            desert.adaugaElement(brownie);

            meniu.adaugaElement(startere);
            meniu.adaugaElement(bauturi);
            meniu.adaugaElement(desert);

            meniu.descriereElement("");

//            desert.stergeElement(cheesecake);
//            meniu.descriereElement("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
