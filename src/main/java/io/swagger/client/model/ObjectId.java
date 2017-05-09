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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * ObjectId
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-09T19:52:30.346+02:00")
public class ObjectId {
  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("machineIdentifier")
  private Integer machineIdentifier = null;

  @SerializedName("processIdentifier")
  private Integer processIdentifier = null;

  @SerializedName("counter")
  private Integer counter = null;

  @SerializedName("timeSecond")
  private Integer timeSecond = null;

  @SerializedName("time")
  private Long time = null;

  @SerializedName("date")
  private DateTime date = null;

  public ObjectId timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public ObjectId machineIdentifier(Integer machineIdentifier) {
    this.machineIdentifier = machineIdentifier;
    return this;
  }

   /**
   * Get machineIdentifier
   * @return machineIdentifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMachineIdentifier() {
    return machineIdentifier;
  }

  public void setMachineIdentifier(Integer machineIdentifier) {
    this.machineIdentifier = machineIdentifier;
  }

  public ObjectId processIdentifier(Integer processIdentifier) {
    this.processIdentifier = processIdentifier;
    return this;
  }

   /**
   * Get processIdentifier
   * @return processIdentifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getProcessIdentifier() {
    return processIdentifier;
  }

  public void setProcessIdentifier(Integer processIdentifier) {
    this.processIdentifier = processIdentifier;
  }

  public ObjectId counter(Integer counter) {
    this.counter = counter;
    return this;
  }

   /**
   * Get counter
   * @return counter
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCounter() {
    return counter;
  }

  public void setCounter(Integer counter) {
    this.counter = counter;
  }

  public ObjectId timeSecond(Integer timeSecond) {
    this.timeSecond = timeSecond;
    return this;
  }

   /**
   * Get timeSecond
   * @return timeSecond
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTimeSecond() {
    return timeSecond;
  }

  public void setTimeSecond(Integer timeSecond) {
    this.timeSecond = timeSecond;
  }

  public ObjectId time(Long time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }

  public ObjectId date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectId objectId = (ObjectId) o;
    return Objects.equals(this.timestamp, objectId.timestamp) &&
        Objects.equals(this.machineIdentifier, objectId.machineIdentifier) &&
        Objects.equals(this.processIdentifier, objectId.processIdentifier) &&
        Objects.equals(this.counter, objectId.counter) &&
        Objects.equals(this.timeSecond, objectId.timeSecond) &&
        Objects.equals(this.time, objectId.time) &&
        Objects.equals(this.date, objectId.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, machineIdentifier, processIdentifier, counter, timeSecond, time, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectId {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    machineIdentifier: ").append(toIndentedString(machineIdentifier)).append("\n");
    sb.append("    processIdentifier: ").append(toIndentedString(processIdentifier)).append("\n");
    sb.append("    counter: ").append(toIndentedString(counter)).append("\n");
    sb.append("    timeSecond: ").append(toIndentedString(timeSecond)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
