package Subiect_Broadcasting.SimpleFactory.clase;

public class Workshop implements Event {
    private final String title;

    public Workshop(String title) {
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
        System.out.println("WORKSHOP " + this.title);
    }
}
