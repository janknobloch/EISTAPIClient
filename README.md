# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: basic-auth
        HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
        basic-auth.setUsername("YOUR USERNAME");
        basic-auth.setPassword("YOUR PASSWORD");

        DefaultApi apiInstance = new DefaultApi();
        String replyInputSourceId = "replyInputSourceId_example"; // String | 
        try {
            StudentQuestion result = apiInstance.deleteBestAnswer(replyInputSourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteBestAnswer");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteBestAnswer**](docs/DefaultApi.md#deleteBestAnswer) | **DELETE** /bot/question/bestAnswer/{replyInputSourceId} | delete bestAnswer
*DefaultApi* | [**deleteQuestion**](docs/DefaultApi.md#deleteQuestion) | **DELETE** /bot/question | deletes a given Question
*DefaultApi* | [**deleteQuestionByInputSourceId**](docs/DefaultApi.md#deleteQuestionByInputSourceId) | **DELETE** /bot/question/sourceId/{inputSourceId} | deletes a given Question by using its inputSourceId
*DefaultApi* | [**deleteQuestionByInputSourceIdandInputSource**](docs/DefaultApi.md#deleteQuestionByInputSourceIdandInputSource) | **DELETE** /bot/question/sourceId/{inputSourceId}/source/{inputSource} | deletes a given Question by using its inputSourceId and inputSource
*DefaultApi* | [**deleteReply**](docs/DefaultApi.md#deleteReply) | **DELETE** /bot/reply/{inputSourceId} | deletes a reply by its inputSourceId
*DefaultApi* | [**downvote**](docs/DefaultApi.md#downvote) | **GET** /bot/downvote/{inputSourceId}/userId/{userId} | upvotes a given DataItem using its inputSourceId
*DefaultApi* | [**getActiveSlides**](docs/DefaultApi.md#getActiveSlides) | **GET** /bot/slide/live | Returns an Array of active slides for (ppt, key, and dev)
*DefaultApi* | [**getAdminAnswer**](docs/DefaultApi.md#getAdminAnswer) | **POST** /bot/answer | forwards a new Admin Answer
*DefaultApi* | [**getAllBots**](docs/DefaultApi.md#getAllBots) | **GET** /bot/bot | retrieves all bots 
*DefaultApi* | [**getAllClosedStudentQuestionsForExercises**](docs/DefaultApi.md#getAllClosedStudentQuestionsForExercises) | **GET** /bot/question/exercise/report | retrieves all exercise questions report not including general questions - ordered by slideSet
*DefaultApi* | [**getAllClosedStudentQuestionsForLectures**](docs/DefaultApi.md#getAllClosedStudentQuestionsForLectures) | **GET** /bot/question/lecture/report | retrieves all lecture questions report not including general questions - ordered by slideSet
*DefaultApi* | [**getAllPresenterSessions**](docs/DefaultApi.md#getAllPresenterSessions) | **GET** /bot/presenter | Retrieves all Presenters
*DefaultApi* | [**getAllQuestionWallSessions**](docs/DefaultApi.md#getAllQuestionWallSessions) | **GET** /bot/wall | retrieves all question wall listeners
*DefaultApi* | [**getAllStudentQuestions**](docs/DefaultApi.md#getAllStudentQuestions) | **GET** /bot/question | retrieves all Questions
*DefaultApi* | [**getAllStudentQuestionsByInputSource**](docs/DefaultApi.md#getAllStudentQuestionsByInputSource) | **GET** /bot/question/inputSource/{inputSource} | retrieves all Questions
*DefaultApi* | [**getClosedLastNumStudentQuestions**](docs/DefaultApi.md#getClosedLastNumStudentQuestions) | **GET** /bot/question/closed/last/{num} | retrieves last {num} closed Questions
*DefaultApi* | [**getClosedStudentQuestions**](docs/DefaultApi.md#getClosedStudentQuestions) | **GET** /bot/question/closed | retrieves closed Questions
*DefaultApi* | [**getExercises**](docs/DefaultApi.md#getExercises) | **GET** /bot/exercise | Returns a mapping ordered by timestamp of all exerciseNames
*DefaultApi* | [**getLastNumTeacherQuestions**](docs/DefaultApi.md#getLastNumTeacherQuestions) | **GET** /bot/quiz/last/{num} | retrieves last {num} quizzes
*DefaultApi* | [**getOpenQuestions**](docs/DefaultApi.md#getOpenQuestions) | **GET** /bot/question/open | retrieves open Questions
*DefaultApi* | [**getPresentations**](docs/DefaultApi.md#getPresentations) | **GET** /bot/presentation | Returns a mapping ordered by timestamp of all presentationNames
*DefaultApi* | [**getQuestionByInputSourceId**](docs/DefaultApi.md#getQuestionByInputSourceId) | **GET** /bot/question/sourceId/{inputSourceId} | retrieves question by its InputSourceId
*DefaultApi* | [**getQuestionByInputSourceIdandInputSource**](docs/DefaultApi.md#getQuestionByInputSourceIdandInputSource) | **GET** /bot/question/sourceId/{inputSourceId}/source/{inputSource} | retrieves question by its InputSourceId and inputSource
*DefaultApi* | [**getQuestionByObjectId**](docs/DefaultApi.md#getQuestionByObjectId) | **GET** /bot/question/{id} | retrieves question by its ObjectId
*DefaultApi* | [**getQuestionByReplyInputSourceId**](docs/DefaultApi.md#getQuestionByReplyInputSourceId) | **GET** /bot/question/reply/sourceId/{inputSourceId} | retrieves question by looking for a certain reply.inputSourceId
*DefaultApi* | [**getReplyByInputSourceId**](docs/DefaultApi.md#getReplyByInputSourceId) | **GET** /bot/reply/sourceId/{inputSourceId} | retrieves reply by looking for a certain reply.inputSourceId
*DefaultApi* | [**getReplyForQuestionByContent**](docs/DefaultApi.md#getReplyForQuestionByContent) | **GET** /bot/question/sourceId/{inputSourceId}/reply/content/{content} | retrieves reply by looking for a certain reply.content
*DefaultApi* | [**getReportForExercise**](docs/DefaultApi.md#getReportForExercise) | **GET** /bot/question/report/exercise{num} | retrieves all questions report for specific exercise(slideSet)
*DefaultApi* | [**getReportForGeneral**](docs/DefaultApi.md#getReportForGeneral) | **GET** /bot/question/report/general | retrieves all questions report for specific lecture(slideSet)
*DefaultApi* | [**getReportForLecture**](docs/DefaultApi.md#getReportForLecture) | **GET** /bot/question/report/lecture/{num} | retrieves all questions report for specific lecture(slideSet)
*DefaultApi* | [**getSMSQuestion**](docs/DefaultApi.md#getSMSQuestion) | **POST** /bot/sms | forwards a new SMS question
*DefaultApi* | [**getScoreforInputSource**](docs/DefaultApi.md#getScoreforInputSource) | **GET** /bot/score/inputSource/{inputSource} | generates Highscore for a given InputSource
*DefaultApi* | [**getSlideForExerciseNumberAndSlideNumber**](docs/DefaultApi.md#getSlideForExerciseNumberAndSlideNumber) | **GET** /bot/exercise/number/{exerciseNumber}/slide/number/{slideNumber} | Returns slidePath for ExerciseNumber / SlideNumber
*DefaultApi* | [**getSlideForPresentationNumberAndSlideNumber**](docs/DefaultApi.md#getSlideForPresentationNumberAndSlideNumber) | **GET** /bot/presentation/number/{presentationNumber}/slide/number/{slideNumber} | Returns slidePath for PresentationNumber / SlideNumber
*DefaultApi* | [**getSlidesForExerciseName**](docs/DefaultApi.md#getSlidesForExerciseName) | **GET** /bot/exercise/name/{exerciseName}/slide | Returns all Slides for ExerciseName
*DefaultApi* | [**getSlidesForPresentationName**](docs/DefaultApi.md#getSlidesForPresentationName) | **GET** /bot/presentation/name/{presentationName}/slide | Returns all Slides for PresentationName
*DefaultApi* | [**getWhatsappQuestion**](docs/DefaultApi.md#getWhatsappQuestion) | **POST** /bot/whatsapp | forwards a new Whatsapp question
*DefaultApi* | [**postBestAnswer**](docs/DefaultApi.md#postBestAnswer) | **POST** /bot/question/bestAnswer/{replyInputSourceId} | saves a bestAnswer
*DefaultApi* | [**postFeedback**](docs/DefaultApi.md#postFeedback) | **POST** /bot/feedback | saves a new Feedback, updates it if already existent
*DefaultApi* | [**postQuestion**](docs/DefaultApi.md#postQuestion) | **POST** /bot/question | saves a new Question, updates it if already existent
*DefaultApi* | [**postReply**](docs/DefaultApi.md#postReply) | **POST** /bot/question/{questionInputSourceId}/reply | saves a new Reply, updates it if already existent
*DefaultApi* | [**putQuestion**](docs/DefaultApi.md#putQuestion) | **PUT** /bot/question | saves a new Question, updates it if already existent
*DefaultApi* | [**putQuiz**](docs/DefaultApi.md#putQuiz) | **PUT** /bot/quiz | saves a new Quiz 
*DefaultApi* | [**upvote**](docs/DefaultApi.md#upvote) | **GET** /bot/upvote/{inputSourceId}/userId/{userId} | upvotes a given DataItem using its inputSourceId


## Documentation for Models

 - [Score](docs/Score.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic-auth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



