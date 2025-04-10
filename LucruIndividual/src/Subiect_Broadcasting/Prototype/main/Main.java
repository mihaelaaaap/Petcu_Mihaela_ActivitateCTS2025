package Subiect_Broadcasting.Prototype.main;

import Subiect_Broadcasting.Prototype.clase.ConcreteWebinar;
import Subiect_Broadcasting.Prototype.clase.Webinar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> comments = new ArrayList<String>();
        comments.add("WOW!");
        comments.add("Interesting!");
        comments.add("It seems so easy!");
        Webinar youtubeWebinar = new ConcreteWebinar("Fundamentele POO in 30 de minute",
                "Concepte de baza ale programarii orientate-obiect, explicate de programatori cu experienta",
                comments);

        Webinar facebookWebinar = youtubeWebinar.clone();
        facebookWebinar.setTitle(youtubeWebinar.getTitle() + " - Facebook");
        facebookWebinar.addComment("Thank you for sharing this with us!");

        Webinar tiktokWebinar = youtubeWebinar.clone();
        tiktokWebinar.setTitle(youtubeWebinar.getTitle() + " - TikTok");
        tiktokWebinar.addComment("How can we implement the Prototype Design Pattern? :)");

        youtubeWebinar.webinarDetails();
        facebookWebinar.webinarDetails();
        tiktokWebinar.webinarDetails();
    }
}
