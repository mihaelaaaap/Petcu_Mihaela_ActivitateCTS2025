package Subiect_PlatformaStreaming.Decorator.main;

import Subiect_PlatformaStreaming.Decorator.clase.ClipVideo;
import Subiect_PlatformaStreaming.Decorator.clase.IClip;
import Subiect_PlatformaStreaming.Decorator.clase.Reclama;

public class Main {
    public static void main(String[] args) {
        IClip clip1 = new ClipVideo(3.45f, "Diamonds - Rihanna");
        IClip clip2 = new ClipVideo(15f, "OOP in 15 minutes");
        IClip clip3 = new ClipVideo(3.25f, "Game of Thrones - Trailer");
        IClip clip4 = new ClipVideo(10.14f, "What is SQL?");

        clip2 = new Reclama(clip2, 0.25f, 3.45f , "OOP Course on Udemy");
        clip4 = new Reclama(clip4, 0.30f, 5f , "Summer coding school at ASE Bucharest!");

        clip1.redareVideo();
        System.out.println();

        clip2.redareVideo();
        System.out.println();

        clip3.redareVideo();
        System.out.println();

        clip4.redareVideo();
        System.out.println();
    }
}
