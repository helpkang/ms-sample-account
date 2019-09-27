package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightDelay;
import com.koreanair.external.dx.vo.FlightEndPoint;
import com.koreanair.external.dx.vo.FlightInformationArrivalTimings;
import com.koreanair.external.dx.vo.FlightInformationDiversionAirport;
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

public class FlightInformationArrivalEndPoint  {
  
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

  @ApiModelProperty(value = "")
  private FlightInformationArrivalTimings timings = null;

  @ApiModelProperty(value = "")
  private FlightInformationDiversionAirport diversion = null;


@XmlType(name="FlightStatusEnum")
@XmlEnum(String.class)
public enum FlightStatusEnum {

@XmlEnumValue("scheduled") SCHEDULED(String.valueOf("scheduled")), @XmlEnumValue("departed") DEPARTED(String.valueOf("departed")), @XmlEnumValue("cancelled") CANCELLED(String.valueOf("cancelled")), @XmlEnumValue("delayed") DELAYED(String.valueOf("delayed")), @XmlEnumValue("arrived") ARRIVED(String.valueOf("arrived")), @XmlEnumValue("landingCancelled") LANDINGCANCELLED(String.valueOf("landingCancelled")), @XmlEnumValue("diverted") DIVERTED(String.valueOf("diverted"));


    private String value;

    FlightStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static FlightStatusEnum fromValue(String v) {
        for (FlightStatusEnum b : FlightStatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(required = true, value = "status of the flight")
 /**
   * status of the flight
  **/
  private FlightStatusEnum flightStatus = null;

  @ApiModelProperty(value = "")
  private FlightDelay flightDelay = null;
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

  public FlightInformationArrivalEndPoint locationCode(String locationCode) {
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

  public FlightInformationArrivalEndPoint dateTime(LocalDateTime dateTime) {
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

  public FlightInformationArrivalEndPoint estimatedDateTime(LocalDateTime estimatedDateTime) {
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

  public FlightInformationArrivalEndPoint terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

 /**
   * Get timings
   * @return timings
  **/
  @JsonProperty("timings")
  public FlightInformationArrivalTimings getTimings() {
    return timings;
  }

  public void setTimings(FlightInformationArrivalTimings timings) {
    this.timings = timings;
  }

  public FlightInformationArrivalEndPoint timings(FlightInformationArrivalTimings timings) {
    this.timings = timings;
    return this;
  }

 /**
   * Get diversion
   * @return diversion
  **/
  @JsonProperty("diversion")
  public FlightInformationDiversionAirport getDiversion() {
    return diversion;
  }

  public void setDiversion(FlightInformationDiversionAirport diversion) {
    this.diversion = diversion;
  }

  public FlightInformationArrivalEndPoint diversion(FlightInformationDiversionAirport diversion) {
    this.diversion = diversion;
    return this;
  }

 /**
   * status of the flight
   * @return flightStatus
  **/
  @JsonProperty("flightStatus")
  public String getFlightStatus() {
    if (flightStatus == null) {
      return null;
    }
    return flightStatus.value();
  }

  public void setFlightStatus(FlightStatusEnum flightStatus) {
    this.flightStatus = flightStatus;
  }

  public FlightInformationArrivalEndPoint flightStatus(FlightStatusEnum flightStatus) {
    this.flightStatus = flightStatus;
    return this;
  }

 /**
   * Get flightDelay
   * @return flightDelay
  **/
  @JsonProperty("flightDelay")
  public FlightDelay getFlightDelay() {
    return flightDelay;
  }

  public void setFlightDelay(FlightDelay flightDelay) {
    this.flightDelay = flightDelay;
  }

  public FlightInformationArrivalEndPoint flightDelay(FlightDelay flightDelay) {
    this.flightDelay = flightDelay;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformationArrivalEndPoint {\n");
    
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    estimatedDateTime: ").append(toIndentedString(estimatedDateTime)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("    diversion: ").append(toIndentedString(diversion)).append("\n");
    sb.append("    flightStatus: ").append(toIndentedString(flightStatus)).append("\n");
    sb.append("    flightDelay: ").append(toIndentedString(flightDelay)).append("\n");
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

