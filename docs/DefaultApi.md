# DefaultApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteQuestion**](DefaultApi.md#deleteQuestion) | **DELETE** /bot/question | deletes a given Question
[**deleteQuestionByInputSourceId**](DefaultApi.md#deleteQuestionByInputSourceId) | **DELETE** /bot/question/sourceId/{inputSourceId} | deletes a given Question by using its inputSourceId
[**deleteQuestionByInputSourceIdandInputSource**](DefaultApi.md#deleteQuestionByInputSourceIdandInputSource) | **DELETE** /bot/question/sourceId/{inputSourceId}/source/{inputSource} | deletes a given Question by using its inputSourceId and inputSource
[**deleteReply**](DefaultApi.md#deleteReply) | **DELETE** /bot/reply/{inputSourceId} | deletes a reply by its inputSourceId
[**downvote**](DefaultApi.md#downvote) | **GET** /bot/downvote/{inputSourceId} | upvotes a given DataItem using its inputSourceId
[**getActiveSlides**](DefaultApi.md#getActiveSlides) | **GET** /bot/slide/live | Returns an Array of active slides for (ppt, key, and dev)
[**getAllBots**](DefaultApi.md#getAllBots) | **GET** /bot/bot | retrieves all bots 
[**getAllClosedStudentQuestionsForExercises**](DefaultApi.md#getAllClosedStudentQuestionsForExercises) | **GET** /bot/question/exercise/report | retrieves all exercise questions report not including general questions - ordered by slideSet
[**getAllClosedStudentQuestionsForLectures**](DefaultApi.md#getAllClosedStudentQuestionsForLectures) | **GET** /bot/question/lecture/report | retrieves all lecture questions report not including general questions - ordered by slideSet
[**getAllPresenterSessions**](DefaultApi.md#getAllPresenterSessions) | **GET** /bot/presenter | Retrieves all Presenters
[**getAllQuestionWallSessions**](DefaultApi.md#getAllQuestionWallSessions) | **GET** /bot/wall | retrieves all question wall listeners
[**getAllStudentQuestions**](DefaultApi.md#getAllStudentQuestions) | **GET** /bot/question | retrieves all Questions
[**getAllStudentQuestionsByInputSource**](DefaultApi.md#getAllStudentQuestionsByInputSource) | **GET** /bot/question/inputSource/{inputSource} | retrieves all Questions
[**getClosedLastNumStudentQuestions**](DefaultApi.md#getClosedLastNumStudentQuestions) | **GET** /bot/question/closed/last/{num} | retrieves last {num} closed Questions
[**getClosedStudentQuestions**](DefaultApi.md#getClosedStudentQuestions) | **GET** /bot/question/closed | retrieves closed Questions
[**getExercises**](DefaultApi.md#getExercises) | **GET** /bot/exercise | Returns a mapping ordered by timestamp of all exerciseNames
[**getLastNumTeacherQuestions**](DefaultApi.md#getLastNumTeacherQuestions) | **GET** /bot/quiz/last/{num} | retrieves last {num} quizzes
[**getOpenQuestions**](DefaultApi.md#getOpenQuestions) | **GET** /bot/question/open | retrieves open Questions
[**getPresentations**](DefaultApi.md#getPresentations) | **GET** /bot/presentation | Returns a mapping ordered by timestamp of all presentationNames
[**getQuestionByInputSourceId**](DefaultApi.md#getQuestionByInputSourceId) | **GET** /bot/question/sourceId/{inputSourceId} | retrieves question by its InputSourceId
[**getQuestionByInputSourceIdandInputSource**](DefaultApi.md#getQuestionByInputSourceIdandInputSource) | **GET** /bot/question/sourceId/{inputSourceId}/source/{inputSource} | retrieves question by its InputSourceId and inputSource
[**getQuestionByObjectId**](DefaultApi.md#getQuestionByObjectId) | **GET** /bot/question/{id} | retrieves question by its ObjectId
[**getQuestionByReplyInputSourceId**](DefaultApi.md#getQuestionByReplyInputSourceId) | **GET** /bot/question/reply/sourceId/{inputSourceId} | retrieves question by looking for a certain reply.inputSourceId
[**getReplyByInputSourceId**](DefaultApi.md#getReplyByInputSourceId) | **GET** /bot/reply/sourceId/{inputSourceId} | retrieves reply by looking for a certain reply.inputSourceId
[**getReplyForQuestionByContent**](DefaultApi.md#getReplyForQuestionByContent) | **GET** /bot/question/sourceId/{inputSourceId}/reply/content/{content} | retrieves reply by looking for a certain reply.content
[**getReportForExercise**](DefaultApi.md#getReportForExercise) | **GET** /bot/question/report/exercise{num} | retrieves all questions report for specific exercise(slideSet)
[**getReportForGeneral**](DefaultApi.md#getReportForGeneral) | **GET** /bot/question/report/general | retrieves all questions report for specific lecture(slideSet)
[**getReportForLecture**](DefaultApi.md#getReportForLecture) | **GET** /bot/question/report/lecture/{num} | retrieves all questions report for specific lecture(slideSet)
[**getSMSQuestion**](DefaultApi.md#getSMSQuestion) | **POST** /bot/sms | forwards a new SMS question
[**getScoreforInputSource**](DefaultApi.md#getScoreforInputSource) | **GET** /bot/score/inputSource/{inputSource} | generates Highscore for a given InputSource
[**getSlideForExerciseNumberAndSlideNumber**](DefaultApi.md#getSlideForExerciseNumberAndSlideNumber) | **GET** /bot/exercise/number/{exerciseNumber}/slide/number/{slideNumber} | Returns slidePath for ExerciseNumber / SlideNumber
[**getSlideForPresentationNumberAndSlideNumber**](DefaultApi.md#getSlideForPresentationNumberAndSlideNumber) | **GET** /bot/presentation/number/{presentationNumber}/slide/number/{slideNumber} | Returns slidePath for PresentationNumber / SlideNumber
[**getSlidesForExerciseName**](DefaultApi.md#getSlidesForExerciseName) | **GET** /bot/exercise/name/{exerciseName}/slide | Returns all Slides for ExerciseName
[**getSlidesForPresentationName**](DefaultApi.md#getSlidesForPresentationName) | **GET** /bot/presentation/name/{presentationName}/slide | Returns all Slides for PresentationName
[**getWhatsappQuestion**](DefaultApi.md#getWhatsappQuestion) | **POST** /bot/whatsapp | forwards a new Whatsapp question
[**postFeedback**](DefaultApi.md#postFeedback) | **POST** /bot/feedback | saves a new Feedback, updates it if already existent
[**postQuestion**](DefaultApi.md#postQuestion) | **POST** /bot/question | saves a new Question, updates it if already existent
[**postReply**](DefaultApi.md#postReply) | **POST** /bot/reply | saves a new Reply, updates it if already existent
[**postReplyAndCloseQuestion**](DefaultApi.md#postReplyAndCloseQuestion) | **POST** /bot/question/close/{replyInputSourceId} | saves a new Question, updates it if already existent
[**putQuestion**](DefaultApi.md#putQuestion) | **PUT** /bot/question | saves a new Question, updates it if already existent
[**putQuiz**](DefaultApi.md#putQuiz) | **PUT** /bot/quiz | saves a new Quiz 
[**upvote**](DefaultApi.md#upvote) | **GET** /bot/upvote/{inputSourceId} | upvotes a given DataItem using its inputSourceId


<a name="deleteQuestion"></a>
# **deleteQuestion**
> StudentQuestion deleteQuestion(body)

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
    StudentQuestion result = apiInstance.deleteQuestion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteQuestion");
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

<a name="deleteQuestionByInputSourceId"></a>
# **deleteQuestionByInputSourceId**
> StudentQuestion deleteQuestionByInputSourceId(inputSourceId)

deletes a given Question by using its inputSourceId



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
String inputSourceId = "inputSourceId_example"; // String | 
try {
    StudentQuestion result = apiInstance.deleteQuestionByInputSourceId(inputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteQuestionByInputSourceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteQuestionByInputSourceIdandInputSource"></a>
# **deleteQuestionByInputSourceIdandInputSource**
> StudentQuestion deleteQuestionByInputSourceIdandInputSource(inputSourceId, inputSource)

deletes a given Question by using its inputSourceId and inputSource



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
String inputSourceId = "inputSourceId_example"; // String | 
String inputSource = "inputSource_example"; // String | 
try {
    StudentQuestion result = apiInstance.deleteQuestionByInputSourceIdandInputSource(inputSourceId, inputSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteQuestionByInputSourceIdandInputSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |
 **inputSource** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteReply"></a>
# **deleteReply**
> StudentQuestion deleteReply(inputSourceId)

deletes a reply by its inputSourceId



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
String inputSourceId = "inputSourceId_example"; // String | 
try {
    StudentQuestion result = apiInstance.deleteReply(inputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteReply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downvote"></a>
# **downvote**
> DataItem downvote(inputSourceId)

upvotes a given DataItem using its inputSourceId



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
String inputSourceId = "inputSourceId_example"; // String | 
try {
    DataItem result = apiInstance.downvote(inputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#downvote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |

### Return type

[**DataItem**](DataItem.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getActiveSlides"></a>
# **getActiveSlides**
> ActiveSlide getActiveSlides()

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
    ActiveSlide result = apiInstance.getActiveSlides();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getActiveSlides");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ActiveSlide**](ActiveSlide.md)

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

<a name="getAllClosedStudentQuestionsForExercises"></a>
# **getAllClosedStudentQuestionsForExercises**
> getAllClosedStudentQuestionsForExercises()

retrieves all exercise questions report not including general questions - ordered by slideSet



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
    apiInstance.getAllClosedStudentQuestionsForExercises();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllClosedStudentQuestionsForExercises");
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

<a name="getAllClosedStudentQuestionsForLectures"></a>
# **getAllClosedStudentQuestionsForLectures**
> getAllClosedStudentQuestionsForLectures()

retrieves all lecture questions report not including general questions - ordered by slideSet



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
    apiInstance.getAllClosedStudentQuestionsForLectures();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllClosedStudentQuestionsForLectures");
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

<a name="getAllQuestionWallSessions"></a>
# **getAllQuestionWallSessions**
> List&lt;String&gt; getAllQuestionWallSessions()

retrieves all question wall listeners



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
    List<String> result = apiInstance.getAllQuestionWallSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllQuestionWallSessions");
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

<a name="getAllStudentQuestionsByInputSource"></a>
# **getAllStudentQuestionsByInputSource**
> List&lt;StudentQuestion&gt; getAllStudentQuestionsByInputSource(inputSource)

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
String inputSource = "inputSource_example"; // String | 
try {
    List<StudentQuestion> result = apiInstance.getAllStudentQuestionsByInputSource(inputSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllStudentQuestionsByInputSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSource** | **String**|  |

### Return type

[**List&lt;StudentQuestion&gt;**](StudentQuestion.md)

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

<a name="getOpenQuestions"></a>
# **getOpenQuestions**
> List&lt;StudentQuestion&gt; getOpenQuestions()

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
    List<StudentQuestion> result = apiInstance.getOpenQuestions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getOpenQuestions");
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

<a name="getQuestionByInputSourceId"></a>
# **getQuestionByInputSourceId**
> StudentQuestion getQuestionByInputSourceId(inputSourceId)

retrieves question by its InputSourceId



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
String inputSourceId = "inputSourceId_example"; // String | 
try {
    StudentQuestion result = apiInstance.getQuestionByInputSourceId(inputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getQuestionByInputSourceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuestionByInputSourceIdandInputSource"></a>
# **getQuestionByInputSourceIdandInputSource**
> StudentQuestion getQuestionByInputSourceIdandInputSource(inputSourceId, inputSource)

retrieves question by its InputSourceId and inputSource



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
String inputSourceId = "inputSourceId_example"; // String | 
String inputSource = "inputSource_example"; // String | 
try {
    StudentQuestion result = apiInstance.getQuestionByInputSourceIdandInputSource(inputSourceId, inputSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getQuestionByInputSourceIdandInputSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |
 **inputSource** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuestionByObjectId"></a>
# **getQuestionByObjectId**
> StudentQuestion getQuestionByObjectId(id)

retrieves question by its ObjectId



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
    StudentQuestion result = apiInstance.getQuestionByObjectId(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getQuestionByObjectId");
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

<a name="getQuestionByReplyInputSourceId"></a>
# **getQuestionByReplyInputSourceId**
> StudentQuestion getQuestionByReplyInputSourceId(inputSourceId)

retrieves question by looking for a certain reply.inputSourceId



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
String inputSourceId = "inputSourceId_example"; // String | 
try {
    StudentQuestion result = apiInstance.getQuestionByReplyInputSourceId(inputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getQuestionByReplyInputSourceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplyByInputSourceId"></a>
# **getReplyByInputSourceId**
> Reply getReplyByInputSourceId(inputSourceId)

retrieves reply by looking for a certain reply.inputSourceId



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
String inputSourceId = "inputSourceId_example"; // String | 
try {
    Reply result = apiInstance.getReplyByInputSourceId(inputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReplyByInputSourceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |

### Return type

[**Reply**](Reply.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplyForQuestionByContent"></a>
# **getReplyForQuestionByContent**
> Reply getReplyForQuestionByContent(inputSourceId, content)

retrieves reply by looking for a certain reply.content



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
String inputSourceId = "inputSourceId_example"; // String | 
String content = "content_example"; // String | 
try {
    Reply result = apiInstance.getReplyForQuestionByContent(inputSourceId, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReplyForQuestionByContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |
 **content** | **String**|  |

### Return type

[**Reply**](Reply.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportForExercise"></a>
# **getReportForExercise**
> getReportForExercise(num)

retrieves all questions report for specific exercise(slideSet)



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
    apiInstance.getReportForExercise(num);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReportForExercise");
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

<a name="getReportForGeneral"></a>
# **getReportForGeneral**
> getReportForGeneral()

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
    apiInstance.getReportForGeneral();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReportForGeneral");
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

<a name="getReportForLecture"></a>
# **getReportForLecture**
> getReportForLecture(num)

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
    apiInstance.getReportForLecture(num);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReportForLecture");
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

<a name="getScoreforInputSource"></a>
# **getScoreforInputSource**
> Score getScoreforInputSource(inputSource)

generates Highscore for a given InputSource



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
String inputSource = "inputSource_example"; // String | 
try {
    Score result = apiInstance.getScoreforInputSource(inputSource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getScoreforInputSource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSource** | **String**|  |

### Return type

[**Score**](Score.md)

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

<a name="getWhatsappQuestion"></a>
# **getWhatsappQuestion**
> StudentQuestion getWhatsappQuestion(body)

forwards a new Whatsapp question



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
StudentQuestion body = new StudentQuestion(); // StudentQuestion | 
try {
    StudentQuestion result = apiInstance.getWhatsappQuestion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getWhatsappQuestion");
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

<a name="postFeedback"></a>
# **postFeedback**
> Feedback postFeedback(body)

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
    Feedback result = apiInstance.postFeedback(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postFeedback");
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

<a name="postQuestion"></a>
# **postQuestion**
> StudentQuestion postQuestion(body)

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
    StudentQuestion result = apiInstance.postQuestion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postQuestion");
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

<a name="postReply"></a>
# **postReply**
> StudentQuestion postReply(body)

saves a new Reply, updates it if already existent



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
Reply body = new Reply(); // Reply | 
try {
    StudentQuestion result = apiInstance.postReply(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postReply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Reply**](Reply.md)|  | [optional]

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postReplyAndCloseQuestion"></a>
# **postReplyAndCloseQuestion**
> StudentQuestion postReplyAndCloseQuestion(replyInputSourceId)

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
String replyInputSourceId = "replyInputSourceId_example"; // String | 
try {
    StudentQuestion result = apiInstance.postReplyAndCloseQuestion(replyInputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postReplyAndCloseQuestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replyInputSourceId** | **String**|  |

### Return type

[**StudentQuestion**](StudentQuestion.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putQuestion"></a>
# **putQuestion**
> StudentQuestion putQuestion(body)

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
    StudentQuestion result = apiInstance.putQuestion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#putQuestion");
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

<a name="putQuiz"></a>
# **putQuiz**
> TeacherQuestion putQuiz(body)

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
    TeacherQuestion result = apiInstance.putQuiz(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#putQuiz");
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

<a name="upvote"></a>
# **upvote**
> DataItem upvote(inputSourceId)

upvotes a given DataItem using its inputSourceId



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
String inputSourceId = "inputSourceId_example"; // String | 
try {
    DataItem result = apiInstance.upvote(inputSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#upvote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputSourceId** | **String**|  |

### Return type

[**DataItem**](DataItem.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

