package de.tum.jk.application.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.util.Date;

public abstract class DataItem {

    @Getter
    protected String id;

    @Getter
    protected String content;

    @Getter
    protected String author;

    @Getter
    protected String date;

    @Getter
    protected int upvotes;

    @Getter
    @Setter
    private static boolean dev;

    public DataItem(){}

    public DataItem(String id, String content, String author, DateTime date){
        generateID(id);
        this.content = content;
        this.author = author;
        this.date = date.toString();
    }

    public void voteUp() {
        this.upvotes++;
    }

    public void voteDown() {
        this.upvotes--;
    }

    private void generateID(String timestamp){
        this.id = "slack_" + timestamp;
        if(dev){
            this.id = "dev_" + this.id;
        }
    }
}
