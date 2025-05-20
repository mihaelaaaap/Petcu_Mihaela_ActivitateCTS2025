package Banca.D8_Proxy.clase;

public class ProxySumaSolicitata implements ICredit {
    private ICredit credit;

    public ProxySumaSolicitata(ICredit credit) {
        this.credit = credit;
    }
    @Override
    public void acordaCredit(String numeClient) {
        if(this.credit instanceof Credit) {
            Credit c = (Credit) this.credit;
            if(c.getSuma() < 50000) {
                this.credit.acordaCredit(numeClient);
            } else {
                System.out.println("Ne cerem scuze, momentan nu putem acorda credite mai mari de "
                        + c.getSuma() + " " + c.getMoneda());
            }
        } else {
            this.credit.acordaCredit(numeClient);
        }
    }

    public void setCredit(ICredit credit) {
        this.credit = credit;
    }
}
