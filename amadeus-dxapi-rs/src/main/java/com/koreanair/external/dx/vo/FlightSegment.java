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
  * Details for one of the flight segment for a given flight's proposal.
 **/
@ApiModel(description="Details for one of the flight segment for a given flight's proposal.")
public class FlightSegment  {
  
  @ApiModelProperty(required = true, value = "Flight id, as defined in flights dictionary")
 /**
   * Flight id, as defined in flights dictionary
  **/
  private String flightId = null;

  @ApiModelProperty(value = "In case of flight connection, it expresses the waiting time until the next flight. Duration expressed in seconds")
 /**
   * In case of flight connection, it expresses the waiting time until the next flight. Duration expressed in seconds
  **/
  private Integer connectionTime = null;

  @ApiModelProperty(value = "Order id created on the airline reservation system for the airline of that flight. It could be for example the reservation number created on the PSS of the airline when the airline is not on Altea.")
 /**
   * Order id created on the airline reservation system for the airline of that flight. It could be for example the reservation number created on the PSS of the airline when the airline is not on Altea.
  **/
  private String airlineOrderId = null;

  @ApiModelProperty(value = "Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as departure days difference means the flight will take off '2' days later than first flight took off. ")
 /**
   * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as departure days difference means the flight will take off '2' days later than first flight took off. 
  **/
  private Integer departureDaysDifference = null;

  @ApiModelProperty(value = "Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as arrival days difference means the flight will take off '2' days later than first flight took off. ")
 /**
   * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. 'Example: +2' as arrival days difference means the flight will take off '2' days later than first flight took off. 
  **/
  private Integer arrivalDaysDifference = null;
 /**
   * Flight id, as defined in flights dictionary
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public FlightSegment flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * In case of flight connection, it expresses the waiting time until the next flight. Duration expressed in seconds
   * @return connectionTime
  **/
  @JsonProperty("connectionTime")
  public Integer getConnectionTime() {
    return connectionTime;
  }

  public void setConnectionTime(Integer connectionTime) {
    this.connectionTime = connectionTime;
  }

  public FlightSegment connectionTime(Integer connectionTime) {
    this.connectionTime = connectionTime;
    return this;
  }

 /**
   * Order id created on the airline reservation system for the airline of that flight. It could be for example the reservation number created on the PSS of the airline when the airline is not on Altea.
   * @return airlineOrderId
  **/
  @JsonProperty("airlineOrderId")
  public String getAirlineOrderId() {
    return airlineOrderId;
  }

  public void setAirlineOrderId(String airlineOrderId) {
    this.airlineOrderId = airlineOrderId;
  }

  public FlightSegment airlineOrderId(String airlineOrderId) {
    this.airlineOrderId = airlineOrderId;
    return this;
  }

 /**
   * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. &#39;Example: +2&#39; as departure days difference means the flight will take off &#39;2&#39; days later than first flight took off. 
   * @return departureDaysDifference
  **/
  @JsonProperty("departureDaysDifference")
  public Integer getDepartureDaysDifference() {
    return departureDaysDifference;
  }

  public void setDepartureDaysDifference(Integer departureDaysDifference) {
    this.departureDaysDifference = departureDaysDifference;
  }

  public FlightSegment departureDaysDifference(Integer departureDaysDifference) {
    this.departureDaysDifference = departureDaysDifference;
    return this;
  }

 /**
   * Number of days difference compared to the departure time of the first flight of the bound. Information computed considering the local date and returned only if dates not referring to the same day. &#39;Example: +2&#39; as arrival days difference means the flight will take off &#39;2&#39; days later than first flight took off. 
   * @return arrivalDaysDifference
  **/
  @JsonProperty("arrivalDaysDifference")
  public Integer getArrivalDaysDifference() {
    return arrivalDaysDifference;
  }

  public void setArrivalDaysDifference(Integer arrivalDaysDifference) {
    this.arrivalDaysDifference = arrivalDaysDifference;
  }

  public FlightSegment arrivalDaysDifference(Integer arrivalDaysDifference) {
    this.arrivalDaysDifference = arrivalDaysDifference;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightSegment {\n");
    
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    connectionTime: ").append(toIndentedString(connectionTime)).append("\n");
    sb.append("    airlineOrderId: ").append(toIndentedString(airlineOrderId)).append("\n");
    sb.append("    departureDaysDifference: ").append(toIndentedString(departureDaysDifference)).append("\n");
    sb.append("    arrivalDaysDifference: ").append(toIndentedString(arrivalDaysDifference)).append("\n");
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

