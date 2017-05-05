# DefaultApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTweetInDB**](DefaultApi.md#deleteTweetInDB) | **DELETE** /bot/question | deletes a given Question
[**deleteTweetInDBById**](DefaultApi.md#deleteTweetInDBById) | **DELETE** /bot/question/{id} | deletes a given Question by using its ID
[**getActiveSlides**](DefaultApi.md#getActiveSlides) | **GET** /bot/slide/live | Returns an Array of active slides for (ppt, key, and dev)
[**getAllBots**](DefaultApi.md#getAllBots) | **GET** /bot/bot | retrieves all bots 
[**getAllClosedStudentQuestions**](DefaultApi.md#getAllClosedStudentQuestions) | **GET** /bot/question/report | retrieves all questions report not including general questions - ordered by slideSet
[**getAllPresenterSessions**](DefaultApi.md#getAllPresenterSessions) | **GET** /bot/presenter | Retrieves all Presenters
[**getAllStudentQuestions**](DefaultApi.md#getAllStudentQuestions) | **GET** /bot/question | retrieves all Questions
[**getAllTwitterWallSessions**](DefaultApi.md#getAllTwitterWallSessions) | **GET** /bot/wall | retrieves all wall listeners
[**getClosedLastNumStudentQuestions**](DefaultApi.md#getClosedLastNumStudentQuestions) | **GET** /bot/question/closed/last/{num} | retrieves last {num} closed Questions
[**getClosedStudentQuestions**](DefaultApi.md#getClosedStudentQuestions) | **GET** /bot/question/closed | retrieves closed Questions
[**getExercises**](DefaultApi.md#getExercises) | **GET** /bot/exercise | Returns a mapping ordered by timestamp of all exerciseNames
[**getHighscores**](DefaultApi.md#getHighscores) | **GET** /bot/highscores | retrieves highscores
[**getLastNumTeacherQuestions**](DefaultApi.md#getLastNumTeacherQuestions) | **GET** /bot/quiz/last/{num} | retrieves last {num} quizzes
[**getOpenTweets**](DefaultApi.md#getOpenTweets) | **GET** /bot/question/open | retrieves open Questions
[**getPresentations**](DefaultApi.md#getPresentations) | **GET** /bot/presentation | Returns a mapping ordered by timestamp of all presentationNames
[**getReport**](DefaultApi.md#getReport) | **GET** /bot/question/report/{num} | retrieves all questions report for specific lecture(slideSet)
[**getReport_0**](DefaultApi.md#getReport_0) | **GET** /bot/question/report/general | retrieves all questions report for specific lecture(slideSet)
[**getSMSQuestion**](DefaultApi.md#getSMSQuestion) | **POST** /bot/sms | forwards a new SMS question
[**getSingleTweet**](DefaultApi.md#getSingleTweet) | **GET** /bot/question/{id} | retrieves question by Id
[**getSlideForExerciseNumberAndSlideNumber**](DefaultApi.md#getSlideForExerciseNumberAndSlideNumber) | **GET** /bot/exercise/number/{exerciseNumber}/slide/number/{slideNumber} | Returns slidePath for ExerciseNumber / SlideNumber
[**getSlideForPresentationNumberAndSlideNumber**](DefaultApi.md#getSlideForPresentationNumberAndSlideNumber) | **GET** /bot/presentation/number/{presentationNumber}/slide/number/{slideNumber} | Returns slidePath for PresentationNumber / SlideNumber
[**getSlidesForExerciseName**](DefaultApi.md#getSlidesForExerciseName) | **GET** /bot/exercise/name/{exerciseName}/slide | Returns all Slides for ExerciseName
[**getSlidesForPresentationName**](DefaultApi.md#getSlidesForPresentationName) | **GET** /bot/presentation/name/{presentationName}/slide | Returns all Slides for PresentationName
[**getWhatzappQUestion**](DefaultApi.md#getWhatzappQUestion) | **POST** /bot/whatsapp | forwards a new Whatsapp question
[**postFeedbackToDB**](DefaultApi.md#postFeedbackToDB) | **POST** /bot/feedback | saves a new Feedback, updates it if already existent
[**postReplyAndCloseQuestion**](DefaultApi.md#postReplyAndCloseQuestion) | **POST** /bot/question/close/{id} | saves a new Question, updates it if already existent
[**postTweetInDB**](DefaultApi.md#postTweetInDB) | **POST** /bot/question | saves a new Question, updates it if already existent
[**saveQuizInDB**](DefaultApi.md#saveQuizInDB) | **PUT** /bot/quiz | saves a new Quiz 
[**updateTweetInDB**](DefaultApi.md#updateTweetInDB) | **PUT** /bot/question | saves a new Question, updates it if already existent


<a name="deleteTweetInDB"></a>
# **deleteTweetInDB**
> StudentQuestion deleteTweetInDB(body)

deletes a given Question



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StudentQuestion**](StudentQuestion.md)|  | [optional]

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTweetInDBById"></a>
# **deleteTweetInDBById**
> StudentQuestion deleteTweetInDBById(body)

deletes a given Question by using its ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String body = "body_example"; // String | 
try {
    StudentQuestion result = apiInstance.deleteTweetInDBById(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteTweetInDBById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActiveSlides"></a>
# **getActiveSlides**
> ActiveSlidePath getActiveSlides()

Returns an Array of active slides for (ppt, key, and dev)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    ActiveSlidePath result = apiInstance.getActiveSlides();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getActiveSlides");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActiveSlidePath**](ActiveSlidePath.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllBots"></a>
# **getAllBots**
> List&lt;String&gt; getAllBots()

retrieves all bots 



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    List<String> result = apiInstance.getAllBots();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllBots");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllClosedStudentQuestions"></a>
# **getAllClosedStudentQuestions**
> getAllClosedStudentQuestions()

retrieves all questions report not including general questions - ordered by slideSet



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.getAllClosedStudentQuestions();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllClosedStudentQuestions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getAllPresenterSessions"></a>
# **getAllPresenterSessions**
> List&lt;String&gt; getAllPresenterSessions()

Retrieves all Presenters



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    List<String> result = apiInstance.getAllPresenterSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllPresenterSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllStudentQuestions"></a>
# **getAllStudentQuestions**
> List&lt;StudentQuestion&gt; getAllStudentQuestions()

retrieves all Questions



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    List<StudentQuestion> result = apiInstance.getAllStudentQuestions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllStudentQuestions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StudentQuestion&gt;**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTwitterWallSessions"></a>
# **getAllTwitterWallSessions**
> List&lt;String&gt; getAllTwitterWallSessions()

retrieves all wall listeners



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    List<String> result = apiInstance.getAllTwitterWallSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllTwitterWallSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClosedLastNumStudentQuestions"></a>
# **getClosedLastNumStudentQuestions**
> List&lt;StudentQuestion&gt; getClosedLastNumStudentQuestions(num)

retrieves last {num} closed Questions



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer num = 56; // Integer | 
try {
    List<StudentQuestion> result = apiInstance.getClosedLastNumStudentQuestions(num);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getClosedLastNumStudentQuestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **num** | **Integer**|  |

### Return type

[**List&lt;StudentQuestion&gt;**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClosedStudentQuestions"></a>
# **getClosedStudentQuestions**
> List&lt;StudentQuestion&gt; getClosedStudentQuestions()

retrieves closed Questions



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    List<StudentQuestion> result = apiInstance.getClosedStudentQuestions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getClosedStudentQuestions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StudentQuestion&gt;**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getExercises"></a>
# **getExercises**
> Map&lt;String, String&gt; getExercises()

Returns a mapping ordered by timestamp of all exerciseNames



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, String> result = apiInstance.getExercises();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getExercises");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getHighscores"></a>
# **getHighscores**
> Map&lt;String, Integer&gt; getHighscores()

retrieves highscores



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, Integer> result = apiInstance.getHighscores();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHighscores");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, Integer&gt;**](Map.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLastNumTeacherQuestions"></a>
# **getLastNumTeacherQuestions**
> List&lt;TeacherQuestion&gt; getLastNumTeacherQuestions(num)

retrieves last {num} quizzes



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer num = 56; // Integer | 
try {
    List<TeacherQuestion> result = apiInstance.getLastNumTeacherQuestions(num);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLastNumTeacherQuestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **num** | **Integer**|  |

### Return type

[**List&lt;TeacherQuestion&gt;**](TeacherQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpenTweets"></a>
# **getOpenTweets**
> List&lt;StudentQuestion&gt; getOpenTweets()

retrieves open Questions



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    List<StudentQuestion> result = apiInstance.getOpenTweets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getOpenTweets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;StudentQuestion&gt;**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPresentations"></a>
# **getPresentations**
> Map&lt;String, String&gt; getPresentations()

Returns a mapping ordered by timestamp of all presentationNames



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    Map<String, String> result = apiInstance.getPresentations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPresentations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReport"></a>
# **getReport**
> getReport(num)

retrieves all questions report for specific lecture(slideSet)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer num = 56; // Integer | 
try {
    apiInstance.getReport(num);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **num** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getReport_0"></a>
# **getReport_0**
> getReport_0()

retrieves all questions report for specific lecture(slideSet)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.getReport_0();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReport_0");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getSMSQuestion"></a>
# **getSMSQuestion**
> String getSMSQuestion(from, body)

forwards a new SMS question



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String from = "from_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.getSMSQuestion(from, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSMSQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/xml

<a name="getSingleTweet"></a>
# **getSingleTweet**
> StudentQuestion getSingleTweet(id)

retrieves question by Id



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    StudentQuestion result = apiInstance.getSingleTweet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSingleTweet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlideForExerciseNumberAndSlideNumber"></a>
# **getSlideForExerciseNumberAndSlideNumber**
> String getSlideForExerciseNumberAndSlideNumber(exerciseNumber, slideNumber)

Returns slidePath for ExerciseNumber / SlideNumber



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer exerciseNumber = 56; // Integer | 
Integer slideNumber = 56; // Integer | 
try {
    String result = apiInstance.getSlideForExerciseNumberAndSlideNumber(exerciseNumber, slideNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlideForExerciseNumberAndSlideNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exerciseNumber** | **Integer**|  |
 **slideNumber** | **Integer**|  |

### Return type

**String**

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlideForPresentationNumberAndSlideNumber"></a>
# **getSlideForPresentationNumberAndSlideNumber**
> String getSlideForPresentationNumberAndSlideNumber(presentationNumber, slideNumber)

Returns slidePath for PresentationNumber / SlideNumber



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Integer presentationNumber = 56; // Integer | 
Integer slideNumber = 56; // Integer | 
try {
    String result = apiInstance.getSlideForPresentationNumberAndSlideNumber(presentationNumber, slideNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlideForPresentationNumberAndSlideNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **presentationNumber** | **Integer**|  |
 **slideNumber** | **Integer**|  |

### Return type

**String**

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlidesForExerciseName"></a>
# **getSlidesForExerciseName**
> Map&lt;String, String&gt; getSlidesForExerciseName(exerciseName)

Returns all Slides for ExerciseName



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String exerciseName = "exerciseName_example"; // String | 
try {
    Map<String, String> result = apiInstance.getSlidesForExerciseName(exerciseName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlidesForExerciseName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exerciseName** | **String**|  |

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlidesForPresentationName"></a>
# **getSlidesForPresentationName**
> Map&lt;String, String&gt; getSlidesForPresentationName(presentationName)

Returns all Slides for PresentationName



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String presentationName = "presentationName_example"; // String | 
try {
    Map<String, String> result = apiInstance.getSlidesForPresentationName(presentationName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlidesForPresentationName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **presentationName** | **String**|  |

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWhatzappQUestion"></a>
# **getWhatzappQUestion**
> StudentQuestion getWhatzappQUestion(body)

forwards a new Whatsapp question



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
StudentQuestion body = new StudentQuestion(); // StudentQuestion | 
try {
    StudentQuestion result = apiInstance.getWhatzappQUestion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getWhatzappQUestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StudentQuestion**](StudentQuestion.md)|  | [optional]

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postFeedbackToDB"></a>
# **postFeedbackToDB**
> Feedback postFeedbackToDB(body)

saves a new Feedback, updates it if already existent



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
Feedback body = new Feedback(); // Feedback | 
try {
    Feedback result = apiInstance.postFeedbackToDB(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postFeedbackToDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Feedback**](Feedback.md)|  | [optional]

### Return type

[**Feedback**](Feedback.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postReplyAndCloseQuestion"></a>
# **postReplyAndCloseQuestion**
> StudentQuestion postReplyAndCloseQuestion(id)

saves a new Question, updates it if already existent



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    StudentQuestion result = apiInstance.postReplyAndCloseQuestion(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postReplyAndCloseQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTweetInDB"></a>
# **postTweetInDB**
> StudentQuestion postTweetInDB(body)

saves a new Question, updates it if already existent



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
StudentQuestion body = new StudentQuestion(); // StudentQuestion | 
try {
    StudentQuestion result = apiInstance.postTweetInDB(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postTweetInDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StudentQuestion**](StudentQuestion.md)|  | [optional]

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveQuizInDB"></a>
# **saveQuizInDB**
> TeacherQuestion saveQuizInDB(body)

saves a new Quiz 



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
TeacherQuestion body = new TeacherQuestion(); // TeacherQuestion | 
try {
    TeacherQuestion result = apiInstance.saveQuizInDB(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#saveQuizInDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TeacherQuestion**](TeacherQuestion.md)|  | [optional]

### Return type

[**TeacherQuestion**](TeacherQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTweetInDB"></a>
# **updateTweetInDB**
> StudentQuestion updateTweetInDB(body)

saves a new Question, updates it if already existent



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic-auth
HttpBasicAuth basic-auth = (HttpBasicAuth) defaultClient.getAuthentication("basic-auth");
basic-auth.setUsername("YOUR USERNAME");
basic-auth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
StudentQuestion body = new StudentQuestion(); // StudentQuestion | 
try {
    StudentQuestion result = apiInstance.updateTweetInDB(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateTweetInDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StudentQuestion**](StudentQuestion.md)|  | [optional]

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

