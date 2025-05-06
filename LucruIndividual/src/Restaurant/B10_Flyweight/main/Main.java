package Restaurant.B10_Flyweight.main;

import Restaurant.B10_Flyweight.clase.Client;
import Restaurant.B10_Flyweight.clase.FlyweightFactoryRezervari;
import Restaurant.B10_Flyweight.clase.IClient;
import Restaurant.B10_Flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervareIonescu = new Rezervare(1, 3, "13:00", "10 mai 2025");
        Rezervare rezervareIonescu2 = new Rezervare(2, 2, "20:00", "29 mai 2025");
        Rezervare rezervarePop= new Rezervare(3, 2, "15:30", "9 mai 2025");

        FlyweightFactoryRezervari factoryRezervari = new FlyweightFactoryRezervari();
        IClient client1 = factoryRezervari.getClient("Ionescu Irina", "irina.ionescu@gmail.com", "0755110290");
        client1.descriere(rezervareIonescu);
        factoryRezervari.getClient("Ionescu Irina", "irina.ionescu@gmail.com", "0755110290").descriere(rezervareIonescu2);
        IClient client2 = factoryRezervari.getClient("Pop Mihai", "mihai.pop@gmail.com", "0799807651");
        client2.descriere(rezervarePop);
    }
}
