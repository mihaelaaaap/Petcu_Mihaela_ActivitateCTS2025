package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPersoana;
import ro.cts.seminar1.interfete.IPredabil;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int nrCredite;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs() {
        this.numeCurs = "CTS";
        this.nrCredite = 5;
        cadruDidactic = new Profesor();
        studenti = new ArrayList<>();
    }

    public Curs(String numeCurs, int nrCredite, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.nrCredite = nrCredite;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public int getNrCredite() {
        return nrCredite;
    }

    public void setNrCredite(int nrCredite) {
        this.nrCredite = nrCredite;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    // afisare detalii curs
    public void detaliiCurs(){
        StringBuilder builder = new StringBuilder("La cursul ");
        builder.append(numeCurs).append(" cu ").append(nrCredite)
                .append(" puncte de credit, ").append("predat de ")
                .append(((IPersoana)cadruDidactic).getNume())
                .append(" participa ").append(studenti.size()).append(" studenti.");
        System.out.println(builder.toString());
    }

    // afisare detalii examen
    public void sustinereExamen(String data){
        StringBuilder builder = new StringBuilder("Pe data de ");
        builder.append(data).append(" cadrul didactic ")
                .append(((IPersoana)cadruDidactic).getNume())
                .append(" sustine examenul la ").append(this.numeCurs)
                .append(" cu urmatorii studenti: ");
        System.out.println(builder.toString());
        studenti.forEach(student -> System.out.println(student.getNume()));
//    for(ro.cts.seminar1.clase.Student student : studenti){
//        builder.append("\n").append(student.getNume()).append("\n");
//    }

    }
}
