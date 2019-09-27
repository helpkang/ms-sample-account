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
  * Flight delay information corresponding to a flight id. 
 **/
@ApiModel(description="Flight delay information corresponding to a flight id. ")
public class FlightDelay  {
  
  @ApiModelProperty(value = "Reason for the flight delay.Appears only when the flight is delayed.")
 /**
   * Reason for the flight delay.Appears only when the flight is delayed.
  **/
  private String reason = null;

  @ApiModelProperty(value = "Duration of the flight delay expressed in seconds, it appears only when the flight is delayed.")
 /**
   * Duration of the flight delay expressed in seconds, it appears only when the flight is delayed.
  **/
  private Integer duration = null;
 /**
   * Reason for the flight delay.Appears only when the flight is delayed.
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public FlightDelay reason(String reason) {
    this.reason = reason;
    return this;
  }

 /**
   * Duration of the flight delay expressed in seconds, it appears only when the flight is delayed.
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public FlightDelay duration(Integer duration) {
    this.duration = duration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightDelay {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

