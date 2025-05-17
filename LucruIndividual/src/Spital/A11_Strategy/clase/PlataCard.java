package Spital.A11_Strategy.clase;

public class PlataCard implements ModPlata {
    @Override
    public void platesteSpitalizare(Pacient pacient) {
        StringBuilder stringBuilder = new StringBuilder("Stimate pacient ");
        stringBuilder.append(pacient.getNume().toUpperCase())
                .append(", ati efectuat o plata cu cardul in valoare de ")
                .append(pacient.calculSumaDePlata()).append(" RON pentru cele ")
                .append(pacient.getNumarZileSpitalizare()).append(" zile de spitalizare");
        System.out.println(stringBuilder.toString());
    }
}
