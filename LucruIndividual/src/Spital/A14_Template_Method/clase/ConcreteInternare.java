package Spital.A14_Template_Method.clase;

public class ConcreteInternare extends TemplateInternare {
    @Override
    protected StarePacient analizeazaStarePacient(Pacient pacient) {
        return pacient.getStarePacient();
    }

    @Override
    protected void verificaDisponibilitate() {
        System.out.println("Se verifica disponibilitatea locurilor din spital...");
    }

    @Override
    protected void emiteFisaInternare(Pacient pacient) {
        System.out.println("S-a emis fisa de internare pentru pacientul " + pacient.getNume());
    }
}
