package clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static final float sumaFinantata = 20;

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumiriProiecte);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	@Override
	public String toString() {
		String detaliiGenerale = getDetaliiGenerale();
		StringBuilder builder = new StringBuilder("Student: ");
		builder.append(detaliiGenerale).append(", Facultate: " + facultate + ", An Studii: " + anStudii );
		return builder.toString();
	}

	@Override
	public void afiseazaFinantarePrimita() {
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + sumaFinantata + " Euro/zi in proiect.");

	}
}
