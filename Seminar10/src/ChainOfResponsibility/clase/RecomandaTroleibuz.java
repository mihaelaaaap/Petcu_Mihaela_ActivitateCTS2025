package ChainOfResponsibility.clase;

public class RecomandaTroleibuz extends Handler {

    @Override
    public void recomandaMijlocTransport(int distanta) {
        if(distanta <= 3) {
            System.out.println("Pentru distanta de " + distanta + " km, circulati cu troleibuzul!");
        } else if( this.urmatorul != null){
            this.urmatorul.recomandaMijlocTransport(distanta);
        }
    }
}
