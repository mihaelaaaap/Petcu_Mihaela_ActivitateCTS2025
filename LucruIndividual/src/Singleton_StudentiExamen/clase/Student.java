package Singleton_StudentiExamen.clase;

public class Student {
    private String numarMatricol;
    private String nume;
    private int grupa;
    private Serie serie;

    public Student(String numarMatricol, String nume, int grupa, Serie serie) {
        this.numarMatricol = numarMatricol;
        this.nume = nume;
        this.grupa = grupa;
        this.serie = serie;
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void profilStudent() {
        StringBuilder stringBuilder = new StringBuilder("\t-> Nume: ");
        stringBuilder.append(nume.toUpperCase())
                .append("\n\t-> Grupa: ").append(grupa)
                .append("\n\t-> Serie: ").append(serie.toString()).append("\n");
        System.out.println(stringBuilder.toString());
    }
}
