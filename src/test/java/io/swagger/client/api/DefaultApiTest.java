/*
 * The Q&A EIST Twitter API
 * Allows the SlackBot to Interact with the TweetWall
 *
 * OpenAPI spec version: V1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import de.tum.jk.application.model.presenterTool.ActiveSlidePath;
import de.tum.jk.application.model.students.DataItem;
import de.tum.jk.application.model.students.Feedback;
import de.tum.jk.application.model.students.Reply;
import de.tum.jk.application.model.students.StudentQuestion;
import de.tum.jk.application.model.presenter.TeacherQuestion;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * deletes a given Question
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTweetInDBTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.deleteTweetInDB(body);

        // TODO: test validations
    }
    
    /**
     * deletes a given Question by using its ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTweetInDBByIdTest() throws ApiException {
        String body = null;
        StudentQuestion response = api.deleteTweetInDBById(body);

        // TODO: test validations
    }
    
    /**
     * Returns an Array of active slides for (ppt, key, and dev)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveSlidesTest() throws ApiException {
        ActiveSlidePath response = api.getActiveSlides();

        // TODO: test validations
    }
    
    /**
     * retrieves all bots 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllBotsTest() throws ApiException {
        List<String> response = api.getAllBots();

        // TODO: test validations
    }
    
    /**
     * retrieves all questions report not including general questions - ordered by slideSet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllClosedStudentQuestionsTest() throws ApiException {
        api.getAllClosedStudentQuestions();

        // TODO: test validations
    }
    
    /**
     * retrieves all DataItem (mock)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDatamodelsTest() throws ApiException {
        List<DataItem> response = api.getAllDatamodels();

        // TODO: test validations
    }
    
    /**
     * Retrieves all Presenters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPresenterSessionsTest() throws ApiException {
        List<String> response = api.getAllPresenterSessions();

        // TODO: test validations
    }
    
    /**
     * retrieves all Replys (mock)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRepliesTest() throws ApiException {
        List<Reply> response = api.getAllReplies();

        // TODO: test validations
    }
    
    /**
     * retrieves all Questions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStudentQuestionsTest() throws ApiException {
        List<StudentQuestion> response = api.getAllStudentQuestions();

        // TODO: test validations
    }
    
    /**
     * retrieves all twitter wall listeners
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTwitterWallSessionsTest() throws ApiException {
        List<String> response = api.getAllTwitterWallSessions();

        // TODO: test validations
    }
    
    /**
     * retrieves last {num} closed Questions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClosedLastNumStudentQuestionsTest() throws ApiException {
        Integer num = null;
        List<StudentQuestion> response = api.getClosedLastNumStudentQuestions(num);

        // TODO: test validations
    }
    
    /**
     * retrieves closed Questions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClosedStudentQuestionsTest() throws ApiException {
        List<StudentQuestion> response = api.getClosedStudentQuestions();

        // TODO: test validations
    }
    
    /**
     * retrieves highscores
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHighscoresTest() throws ApiException {
        Map<String, Integer> response = api.getHighscores();

        // TODO: test validations
    }
    
    /**
     * retrieves last {num} quizzes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastNumTeacherQuestionsTest() throws ApiException {
        Integer num = null;
        List<TeacherQuestion> response = api.getLastNumTeacherQuestions(num);

        // TODO: test validations
    }
    
    /**
     * retrieves open Questions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOpenTweetsTest() throws ApiException {
        List<StudentQuestion> response = api.getOpenTweets();

        // TODO: test validations
    }
    
    /**
     * Returns a mapping ordered by timestamp of all presentationNames
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPresentationsTest() throws ApiException {
        Map<String, String> response = api.getPresentations();

        // TODO: test validations
    }
    
    /**
     * retrieves all questions report for specific lecture(slideSet)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportTest() throws ApiException {
        Integer num = null;
        api.getReport(num);

        // TODO: test validations
    }
    
    /**
     * retrieves all questions report for specific lecture(slideSet)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReport_0Test() throws ApiException {
        api.getReport_0();

        // TODO: test validations
    }
    
    /**
     * forwards a new Whatzapp question
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSMSQuestionTest() throws ApiException {
        String from = null;
        String body = null;
        String response = api.getSMSQuestion(from, body);

        // TODO: test validations
    }
    
    /**
     * retrieves question by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSingleTweetTest() throws ApiException {
        String id = null;
        StudentQuestion response = api.getSingleTweet(id);

        // TODO: test validations
    }
    
    /**
     * Returns slidePath for PresentationName / SlideNumber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideForPresentationNameAndSlideNumberTest() throws ApiException {
        String presentationName = null;
        Integer slideNumber = null;
        String response = api.getSlideForPresentationNameAndSlideNumber(presentationName, slideNumber);

        // TODO: test validations
    }
    
    /**
     * Returns slidePath for PresentationNumber / SlideName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideForPresentationNumberAndSlideNameTest() throws ApiException {
        Integer presentationNumber = null;
        String slideName = null;
        String response = api.getSlideForPresentationNumberAndSlideName(presentationNumber, slideName);

        // TODO: test validations
    }
    
    /**
     * Returns slidePath for PresentationNumber / SlideNumber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideForPresentationNumberAndSlideNumberTest() throws ApiException {
        Integer presentationNumber = null;
        Integer slideNumber = null;
        String response = api.getSlideForPresentationNumberAndSlideNumber(presentationNumber, slideNumber);

        // TODO: test validations
    }
    
    /**
     * Returns all Slides for PresentationName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesForPresentationNameTest() throws ApiException {
        String presentationName = null;
        Map<String, String> response = api.getSlidesForPresentationName(presentationName);

        // TODO: test validations
    }
    
    /**
     * Returns slidePath for PresentationNumber / SlideName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesForPresentationNameAndSlideNameTest() throws ApiException {
        String presentationName = null;
        String slideName = null;
        String response = api.getSlidesForPresentationNameAndSlideName(presentationName, slideName);

        // TODO: test validations
    }
    
    /**
     * Returns all Slides for PresentationNumber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesForPresentationNumberTest() throws ApiException {
        Integer presentationNumber = null;
        Map<String, String> response = api.getSlidesForPresentationNumber(presentationNumber);

        // TODO: test validations
    }
    
    /**
     * forwards a new Whatsapp question
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWhatzappQUestionTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.getWhatzappQUestion(body);

        // TODO: test validations
    }
    
    /**
     * saves a new Feedback, updates it if already existent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFeedbackToDBTest() throws ApiException {
        Feedback body = null;
        Feedback response = api.postFeedbackToDB(body);

        // TODO: test validations
    }
    
    /**
     * saves a new Question, updates it if already existent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postReplyAndCloseQuestionTest() throws ApiException {
        String id = null;
        StudentQuestion response = api.postReplyAndCloseQuestion(id);

        // TODO: test validations
    }
    
    /**
     * saves a new Question, updates it if already existent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTweetInDBTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.postTweetInDB(body);

        // TODO: test validations
    }
    
    /**
     * saves a new Quiz 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveQuizInDBTest() throws ApiException {
        TeacherQuestion body = null;
        TeacherQuestion response = api.saveQuizInDB(body);

        // TODO: test validations
    }
    
    /**
     * saves a new Question, updates it if already existent
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTweetInDBTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.updateTweetInDB(body);

        // TODO: test validations
    }
    
}
