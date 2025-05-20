package Banca.D8_Proxy.clase;

public class ProxyMoneda implements ICredit {
    private ICredit credit;

    public ProxyMoneda(ICredit credit) {
        this.credit = credit;
    }

    @Override
    public void acordaCredit(String numeClient) {
        if (this.credit instanceof Credit) {
            Credit c = (Credit) this.credit;
            if (c.getMoneda().equals(Moneda.RON)) {
                credit.acordaCredit(numeClient);
            } else {
                System.out.println("Solicitarea clientului " + numeClient + " pentru un credit in valoare de "
                        + c.getSuma() + " " + c.getMoneda() + " a fost respinsa!");
                System.out.println("Momentan, se acorda credite doar in RON!");
            }
        } else {
            this.credit.acordaCredit(numeClient);
        }
    }

    public void setCredit(ICredit credit) {
        this.credit = credit;
    }
}
