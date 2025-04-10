package Subiect_Broadcasting.SimpleFactory.clase;

public class Webinar implements Event {
    private final String title;

    public Webinar(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        throw new UnsupportedOperationException("Titlul nu poate fi schimbat!");
    }

    @Override
    public void broadcast() {
        System.out.println("WEBINAR " + this.title);
    }
}
