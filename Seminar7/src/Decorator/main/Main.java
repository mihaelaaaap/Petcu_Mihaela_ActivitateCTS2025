package Decorator.main;

import Decorator.clase.Nota;
import Decorator.clase.NotaAnNou;
import Decorator.clase.NotaCraciun;
import Decorator.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata(150.5f);
        Nota notaDecorata = new NotaAnNou(nota);
//        notaDecorata.printare();
//        nota.printare();

        Nota notaCraciun = new NotaCraciun(notaDecorata);
        notaCraciun.printare();
    }
}
