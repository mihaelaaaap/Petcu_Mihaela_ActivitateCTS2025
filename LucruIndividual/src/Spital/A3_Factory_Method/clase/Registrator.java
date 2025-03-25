package Spital.A3_Factory_Method.clase;

public class Registrator extends Personal {
    public Registrator(String nume, String prenume, int salariu, int aniVechime) {
        super(nume, prenume, salariu, aniVechime);
    }

    @Override
    public void descriereProfilAngajat() {
        StringBuilder builder = new StringBuilder(this.getNumeComplet().toUpperCase());
        builder.append("\n").append("FUNCTIE: asistent").append("\n")
                .append("SALARIUL: ").append(this.getSalariu()).append(" RON").append("\n")
                .append("Angajat din anul ").append(this.getAnAngajare()).append(" (")
                .append(this.getAniVechime()).append(" ani vechime)");
        System.out.println(builder.toString());
    }
}
