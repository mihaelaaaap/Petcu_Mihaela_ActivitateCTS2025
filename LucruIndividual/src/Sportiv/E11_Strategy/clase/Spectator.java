package Sportiv.E11_Strategy.clase;

public class Spectator {
    private String nume;
    private VerificareSpectator tipVerificare;

    public Spectator(String nume) {
        this.nume = nume;
    }

    public void setTipVerificare(VerificareSpectator tipVerificare) {
        this.tipVerificare = tipVerificare;
    }

    public String getNume() {
        return nume;
    }

    public void controlAcces() {
        this.tipVerificare.verificaSpectator(this);
    }
}
