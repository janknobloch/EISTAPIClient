package de.tum.jk.application.model.students;

import de.tum.jk.application.model.students.StudentQuestion;
import org.joda.time.DateTime;

import java.util.*;
import java.util.stream.Collectors;

public class Score {

	private final List<StudentQuestion> questions;
	private ArrayList<String> tutors;
	private ArrayList<String> admins;
	private Map<String, String> userIDMapping; // map userID to display name

	private Map<String, Integer> bestAnswersCount;
	private Map<String, Integer> questionsCount;
	private Map<String, Integer> upvotesCount;
	private ArrayList<Long> answerTime;

	public Score(List<StudentQuestion> questions) {
		this.questions = questions;

		this.bestAnswersCount = new HashMap<>();
		this.questionsCount = new HashMap<>();
		this.upvotesCount = new HashMap<>();
		this.answerTime = new ArrayList<>();
		count();
		this.bestAnswersCount = sortedDescending(bestAnswersCount);
		this.questionsCount = sortedDescending(questionsCount);
		this.upvotesCount = sortedDescending(upvotesCount);

	}

	private void count() {
		int index = 0;

		this.questions.forEach((StudentQuestion question) -> {

			String bestAnswerAuthor = question.getBestanswer().getAuthor();
			if (bestAnswersCount.containsKey(bestAnswerAuthor)) {
				bestAnswersCount.put(bestAnswerAuthor, bestAnswersCount.get(bestAnswerAuthor) + 1);
			} else {
				bestAnswersCount.put(bestAnswerAuthor, 1);
			}

			String questionAuthor = question.getAuthor();
			if (questionsCount.containsKey(questionAuthor)) {
				questionsCount.put(questionAuthor, questionsCount.get(questionAuthor) + 1);
			} else {
				questionsCount.put(questionAuthor, 1);
			}

			if (upvotesCount.containsKey(questionAuthor)) {
				upvotesCount.put(questionAuthor, upvotesCount.get(questionAuthor) + question.getUpvotes());
			} else {
				upvotesCount.put(questionAuthor, question.getUpvotes());
			}
			DateTime dt = new DateTime(question.getDate());
			long qDate = dt.getMillis();
			dt = new DateTime(question.getBestanswer().getDate());
			long aDate = dt.getMillis();
			answerTime.add(aDate - qDate);
		});
	}

	private LinkedHashMap<String, Integer> sortedDescending(Map<String, Integer> toBeSorted) {
		LinkedHashMap<String, Integer> sorted = toBeSorted.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		return sorted;
	}

}
