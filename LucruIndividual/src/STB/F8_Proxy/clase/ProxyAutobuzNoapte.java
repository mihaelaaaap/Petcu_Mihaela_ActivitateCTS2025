package STB.F8_Proxy.clase;

import java.util.List;
import java.util.Random;

public class ProxyAutobuzNoapte implements IAutobuz {
    private Autobuz autobuz;

    public ProxyAutobuzNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        Random random = new Random();
        List<String> statii = this.autobuz.statii;
        int nrPasageri = this.autobuz.nrPasageri;

        for (String statie : statii) {
            if (nrPasageri == 0) {
                System.out.println("Autobuzul " + this.autobuz.linieAutobuz +
                        " nu mai are pasageri. Se retrage la autobaza.");
                break;
            }

            int coborati = random.nextInt(nrPasageri + 1);
            System.out.println("STATIA " + statie.toUpperCase());
            this.autobuz.opresteInStatie();
            System.out.println("Au coborat " + coborati + " pasageri...");
            nrPasageri -= coborati;
        }
    }
}
