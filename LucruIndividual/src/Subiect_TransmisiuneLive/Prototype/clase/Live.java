package Subiect_TransmisiuneLive.Prototype.clase;

public interface Live {
    Live clone();
    void transmiteEvenimentLive();
    void adaugaComentariu(String comentariu);
    void afiseazaListaComentariilor();
    void conectareSpectator();
}
