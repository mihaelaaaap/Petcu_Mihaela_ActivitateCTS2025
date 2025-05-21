package Subiect_PlatformaStreaming.Decorator.clase;

public abstract class DecoratorClip implements IClip {
    private IClip clipDecorat;

    public DecoratorClip(IClip clipDecorat) {
        this.clipDecorat = clipDecorat;
    }

    @Override
    public void redareVideo() {
        this.redareReclama();
        this.clipDecorat.redareVideo();
    }

    public abstract void redareReclama();
}
