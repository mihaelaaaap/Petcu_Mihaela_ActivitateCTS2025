package Subiect_SalaFitness.Strategy.main;

import Subiect_SalaFitness.Strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        IExercitiu flotari = new Flotari();
        IExercitiu fandari = new Fandari();
        IExercitiu salturi = new Salturi();
        IExercitiu genuflexiuni = new Genuflexiuni();

        IChallenge challenge1 = new Challenge("Maria");
        IChallenge challenge2 = new Challenge("Ionut");

        challenge1.setExercitiu(fandari);
        challenge1.executaChallenge();
        challenge1.setExercitiu(salturi);
        challenge1.executaChallenge();

        challenge2.setExercitiu(flotari);
        challenge2.executaChallenge();
        challenge2.setExercitiu(genuflexiuni);
        challenge2.executaChallenge();
    }
}
