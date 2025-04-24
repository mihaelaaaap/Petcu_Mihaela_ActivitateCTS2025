package Proxy.clase;

public class RezervareProxy implements IRezervare {
    private IRezervare rezervare;

    public RezervareProxy(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int numarPersoane) {
        if(numarPersoane >= 4){
            rezervare.realizeazaRezervare(numeClient, numarPersoane);
        } else {
            System.out.println("Nu este nevoie de rezervare!");
        }
    }
}
