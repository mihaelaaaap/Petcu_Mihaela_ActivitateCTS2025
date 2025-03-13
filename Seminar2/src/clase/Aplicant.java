package clase;

public abstract class Aplicant {
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

	public void statutAcceptareFinantare(int pragPunctaj) {
		String decizieAcceptare = punctaj > pragPunctaj ? " a fost acceptat. (PUNCTAJ:" + this.punctaj + ")"
				: " nu a fost acceptat.(PUNCTAJ:" + punctaj + ")";
		StringBuilder builder = new StringBuilder("Aplicantul ");
		builder.append(this.nume).append(" ").append(this.prenume).append(decizieAcceptare);
		System.out.println(builder.toString());
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

	public void setNrProiecte(int nrProiecte, String[] denumiriProiecte) {
		this.denumiriProiecte = denumiriProiecte;
		this.nrProiecte = nrProiecte;
	}

	public abstract void afiseazaFinantarePrimita();

	public String getDetaliiGenerale() {
		return String.format("Nume: %s, Prenume: %s, Varsta: %d, Punctaj: %d, Nr_proiecte: %d, Denumiri Proiecte: %s",
				nume, prenume, varsta, punctaj, nrProiecte, String.join(", ", denumiriProiecte));

	}
}
