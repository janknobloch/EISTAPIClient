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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActiveSlidePath
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T16:55:36.973+02:00")
public class ActiveSlidePath {
  @SerializedName("pptslide")
  private String pptslide = null;

  @SerializedName("keyslide")
  private String keyslide = null;

  @SerializedName("devslide")
  private String devslide = null;

  @SerializedName("presentationNumber")
  private Integer presentationNumber = null;

  @SerializedName("slideNumber")
  private Integer slideNumber = null;

  public ActiveSlidePath pptslide(String pptslide) {
    this.pptslide = pptslide;
    return this;
  }

   /**
   * Get pptslide
   * @return pptslide
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPptslide() {
    return pptslide;
  }

  public void setPptslide(String pptslide) {
    this.pptslide = pptslide;
  }

  public ActiveSlidePath keyslide(String keyslide) {
    this.keyslide = keyslide;
    return this;
  }

   /**
   * Get keyslide
   * @return keyslide
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKeyslide() {
    return keyslide;
  }

  public void setKeyslide(String keyslide) {
    this.keyslide = keyslide;
  }

  public ActiveSlidePath devslide(String devslide) {
    this.devslide = devslide;
    return this;
  }

   /**
   * Get devslide
   * @return devslide
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDevslide() {
    return devslide;
  }

  public void setDevslide(String devslide) {
    this.devslide = devslide;
  }

  public ActiveSlidePath presentationNumber(Integer presentationNumber) {
    this.presentationNumber = presentationNumber;
    return this;
  }

   /**
   * Get presentationNumber
   * @return presentationNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPresentationNumber() {
    return presentationNumber;
  }

  public void setPresentationNumber(Integer presentationNumber) {
    this.presentationNumber = presentationNumber;
  }

  public ActiveSlidePath slideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
    return this;
  }

   /**
   * Get slideNumber
   * @return slideNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSlideNumber() {
    return slideNumber;
  }

  public void setSlideNumber(Integer slideNumber) {
    this.slideNumber = slideNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveSlidePath activeSlidePath = (ActiveSlidePath) o;
    return Objects.equals(this.pptslide, activeSlidePath.pptslide) &&
        Objects.equals(this.keyslide, activeSlidePath.keyslide) &&
        Objects.equals(this.devslide, activeSlidePath.devslide) &&
        Objects.equals(this.presentationNumber, activeSlidePath.presentationNumber) &&
        Objects.equals(this.slideNumber, activeSlidePath.slideNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pptslide, keyslide, devslide, presentationNumber, slideNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveSlidePath {\n");
    
    sb.append("    pptslide: ").append(toIndentedString(pptslide)).append("\n");
    sb.append("    keyslide: ").append(toIndentedString(keyslide)).append("\n");
    sb.append("    devslide: ").append(toIndentedString(devslide)).append("\n");
    sb.append("    presentationNumber: ").append(toIndentedString(presentationNumber)).append("\n");
    sb.append("    slideNumber: ").append(toIndentedString(slideNumber)).append("\n");
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

