package Proxy.clase;

public class ProxyNumeClient implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare){
        this.rezervare = rezervare;
    }
    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        if(numeClient.length() > 5){
            this.rezervare.realizeazaRezervare(numeClient, nrPersoane);
        }
        else{
            System.out.println("Nu va este permisa rezervarea.");
        }
    }
}
