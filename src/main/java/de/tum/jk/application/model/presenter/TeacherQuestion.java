package de.tum.jk.application.model.presenter;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.util.TreeMap;

@Entity
public class TeacherQuestion {

	@Id
	@Getter
	@Setter
	protected String id;

	@Property
	@Getter
	@Setter
	protected String content;

	@Property
	@Getter
	@Setter
	protected String date;

	@Property
	@Getter
	protected String name;

	protected static String[] keys = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

	@Property
	@Getter
	@Setter
	protected TreeMap<String, String> answerKeyText;

	@Property
	@Setter
	@Getter
	protected Map<String, String> votes;

	@Getter
	@Setter
	private String correctAnswerKey;

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

	ArrayList<VoteItem> highchartsVotes;

	public TeacherQuestion() {
		answerKeyText = new TreeMap<String, String>();
		votes = new HashMap<>();
	}

	
	public void lastAnswerasCorrect(){
       this.correctAnswerKey = answerKeyText.lastKey();
	}
	
	
	public void addAnswer(String text) throws QuizFullException {
		if (answerKeyText.size() < keys.length) {
			int index = answerKeyText.size();
			answerKeyText.put(keys[index], text);
		} else {
			throw new QuizFullException();
		}
	}

	public ArrayList<VoteItem> getHighchartsVotes() {

		ArrayList<VoteItem> result = new ArrayList<>();
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		for (Entry<String, String> x : answerKeyText.entrySet()) {
			map.put(x.getValue(), 0);
		}

		this.votes.forEach((String userName, String voteKey) -> {
			map.put(answerKeyText.get(voteKey), map.get(answerKeyText.get(voteKey)) + 1);
		});

		for (Entry<String, Integer> x : map.entrySet()) {
			result.add(new VoteItem(x.getKey(), x.getValue(), x.getKey().equals(answerKeyText.get(correctAnswerKey))));
		}
		return result;
	}

	private TreeMap<String, Integer> sumVotes() {

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();

		for (Entry<String, String> x : answerKeyText.entrySet()) {
			map.put(x.getKey(), 0);
		}

		this.votes.forEach((String userName, String voteKey) -> {
			map.put(voteKey, map.get(voteKey) + 1);
		});
		return map;
	}

	public String showQuiz() {
		String result = ">*" + this.content + "*";
		for (Entry<String, String> x : answerKeyText.entrySet()) {
			result += "\n" + "*" + x.getKey() + "* `" + answerKeyText.get(x.getKey()) + "`";
		}
		return result;
	}

	public void updateVoteByUser(String user, String vote) {

	}

	public String showResults() {
		TreeMap<String, Integer> votes = sumVotes();
		String result = "Final Result:";
		int totalVotes = 0;
		// count total votes
		for (Entry<String, Integer> vote : votes.entrySet()) {
			totalVotes += vote.getValue();
		}
		// generate String
		for (Entry<String, Integer> vote : votes.entrySet()) {
			int percentage = (int) ((double) vote.getValue() / totalVotes * 100);
			result = result + "\n" + "*" + vote.getKey() + "*" + ": ";
			for (int j = 0; j <= percentage; j = j + 5) {
				result = result + "█";
			}
			result = result + vote.getValue() + "   (" + percentage + "%)";
			if (vote.getKey().equals(correctAnswerKey)) {
				result = result + " (C)";
			}
		}
		result += "\n\nTotal Votes: " + totalVotes;
		return result;
	}

}
