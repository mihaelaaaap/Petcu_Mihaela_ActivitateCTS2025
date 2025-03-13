package ro.cts.seminar3.SingletonRegistry;

public class Autorizatie {
   private String detinator;
   private int nrAutorizatie;
   private String data;

    Autorizatie(String detinator, int nrAutorizatie, String data) {
        this.detinator = detinator;
        this.nrAutorizatie = nrAutorizatie;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autorizatie{");
        sb.append("detinator='").append(detinator).append('\'');
        sb.append(", nrAutorizatie=").append(nrAutorizatie);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
