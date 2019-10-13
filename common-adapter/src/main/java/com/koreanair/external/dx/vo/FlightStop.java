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
  * Details of stops for direct or change of gauge flights
 **/
@ApiModel(description="Details of stops for direct or change of gauge flights")
public class FlightStop  {
  
  @ApiModelProperty(value = "Flight will stop at this location")
 /**
   * Flight will stop at this location
  **/
  private String locationCode = null;

  @ApiModelProperty(value = "Flight will stop at this terminal")
 /**
   * Flight will stop at this terminal
  **/
  private String departureTerminal = null;

  @ApiModelProperty(value = "Stop duration expressed in seconds")
 /**
   * Stop duration expressed in seconds
  **/
  private Integer duration = null;

  @ApiModelProperty(value = "Type of stop")
 /**
   * Type of stop
  **/
  private Boolean isChangeOfGauge = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Arrival at the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Arrival at the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime arrivalDateTime = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Departure from the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Departure from the stop with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime departureDateTime = null;

  @ApiModelProperty(value = "IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php). Specified if a change of gauge (with change of aircraft) occurs")
 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php). Specified if a change of gauge (with change of aircraft) occurs
  **/
  private String aircraftCode = null;
 /**
   * Flight will stop at this location
   * @return locationCode
  **/
  @JsonProperty("locationCode")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public FlightStop locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

 /**
   * Flight will stop at this terminal
   * @return departureTerminal
  **/
  @JsonProperty("departureTerminal")
  public String getDepartureTerminal() {
    return departureTerminal;
  }

  public void setDepartureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
  }

  public FlightStop departureTerminal(String departureTerminal) {
    this.departureTerminal = departureTerminal;
    return this;
  }

 /**
   * Stop duration expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public FlightStop duration(Integer duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Type of stop
   * @return isChangeOfGauge
  **/
  @JsonProperty("isChangeOfGauge")
  public Boolean isIsChangeOfGauge() {
    return isChangeOfGauge;
  }

  public void setIsChangeOfGauge(Boolean isChangeOfGauge) {
    this.isChangeOfGauge = isChangeOfGauge;
  }

  public FlightStop isChangeOfGauge(Boolean isChangeOfGauge) {
    this.isChangeOfGauge = isChangeOfGauge;
    return this;
  }

 /**
   * Arrival at the stop with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return arrivalDateTime
  **/
  @JsonProperty("arrivalDateTime")
  public LocalDateTime getArrivalDateTime() {
    return arrivalDateTime;
  }

  public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
  }

  public FlightStop arrivalDateTime(LocalDateTime arrivalDateTime) {
    this.arrivalDateTime = arrivalDateTime;
    return this;
  }

 /**
   * Departure from the stop with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return departureDateTime
  **/
  @JsonProperty("departureDateTime")
  public LocalDateTime getDepartureDateTime() {
    return departureDateTime;
  }

  public void setDepartureDateTime(LocalDateTime departureDateTime) {
    this.departureDateTime = departureDateTime;
  }

  public FlightStop departureDateTime(LocalDateTime departureDateTime) {
    this.departureDateTime = departureDateTime;
    return this;
  }

 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php). Specified if a change of gauge (with change of aircraft) occurs
   * @return aircraftCode
  **/
  @JsonProperty("aircraftCode")
  public String getAircraftCode() {
    return aircraftCode;
  }

  public void setAircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
  }

  public FlightStop aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightStop {\n");
    
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    departureTerminal: ").append(toIndentedString(departureTerminal)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    isChangeOfGauge: ").append(toIndentedString(isChangeOfGauge)).append("\n");
    sb.append("    arrivalDateTime: ").append(toIndentedString(arrivalDateTime)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
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

