package de.tum.jk.application.model.presenter;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;

import org.mongodb.morphia.annotations.Entity;


@Entity
public class SingleShotQuestion extends QuizQuestion {

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
