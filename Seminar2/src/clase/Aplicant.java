package clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumiriProiecte;


	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {

		return varsta;
	}

	public void setVarsta(int varsta) {

		this.varsta = varsta;
	}

	public int getPunctaj() {

		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}


	public void statut(){
		if(punctaj>80)
			System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
		else
			System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
	}


	public Aplicant() {
		super();
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumiriProiecte) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumiriProiecte = denumiriProiecte;
	}
	public int getNrProiecte() {

		return nrProiecte;
	}
	public void setNrProiecte(int nrProiecte,String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
		this.nrProiecte = nrProiecte;
	}

	public abstract void afiseazaFinantarePrimita();
}
