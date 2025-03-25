package Spital.A2_Simple_Factory.clase;

public class Medic extends Personal {
    private String specializare;

    public Medic(String nume, String prenume, int salariu, int aniVechime, String specializare) {
        super(nume, prenume, salariu, aniVechime);
        this.specializare = specializare;
    }

    @Override
    public void descriereProfilAngajat() {
        StringBuilder builder = new StringBuilder(this.getNumeComplet().toUpperCase());
        builder.append("\n").append("FUNCTIE: medic ").append(specializare).append("\n")
                .append("SALARIUL: ").append(this.getSalariu()).append(" RON").append("\n")
                .append("Angajat din anul ").append(this.getAnAngajare()).append(" (")
                .append(this.getAniVechime()).append(" ani vechime)");
        System.out.println(builder.toString());
    }

}
