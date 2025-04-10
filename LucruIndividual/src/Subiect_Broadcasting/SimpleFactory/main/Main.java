package Subiect_Broadcasting.SimpleFactory.main;

import Subiect_Broadcasting.SimpleFactory.clase.Event;
import Subiect_Broadcasting.SimpleFactory.factory.FactoryEvenimente;
import Subiect_Broadcasting.SimpleFactory.factory.TipEveniment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryEvenimente factory = new FactoryEvenimente();
        List<Event> evenimente = new ArrayList<>();
        evenimente.add(factory.creeazaEveniment(TipEveniment.WEBINAR, "POO in C++"));
        evenimente.add(factory.creeazaEveniment(TipEveniment.WORKSHOP, "Design Patterns Creationale"));
        evenimente.add(factory.creeazaEveniment(TipEveniment.CONFERINTA, "Cum utilizeaza studentii AI-ul?"));
        for(int i = 0; i < evenimente.size(); i++){
            System.out.println("Evenimentul " + (i+1));
            evenimente.get(i).broadcast();
        }
        evenimente.get(0).setTitle("Titlu nou");
    }
}
