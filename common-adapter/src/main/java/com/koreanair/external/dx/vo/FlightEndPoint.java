package com.koreanair.external.dx.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class FlightEndPoint  {

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

  @ApiModelProperty(value = "Terminal number")
 /**
   * Terminal number
  **/
  private String terminal = null;
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

  public FlightEndPoint locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

 /**
   * Local date and time with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return dateTime
  **/
  @JsonProperty("dateTime")
  @JsonFormat(pattern ="yyyy-MM-dd'T'HH:mm:ss.SSS[xxx][xx][X]")
  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public FlightEndPoint dateTime(LocalDateTime dateTime) {
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

  public FlightEndPoint estimatedDateTime(LocalDateTime estimatedDateTime) {
    this.estimatedDateTime = estimatedDateTime;
    return this;
  }

 /**
   * Terminal number
   * @return terminal
  **/
  @JsonProperty("terminal")
  public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  public FlightEndPoint terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightEndPoint {\n");

    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    estimatedDateTime: ").append(toIndentedString(estimatedDateTime)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

