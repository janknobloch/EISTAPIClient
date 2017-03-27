package de.tum.jk.application.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;

public class Question extends DataItem {

    @Getter
    @Setter
    protected int slideSet;

    @Getter
    @Setter
    protected int slide;

    @Getter
    @Setter
    protected String slideURL;

    @Getter
    @Setter
    private ArrayList<Reply> replies;
    
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
