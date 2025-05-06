package Restaurant.B10_Flyweight.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String ora;
    private String data;

    public Rezervare(int nrMasa, int nrPersoane, String ora, String data) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
        this.data = data;
    }

    public void detaliiRezervare() {
        StringBuilder stringBuilder = new StringBuilder("Rezervare pentru ");
        stringBuilder.append(this.nrPersoane).append(" persoane - masa ")
                .append(this.nrMasa).append(" ( ").append(this.data).append(", ora ")
                .append(this.ora).append(" )");
        System.out.println(stringBuilder.toString());
    }
}
