package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.DisruptionConnection;
import com.koreanair.external.dx.vo.DisruptionEndPoint;
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
  * Contains information related to the disrupted bound.
 **/
@ApiModel(description="Contains information related to the disrupted bound.")
public class DisruptionStatus  {
  
  @ApiModelProperty(required = true, value = "The flights before the disruption")
 /**
   * The flights before the disruption
  **/
  private List<FlightItem> originalFlights = new ArrayList<>();

  @ApiModelProperty(value = "Contains information related to the departure of the original bound as well difference with the current bound.")
 /**
   * Contains information related to the departure of the original bound as well difference with the current bound.
  **/
  private DisruptionEndPoint departure = null;

  @ApiModelProperty(value = "Contains information related to the arrival of the original bound as well difference with the current bound.")
 /**
   * Contains information related to the arrival of the original bound as well difference with the current bound.
  **/
  private DisruptionEndPoint arrival = null;

  @ApiModelProperty(value = "Contains information related to flight connections between the current bound and original bound.")
 /**
   * Contains information related to flight connections between the current bound and original bound.
  **/
  private DisruptionConnection connection = null;

  @ApiModelProperty(value = "Duration of the original journey expressed in seconds")
 /**
   * Duration of the original journey expressed in seconds
  **/
  private Integer duration = null;
 /**
   * The flights before the disruption
   * @return originalFlights
  **/
  @JsonProperty("originalFlights")
  public List<FlightItem> getOriginalFlights() {
    return originalFlights;
  }

  public void setOriginalFlights(List<FlightItem> originalFlights) {
    this.originalFlights = originalFlights;
  }

  public DisruptionStatus originalFlights(List<FlightItem> originalFlights) {
    this.originalFlights = originalFlights;
    return this;
  }

  public DisruptionStatus addOriginalFlightsItem(FlightItem originalFlightsItem) {
    this.originalFlights.add(originalFlightsItem);
    return this;
  }

 /**
   * Contains information related to the departure of the original bound as well difference with the current bound.
   * @return departure
  **/
  @JsonProperty("departure")
  public DisruptionEndPoint getDeparture() {
    return departure;
  }

  public void setDeparture(DisruptionEndPoint departure) {
    this.departure = departure;
  }

  public DisruptionStatus departure(DisruptionEndPoint departure) {
    this.departure = departure;
    return this;
  }

 /**
   * Contains information related to the arrival of the original bound as well difference with the current bound.
   * @return arrival
  **/
  @JsonProperty("arrival")
  public DisruptionEndPoint getArrival() {
    return arrival;
  }

  public void setArrival(DisruptionEndPoint arrival) {
    this.arrival = arrival;
  }

  public DisruptionStatus arrival(DisruptionEndPoint arrival) {
    this.arrival = arrival;
    return this;
  }

 /**
   * Contains information related to flight connections between the current bound and original bound.
   * @return connection
  **/
  @JsonProperty("connection")
  public DisruptionConnection getConnection() {
    return connection;
  }

  public void setConnection(DisruptionConnection connection) {
    this.connection = connection;
  }

  public DisruptionStatus connection(DisruptionConnection connection) {
    this.connection = connection;
    return this;
  }

 /**
   * Duration of the original journey expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public DisruptionStatus duration(Integer duration) {
    this.duration = duration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisruptionStatus {\n");
    
    sb.append("    originalFlights: ").append(toIndentedString(originalFlights)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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

