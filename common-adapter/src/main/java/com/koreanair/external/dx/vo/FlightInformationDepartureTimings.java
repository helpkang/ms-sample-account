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

public class FlightInformationDepartureTimings  {
  
  @ApiModelProperty(value = "Scheduled time of departure, local to the departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Scheduled time of departure, local to the departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime scheduledDepartureDateTime = null;

  @ApiModelProperty(value = "Actual time of departure from the gate, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Actual time of departure from the gate, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime actualOffBlockDateTime = null;

  @ApiModelProperty(value = "Estimated time of departure from the gate, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Estimated time of departure from the gate, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime estimatedOffBlockDateTime = null;

  @ApiModelProperty(value = "Estimated time of departure from the runway, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Estimated time of departure from the runway, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime estimatedTakeOffDateTime = null;

  @ApiModelProperty(value = "Actual time of departure from the runway, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)          ")
 /**
   * Actual time of departure from the runway, local to the leg departure airport with the format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)          
  **/
  private LocalDateTime actualTakeOffDateTime = null;
 /**
   * Scheduled time of departure, local to the departure airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return scheduledDepartureDateTime
  **/
  @JsonProperty("scheduledDepartureDateTime")
  public LocalDateTime getScheduledDepartureDateTime() {
    return scheduledDepartureDateTime;
  }

  public void setScheduledDepartureDateTime(LocalDateTime scheduledDepartureDateTime) {
    this.scheduledDepartureDateTime = scheduledDepartureDateTime;
  }

  public FlightInformationDepartureTimings scheduledDepartureDateTime(LocalDateTime scheduledDepartureDateTime) {
    this.scheduledDepartureDateTime = scheduledDepartureDateTime;
    return this;
  }

 /**
   * Actual time of departure from the gate, local to the leg departure airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return actualOffBlockDateTime
  **/
  @JsonProperty("actualOffBlockDateTime")
  public LocalDateTime getActualOffBlockDateTime() {
    return actualOffBlockDateTime;
  }

  public void setActualOffBlockDateTime(LocalDateTime actualOffBlockDateTime) {
    this.actualOffBlockDateTime = actualOffBlockDateTime;
  }

  public FlightInformationDepartureTimings actualOffBlockDateTime(LocalDateTime actualOffBlockDateTime) {
    this.actualOffBlockDateTime = actualOffBlockDateTime;
    return this;
  }

 /**
   * Estimated time of departure from the gate, local to the leg departure airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return estimatedOffBlockDateTime
  **/
  @JsonProperty("estimatedOffBlockDateTime")
  public LocalDateTime getEstimatedOffBlockDateTime() {
    return estimatedOffBlockDateTime;
  }

  public void setEstimatedOffBlockDateTime(LocalDateTime estimatedOffBlockDateTime) {
    this.estimatedOffBlockDateTime = estimatedOffBlockDateTime;
  }

  public FlightInformationDepartureTimings estimatedOffBlockDateTime(LocalDateTime estimatedOffBlockDateTime) {
    this.estimatedOffBlockDateTime = estimatedOffBlockDateTime;
    return this;
  }

 /**
   * Estimated time of departure from the runway, local to the leg departure airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return estimatedTakeOffDateTime
  **/
  @JsonProperty("estimatedTakeOffDateTime")
  public LocalDateTime getEstimatedTakeOffDateTime() {
    return estimatedTakeOffDateTime;
  }

  public void setEstimatedTakeOffDateTime(LocalDateTime estimatedTakeOffDateTime) {
    this.estimatedTakeOffDateTime = estimatedTakeOffDateTime;
  }

  public FlightInformationDepartureTimings estimatedTakeOffDateTime(LocalDateTime estimatedTakeOffDateTime) {
    this.estimatedTakeOffDateTime = estimatedTakeOffDateTime;
    return this;
  }

 /**
   * Actual time of departure from the runway, local to the leg departure airport with the format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)          
   * @return actualTakeOffDateTime
  **/
  @JsonProperty("actualTakeOffDateTime")
  public LocalDateTime getActualTakeOffDateTime() {
    return actualTakeOffDateTime;
  }

  public void setActualTakeOffDateTime(LocalDateTime actualTakeOffDateTime) {
    this.actualTakeOffDateTime = actualTakeOffDateTime;
  }

  public FlightInformationDepartureTimings actualTakeOffDateTime(LocalDateTime actualTakeOffDateTime) {
    this.actualTakeOffDateTime = actualTakeOffDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformationDepartureTimings {\n");
    
    sb.append("    scheduledDepartureDateTime: ").append(toIndentedString(scheduledDepartureDateTime)).append("\n");
    sb.append("    actualOffBlockDateTime: ").append(toIndentedString(actualOffBlockDateTime)).append("\n");
    sb.append("    estimatedOffBlockDateTime: ").append(toIndentedString(estimatedOffBlockDateTime)).append("\n");
    sb.append("    estimatedTakeOffDateTime: ").append(toIndentedString(estimatedTakeOffDateTime)).append("\n");
    sb.append("    actualTakeOffDateTime: ").append(toIndentedString(actualTakeOffDateTime)).append("\n");
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

