package Flyweight.main;

import Flyweight.clase.Receptie;
import Flyweight.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        Receptie receptie = new Receptie();

        receptie.getPacient("6030406", "Maria", "0711000222", "Bucuresti, Bd.Unirii, Nr.25A");
        receptie.getPacient("5010515", "Pavel", "0724105690", "Iasi, Str.Amurgului, Nr.42");
        receptie.getPacient("6030911", "Laura", "0711000219", "Bucuresti, Bd.Unirii, Nr.1");

        Spitalizare spitalizare1 = new Spitalizare(1, 1, 5);
        Spitalizare spitalizare2 = new Spitalizare(1, 2, 3);
        Spitalizare spitalizare3 = new Spitalizare(2, 1, 2);
        Spitalizare spitalizare4 = new Spitalizare(3, 2, 7);

        try {
            receptie.getPacient("6030406").detaliiPacient(spitalizare1);
            receptie.getPacient("6030406").detaliiPacient(spitalizare2);
            receptie.getPacient("5010515").detaliiPacient(spitalizare3);
            receptie.getPacient("6030911").detaliiPacient(spitalizare4);
            receptie.getPacient("6030910").detaliiPacient(spitalizare4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
