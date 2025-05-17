package Banca.D16_Chain_of_Responsibility.clase;

public class ContDebit extends HandlerPlata {
    public ContDebit(double sold) {
        super(sold);
    }

    @Override
    public void gestioneazaPlata(double sumaSolicitata) {
        if(verificaSold(sumaSolicitata)) {
            System.out.println("Ati efectuat o plata in valoare de "
            + sumaSolicitata + " RON din contul de debit");
            this.actualizeazaSold(sumaSolicitata);
            System.out.println("Sold ramas: " + this.getSold());
        } else if(this.getSuccesor() != null) {
            this.getSuccesor().gestioneazaPlata(sumaSolicitata);
        }
    }
}
