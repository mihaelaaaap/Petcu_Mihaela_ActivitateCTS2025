package Subiect_CodSursa.Composite.main;


import Subiect_CodSursa.Composite.clase.Code;
import Subiect_CodSursa.Composite.clase.CompositeUnitateCod;
import Subiect_CodSursa.Composite.clase.NodFrunzaUnitateCod;
import Subiect_CodSursa.Composite.clase.TipNodFrunza;

public class Main {
    public static void main(String[] args) {
        Code functia1 = new NodFrunzaUnitateCod(TipNodFrunza.functia, "int getSuma(int a, int b)");
        Code functia2 = new NodFrunzaUnitateCod(TipNodFrunza.functia, "int getPutere(int a, int b)");
        Code metoda1 = new NodFrunzaUnitateCod(TipNodFrunza.metoda, "void printeazaRezultat()");

        Code clasaCalculator = new CompositeUnitateCod("Calculator");
        Code clasaOperatii = new CompositeUnitateCod("OperatiiMatematice");

        clasaOperatii.adaugaUnitateCod(functia1);
        clasaOperatii.adaugaUnitateCod(functia2);

        clasaCalculator.adaugaUnitateCod(metoda1);
        clasaCalculator.adaugaUnitateCod(clasaOperatii);

        clasaCalculator.parseazaUnitateCod("  ");

        System.out.println();
        clasaCalculator.getUnitateCod(0).parseazaUnitateCod(" ");

        System.out.println();
        functia1.parseazaUnitateCod(" ");

    }
}
