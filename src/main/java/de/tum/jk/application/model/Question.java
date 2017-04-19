package de.tum.jk.application.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;

import java.util.ArrayList;

@Entity
public class Question extends DataItem {

    @Property
    @Getter
    @Setter
    protected int slideSet;

    @Property
    @Getter
    @Setter
    protected int slide;

    @Property
    @Getter
    @Setter
    protected String slideURL;

    @Embedded
    @Getter
    @Setter
    private ArrayList<Reply> replies;

    @Embedded
    @Getter
    @Setter
    private Reply bestanswer;

    @Property
    @Getter
    @Setter
    private String refURL;

    @Property
    @Getter
    @Setter
    private int refSlideset;

    @Property
    @Getter
    @Setter
    private int refSlide;

    public Question(String id, String text, String author, DateTime date) {
        super(id, text, author, date);
        this.replies = new ArrayList<Reply>();
        this.author = author;
    }

    public Question() {
    }

    public void addReply(Reply reply) {
        replies.add(reply);
    }

    public String summarize() {
        String summary = "Question ID: " + this.id + "\n" +
                "Question: " + this.content + "\n" +
                "Context: SlideSet:" + slideSet + "Slide:" + slide +
                "\nContext URL: " + slideURL +
                "\nVotes: " + upvotes;
        if (this.bestanswer != null) {
            summary = summary + "\nBest Answer: " + bestanswer.getContent();
        }
        if (this.refURL != null) {
            summary = summary + "\nReference URL: " + refURL +
                    "\nReference SlideSet: " + refSlideset +
                    "\nReference Slide: " + refSlide;
        }
        return summary;
    }

    public void finalAnswer(String message_ts) {
        for (Reply r : replies) {
            if (r.getId().equals(message_ts)) {
                bestanswer = r;
            }
        }
    }
}
