package ChainOfResponsibility.main;

import ChainOfResponsibility.clase.*;

public class Main {
    public static void main(String[] args) {
        Handler troleibuz = new RecomandaTroleibuz();
        Handler autobuz = new RecomandaAutobuz();
        Handler tramvai = new RecomandaTramvai();
        Handler metrou = new RecomandaMetrou();

        troleibuz.setUrmatorul(autobuz);
        autobuz.setUrmatorul(tramvai);
        tramvai.setUrmatorul(metrou);

        troleibuz.recomandaMijlocTransport(2);
        troleibuz.recomandaMijlocTransport(4);
        troleibuz.recomandaMijlocTransport(8);
        troleibuz.recomandaMijlocTransport(12);
    }
}
