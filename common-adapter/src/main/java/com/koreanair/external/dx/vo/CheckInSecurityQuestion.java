package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Security question set by the airline following national requirements in order to check-in a traveler. Travelers need to answer the question and the result should be provided in the POST acceptance service. It is adviced to contact the airline to know all the questions possible as they are in control of those. 
 **/
@ApiModel(description="Security question set by the airline following national requirements in order to check-in a traveler. Travelers need to answer the question and the result should be provided in the POST acceptance service. It is adviced to contact the airline to know all the questions possible as they are in control of those. ")
public class CheckInSecurityQuestion  {
  
  @ApiModelProperty(required = true, value = "Code of the question as set by the airline in the Departure Control System business rule system. Example: 14651")
 /**
   * Code of the question as set by the airline in the Departure Control System business rule system. Example: 14651
  **/
  private String questionCode = null;

  @ApiModelProperty(value = "Readable question, usually only in English, that the traveler should answer. Example: Has anyone asked you to put something in your bag for them? ")
 /**
   * Readable question, usually only in English, that the traveler should answer. Example: Has anyone asked you to put something in your bag for them? 
  **/
  private String questionDescription = null;
 /**
   * Code of the question as set by the airline in the Departure Control System business rule system. Example: 14651
   * @return questionCode
  **/
  @JsonProperty("questionCode")
  public String getQuestionCode() {
    return questionCode;
  }

  public void setQuestionCode(String questionCode) {
    this.questionCode = questionCode;
  }

  public CheckInSecurityQuestion questionCode(String questionCode) {
    this.questionCode = questionCode;
    return this;
  }

 /**
   * Readable question, usually only in English, that the traveler should answer. Example: Has anyone asked you to put something in your bag for them? 
   * @return questionDescription
  **/
  @JsonProperty("questionDescription")
  public String getQuestionDescription() {
    return questionDescription;
  }

  public void setQuestionDescription(String questionDescription) {
    this.questionDescription = questionDescription;
  }

  public CheckInSecurityQuestion questionDescription(String questionDescription) {
    this.questionDescription = questionDescription;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInSecurityQuestion {\n");
    
    sb.append("    questionCode: ").append(toIndentedString(questionCode)).append("\n");
    sb.append("    questionDescription: ").append(toIndentedString(questionDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

