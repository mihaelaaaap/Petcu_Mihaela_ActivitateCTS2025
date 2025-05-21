package Subiect_PlatformaStreaming.Decorator.clase;

public class Reclama extends DecoratorClip {
    private double durata;
    private double momentRedare;
    private String titlu;

    public Reclama(IClip clipDecorat, double durata, double momentRedare, String titlu) {
        super(clipDecorat);
        this.durata = durata;
        this.momentRedare = momentRedare;
        this.titlu = titlu;
    }

    @Override
    public void redareReclama() {
        String durataString = String.format("%.2f", this.durata);
        String momentRedareString = String.format("%.2f", this.momentRedare);
        System.out.println("Reclama " + this.titlu + " - " + durataString + " min" +
                " va fi redata la " + momentRedareString + " min");
    }
}
