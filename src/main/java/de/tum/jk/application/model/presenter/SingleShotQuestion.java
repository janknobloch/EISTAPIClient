package de.tum.jk.application.model.presenter;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;

import org.mongodb.morphia.annotations.Entity;


@Entity
public class SingleShotQuestion extends TeacherQuestion {

    public SingleShotQuestion(){
        super();
        name = "Single-Shot Question";
    }

    @Override
    public void updateVoteByUser(String user, String vote){
        //only add valid answers
        if(answerKeyText.containsKey(vote) && !votes.containsKey(user)){
            votes.put(user, vote);
        }
    }


}
