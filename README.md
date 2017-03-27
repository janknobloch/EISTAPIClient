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
        
        DefaultApi apiInstance = new DefaultApi();
        Question body = new Question(); // Question | 
        try {
            Question result = apiInstance.deleteTweetInDB(body);
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
*DefaultApi* | [**getAllDatamodels**](docs/DefaultApi.md#getAllDatamodels) | **GET** /bot/dataitem | retrieves all DataItem (mock)
*DefaultApi* | [**getAllPresenterSessions**](docs/DefaultApi.md#getAllPresenterSessions) | **GET** /bot/presenter | Retrieves all Presenters
*DefaultApi* | [**getAllReplies**](docs/DefaultApi.md#getAllReplies) | **GET** /bot/question/replies | retrieves all Replys (mock)
*DefaultApi* | [**getAllTweets**](docs/DefaultApi.md#getAllTweets) | **GET** /bot/question | retrieves all Questions
*DefaultApi* | [**getAllTwitterWallSessions**](docs/DefaultApi.md#getAllTwitterWallSessions) | **GET** /bot/twitterwalls | retrieves all twitter wall listeners
*DefaultApi* | [**getPresentations**](docs/DefaultApi.md#getPresentations) | **GET** /bot/presentation | Returns a mapping ordered by timestamp of all presentationNames
*DefaultApi* | [**getSingleTweet**](docs/DefaultApi.md#getSingleTweet) | **GET** /bot/question/{id} | retrieves question by Id
*DefaultApi* | [**getSlideForPresentationNameAndSlideNumber**](docs/DefaultApi.md#getSlideForPresentationNameAndSlideNumber) | **GET** /bot/presentation/name/{presentationName}/slide/number/{slideNumber} | Returns slidePath for PresentationName / SlideNumber
*DefaultApi* | [**getSlideForPresentationNumberAndSlideName**](docs/DefaultApi.md#getSlideForPresentationNumberAndSlideName) | **GET** /bot/presentation/number/{presentationNumber}/slide/name/{slideName} | Returns slidePath for PresentationNumber / SlideName
*DefaultApi* | [**getSlideForPresentationNumberAndSlideNumber**](docs/DefaultApi.md#getSlideForPresentationNumberAndSlideNumber) | **GET** /bot/presentation/number/{presentationNumber}/slide/number/{slideNumber} | Returns slidePath for PresentationNumber / SlideNumber
*DefaultApi* | [**getSlidesForPresentationName**](docs/DefaultApi.md#getSlidesForPresentationName) | **GET** /bot/presentation/name/{presentationName}/slide | Returns all Slides for PresentationName
*DefaultApi* | [**getSlidesForPresentationNameAndSlideName**](docs/DefaultApi.md#getSlidesForPresentationNameAndSlideName) | **GET** /bot/presentation/name/{presentationName}/slide/name/{slideName} | Returns slidePath for PresentationNumber / SlideName
*DefaultApi* | [**getSlidesForPresentationNumber**](docs/DefaultApi.md#getSlidesForPresentationNumber) | **GET** /bot/presentation/number/{presentationNumber}/slide | Returns all Slides for PresentationNumber
*DefaultApi* | [**postFeedbackToDB**](docs/DefaultApi.md#postFeedbackToDB) | **POST** /bot/feedback | saves a new Feedback, updates it if already existent
*DefaultApi* | [**postTweetInDB**](docs/DefaultApi.md#postTweetInDB) | **POST** /bot/question | saves a new Question, updates it if already existent
*DefaultApi* | [**updateTweetInDB**](docs/DefaultApi.md#updateTweetInDB) | **PUT** /bot/question | saves a new Question, updates it if already existent


## Documentation for Models



## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



