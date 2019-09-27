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
  * Departure or arrival information (if case of multiple legs, departure for the first leg)
 **/
@ApiModel(description="Departure or arrival information (if case of multiple legs, departure for the first leg)")
public class FlightBasicEndPoint  {
  
  @ApiModelProperty(value = "IATA airport code")
 /**
   * IATA airport code
  **/
  private String locationCode = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Local date and time with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Local date and time with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime dateTime = null;

  @ApiModelProperty(example = "2018-02-10T21:40:00+02:00", value = "Estimated time, in case of delay or other modification. Local date and time with the following format \\\"yyyy-MM-dd'T'HH:mm:ssZ\\\" (e.g. 2018-02-10T20:40:00+02:00) ")
 /**
   * Estimated time, in case of delay or other modification. Local date and time with the following format \\\"yyyy-MM-dd'T'HH:mm:ssZ\\\" (e.g. 2018-02-10T20:40:00+02:00) 
  **/
  private LocalDateTime estimatedDateTime = null;
 /**
   * IATA airport code
   * @return locationCode
  **/
  @JsonProperty("locationCode")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public FlightBasicEndPoint locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

 /**
   * Local date and time with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return dateTime
  **/
  @JsonProperty("dateTime")
  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public FlightBasicEndPoint dateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

 /**
   * Estimated time, in case of delay or other modification. Local date and time with the following format \\\&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\\\&quot; (e.g. 2018-02-10T20:40:00+02:00) 
   * @return estimatedDateTime
  **/
  @JsonProperty("estimatedDateTime")
  public LocalDateTime getEstimatedDateTime() {
    return estimatedDateTime;
  }

  public void setEstimatedDateTime(LocalDateTime estimatedDateTime) {
    this.estimatedDateTime = estimatedDateTime;
  }

  public FlightBasicEndPoint estimatedDateTime(LocalDateTime estimatedDateTime) {
    this.estimatedDateTime = estimatedDateTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightBasicEndPoint {\n");
    
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    estimatedDateTime: ").append(toIndentedString(estimatedDateTime)).append("\n");
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

