package Banca.D16_Chain_of_Responsibility.clase;

public class ContEconomii extends HandlerPlata {
    public ContEconomii(double sold) {
        super(sold);
    }

    @Override
    public void gestioneazaPlata(double sumaSolicitata) {
        if(verificaSold(sumaSolicitata)) {
            System.out.println("Ati efectuat o plata in valoare de "
                    + sumaSolicitata + " RON din contul de economii");
            this.actualizeazaSold(sumaSolicitata);
            System.out.println("Sold ramas: " + this.getSold());
        } else if(this.getSuccesor() != null) {
            this.getSuccesor().gestioneazaPlata(sumaSolicitata);
        }
    }
}
