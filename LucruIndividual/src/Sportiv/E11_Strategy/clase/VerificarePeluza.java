package Sportiv.E11_Strategy.clase;

public class VerificarePeluza implements VerificareSpectator {
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("Verificare acces in peluza: " + spectator.getNume() +
                ", va rugam sa permiteti controlul bagajului si al hainelor purtate!");
    }
}
