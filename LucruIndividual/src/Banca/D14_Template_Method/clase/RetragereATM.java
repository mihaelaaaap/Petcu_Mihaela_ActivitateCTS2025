package Banca.D14_Template_Method.clase;

import java.util.Scanner;

public class RetragereATM extends TemplateTranzactieATM {
    private String pinIntrodus;
    private double sumaSolicitata;

    @Override
    protected void introducereCard() {
        System.out.println("Hello, " + client.getNume().toUpperCase() + "!");
    }

    @Override
    protected void introducerePin() {
        System.out.println("Va rugam introduceti PIN-ul: ");
        Scanner scanner = new Scanner(System.in);
        this.pinIntrodus = scanner.nextLine();
    }

    @Override
    protected boolean verificarePin() {
        return client.verificaPin(this.pinIntrodus);
    }

    @Override
    protected void solicitaSuma() {
        System.out.println("Introduceti suma solicitata: ");
        Scanner scanner = new Scanner(System.in);
        this.sumaSolicitata = scanner.nextDouble();
    }

    @Override
    protected boolean verificareSold() {
        return client.areSoldSuficient(this.sumaSolicitata);
    }

    @Override
    protected void retragereBani() {
        client.actualizeazaSold(this.sumaSolicitata);
        System.out.println("Va rugam sa ridicati suma solicitata. Sold ramas: " + client.getSold() + " RON");
    }

    @Override
    protected void retragereCard() {
        System.out.println("Va rugam sa ridicati cardul. Multumim ca ati ales serviciile noastre!");
    }
}
