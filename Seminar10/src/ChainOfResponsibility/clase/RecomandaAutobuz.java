package ChainOfResponsibility.clase;

public class RecomandaAutobuz extends Handler {
    @Override
    public void recomandaMijlocTransport(int distanta) {
        if(distanta > 3 && distanta <=5) {
            System.out.println("Pentru distanta de " + distanta + " km, circulati cu autobuzul!");
        } else if( this.urmatorul != null) {
            this.urmatorul.recomandaMijlocTransport(distanta);
        }
    }
}
