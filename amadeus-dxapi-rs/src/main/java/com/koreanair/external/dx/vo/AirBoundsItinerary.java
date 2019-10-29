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
  * Description of an itinerary subject of the air bounds search. It is a bound itinerary. To perform a return journey search, two itineraries will be required, one itinerary for each bound.
 **/
@ApiModel(description="Description of an itinerary subject of the air bounds search. It is a bound itinerary. To perform a return journey search, two itineraries will be required, one itinerary for each bound.")
public class AirBoundsItinerary  {
  
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

  @ApiModelProperty(value = "Commercial fare families to be used for the choosen bound. Must not be provided along with commercial fare families for the entire trip at itinerary level. ")
 /**
   * Commercial fare families to be used for the choosen bound. Must not be provided along with commercial fare families for the entire trip at itinerary level. 
  **/
  private List<String> commercialFareFamilies = null;

  @ApiModelProperty(value = "This defines which bound needs to searched for the bound-by-bound search, in the given itinerary. ")
 /**
   * This defines which bound needs to searched for the bound-by-bound search, in the given itinerary. 
  **/
  private Boolean isRequestedBound = null;

  @ApiModelProperty(value = "Stop over for the bound")
 /**
   * Stop over for the bound
  **/
  private StopOver stopOver = null;
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

  public AirBoundsItinerary originLocationCode(String originLocationCode) {
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

  public AirBoundsItinerary destinationLocationCode(String destinationLocationCode) {
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

  public AirBoundsItinerary departureDateTime(LocalDateTime departureDateTime) {
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

  public AirBoundsItinerary departureTimeWindow(Integer departureTimeWindow) {
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

  public AirBoundsItinerary directFlights(Boolean directFlights) {
    this.directFlights = directFlights;
    return this;
  }

 /**
   * Commercial fare families to be used for the choosen bound. Must not be provided along with commercial fare families for the entire trip at itinerary level. 
   * @return commercialFareFamilies
  **/
  @JsonProperty("commercialFareFamilies")
  public List<String> getCommercialFareFamilies() {
    return commercialFareFamilies;
  }

  public void setCommercialFareFamilies(List<String> commercialFareFamilies) {
    this.commercialFareFamilies = commercialFareFamilies;
  }

  public AirBoundsItinerary commercialFareFamilies(List<String> commercialFareFamilies) {
    this.commercialFareFamilies = commercialFareFamilies;
    return this;
  }

  public AirBoundsItinerary addCommercialFareFamiliesItem(String commercialFareFamiliesItem) {
    this.commercialFareFamilies.add(commercialFareFamiliesItem);
    return this;
  }

 /**
   * This defines which bound needs to searched for the bound-by-bound search, in the given itinerary. 
   * @return isRequestedBound
  **/
  @JsonProperty("isRequestedBound")
  public Boolean isIsRequestedBound() {
    return isRequestedBound;
  }

  public void setIsRequestedBound(Boolean isRequestedBound) {
    this.isRequestedBound = isRequestedBound;
  }

  public AirBoundsItinerary isRequestedBound(Boolean isRequestedBound) {
    this.isRequestedBound = isRequestedBound;
    return this;
  }

 /**
   * Stop over for the bound
   * @return stopOver
  **/
  @JsonProperty("stopOver")
  public StopOver getStopOver() {
    return stopOver;
  }

  public void setStopOver(StopOver stopOver) {
    this.stopOver = stopOver;
  }

  public AirBoundsItinerary stopOver(StopOver stopOver) {
    this.stopOver = stopOver;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBoundsItinerary {\n");
    
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    departureTimeWindow: ").append(toIndentedString(departureTimeWindow)).append("\n");
    sb.append("    directFlights: ").append(toIndentedString(directFlights)).append("\n");
    sb.append("    commercialFareFamilies: ").append(toIndentedString(commercialFareFamilies)).append("\n");
    sb.append("    isRequestedBound: ").append(toIndentedString(isRequestedBound)).append("\n");
    sb.append("    stopOver: ").append(toIndentedString(stopOver)).append("\n");
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

