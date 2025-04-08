package Subiect_TransmisiuneLive.Prototype.clase;


import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements Live {
    private String numeEveniment;
    private int numarSpectatori;
    private List<String> comentarii;

    public TransmisiuneLive(String numeEveniment, int numarSpectatori) {
        this.numeEveniment = numeEveniment;
        this.numarSpectatori = numarSpectatori;
        this.comentarii = new ArrayList<String>();
    }

    public void setComentarii(List<String> comentarii) {
        this.comentarii = comentarii;
    }

    @Override
    public Live clone() {
        List<String> clonaComentarii = new ArrayList<>(this.comentarii);
        TransmisiuneLive clona = new TransmisiuneLive(this.numeEveniment, this.numarSpectatori);
        clona.setComentarii(clonaComentarii);
        return clona;
    }

    @Override
    public void transmiteEvenimentLive() {
        StringBuilder stringBuilder = new StringBuilder("LIVE: ");
        stringBuilder.append(this.numeEveniment).append("\n")
                .append(this.numarSpectatori).append(" persoane conectate\n");
        System.out.println(stringBuilder.toString());
        if(!this.comentarii.isEmpty()) {
          this.afiseazaListaComentariilor();
        }
    }

    @Override
    public void adaugaComentariu(String comentariu) {
        this.comentarii.add(comentariu);
    }

    @Override
    public void afiseazaListaComentariilor() {
       StringBuilder stringBuilder = new StringBuilder("COMENTARII:\n");
        for(String comentariu : comentarii) {
            stringBuilder.append("\t").append(comentariu).append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

    @Override
    public void conectareSpectator() {
        this.numarSpectatori++;
    }
}
