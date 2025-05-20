package Banca.D7_Facade.clase;

public class FacadeCreareCont {
    private ServiciuCreante serviciuCreante = new ServiciuCreante();
    private ServiciuPolitie serviciuPolitie = new ServiciuPolitie();

    protected boolean verificaEligibilitateDeschidereCont(Persoana persoana) {
        return persoana.varsta >= 18 && !this.serviciuCreante.areCreanteLaAlteBanci(persoana)
                && !this.serviciuPolitie.esteUrmaritaDePolitie(persoana);
    }

    public void comunicareDecizieEligibilitate(Persoana persoana) {
        if (verificaEligibilitateDeschidereCont(persoana)) {
            System.out.println("Dl./Dna. " + persoana.nume + " in varsta de " + persoana.varsta
            + " ani este eligibil/eligibila pentru deschiderea contului!");
        } else {
            System.out.println("Dl./Dna. " + persoana.nume + " in varsta de " + persoana.varsta
                    + " ani NU este eligibil/eligibila pentru deschiderea contului, deoarece: ");

            if(persoana.varsta < 18) {
                System.out.println("\t - este minor/minora (varsta: " + persoana.varsta + " ani)");
            }

            if(this.serviciuPolitie.esteUrmaritaDePolitie(persoana)) {
                System.out.println("\t - este urmarit/urmarita de politie");
            }

            if(this.serviciuCreante.areCreanteLaAlteBanci(persoana)) {
                System.out.println("\t - are creante la alte banci");
            }
        }
        System.out.println();
    }
}
