package ro.cts.seminar5.FactoryMethod.clase;

public abstract class PersonalSpital {
    private String nume;
    private double salariu;

    public PersonalSpital(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital ");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(' ');
        return sb.toString();
    }
}
