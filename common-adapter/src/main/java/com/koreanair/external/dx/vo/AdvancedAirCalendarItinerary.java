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
  * Description of an itinerary subject of an advanced air calendar search
 **/
@ApiModel(description="Description of an itinerary subject of an advanced air calendar search")
public class AdvancedAirCalendarItinerary  {
  
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

  @ApiModelProperty(value = "Flexibility in days for the outbound (first flight) or inbound (return). Flexibility = 3 means +/- 3 days. If not specified the default value of +/-3 days is taken into account. E.g departure date 13NOV, return date 23NOV and flexibility 3 : the response will contain travel solutions with [10NOV-16NOV] for departure range and [20NOV-26NOV] for arrival range.")
 /**
   * Flexibility in days for the outbound (first flight) or inbound (return). Flexibility = 3 means +/- 3 days. If not specified the default value of +/-3 days is taken into account. E.g departure date 13NOV, return date 23NOV and flexibility 3 : the response will contain travel solutions with [10NOV-16NOV] for departure range and [20NOV-26NOV] for arrival range.
  **/
  private Integer flexibility = null;

  @ApiModelProperty(value = "Stop over for the bound.")
 /**
   * Stop over for the bound.
  **/
  private StopOver stopOver = null;

  @ApiModelProperty(value = "Commercial fare families to be used for the choosen bound. Must not be provided along with commercial fare families for the entire trip at itinerary level. ")
 /**
   * Commercial fare families to be used for the choosen bound. Must not be provided along with commercial fare families for the entire trip at itinerary level. 
  **/
  private List<String> commercialFareFamilies = null;
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

  public AdvancedAirCalendarItinerary originLocationCode(String originLocationCode) {
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

  public AdvancedAirCalendarItinerary destinationLocationCode(String destinationLocationCode) {
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

  public AdvancedAirCalendarItinerary departureDateTime(LocalDateTime departureDateTime) {
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

  public AdvancedAirCalendarItinerary departureTimeWindow(Integer departureTimeWindow) {
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

  public AdvancedAirCalendarItinerary directFlights(Boolean directFlights) {
    this.directFlights = directFlights;
    return this;
  }

 /**
   * Flexibility in days for the outbound (first flight) or inbound (return). Flexibility &#x3D; 3 means +/- 3 days. If not specified the default value of +/-3 days is taken into account. E.g departure date 13NOV, return date 23NOV and flexibility 3 : the response will contain travel solutions with [10NOV-16NOV] for departure range and [20NOV-26NOV] for arrival range.
   * minimum: 1
   * @return flexibility
  **/
  @JsonProperty("flexibility")
  public Integer getFlexibility() {
    return flexibility;
  }

  public void setFlexibility(Integer flexibility) {
    this.flexibility = flexibility;
  }

  public AdvancedAirCalendarItinerary flexibility(Integer flexibility) {
    this.flexibility = flexibility;
    return this;
  }

 /**
   * Stop over for the bound.
   * @return stopOver
  **/
  @JsonProperty("stopOver")
  public StopOver getStopOver() {
    return stopOver;
  }

  public void setStopOver(StopOver stopOver) {
    this.stopOver = stopOver;
  }

  public AdvancedAirCalendarItinerary stopOver(StopOver stopOver) {
    this.stopOver = stopOver;
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

  public AdvancedAirCalendarItinerary commercialFareFamilies(List<String> commercialFareFamilies) {
    this.commercialFareFamilies = commercialFareFamilies;
    return this;
  }

  public AdvancedAirCalendarItinerary addCommercialFareFamiliesItem(String commercialFareFamiliesItem) {
    this.commercialFareFamilies.add(commercialFareFamiliesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAirCalendarItinerary {\n");
    
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    departureTimeWindow: ").append(toIndentedString(departureTimeWindow)).append("\n");
    sb.append("    directFlights: ").append(toIndentedString(directFlights)).append("\n");
    sb.append("    flexibility: ").append(toIndentedString(flexibility)).append("\n");
    sb.append("    stopOver: ").append(toIndentedString(stopOver)).append("\n");
    sb.append("    commercialFareFamilies: ").append(toIndentedString(commercialFareFamilies)).append("\n");
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

