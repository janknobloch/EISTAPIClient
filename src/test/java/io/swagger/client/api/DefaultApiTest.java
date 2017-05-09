/*
 * The Q&A AMATI API
 * Allows the SlackBot to Interact with the QuestionWall
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
import de.tum.jk.application.model.students.Feedback;
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
     * deletes a given Question by using its inputSourceId
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQuestionByInputSourceIdTest() throws ApiException {
        String inputSourceId = null;
        StudentQuestion response = api.deleteQuestionByInputSourceId(inputSourceId);

        // TODO: test validations
    }
    
    /**
     * deletes a given Question by using its inputSourceId and inputSource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQuestionByInputSourceIdandInputSourceTest() throws ApiException {
        String inputSourceId = null;
        String inputSource = null;
        StudentQuestion response = api.deleteQuestionByInputSourceIdandInputSource(inputSourceId, inputSource);

        // TODO: test validations
    }
    
    /**
     * deletes a given Question
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteQuestionInDBTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.deleteQuestionInDB(body);

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
     * retrieves all question wall listeners
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllQuestionWallSessionsTest() throws ApiException {
        List<String> response = api.getAllQuestionWallSessions();

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
     * Returns a mapping ordered by timestamp of all exerciseNames
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExercisesTest() throws ApiException {
        Map<String, String> response = api.getExercises();

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
    public void getOpenQuestionsTest() throws ApiException {
        List<StudentQuestion> response = api.getOpenQuestions();

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
     * retrieves question by its InputSourceId
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQuestionByInputSourceIdTest() throws ApiException {
        String inputSourceId = null;
        StudentQuestion response = api.getQuestionByInputSourceId(inputSourceId);

        // TODO: test validations
    }
    
    /**
     * retrieves question by its InputSourceId and inputSource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQuestionByInputSourceIdandInputSourceTest() throws ApiException {
        String inputSourceId = null;
        String inputSource = null;
        StudentQuestion response = api.getQuestionByInputSourceIdandInputSource(inputSourceId, inputSource);

        // TODO: test validations
    }
    
    /**
     * retrieves question by its ObjectId
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getQuestionByObjectIdTest() throws ApiException {
        String id = null;
        StudentQuestion response = api.getQuestionByObjectId(id);

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
     * forwards a new SMS question
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
     * Returns slidePath for ExerciseNumber / SlideNumber
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideForExerciseNumberAndSlideNumberTest() throws ApiException {
        Integer exerciseNumber = null;
        Integer slideNumber = null;
        String response = api.getSlideForExerciseNumberAndSlideNumber(exerciseNumber, slideNumber);

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
     * Returns all Slides for ExerciseName
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesForExerciseNameTest() throws ApiException {
        String exerciseName = null;
        Map<String, String> response = api.getSlidesForExerciseName(exerciseName);

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
     * forwards a new Whatsapp question
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWhatsappQuestionTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.getWhatsappQuestion(body);

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
    public void postQuestionInDBTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.postQuestionInDB(body);

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
        String replyInputSourceId = null;
        StudentQuestion response = api.postReplyAndCloseQuestion(replyInputSourceId);

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
    public void updateQuestionInDBTest() throws ApiException {
        StudentQuestion body = null;
        StudentQuestion response = api.updateQuestionInDB(body);

        // TODO: test validations
    }
    
}
