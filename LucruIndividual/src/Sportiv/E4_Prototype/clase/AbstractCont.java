package Sportiv.E4_Prototype.clase;

import Restaurant.B2_Builder.clase.Rezervare;

import java.util.Map;

public abstract class AbstractCont {
    private String numeSuporter;
    private String email;
    private String dataInregistrarii;
    private Map<Integer, String> istoricRezervari;

    public AbstractCont(String numeSuporter, String email, String dataInregistrarii,
                        Map<Integer, String> istoricRezervari) {
        this.numeSuporter = numeSuporter;
        this.email = email;
        this.dataInregistrarii = dataInregistrarii;
        this.istoricRezervari = istoricRezervari;
    }

    public String getNumeSuporter() {
        return numeSuporter;
    }

    public String getEmail() {
        return email;
    }

    public String getDataInregistrarii() {
        return dataInregistrarii;
    }

    public Map<Integer, String> getIstoricRezervari() {
        return istoricRezervari;
    }

    public void adaugaRezervare(String rezervareNoua) {
        int urmatoareaCheie = this.istoricRezervari.size() + 1;
        this.istoricRezervari.put(urmatoareaCheie, rezervareNoua);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SUPORTER: ");
        sb.append(numeSuporter).append('\n');
        sb.append("EMAIL: ").append(email).append('\n');
        sb.append("DATA INREGISTRARII: ").append(dataInregistrarii).append('\n');
        sb.append("ISTORIC REZERVARI:\n");
        if(istoricRezervari.isEmpty()) {
            sb.append(" Nu exista rezervari pentru acest suporter.\n");
        } else {
            for(Map.Entry<Integer, String> entry : istoricRezervari.entrySet()) {
                sb.append("\t").append(entry.getKey()).append(") ").append(entry.getValue()).append('\n');
            }
        }
        return sb.toString();
    }

    public abstract Cont clone();
}
