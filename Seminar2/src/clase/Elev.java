package clase;

import java.util.Arrays;

public class Elev extends Aplicant{

	private int clasa;
	private String tutore;
	private static float sumaFinantata = 30;


	public int getClasa() {
		return clasa;
	}
	public void setClasa(int i) {
		this.clasa = i;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}


	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte  + ", Denumiri Proiecte="
				+ Arrays.toString(denumiriProiecte) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, String[] denumiriProiecte, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public void afiseazaFinantarePrimita() {
		System.out.println("Elevul" + getNume() + " " + getPrenume() + " primeste" + sumaFinantata + " Euro/zi in proiect.");
	}


}
