package Subiect_PlatformaStreaming.Composite.main;

import Subiect_PlatformaStreaming.Composite.clase.ClipVideo;
import Subiect_PlatformaStreaming.Composite.clase.CompositeStreaming;
import Subiect_PlatformaStreaming.Composite.clase.IClip;
import Subiect_PlatformaStreaming.Composite.clase.TipComposite;

public class Main {
    public static void main(String[] args) {
        IClip categorieSport = new CompositeStreaming(TipComposite.Categorie, "SPORT");
        IClip categorieMuzica = new CompositeStreaming(TipComposite.Categorie, "MUZICA");

        IClip clip1 = new ClipVideo(10f, "Cele mai bune momente din meciul Romania - Ucraina");
        IClip clip2 = new ClipVideo(25.5f, "Interviu cu Simona Halep");
        IClip clip3 = new ClipVideo(5.25f, "Rezumat meci FCSB - Rapid Bucuresti");

        categorieSport.adaugaElement(clip1);
        categorieSport.adaugaElement(clip2);
        categorieSport.adaugaElement(clip3);

        IClip playlistManele = new CompositeStreaming(TipComposite.Playlist, "MANELE <3");

        IClip clip4 = new ClipVideo(3.48f, "Adi Minune - Asa sunt zilele mele");
        IClip clip5 = new ClipVideo(3.23f, "Nicolae Guta - Ma bate vantul in fata");
        IClip clip6 = new ClipVideo(2.5f, "Tzanca Uraganu - Se misca pe beat");

        playlistManele.adaugaElement(clip4);
        playlistManele.adaugaElement(clip5);
        playlistManele.adaugaElement(clip6);

        IClip clip7 = new ClipVideo(3.02f, "Beyonce - Single Ladies");
        IClip clip8 = new ClipVideo(3.44f, "Britney Spears - Toxic");

        categorieMuzica.adaugaElement(playlistManele);
        categorieMuzica.adaugaElement(clip7);
        categorieMuzica.adaugaElement(clip8);

        categorieSport.afiseazaDetalii("\t");
        categorieMuzica.afiseazaDetalii("\t");
    }
}
