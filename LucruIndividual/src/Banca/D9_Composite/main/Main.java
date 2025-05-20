package Banca.D9_Composite.main;

import Banca.D9_Composite.clase.Agentie;
import Banca.D9_Composite.clase.Filiala;
import Banca.D9_Composite.clase.Sucursala;
import Banca.D9_Composite.clase.UnitateBancara;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala = new Sucursala("Banca Nationala", "Bucuresti, Piata Unirii");

        UnitateBancara agentie1 = new Agentie("Agentie Sector 1", "Bd.Magheru, Nr.15");
        UnitateBancara agentie2 = new Agentie("Agentie Sector 2", "Bd.Ion Mihalache, Nr. 2B");

        UnitateBancara filiala1 = new Filiala("Filiala 1.1", "Str.Morii, Nr.10");
        UnitateBancara filiala2 = new Filiala("Filiala 1.2", "Str.Amurgului, Nr.20");
        UnitateBancara filiala3 = new Filiala("Filiala 2.1", "Str.Venus, Nr.7A");

        agentie1.adaugaComponenta(filiala1);
        agentie1.adaugaComponenta(filiala2);
        agentie2.adaugaComponenta(filiala3);

        sucursala.adaugaComponenta(agentie1);
        sucursala.adaugaComponenta(agentie2);

        sucursala.descrieStructura("\t");
    }
}
