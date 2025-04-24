package Facade.clase;

public class Facade {
    public String verificaAfisareMasa(Masa masa) {
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();
        if(masa.getEsteLibera()) {
            if (picolo.esteDebarasata(masa)) {
                if(ospatar.esteAranjata(masa)) {
                    return "Luati loc, va rog, la masa numarul " + masa.getNumarMasa();
                } else {
                    return "Va rugam asteptati, masa numarul " + masa.getNumarMasa() + " nu este inca aranjata.";
                }
            } else {
                return "Va rugam asteptati, masa numarul " + masa.getNumarMasa() + " nu a fost debarasata inca.";
            }
        } else {
            return "Momentan masa numarul " + masa.getNumarMasa() + " nu este libera.";
        }
    }
}
