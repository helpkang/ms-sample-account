package com.koreanair.external.dx.vo;

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

public class FlightInformationArrivalTimings  {
  
  @ApiModelProperty(value = "Scheduled time of arrival, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Scheduled time of arrival, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime scheduledArrivalDateTime = null;

  @ApiModelProperty(value = "Actual time of arrival at the gate, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Actual time of arrival at the gate, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime actualOnBlockDateTime = null;

  @ApiModelProperty(value = "Estimated time of arrival at the gate, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Estimated time of arrival at the gate, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime estimatedOnBlockDateTime = null;

  @ApiModelProperty(value = "Estimated time of arrival at the runway, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Estimated time of arrival at the runway, local to the arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime estimatedTouchDownDateTime = null;

  @ApiModelProperty(value = "Actual time of arrival at the runway, local to the leg arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)              ")
 /**
   * Actual time of arrival at the runway, local to the leg arrival airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)              
  **/
  private LocalDateTime actualTouchDownDateTime = null;
 /**
   * Scheduled time of arrival, local to the arrival airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return scheduledArrivalDateTime
  **/
  @JsonProperty("scheduledArrivalDateTime")
  public LocalDateTime getScheduledArrivalDateTime() {
    return scheduledArrivalDateTime;
  }

  public void setScheduledArrivalDateTime(LocalDateTime scheduledArrivalDateTime) {
    this.scheduledArrivalDateTime = scheduledArrivalDateTime;
  }

  public FlightInformationArrivalTimings scheduledArrivalDateTime(LocalDateTime scheduledArrivalDateTime) {
    this.scheduledArrivalDateTime = scheduledArrivalDateTime;
    return this;
  }

 /**
   * Actual time of arrival at the gate, local to the arrival airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return actualOnBlockDateTime
  **/
  @JsonProperty("actualOnBlockDateTime")
  public LocalDateTime getActualOnBlockDateTime() {
    return actualOnBlockDateTime;
  }

  public void setActualOnBlockDateTime(LocalDateTime actualOnBlockDateTime) {
    this.actualOnBlockDateTime = actualOnBlockDateTime;
  }

  public FlightInformationArrivalTimings actualOnBlockDateTime(LocalDateTime actualOnBlockDateTime) {
    this.actualOnBlockDateTime = actualOnBlockDateTime;
    return this;
  }

 /**
   * Estimated time of arrival at the gate, local to the arrival airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return estimatedOnBlockDateTime
  **/
  @JsonProperty("estimatedOnBlockDateTime")
  public LocalDateTime getEstimatedOnBlockDateTime() {
    return estimatedOnBlockDateTime;
  }

  public void setEstimatedOnBlockDateTime(LocalDateTime estimatedOnBlockDateTime) {
    this.estimatedOnBlockDateTime = estimatedOnBlockDateTime;
  }

  public FlightInformationArrivalTimings estimatedOnBlockDateTime(LocalDateTime estimatedOnBlockDateTime) {
    this.estimatedOnBlockDateTime = estimatedOnBlockDateTime;
    return this;
  }

 /**
   * Estimated time of arrival at the runway, local to the arrival airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return estimatedTouchDownDateTime
  **/
  @JsonProperty("estimatedTouchDownDateTime")
  public LocalDateTime getEstimatedTouchDownDateTime() {
    return estimatedTouchDownDateTime;
  }

  public void setEstimatedTouchDownDateTime(LocalDateTime estimatedTouchDownDateTime) {
    this.estimatedTouchDownDateTime = estimatedTouchDownDateTime;
  }

  public FlightInformationArrivalTimings estimatedTouchDownDateTime(LocalDateTime estimatedTouchDownDateTime) {
    this.estimatedTouchDownDateTime = estimatedTouchDownDateTime;
    return this;
  }

 /**
   * Actual time of arrival at the runway, local to the leg arrival airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)              
   * @return actualTouchDownDateTime
  **/
  @JsonProperty("actualTouchDownDateTime")
  public LocalDateTime getActualTouchDownDateTime() {
    return actualTouchDownDateTime;
  }

  public void setActualTouchDownDateTime(LocalDateTime actualTouchDownDateTime) {
    this.actualTouchDownDateTime = actualTouchDownDateTime;
  }

  public FlightInformationArrivalTimings actualTouchDownDateTime(LocalDateTime actualTouchDownDateTime) {
    this.actualTouchDownDateTime = actualTouchDownDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformationArrivalTimings {\n");
    
    sb.append("    scheduledArrivalDateTime: ").append(toIndentedString(scheduledArrivalDateTime)).append("\n");
    sb.append("    actualOnBlockDateTime: ").append(toIndentedString(actualOnBlockDateTime)).append("\n");
    sb.append("    estimatedOnBlockDateTime: ").append(toIndentedString(estimatedOnBlockDateTime)).append("\n");
    sb.append("    estimatedTouchDownDateTime: ").append(toIndentedString(estimatedTouchDownDateTime)).append("\n");
    sb.append("    actualTouchDownDateTime: ").append(toIndentedString(actualTouchDownDateTime)).append("\n");
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

