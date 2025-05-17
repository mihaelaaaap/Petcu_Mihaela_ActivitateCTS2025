package Sportiv.E11_Strategy.clase;

public class VerificareVIP implements VerificareSpectator {
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("Verificare acces zona VIP: " + spectator.getNume() +
                ", va rugam sa prezentati biletul!");
    }
}
