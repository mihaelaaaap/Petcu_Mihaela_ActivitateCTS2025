package clase;

public class PachetTuristic {

	private IPersoana client;
	private String destinatie;
	private Double pret;

	public PachetTuristic(IPersoana client, String destinatie, Double pret) {
		super();
		this.client = client;
		this.destinatie = destinatie;
		this.pret = pret;
	}

	public boolean poateRezerva() {
		return client.getVarsta() > 18;
	}

	public void aplicaDiscountVarstnici(int procent) {
		if (this.client.getVarsta() >= 65) {
			this.pret = this.pret - (procent / 100);
		}
	}

	public IPersoana getClient() {
		return client;
	}

	public void setClient(IPersoana client) {
		this.client = client;
	}

	public String getDestinatie() {
		return destinatie;
	}

	public void setDestinatie(String destinatie) {
		this.destinatie = destinatie;
	}

	public Double getPret() {
		return pret;
	}

	public void setPret(Double pret) {
		this.pret = pret;
	}

}
