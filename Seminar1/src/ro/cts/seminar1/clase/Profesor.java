package ro.cts.seminar1.clase;

import ro.cts.seminar1.interfete.IPredabil;

public class Profesor extends Persoana implements IPredabil {
    private int idProfesor;
    private float salariu;
    private float sporVechime;

    public Profesor() {
        super("PROF", 35);
        this.idProfesor = 0;
        this.salariu = 0;
        this.sporVechime = 0;
    }

    public Profesor(String nume, int varsta, int idProfesor, float salariu, float sporVechime) {
        super(nume, varsta);
        this.idProfesor = idProfesor;
        this.salariu = salariu;
        this.sporVechime = sporVechime;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }


    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }



    public float getSporVechime() {
        return sporVechime;
    }

    public void setSporVechime(float sporVechime) {
        this.sporVechime = sporVechime;
    }

    @Override
    public void preda() {
        StringBuilder builder = new StringBuilder("Profesorul ");
        builder.append(this.getNume()).append(" in varsta de ").append(this.varsta).append(" de ani preda la curs.");
        System.out.println(builder.toString());
    }

    // practic e getter pt salariu
    @Override
    public float calculVenit() {
        return salariu + sporVechime * salariu;
    }
}
