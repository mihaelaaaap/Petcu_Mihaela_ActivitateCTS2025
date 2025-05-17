package Sportiv.E14_Template_Method.clase;

public class AccesMeci extends TemplateAccesMeci {

    @Override
    protected void asezareInRand() {
        System.out.println("Domnule/Doamna " + this.suporter.getNume() + ", va rugam sa va asezati la coada si sa asteptati pana vine randul dvs.");
    }

    @Override
    protected void prezentareBilet() {
        System.out.println("Va rugam sa prezentati biletul dvs.");
        System.out.println(this.suporter.getBilet().toString());
    }

    @Override
    protected void controlCorporal() {
        System.out.println("Va rugam sa permiteti controlul corporal inainte de a finaliza procedura de acces...");
    }

    @Override
    protected void intrareInStadion() {
        System.out.println("Puteti intra in stadion pe poarta de acces " +
                this.suporter.getBilet().getPoartaAcces() + ". Distractie placuta!");
    }

    @Override
    protected void ocupareLoc() {
        System.out.println("Asezati-va pe locul numarul " + this.suporter.getBilet().getNumarLoc());
    }
}
