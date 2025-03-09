package clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
    private String ocupatie;
    private int salariu;
    private static float sumaFinantata = 10;

    public String getOcupatie() {
        return ocupatie;
    }
    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }
    public int getSalariu() {
        return salariu;
    }
    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }
    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte,int salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }

    public Angajat() {
        super();
    }

    @Override
    public String toString() {
        return "Angajat: Nume= " + nume + ", Prenume= " + prenume
                + ", Varsta= " + varsta + ", Punctaj= " + punctaj + ", Nr_proiecte= " + nrProiecte + ", Denumiri Proiecte= "
                + Arrays.toString(denumiriProiecte) + "Ocupatie= " + ocupatie + ", salariu= " + salariu;
    }

    @Override
    public void afiseazaFinantarePrimita() {
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantata + " Euro/zi in proiect.");
    }


}
