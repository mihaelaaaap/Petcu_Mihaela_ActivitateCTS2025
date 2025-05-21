package Subiect_PlatformaStreaming.Decorator.clase;

public class ClipVideo implements IClip {
    @Override
    public void redareVideo() {
        String durataString = String.format("%.2f", this.durata);
        System.out.println("Se reda clipul " + this.titlu + " - " + durataString + " min");
    }

    private double durata;
    private String titlu;

    public ClipVideo(double durata, String titlu) {
        this.durata = durata;
        this.titlu = titlu;
    }

}
