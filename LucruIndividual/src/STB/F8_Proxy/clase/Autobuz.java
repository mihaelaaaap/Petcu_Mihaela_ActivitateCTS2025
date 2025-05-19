package STB.F8_Proxy.clase;

import java.util.List;
import java.util.Random;

public class Autobuz implements IAutobuz {
    protected String linieAutobuz;
    protected int nrPasageri;
    protected List<String> statii;

    public Autobuz(String linieAutobuz, int nrPasageri, List<String> statii) {
        this.linieAutobuz = linieAutobuz;
        if (nrPasageri > 0) {
            this.nrPasageri = nrPasageri;
        } else {
            this.nrPasageri = 0;
        }
        this.statii = statii;
    }

    public void setNrPasageri(int nrPasageri) {
        if (this.nrPasageri > nrPasageri) {
            this.nrPasageri = nrPasageri;
        } else {
            this.nrPasageri = 0;
        };
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + this.linieAutobuz + " opreste in statie");

    }
}
