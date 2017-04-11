package de.tum.jk.application.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;

import java.util.ArrayList;
import java.util.Date;

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

    public Question(String id, String text, String author, DateTime date) {
        super(id,text,author,date);
        this.replies = new ArrayList<Reply>();
        this.author = author;
    }

    public Question(){}

    public void addReply(Reply reply) {
        replies.add(reply);
    }

    public String summarize() {
        return ("Question ID: " + this.id + "\n") +
                "Question: " + this.content + "\n" +
                "Best Answer: " + bestanswer.getContent() + " \n" +
                "Context: SlideSet:" + slideSet + "Slide:" + slide +
                "\nContext URL: " + slideURL +
                "\nVotes: " + upvotes;
    }

    public void finalAnswer(String message_ts) {
        for(Reply r : replies){
            if(r.getId().equals(message_ts)){
                bestanswer = r;
            }
        }
    }
}
