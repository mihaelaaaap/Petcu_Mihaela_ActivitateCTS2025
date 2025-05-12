package Strategy.clase;

public class CardCalatorie implements IMetodaPlata {
    private int numarCalatorii;

    public CardCalatorie(int numarCalatorii) {
        this.numarCalatorii = numarCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if (this.numarCalatorii > 0) {
            this.numarCalatorii--;
            System.out.println("Plata cu cardul de calatorii validata! " + this.numarCalatorii + " calatorii ramase");
        } else {
            System.out.println("Eroare! Nu aveti calatorii ramase pe card!");
        }

    }
}
