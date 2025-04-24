package Decorator.clase;

public class NotaDePlata implements Nota {
    private float total;

    public NotaDePlata(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public void printare() {
        System.out.println("TOTAL DE PLATA: " + total + " RON");
    }
}
