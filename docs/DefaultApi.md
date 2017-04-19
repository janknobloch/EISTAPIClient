# DefaultApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTweetInDB**](DefaultApi.md#deleteTweetInDB) | **DELETE** /bot/question | deletes a given Question
[**deleteTweetInDBById**](DefaultApi.md#deleteTweetInDBById) | **DELETE** /bot/question/{id} | deletes a given Question by using its ID
[**getActiveSlides**](DefaultApi.md#getActiveSlides) | **GET** /bot/slide/live | Returns an Array of active slides for (ppt, key, and dev)
[**getAllDatamodels**](DefaultApi.md#getAllDatamodels) | **GET** /bot/dataitem | retrieves all DataItem (mock)
[**getAllPresenterSessions**](DefaultApi.md#getAllPresenterSessions) | **GET** /bot/presenter | Retrieves all Presenters
[**getAllReplies**](DefaultApi.md#getAllReplies) | **GET** /bot/question/replies | retrieves all Replys (mock)
[**getAllTweets**](DefaultApi.md#getAllTweets) | **GET** /bot/question | retrieves all Questions
[**getAllTwitterWallSessions**](DefaultApi.md#getAllTwitterWallSessions) | **GET** /bot/twitterwalls | retrieves all twitter wall listeners
[**getClosedLastNumTweets**](DefaultApi.md#getClosedLastNumTweets) | **GET** /bot/question/closed/last/{num} | retrieves last {num} closed Questions
[**getClosedTweets**](DefaultApi.md#getClosedTweets) | **GET** /bot/question/closed | retrieves closed Questions
[**getHighscores**](DefaultApi.md#getHighscores) | **GET** /bot/highscores | retrieves highscores
[**getOpenTweets**](DefaultApi.md#getOpenTweets) | **GET** /bot/question/open | retrieves open Questions
[**getPresentations**](DefaultApi.md#getPresentations) | **GET** /bot/presentation | Returns a mapping ordered by timestamp of all presentationNames
[**getSingleTweet**](DefaultApi.md#getSingleTweet) | **GET** /bot/question/{id} | retrieves question by Id
[**getSlideForPresentationNameAndSlideNumber**](DefaultApi.md#getSlideForPresentationNameAndSlideNumber) | **GET** /bot/presentation/name/{presentationName}/slide/number/{slideNumber} | Returns slidePath for PresentationName / SlideNumber
[**getSlideForPresentationNumberAndSlideName**](DefaultApi.md#getSlideForPresentationNumberAndSlideName) | **GET** /bot/presentation/number/{presentationNumber}/slide/name/{slideName} | Returns slidePath for PresentationNumber / SlideName
[**getSlideForPresentationNumberAndSlideNumber**](DefaultApi.md#getSlideForPresentationNumberAndSlideNumber) | **GET** /bot/presentation/number/{presentationNumber}/slide/number/{slideNumber} | Returns slidePath for PresentationNumber / SlideNumber
[**getSlidesForPresentationName**](DefaultApi.md#getSlidesForPresentationName) | **GET** /bot/presentation/name/{presentationName}/slide | Returns all Slides for PresentationName
[**getSlidesForPresentationNameAndSlideName**](DefaultApi.md#getSlidesForPresentationNameAndSlideName) | **GET** /bot/presentation/name/{presentationName}/slide/name/{slideName} | Returns slidePath for PresentationNumber / SlideName
[**getSlidesForPresentationNumber**](DefaultApi.md#getSlidesForPresentationNumber) | **GET** /bot/presentation/number/{presentationNumber}/slide | Returns all Slides for PresentationNumber
[**postFeedbackToDB**](DefaultApi.md#postFeedbackToDB) | **POST** /bot/feedback | saves a new Feedback, updates it if already existent
[**postReplyAndCloseQuestion**](DefaultApi.md#postReplyAndCloseQuestion) | **POST** /bot/question/close/{id} | saves a new Question, updates it if already existent
[**postTweetInDB**](DefaultApi.md#postTweetInDB) | **POST** /bot/question | saves a new Question, updates it if already existent
[**updateTweetInDB**](DefaultApi.md#updateTweetInDB) | **PUT** /bot/question | saves a new Question, updates it if already existent


<a name="deleteTweetInDB"></a>
# **deleteTweetInDB**
> Question deleteTweetInDB(body)

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
Question body = new Question(); // Question | 
try {
    Question result = apiInstance.deleteTweetInDB(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteTweetInDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Question**](Question.md)|  | [optional]

### Return type

[**Question**](Question.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTweetInDBById"></a>
# **deleteTweetInDBById**
> Question deleteTweetInDBById(body)

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
    Question result = apiInstance.deleteTweetInDBById(body);
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

[**Question**](Question.md)

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

<a name="getAllDatamodels"></a>
# **getAllDatamodels**
> List&lt;DataItem&gt; getAllDatamodels()

retrieves all DataItem (mock)



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
    List<DataItem> result = apiInstance.getAllDatamodels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllDatamodels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DataItem&gt;**](DataItem.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a name="getAllReplies"></a>
# **getAllReplies**
> List&lt;Reply&gt; getAllReplies()

retrieves all Replys (mock)



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
    List<Reply> result = apiInstance.getAllReplies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllReplies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Reply&gt;**](Reply.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTweets"></a>
# **getAllTweets**
> List&lt;Question&gt; getAllTweets()

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
    List<Question> result = apiInstance.getAllTweets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAllTweets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Question&gt;**](Question.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTwitterWallSessions"></a>
# **getAllTwitterWallSessions**
> List&lt;String&gt; getAllTwitterWallSessions()

retrieves all twitter wall listeners



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

<a name="getClosedLastNumTweets"></a>
# **getClosedLastNumTweets**
> List&lt;Question&gt; getClosedLastNumTweets(num)

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
    List<Question> result = apiInstance.getClosedLastNumTweets(num);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getClosedLastNumTweets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **num** | **Integer**|  |

### Return type

[**List&lt;Question&gt;**](Question.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClosedTweets"></a>
# **getClosedTweets**
> List&lt;Question&gt; getClosedTweets()

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
    List<Question> result = apiInstance.getClosedTweets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getClosedTweets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Question&gt;**](Question.md)

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

<a name="getOpenTweets"></a>
# **getOpenTweets**
> List&lt;Question&gt; getOpenTweets()

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
    List<Question> result = apiInstance.getOpenTweets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getOpenTweets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Question&gt;**](Question.md)

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

<a name="getSingleTweet"></a>
# **getSingleTweet**
> Question getSingleTweet(id)

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
    Question result = apiInstance.getSingleTweet(id);
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

[**Question**](Question.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlideForPresentationNameAndSlideNumber"></a>
# **getSlideForPresentationNameAndSlideNumber**
> String getSlideForPresentationNameAndSlideNumber(presentationName, slideNumber)

Returns slidePath for PresentationName / SlideNumber



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
Integer slideNumber = 56; // Integer | 
try {
    String result = apiInstance.getSlideForPresentationNameAndSlideNumber(presentationName, slideNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlideForPresentationNameAndSlideNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **presentationName** | **String**|  |
 **slideNumber** | **Integer**|  |

### Return type

**String**

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlideForPresentationNumberAndSlideName"></a>
# **getSlideForPresentationNumberAndSlideName**
> String getSlideForPresentationNumberAndSlideName(presentationNumber, slideName)

Returns slidePath for PresentationNumber / SlideName



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
String slideName = "slideName_example"; // String | 
try {
    String result = apiInstance.getSlideForPresentationNumberAndSlideName(presentationNumber, slideName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlideForPresentationNumberAndSlideName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **presentationNumber** | **Integer**|  |
 **slideName** | **String**|  |

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

<a name="getSlidesForPresentationNameAndSlideName"></a>
# **getSlidesForPresentationNameAndSlideName**
> String getSlidesForPresentationNameAndSlideName(presentationName, slideName)

Returns slidePath for PresentationNumber / SlideName



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
String slideName = "slideName_example"; // String | 
try {
    String result = apiInstance.getSlidesForPresentationNameAndSlideName(presentationName, slideName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlidesForPresentationNameAndSlideName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **presentationName** | **String**|  |
 **slideName** | **String**|  |

### Return type

**String**

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSlidesForPresentationNumber"></a>
# **getSlidesForPresentationNumber**
> Map&lt;String, String&gt; getSlidesForPresentationNumber(presentationNumber)

Returns all Slides for PresentationNumber



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
try {
    Map<String, String> result = apiInstance.getSlidesForPresentationNumber(presentationNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSlidesForPresentationNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **presentationNumber** | **Integer**|  |

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

[basic-auth](../README.md#basic-auth)

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
> Question postReplyAndCloseQuestion(id)

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
    Question result = apiInstance.postReplyAndCloseQuestion(id);
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

[**Question**](Question.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTweetInDB"></a>
# **postTweetInDB**
> Question postTweetInDB(body)

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
Question body = new Question(); // Question | 
try {
    Question result = apiInstance.postTweetInDB(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postTweetInDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Question**](Question.md)|  | [optional]

### Return type

[**Question**](Question.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTweetInDB"></a>
# **updateTweetInDB**
> Question updateTweetInDB(body)

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
Question body = new Question(); // Question | 
try {
    Question result = apiInstance.updateTweetInDB(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateTweetInDB");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Question**](Question.md)|  | [optional]

### Return type

[**Question**](Question.md)

### Authorization

[basic-auth](../README.md#basic-auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

