package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;

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
  * Define a time window with a opening and closing time. If no opening date and time is provided, this means that it's always open before the closing time. Likewise, if no closing date and time is provided, this means that the window is open-ended. 
 **/
@ApiModel(description="Define a time window with a opening and closing time. If no opening date and time is provided, this means that it's always open before the closing time. Likewise, if no closing date and time is provided, this means that the window is open-ended. ")
public class TimeWindow  {
  
  @ApiModelProperty(value = "Opening date and time of the window in ISO 8601 (eg. 2017-02-10T06:12:00+02:00)")
 /**
   * Opening date and time of the window in ISO 8601 (eg. 2017-02-10T06:12:00+02:00)
  **/
  private LocalDateTime openingDateAndTime = null;

  @ApiModelProperty(value = "Closing date and time of the window in ISO 8601 (eg. 2017-02-10T06:12:00+02:00)")
 /**
   * Closing date and time of the window in ISO 8601 (eg. 2017-02-10T06:12:00+02:00)
  **/
  private LocalDateTime closingDateAndTime = null;
 /**
   * Opening date and time of the window in ISO 8601 (eg. 2017-02-10T06:12:00+02:00)
   * @return openingDateAndTime
  **/
  @JsonProperty("openingDateAndTime")
  public LocalDateTime getOpeningDateAndTime() {
    return openingDateAndTime;
  }

  public void setOpeningDateAndTime(LocalDateTime openingDateAndTime) {
    this.openingDateAndTime = openingDateAndTime;
  }

  public TimeWindow openingDateAndTime(LocalDateTime openingDateAndTime) {
    this.openingDateAndTime = openingDateAndTime;
    return this;
  }

 /**
   * Closing date and time of the window in ISO 8601 (eg. 2017-02-10T06:12:00+02:00)
   * @return closingDateAndTime
  **/
  @JsonProperty("closingDateAndTime")
  public LocalDateTime getClosingDateAndTime() {
    return closingDateAndTime;
  }

  public void setClosingDateAndTime(LocalDateTime closingDateAndTime) {
    this.closingDateAndTime = closingDateAndTime;
  }

  public TimeWindow closingDateAndTime(LocalDateTime closingDateAndTime) {
    this.closingDateAndTime = closingDateAndTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeWindow {\n");
    
    sb.append("    openingDateAndTime: ").append(toIndentedString(openingDateAndTime)).append("\n");
    sb.append("    closingDateAndTime: ").append(toIndentedString(closingDateAndTime)).append("\n");
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

