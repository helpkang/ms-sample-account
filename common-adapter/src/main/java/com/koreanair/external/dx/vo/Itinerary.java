package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CommonItinerary;
import com.koreanair.external.dx.vo.StopOver;
import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;
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
  * Description of an itinerary subject of the search
 **/
@ApiModel(description="Description of an itinerary subject of the search")
public class Itinerary  {
  
  @ApiModelProperty(value = "Departure location code of outbound (city or airport code)")
 /**
   * Departure location code of outbound (city or airport code)
  **/
  private String originLocationCode = null;

  @ApiModelProperty(value = "Destination location code (city or airport code) for the outbound, in case of a round trip this is also the departure location code of second bound")
 /**
   * Destination location code (city or airport code) for the outbound, in case of a round trip this is also the departure location code of second bound
  **/
  private String destinationLocationCode = null;

  @ApiModelProperty(value = "Departure date and time of the outbound (first departure flight) in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]. It specifies date and hours of the search (eg. 2017-11-10T10:21:00) ")
 /**
   * Departure date and time of the outbound (first departure flight) in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]. It specifies date and hours of the search (eg. 2017-11-10T10:21:00) 
  **/
  private LocalDateTime departureDateTime = null;

  @ApiModelProperty(value = "\"Time window in hours for the outbound (first flight). E.g: departureTimeWindow=2 means from 2 hours before, until 2 hours after the departure time. The value 0 is considered as there is no time window.\" ")
 /**
   * \"Time window in hours for the outbound (first flight). E.g: departureTimeWindow=2 means from 2 hours before, until 2 hours after the departure time. The value 0 is considered as there is no time window.\" 
  **/
  private Integer departureTimeWindow = null;

  @ApiModelProperty(value = "Search only for direct (without connections) flight proposals.")
 /**
   * Search only for direct (without connections) flight proposals.
  **/
  private Boolean directFlights = false;

  @ApiModelProperty(value = "Return date and time for the inbound (first return flight) in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]. It specifies date and hours of the search (eg. 2017-11-10T10:21:00) ")
 /**
   * Return date and time for the inbound (first return flight) in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]. It specifies date and hours of the search (eg. 2017-11-10T10:21:00) 
  **/
  private LocalDateTime returnDateTime = null;

  @ApiModelProperty(value = "Commercial fare families to be used for outbound. Must be provided along with returnCommercialFareFamilies in case of RoundTrip. Must not be provided along with commercial fare families for the entire trip at itinerary level. ")
 /**
   * Commercial fare families to be used for outbound. Must be provided along with returnCommercialFareFamilies in case of RoundTrip. Must not be provided along with commercial fare families for the entire trip at itinerary level. 
  **/
  private List<String> departureCommercialFareFamilies = null;

  @ApiModelProperty(value = "Commercial fare families to be used for inbound. Must be provided along with departureCommercialFareFamilies in case of RoundTrip. Must not be provided along with commercialFareFamilies for the entire trip at itinerary level. ")
 /**
   * Commercial fare families to be used for inbound. Must be provided along with departureCommercialFareFamilies in case of RoundTrip. Must not be provided along with commercialFareFamilies for the entire trip at itinerary level. 
  **/
  private List<String> returnCommercialFareFamilies = null;

  @ApiModelProperty(value = "\"Time window for the return trip or continuation of an open-jaw. E.g: A returnTimeWindow=2 means from 2 hours before, until 2 hours after the return time. The value 0 is considered as there is no time window.\" ")
 /**
   * \"Time window for the return trip or continuation of an open-jaw. E.g: A returnTimeWindow=2 means from 2 hours before, until 2 hours after the return time. The value 0 is considered as there is no time window.\" 
  **/
  private Integer returnTimeWindow = null;

  @ApiModelProperty(value = "Stop over for the outbound. It could be applied only for one-way or round trips")
 /**
   * Stop over for the outbound. It could be applied only for one-way or round trips
  **/
  private StopOver departureStopOver = null;

