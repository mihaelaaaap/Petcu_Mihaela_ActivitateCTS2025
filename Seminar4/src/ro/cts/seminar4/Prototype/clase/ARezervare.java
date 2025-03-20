package ro.cts.seminar4.Prototype.clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare() {
        this.numeClient = "Anonim";
        this.nrPersoane = 5;
        this.data = "01.01.2025";
        this.ora = "12:00";
    }

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length() > 3 ) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Necunoscut";
        }

       if(nrPersoane > 2) {
           this.nrPersoane = nrPersoane;
       } else {
           this.nrPersoane = 2;
       }

       if(data.length() == 10) {
           this.data = data;
       } else {
           this.data = "Necunoscut";
       }

       if(ora.length() == 5) {
           this.ora = ora;
       } else {
           this.ora = "Necunoscuta";
       }
    }

    public abstract void descriere();

    public abstract ARezervare copiaza();

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ARezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora='").append(ora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
