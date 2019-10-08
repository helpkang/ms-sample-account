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
  * Contains information related to bound endpoint after the disruption.
 **/
@ApiModel(description="Contains information related to bound endpoint after the disruption.")
public class DisruptionEndPoint  {
  
  @ApiModelProperty(required = true, value = "Location (airport code) of the original bound endpoint")
 /**
   * Location (airport code) of the original bound endpoint
  **/
  private String locationCode = null;

  @ApiModelProperty(value = "Indicates, if after disruption, the aiport of the current end point is the same than the original end point")
 /**
   * Indicates, if after disruption, the aiport of the current end point is the same than the original end point
  **/
  private Boolean sameAirport = null;

  @ApiModelProperty(value = "Indicates, if after disruption, the city of the current end point is the same than the original end point")
 /**
   * Indicates, if after disruption, the city of the current end point is the same than the original end point
  **/
  private Boolean sameCity = null;

  @ApiModelProperty(value = "Boolean to indicate if the passenger travels the same day before and after the disruption")
 /**
   * Boolean to indicate if the passenger travels the same day before and after the disruption
  **/
  private Boolean sameDay = null;

  @ApiModelProperty(value = "Difference in seconds between the time of the current trip and the original trip. If the duration is positive, the time of the current trip is after the original trip.")
 /**
   * Difference in seconds between the time of the current trip and the original trip. If the duration is positive, the time of the current trip is after the original trip.
  **/
  private Integer deltaTime = null;
 /**
   * Location (airport code) of the original bound endpoint
   * @return locationCode
  **/
  @JsonProperty("locationCode")
  public String getLocationCode() {
    return locationCode;
  }

  public void setLocationCode(String locationCode) {
    this.locationCode = locationCode;
  }

  public DisruptionEndPoint locationCode(String locationCode) {
    this.locationCode = locationCode;
    return this;
  }

 /**
   * Indicates, if after disruption, the aiport of the current end point is the same than the original end point
   * @return sameAirport
  **/
  @JsonProperty("sameAirport")
  public Boolean isSameAirport() {
    return sameAirport;
  }

  public void setSameAirport(Boolean sameAirport) {
    this.sameAirport = sameAirport;
  }

  public DisruptionEndPoint sameAirport(Boolean sameAirport) {
    this.sameAirport = sameAirport;
    return this;
  }

 /**
   * Indicates, if after disruption, the city of the current end point is the same than the original end point
   * @return sameCity
  **/
  @JsonProperty("sameCity")
  public Boolean isSameCity() {
    return sameCity;
  }

  public void setSameCity(Boolean sameCity) {
    this.sameCity = sameCity;
  }

  public DisruptionEndPoint sameCity(Boolean sameCity) {
    this.sameCity = sameCity;
    return this;
  }

 /**
   * Boolean to indicate if the passenger travels the same day before and after the disruption
   * @return sameDay
  **/
  @JsonProperty("sameDay")
  public Boolean isSameDay() {
    return sameDay;
  }

  public void setSameDay(Boolean sameDay) {
    this.sameDay = sameDay;
  }

  public DisruptionEndPoint sameDay(Boolean sameDay) {
    this.sameDay = sameDay;
    return this;
  }

 /**
   * Difference in seconds between the time of the current trip and the original trip. If the duration is positive, the time of the current trip is after the original trip.
   * @return deltaTime
  **/
  @JsonProperty("deltaTime")
  public Integer getDeltaTime() {
    return deltaTime;
  }

  public void setDeltaTime(Integer deltaTime) {
    this.deltaTime = deltaTime;
  }

  public DisruptionEndPoint deltaTime(Integer deltaTime) {
    this.deltaTime = deltaTime;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisruptionEndPoint {\n");
    
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    sameAirport: ").append(toIndentedString(sameAirport)).append("\n");
    sb.append("    sameCity: ").append(toIndentedString(sameCity)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
    sb.append("    deltaTime: ").append(toIndentedString(deltaTime)).append("\n");
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

