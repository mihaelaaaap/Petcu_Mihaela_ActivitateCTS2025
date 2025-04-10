package Subiect_Broadcasting.Prototype.clase;

import java.util.List;

public interface Webinar {
    String getTitle();
    void setTitle(String title);
    String getDescription();
    void setDescription(String description);
    List<String> getComments();
    void addComment(String comment);
    Webinar clone();
    void webinarDetails();
}
