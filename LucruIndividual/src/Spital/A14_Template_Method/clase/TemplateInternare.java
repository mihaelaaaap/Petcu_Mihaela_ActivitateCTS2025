package Spital.A14_Template_Method.clase;

public abstract class TemplateInternare {
    public final void internarePacient(Pacient pacient) {
        if(analizeazaStarePacient(pacient) == StarePacient.USOARA) {
            System.out.println("Pacientul " + pacient.getNume() + " nu necesita internare");
        } else if(analizeazaStarePacient(pacient) == StarePacient.MEDIE) {
            System.out.println("Pacientul " + pacient.getNume() + " se afla in stare de dificultate medie");
            verificaDisponibilitate();
            emiteFisaInternare(pacient);
        } else if(analizeazaStarePacient(pacient) == StarePacient.GRAVA) {
            System.out.println("Pacientul " + pacient.getNume() + " se afla in stare grava, este transportat catre sectia UPU");
            emiteFisaInternare(pacient);
        }
    }

    protected abstract StarePacient analizeazaStarePacient(Pacient pacient);
    protected abstract void verificaDisponibilitate();
    protected abstract void emiteFisaInternare(Pacient pacient);
}
