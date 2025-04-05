package Sportiv.E4_Prototype.clase;

import java.util.HashMap;
import java.util.Map;

public class Cont extends AbstractCont {

    public Cont(String numeSuporter, String email, String dataInregistrarii, Map<Integer, String> istoricRezervari) {
        super(numeSuporter, email, dataInregistrarii, istoricRezervari);
    }

    @Override
    public Cont clone() {
        Map<Integer,String> clonaIstoricRezervari = new HashMap<>(this.getIstoricRezervari());
        return new Cont(this.getNumeSuporter(), this.getEmail(), this.getDataInregistrarii(), clonaIstoricRezervari);
    }
}
