package Sportiv.E14_Template_Method.main;

import Sportiv.E14_Template_Method.clase.AccesMeci;
import Sportiv.E14_Template_Method.clase.Bilet;
import Sportiv.E14_Template_Method.clase.Suporter;
import Sportiv.E14_Template_Method.clase.TemplateAccesMeci;

public class Main {
    public static void main(String[] args) {
        TemplateAccesMeci template = new AccesMeci();
        Suporter suporter = new Suporter("Popescu Ion", new Bilet("B100", "A", 80));
        template.accesMeci(suporter);
    }
}
