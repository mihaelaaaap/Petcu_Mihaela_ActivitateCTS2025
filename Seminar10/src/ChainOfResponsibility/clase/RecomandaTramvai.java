package ChainOfResponsibility.clase;

public class RecomandaTramvai extends Handler {
    @Override
    public void recomandaMijlocTransport(int distanta) {
        if(distanta > 5 && distanta <= 10) {
            System.out.println("Pentru distanta de " + distanta + " km, circulati cu tramvaiul!");
        } else if( this.urmatorul != null) {
            this.urmatorul.recomandaMijlocTransport(distanta);
        }
    }
}
