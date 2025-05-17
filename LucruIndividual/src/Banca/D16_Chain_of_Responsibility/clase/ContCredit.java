package Banca.D16_Chain_of_Responsibility.clase;

public class ContCredit extends HandlerPlata {
    public ContCredit(double sold) {
        super(sold);
    }

    @Override
    public void gestioneazaPlata(double sumaSolicitata) {
        if(verificaSold(sumaSolicitata)) {
            System.out.println("Ati efectuat o plata in valoare de "
                    + sumaSolicitata + " RON din contul de credit");
            this.actualizeazaSold(sumaSolicitata);
            System.out.println("Sold ramas: " + this.getSold());
        } else {
            System.out.println("Plata a fost refuzata, deoarece soldul este insuficient! ("
            + this.getSold() + " RON)");
        }
    }
}
