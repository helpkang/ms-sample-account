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
  * Traveler's services on the flight to be indicated on the boarding pass
 **/
@ApiModel(description="Traveler's services on the flight to be indicated on the boarding pass")
public class BoardingPassService  {
  
  @ApiModelProperty(value = "Service code needed to identify a service")
 /**
   * Service code needed to identify a service
  **/
  private String code = null;

  @ApiModelProperty(value = "Comment associated to the service")
 /**
   * Comment associated to the service
  **/
  private String comment = null;
 /**
   * Service code needed to identify a service
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BoardingPassService code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Comment associated to the service
   * @return comment
  **/
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public BoardingPassService comment(String comment) {
    this.comment = comment;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassService {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

