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
        StudentQuestion body = new StudentQuestion(); // StudentQuestion | 
        try {
            StudentQuestion result = apiInstance.deleteTweetInDB(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteTweetInDB");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deleteTweetInDB**](docs/DefaultApi.md#deleteTweetInDB) | **DELETE** /bot/question | deletes a given Question
*DefaultApi* | [**deleteTweetInDBById**](docs/DefaultApi.md#deleteTweetInDBById) | **DELETE** /bot/question/{id} | deletes a given Question by using its ID
*DefaultApi* | [**getActiveSlides**](docs/DefaultApi.md#getActiveSlides) | **GET** /bot/slide/live | Returns an Array of active slides for (ppt, key, and dev)
*DefaultApi* | [**getAllBots**](docs/DefaultApi.md#getAllBots) | **GET** /bot/bot | retrieves all bots 
*DefaultApi* | [**getAllClosedStudentQuestions**](docs/DefaultApi.md#getAllClosedStudentQuestions) | **GET** /bot/question/report | retrieves all questions report not including general questions - ordered by slideSet
*DefaultApi* | [**getAllPresenterSessions**](docs/DefaultApi.md#getAllPresenterSessions) | **GET** /bot/presenter | Retrieves all Presenters
*DefaultApi* | [**getAllStudentQuestions**](docs/DefaultApi.md#getAllStudentQuestions) | **GET** /bot/question | retrieves all Questions
*DefaultApi* | [**getAllTwitterWallSessions**](docs/DefaultApi.md#getAllTwitterWallSessions) | **GET** /bot/wall | retrieves all wall listeners
*DefaultApi* | [**getClosedLastNumStudentQuestions**](docs/DefaultApi.md#getClosedLastNumStudentQuestions) | **GET** /bot/question/closed/last/{num} | retrieves last {num} closed Questions
*DefaultApi* | [**getClosedStudentQuestions**](docs/DefaultApi.md#getClosedStudentQuestions) | **GET** /bot/question/closed | retrieves closed Questions
*DefaultApi* | [**getExercises**](docs/DefaultApi.md#getExercises) | **GET** /bot/exercise | Returns a mapping ordered by timestamp of all exerciseNames
*DefaultApi* | [**getHighscores**](docs/DefaultApi.md#getHighscores) | **GET** /bot/highscores | retrieves highscores
*DefaultApi* | [**getLastNumTeacherQuestions**](docs/DefaultApi.md#getLastNumTeacherQuestions) | **GET** /bot/quiz/last/{num} | retrieves last {num} quizzes
*DefaultApi* | [**getOpenTweets**](docs/DefaultApi.md#getOpenTweets) | **GET** /bot/question/open | retrieves open Questions
*DefaultApi* | [**getPresentations**](docs/DefaultApi.md#getPresentations) | **GET** /bot/presentation | Returns a mapping ordered by timestamp of all presentationNames
*DefaultApi* | [**getReport**](docs/DefaultApi.md#getReport) | **GET** /bot/question/report/{num} | retrieves all questions report for specific lecture(slideSet)
*DefaultApi* | [**getReport_0**](docs/DefaultApi.md#getReport_0) | **GET** /bot/question/report/general | retrieves all questions report for specific lecture(slideSet)
*DefaultApi* | [**getSMSQuestion**](docs/DefaultApi.md#getSMSQuestion) | **POST** /bot/sms | forwards a new SMS question
*DefaultApi* | [**getSingleTweet**](docs/DefaultApi.md#getSingleTweet) | **GET** /bot/question/{id} | retrieves question by Id
*DefaultApi* | [**getSlideForExerciseNumberAndSlideNumber**](docs/DefaultApi.md#getSlideForExerciseNumberAndSlideNumber) | **GET** /bot/presentation/number/{exerciseNumber}/slide/number/{slideNumber} | Returns slidePath for PresentationNumber / SlideNumber
*DefaultApi* | [**getSlideForPresentationNumberAndSlideNumber**](docs/DefaultApi.md#getSlideForPresentationNumberAndSlideNumber) | **GET** /bot/exercise/number/{exerciseNumber}/slide/number/{exerciseNumber} | Returns slidePath for PresentationNumber / SlideNumber
*DefaultApi* | [**getSlidesForExerciseName**](docs/DefaultApi.md#getSlidesForExerciseName) | **GET** /bot/exercise/name/{exerciseName}/slide | Returns all Slides for ExerciseName
*DefaultApi* | [**getSlidesForPresentationName**](docs/DefaultApi.md#getSlidesForPresentationName) | **GET** /bot/presentation/name/{presentationName}/slide | Returns all Slides for PresentationName
*DefaultApi* | [**getWhatzappQUestion**](docs/DefaultApi.md#getWhatzappQUestion) | **POST** /bot/whatsapp | forwards a new Whatsapp question
*DefaultApi* | [**postFeedbackToDB**](docs/DefaultApi.md#postFeedbackToDB) | **POST** /bot/feedback | saves a new Feedback, updates it if already existent
*DefaultApi* | [**postReplyAndCloseQuestion**](docs/DefaultApi.md#postReplyAndCloseQuestion) | **POST** /bot/question/close/{id} | saves a new Question, updates it if already existent
*DefaultApi* | [**postTweetInDB**](docs/DefaultApi.md#postTweetInDB) | **POST** /bot/question | saves a new Question, updates it if already existent
*DefaultApi* | [**saveQuizInDB**](docs/DefaultApi.md#saveQuizInDB) | **PUT** /bot/quiz | saves a new Quiz 
*DefaultApi* | [**updateTweetInDB**](docs/DefaultApi.md#updateTweetInDB) | **PUT** /bot/question | saves a new Question, updates it if already existent


## Documentation for Models



## Documentation for Authorization

Authentication schemes defined for the API:
### basic-auth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



