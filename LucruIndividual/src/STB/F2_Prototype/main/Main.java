package STB.F2_Prototype.main;

import STB.F2_Prototype.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransport prototipAutobuz = new Autobuz("Mihai", 97);
        MijlocTransport prototipTroleibuz = new Troleibuz("Marius", 86);
        MijlocTransport prototipTramvai = new Tramvai("Andrei", 10);
        PrototypeMijlocTransport clonaAutobuz = prototipAutobuz.clone();
        PrototypeMijlocTransport clonaTramvai =  prototipTramvai.clone();
        PrototypeMijlocTransport clonaTroleibuz = prototipTroleibuz.clone();
        clonaAutobuz.descriereMijlocTransport();
        clonaTramvai.descriereMijlocTransport();
        clonaTroleibuz.descriereMijlocTransport();
    }
}
