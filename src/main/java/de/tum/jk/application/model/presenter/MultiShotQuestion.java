package de.tum.jk.application.model.presenter;


import de.tum.jk.application.model.students.DataItem;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.mongodb.morphia.annotations.Entity;

import java.util.*;


@Entity
public class MultiShotQuestion extends QuizQuestion {

    public MultiShotQuestion(){
        super();
        name = "Multi-Shot Question";
    }

    @Override
    public void updateVoteByUser(String user, String vote){
        //only add valid answers
        if(answerKeyText.containsKey(vote)){
            votes.put(user, vote);
        }
    }

    public void generateRandomVotes(){
        for(int i = 0;i<1000;i++){
            //generate random name
            String name = (int) (Math.random()*1000) + "";

            //generate vote
            String vote = keys[(int) (Math.random() * 10)];

            updateVoteByUser(name, vote);
        }

    }

}
