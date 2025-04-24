package Decorator.clase;

public class NotaCraciun extends NotaDecorata {
    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit! <3");
    }
}
