package Subiect_Masina.Singleton.clase;

public class Masina extends AMasina{
    public Masina(String numarInmatriculare, String marca, double kilometraj) throws Exception {
        super(numarInmatriculare, marca, kilometraj);
    }

    @Override
    public void detaliiMasina() {
        StringBuilder stringBuilder = new StringBuilder("Autovehiculul cu numarul de inamtriculare ");
        stringBuilder.append(this.getNumarInmatriculare()).append(" (marca ")
                .append(this.getMarca()).append(", ").append(this.getKilometraj()).append(" km)\n");
        System.out.println(stringBuilder.toString());
    }
}
