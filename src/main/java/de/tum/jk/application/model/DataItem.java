package de.tum.jk.application.model;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;

@Entity
public abstract class DataItem {

	@Id
    @Getter
    protected String id;

	@Property
    @Getter
    protected String content;

	@Property
    @Getter
    protected String author;

	@Property
    @Getter
    protected String date;

	@Property
    @Getter
    protected int upvotes;

	@Property
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
