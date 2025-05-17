package Banca.D16_Chain_of_Responsibility.clase;

public abstract class HandlerPlata {
    private HandlerPlata succesor;
    private double sold;

    public HandlerPlata(double sold) {
        this.sold = sold;
    }

    public HandlerPlata getSuccesor() {
        return succesor;
    }

    public double getSold() {
        return sold;
    }

    public void setSuccesor(HandlerPlata succesor) {
        this.succesor = succesor;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    protected void actualizeazaSold(double sumaSolicitata) {
        this.sold -= sumaSolicitata;
    }

    public boolean verificaSold(double sumaSolicitata) {
        return this.sold >= sumaSolicitata;
    }

    public abstract void gestioneazaPlata(double sumaSolicitata);
}
