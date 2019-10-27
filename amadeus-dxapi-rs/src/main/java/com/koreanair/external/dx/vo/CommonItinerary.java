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
  * Description of an common itinerary subject of the search
 **/
@ApiModel(description="Description of an common itinerary subject of the search")
public class CommonItinerary  {
  
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

  public CommonItinerary originLocationCode(String originLocationCode) {
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

  public CommonItinerary destinationLocationCode(String destinationLocationCode) {
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

  public CommonItinerary departureDateTime(LocalDateTime departureDateTime) {
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

  public CommonItinerary departureTimeWindow(Integer departureTimeWindow) {
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

  public CommonItinerary directFlights(Boolean directFlights) {
    this.directFlights = directFlights;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonItinerary {\n");
    
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
    sb.append("    departureDateTime: ").append(toIndentedString(departureDateTime)).append("\n");
    sb.append("    departureTimeWindow: ").append(toIndentedString(departureTimeWindow)).append("\n");
    sb.append("    directFlights: ").append(toIndentedString(directFlights)).append("\n");
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

