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
import de.tum.jk.application.model.ActiveSlidePath;
import de.tum.jk.application.model.DataItem;
import de.tum.jk.application.model.Feedback;
import io.swagger.client.model.Principal;
import de.tum.jk.application.model.Question;
import de.tum.jk.application.model.Reply;
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
        Principal body = null;
        Question body2 = null;
        Question response = api.deleteTweetInDB(body, body2);

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
        Principal body = null;
        String body2 = null;
        Question response = api.deleteTweetInDBById(body, body2);

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
        Principal body = null;
        ActiveSlidePath response = api.getActiveSlides(body);

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
        Principal body = null;
        List<DataItem> response = api.getAllDatamodels(body);

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
        Principal body = null;
        List<String> response = api.getAllPresenterSessions(body);

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
        Principal body = null;
        List<Reply> response = api.getAllReplies(body);

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
    public void getAllTweetsTest() throws ApiException {
        Principal body = null;
        List<Question> response = api.getAllTweets(body);

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
        Principal body = null;
        List<String> response = api.getAllTwitterWallSessions(body);

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
        Principal body = null;
        Map<String, String> response = api.getPresentations(body);

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
        Principal body = null;
        Question response = api.getSingleTweet(id, body);

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
        Principal body = null;
        String response = api.getSlideForPresentationNameAndSlideNumber(presentationName, slideNumber, body);

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
        Principal body = null;
        String response = api.getSlideForPresentationNumberAndSlideName(presentationNumber, slideName, body);

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
        Principal body = null;
        String response = api.getSlideForPresentationNumberAndSlideNumber(presentationNumber, slideNumber, body);

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
        Principal body = null;
        Map<String, String> response = api.getSlidesForPresentationName(presentationName, body);

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
        Principal body = null;
        String response = api.getSlidesForPresentationNameAndSlideName(presentationName, slideName, body);

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
        Principal body = null;
        Map<String, String> response = api.getSlidesForPresentationNumber(presentationNumber, body);

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
        Principal body = null;
        Feedback body2 = null;
        Feedback response = api.postFeedbackToDB(body, body2);

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
        Principal body = null;
        Question response = api.postReplyAndCloseQuestion(id, body);

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
        Principal body = null;
        Question body2 = null;
        Question response = api.postTweetInDB(body, body2);

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
        Principal body = null;
        Question body2 = null;
        Question response = api.updateTweetInDB(body, body2);

        // TODO: test validations
    }
    
}
