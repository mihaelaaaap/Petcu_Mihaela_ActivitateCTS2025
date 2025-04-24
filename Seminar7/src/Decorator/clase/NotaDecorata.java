package Decorator.clase;

public abstract class NotaDecorata implements Nota {
    private Nota nota;

    public NotaDecorata(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printare() {
        nota.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
