package Restaurant.B12_Observer.observers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientFidel implements Observer {
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        LocalDateTime dataCurenta = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm");

        String dataFormata = dataCurenta.format(formatter);
        System.out.println("[" + dataFormata + "] " + this.nume + ", tocmai ai primit urmatorul mesaj:\n\t " + mesaj);
    }
}
