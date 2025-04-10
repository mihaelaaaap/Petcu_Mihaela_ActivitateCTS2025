package Subiect_Broadcasting.Prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWebinar implements Webinar {
    private String title;
    private String description;
    private List<String> comments;

    public ConcreteWebinar(String title, String description, List<String> comments) {
        this.title = title;
        this.description = description;
        this.comments = comments;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<String> getComments() {
        return this.comments;
    }

    @Override
    public void addComment(String comment) {
        this.comments.add(comment);
    }

    @Override
    public Webinar clone() {
        List<String> clonedComments = new ArrayList<String>(this.comments);
        return new ConcreteWebinar(this.title, this.description, clonedComments);
    }

    @Override
    public void webinarDetails() {
        StringBuilder sb = new StringBuilder("TITLE: ");
        sb.append(this.title)
                .append("\nDESCRIPTION: ").append(this.description);
        if(!this.comments.isEmpty()) {
            sb.append("\nCOMMENTS: ");
            for(int i = 0; i < this.comments.size(); i++) {
                sb.append("\n\t" + this.comments.get(i));
            }
        } else {
            sb.append("\nNO COMMENTS FOR THIS WEBINAR");
        }
        System.out.println(sb.toString());
    }
}
