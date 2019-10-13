package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightItem;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * A bound corresponds to one or a group of flights. Only flight reference ids are provided: for the full flight content please refer to the flightDictionary
 **/
@ApiModel(description="A bound corresponds to one or a group of flights. Only flight reference ids are provided: for the full flight content please refer to the flightDictionary")
public class AirBound  {
  
  @ApiModelProperty(required = true, value = "Flights, and for each flight, associated services")
 /**
   * Flights, and for each flight, associated services
  **/
  private List<FlightItem> flights = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Departure location (airport code) of the flight bound")
 /**
   * Departure location (airport code) of the flight bound
  **/
  private String originLocationCode = null;

  @ApiModelProperty(required = true, value = "Arrival location (airport code) of the flight bound")
 /**
   * Arrival location (airport code) of the flight bound
  **/
  private String destinationLocationCode = null;

  @ApiModelProperty(value = "Duration of the entire bound expressed in seconds")
 /**
   * Duration of the entire bound expressed in seconds
  **/
  private Integer duration = null;
 /**
   * Flights, and for each flight, associated services
   * @return flights
  **/
  @JsonProperty("flights")
  public List<FlightItem> getFlights() {
    return flights;
  }

  public void setFlights(List<FlightItem> flights) {
    this.flights = flights;
  }

  public AirBound flights(List<FlightItem> flights) {
    this.flights = flights;
    return this;
  }

  public AirBound addFlightsItem(FlightItem flightsItem) {
    this.flights.add(flightsItem);
    return this;
  }

 /**
   * Departure location (airport code) of the flight bound
   * @return originLocationCode
  **/
  @JsonProperty("originLocationCode")
  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public AirBound originLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
    return this;
  }

 /**
   * Arrival location (airport code) of the flight bound
   * @return destinationLocationCode
  **/
  @JsonProperty("destinationLocationCode")
  public String getDestinationLocationCode() {
    return destinationLocationCode;
  }

  public void setDestinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
  }

  public AirBound destinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
    return this;
  }

 /**
   * Duration of the entire bound expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public AirBound duration(Integer duration) {
    this.duration = duration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBound {\n");
    
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
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

