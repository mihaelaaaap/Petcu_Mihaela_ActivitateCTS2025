package Restaurant.B14_Template_Method.clase;

public abstract class TemplateOcupareMasa {
    private Masa masa;

    public TemplateOcupareMasa(Masa masa) {
        this.masa = masa;
    }

    public void setMasa(Masa masa) {
        this.masa = masa;
    }

    public final void ocupaMasa(){
        if(this.masa.getEsteRezervata()) {
            System.out.println("MASA NUMARUL " + this.masa.getNumarMasa());
            curataMasa();
            asazaServetele();
            asazaTacamuri();
            invitaClientii();
        } else {
            System.out.println("Masa numarul " + this.masa.getNumarMasa() + " NU este rezervata!");
        }
    }

    protected abstract void curataMasa();
    protected abstract void asazaServetele();
    protected abstract void asazaTacamuri();
    protected abstract void invitaClientii();
}
