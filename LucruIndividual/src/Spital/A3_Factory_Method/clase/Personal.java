package Spital.A3_Factory_Method.clase;

import java.time.LocalDate;

public abstract class Personal {
    private String nume;
    private String prenume;
    private int salariu;
    private int aniVechime;

    public Personal(String nume, String prenume, int salariu, int aniVechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
        this.aniVechime = aniVechime;
    }

    public String getNumeComplet() {
        return nume + " " + prenume;
    }

    public int getAnAngajare(){
        return LocalDate.now().getYear() - aniVechime;
    }

    public int getSalariu() {
        return salariu;
    }

    public int getAniVechime() {
        return aniVechime;
    }

    public abstract void descriereProfilAngajat();
}
