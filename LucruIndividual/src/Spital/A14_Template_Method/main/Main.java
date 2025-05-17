package Spital.A14_Template_Method.main;

import Spital.A14_Template_Method.clase.ConcreteInternare;
import Spital.A14_Template_Method.clase.Pacient;
import Spital.A14_Template_Method.clase.StarePacient;
import Spital.A14_Template_Method.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        TemplateInternare template = new ConcreteInternare();

        Pacient p1 = new Pacient("Mihai", StarePacient.USOARA);
        Pacient p2 = new Pacient("George", StarePacient.MEDIE);
        Pacient p3 = new Pacient("Andreea", StarePacient.GRAVA);

        template.internarePacient(p1);
        System.out.println();
        template.internarePacient(p2);
        System.out.println();
        template.internarePacient(p3);
        System.out.println();
    }
}
