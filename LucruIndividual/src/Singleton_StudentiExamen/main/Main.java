package Singleton_StudentiExamen.main;

import Singleton_StudentiExamen.clase.RegistryExamen;
import Singleton_StudentiExamen.clase.Serie;
import Singleton_StudentiExamen.clase.Student;

public class Main {
    public static void main(String[] args) {
        RegistryExamen examenCTS = RegistryExamen.getInstance("CTS", "10 iunie 2025");
        examenCTS.rezumatExamen();

        try {
            examenCTS.inregistreazaStudent(new Student("S22_1", "Ionel", 1097, Serie.E));
            examenCTS.inregistreazaStudent(new Student("S22_2", "Gigel", 1065, Serie.C));
            examenCTS.inregistreazaStudent(new Student("S22_3", "Maria", 1081, Serie.D));
            //examenCTS.inregistreazaStudent(new Student("S22_1", "Ioana", 1097, Serie.E));
        } catch (Exception e) {
            e.printStackTrace();
        }
        examenCTS.rezumatExamen();
    }
}
