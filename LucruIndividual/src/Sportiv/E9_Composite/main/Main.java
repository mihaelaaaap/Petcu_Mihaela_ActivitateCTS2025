package Sportiv.E9_Composite.main;

import Sportiv.E9_Composite.clase.CompositeStadion;
import Sportiv.E9_Composite.clase.Loc;
import Sportiv.E9_Composite.clase.StructuraStadion;

public class Main {
    public static void main(String[] args) {
        StructuraStadion loc1 = new Loc(1);
        StructuraStadion loc2 = new Loc(2);
        StructuraStadion loc3 = new Loc(3);
        StructuraStadion loc4 = new Loc(4);
        StructuraStadion loc5 = new Loc(5);
        StructuraStadion loc6 = new Loc(6);
        StructuraStadion loc7 = new Loc(7);
        StructuraStadion loc8 = new Loc(8);
        StructuraStadion loc9 = new Loc(9);
        StructuraStadion loc10 = new Loc(10);
        StructuraStadion loc11 = new Loc(11);

        CompositeStadion tribunaNord = new CompositeStadion("Tribuna Nord");
        tribunaNord.adaugaElement(loc1);
        tribunaNord.adaugaElement(loc2);

        CompositeStadion tribunaSud = new CompositeStadion("Tribuna Sud");
        tribunaSud.adaugaElement(loc3);
        tribunaSud.adaugaElement(loc4);

        CompositeStadion tribuna = new CompositeStadion("Tribuna");
        tribuna.adaugaElement(tribunaNord);
        tribuna.adaugaElement(tribunaSud);

        CompositeStadion vip = new CompositeStadion("VIP");
        vip.adaugaElement(loc5);
        vip.adaugaElement(loc6);

        CompositeStadion peluzaNord = new CompositeStadion("Peluza Nord");
        peluzaNord.adaugaElement(loc7);
        peluzaNord.adaugaElement(loc8);

        CompositeStadion peluzaSud = new CompositeStadion("Peluza Sud");
        peluzaSud.adaugaElement(loc9);
        peluzaSud.adaugaElement(loc10);
        peluzaSud.adaugaElement(loc11);

        CompositeStadion peluza = new CompositeStadion("Peluza");
        peluza.adaugaElement(peluzaNord);
        peluza.adaugaElement(peluzaSud);

        CompositeStadion stadion = new CompositeStadion("ARENA NATIONALA");
        stadion.adaugaElement(tribuna);
        stadion.adaugaElement(peluza);
        stadion.adaugaElement(vip);

        stadion.descriereElement(" ");
    }
}