  @ApiModelProperty(value = "Stop over for the inbound in case of round trip")
 /**
   * Stop over for the inbound in case of round trip
  **/
  private StopOver returnStopOver = null;
 /**
   * Departure location code of outbound (city or airport code)
   * @return originLocationCode
  **/
  @JsonProperty("originLocationCode")
  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public Itinerary originLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
    return this;
  }

 /**
   * Destination location code (city or airport code) for the outbound, in case of a round trip this is also the departure location code of second bound
   * @return destinationLocationCode
  **/
  @JsonProperty("destinationLocationCode")
  public String getDestinationLocationCode() {
    return destinationLocationCode;
  }

  public void setDestinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
  }

  public Itinerary destinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
    return this;
  }

 /**
   * Departure date and time of the outbound (first departure flight) in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]. It specifies date and hours of the search (eg. 2017-11-10T10:21:00) 
   * @return departureDateTime
  **/
  @JsonProperty("departureDateTime")
  public LocalDateTime getDepartureDateTime() {
    return departureDateTime;
  }

  public void setDepartureDateTime(LocalDateTime departureDateTime) {
    this.departureDateTime = departureDateTime;
  }

  public Itinerary departureDateTime(LocalDateTime departureDateTime) {
    this.departureDateTime = departureDateTime;
    return this;
  }

 /**
   * \&quot;Time window in hours for the outbound (first flight). E.g: departureTimeWindow&#x3D;2 means from 2 hours before, until 2 hours after the departure time. The value 0 is considered as there is no time window.\&quot; 
   * minimum: 0
   * maximum: 12
   * @return departureTimeWindow
  **/
  @JsonProperty("departureTimeWindow")
  public Integer getDepartureTimeWindow() {
    return departureTimeWindow;
  }

  public void setDepartureTimeWindow(Integer departureTimeWindow) {
    this.departureTimeWindow = departureTimeWindow;
  }

  public Itinerary departureTimeWindow(Integer departureTimeWindow) {
    this.departureTimeWindow = departureTimeWindow;
    return this;
  }

 /**
   * Search only for direct (without connections) flight proposals.
   * @return directFlights
  **/
  @JsonProperty("directFlights")
  public Boolean isDirectFlights() {
    return directFlights;
  }

  public void setDirectFlights(Boolean directFlights) {
    this.directFlights = directFlights;
  }

  public Itinerary directFlights(Boolean directFlights) {
    this.directFlights = directFlights;
    return this;
  }

 /**
   * Return date and time for the inbound (first return flight) in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]. It specifies date and hours of the search (eg. 2017-11-10T10:21:00) 
   * @return returnDateTime
  **/
  @JsonProperty("returnDateTime")
  public LocalDateTime getReturnDateTime() {
    return returnDateTime;
  }

  public void setReturnDateTime(LocalDateTime returnDateTime) {
    this.returnDateTime = returnDateTime;
  }

  public Itinerary returnDateTime(LocalDateTime returnDateTime) {
    this.returnDateTime = returnDateTime;
    return this;
  }

 /**
   * Commercial fare families to be used for outbound. Must be provided along with returnCommercialFareFamilies in case of RoundTrip. Must not be provided along with commercial fare families for the entire trip at itinerary level. 
   * @return departureCommercialFareFamilies
  **/
  @JsonProperty("departureCommercialFareFamilies")
  public List<String> getDepartureCommercialFareFamilies() {
    return departureCommercialFareFamilies;
  }

  public void setDepartureCommercialFareFamilies(List<String> departureCommercialFareFamilies) {
    this.departureCommercialFareFamilies = departureCommercialFareFamilies;
  }

  public Itinerary departureCommercialFareFamilies(List<String> departureCommercialFareFamilies) {
    this.departureCommercialFareFamilies = departureCommercialFareFamilies;
    return this;
  }

  public Itinerary addDepartureCommercialFareFamiliesItem(String departureCommercialFareFamiliesItem) {
    this.departureCommercialFareFamilies.add(departureCommercialFareFamiliesItem);
    return this;
  }

 /**
   * Commercial fare families to be used for inbound. Must be provided along with departureCommercialFareFamilies in case of RoundTrip. Must not be provided along with commercialFareFamilies for the entire trip at itinerary level. 
   * @return returnCommercialFareFamilies
  **/
  @JsonProperty("returnCommercialFareFamilies")
  public List<String> getReturnCommercialFareFamilies() {
    return returnCommercialFareFamilies;
  }

  public void setReturnCommercialFareFamilies(List<String> returnCommercialFareFamilies) {
    this.returnCommercialFareFamilies = returnCommercialFareFamilies;
  }

  public Itinerary returnCommercialFareFamilies(List<String> returnCommercialFareFamilies) {
    this.returnCommercialFareFamilies = returnCommercialFareFamilies;
    return this;
  }

  public Itinerary addReturnCommercialFareFamiliesItem(String returnCommercialFareFamiliesItem) {
    this.returnCommercialFareFamilies.add(returnCommercialFareFamiliesItem);
    return this;
  }

 /**
   * \&quot;Time window for the return trip or continuation of an open-jaw. E.g: A returnTimeWindow&#x3D;2 means from 2 hours before, until 2 hours after the return time. The value 0 is considered as there is no time window.\&quot; 
   * minimum: 0
   * maximum: 12
   * @return returnTimeWindow
  **/
  @JsonProperty("returnTimeWindow")
  public Integer getReturnTimeWindow() {
    return returnTimeWindow;
  }

  public void setReturnTimeWindow(Integer returnTimeWindow) {
    this.returnTimeWindow = returnTimeWindow;
  }

  public Itinerary returnTimeWindow(Integer returnTimeWindow) {
    this.returnTimeWindow = returnTimeWindow;
    return this;
  }

 /**
   * Stop over for the outbound. It could be applied only for one-way or round trips
   * @return departureStopOver
  **/
  @JsonProperty("departureStopOver")
  public StopOver getDepartureStopOver() {
    return departureStopOver;
  }

  public void setDepartureStopOver(StopOver departureStopOver) {
    this.departureStopOver = departureStopOver;
  }

  public Itinerary departureStopOver(StopOver departureStopOver) {
    this.departureStopOver = departureStopOver;
    return this;
  }

 /**
   * Stop over for the inbound in case of round trip
   * @return returnStopOver
  **/
  @JsonProperty("returnStopOver")
  public StopOver getReturnStopOver() {
    return returnStopOver;
  }

  public void setReturnStopOver(StopOver returnStopOver) {
    this.returnStopOver = returnStopOver;
  }

  public Itinerary returnStopOver(StopOver returnStopOver) {
    this.returnStopOver = returnStopOver;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Itinerary {\n");
    
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    departureTimeWindow: ").append(toIndentedString(departureTimeWindow)).append("\n");
    sb.append("    directFlights: ").append(toIndentedString(directFlights)).append("\n");
    sb.append("    returnDateTime: ").append(toIndentedString(returnDateTime)).append("\n");
    sb.append("    departureCommercialFareFamilies: ").append(toIndentedString(departureCommercialFareFamilies)).append("\n");
    sb.append("    returnCommercialFareFamilies: ").append(toIndentedString(returnCommercialFareFamilies)).append("\n");
    sb.append("    returnTimeWindow: ").append(toIndentedString(returnTimeWindow)).append("\n");
    sb.append("    departureStopOver: ").append(toIndentedString(departureStopOver)).append("\n");
    sb.append("    returnStopOver: ").append(toIndentedString(returnStopOver)).append("\n");
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

