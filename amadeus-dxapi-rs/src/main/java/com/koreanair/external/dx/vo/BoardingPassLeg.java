package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPassLounge;
import com.koreanair.external.dx.vo.BoardingPassService;
import com.koreanair.external.dx.vo.FlightEndPoint;
import com.koreanair.external.dx.vo.SeatmapSeatProperties;
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
  * Boarding pass data related to a leg of the flight for the traveler. A leg is the in-flight time between two airports. Example: for the flight 6X123 performing the trip LHR-SIN-MEL, with a stop in SIN, there will be 2 legs associated: LHR-SIN and SIN-MEL. 
 **/
@ApiModel(description="Boarding pass data related to a leg of the flight for the traveler. A leg is the in-flight time between two airports. Example: for the flight 6X123 performing the trip LHR-SIN-MEL, with a stop in SIN, there will be 2 legs associated: LHR-SIN and SIN-MEL. ")
public class BoardingPassLeg  {
  
  @ApiModelProperty(value = "")
  private FlightEndPoint departure = null;

  @ApiModelProperty(value = "")
  private FlightEndPoint arrival = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Date and time when the boarding of the plane is planned to start. Local date and time with the following format \\\"yyyy-MM-dd'T'HH:mm:ssZ\\\" (e.g. 2018-02-10T20:40:00+02:00) ")
 /**
   * Date and time when the boarding of the plane is planned to start. Local date and time with the following format \\\"yyyy-MM-dd'T'HH:mm:ssZ\\\" (e.g. 2018-02-10T20:40:00+02:00) 
  **/
  private LocalDateTime boardingDateTime = null;

  @ApiModelProperty(value = "Airport gate wherer travelers will board the plane")
 /**
   * Airport gate wherer travelers will board the plane
  **/
  private String boardingGate = null;

  @ApiModelProperty(value = "")
  private SeatmapSeatProperties seat = null;

  @ApiModelProperty(value = "Lounge access information")
 /**
   * Lounge access information
  **/
  private List<BoardingPassLounge> lounges = null;

  @ApiModelProperty(value = "List of services of the traveler")
 /**
   * List of services of the traveler
  **/
  private List<BoardingPassService> services = null;
 /**
   * Get departure
   * @return departure
  **/
  @JsonProperty("departure")
  public FlightEndPoint getDeparture() {
    return departure;
  }

  public void setDeparture(FlightEndPoint departure) {
    this.departure = departure;
  }

  public BoardingPassLeg departure(FlightEndPoint departure) {
    this.departure = departure;
    return this;
  }

 /**
   * Get arrival
   * @return arrival
  **/
  @JsonProperty("arrival")
  public FlightEndPoint getArrival() {
    return arrival;
  }

  public void setArrival(FlightEndPoint arrival) {
    this.arrival = arrival;
  }

  public BoardingPassLeg arrival(FlightEndPoint arrival) {
    this.arrival = arrival;
    return this;
  }

 /**
   * Date and time when the boarding of the plane is planned to start. Local date and time with the following format \\\&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\\\&quot; (e.g. 2018-02-10T20:40:00+02:00) 
   * @return boardingDateTime
  **/
  @JsonProperty("boardingDateTime")
  public LocalDateTime getBoardingDateTime() {
    return boardingDateTime;
  }

  public void setBoardingDateTime(LocalDateTime boardingDateTime) {
    this.boardingDateTime = boardingDateTime;
  }

  public BoardingPassLeg boardingDateTime(LocalDateTime boardingDateTime) {
    this.boardingDateTime = boardingDateTime;
    return this;
  }

 /**
   * Airport gate wherer travelers will board the plane
   * @return boardingGate
  **/
  @JsonProperty("boardingGate")
  public String getBoardingGate() {
    return boardingGate;
  }

  public void setBoardingGate(String boardingGate) {
    this.boardingGate = boardingGate;
  }

  public BoardingPassLeg boardingGate(String boardingGate) {
    this.boardingGate = boardingGate;
    return this;
  }

 /**
   * Get seat
   * @return seat
  **/
  @JsonProperty("seat")
  public SeatmapSeatProperties getSeat() {
    return seat;
  }

  public void setSeat(SeatmapSeatProperties seat) {
    this.seat = seat;
  }

  public BoardingPassLeg seat(SeatmapSeatProperties seat) {
    this.seat = seat;
    return this;
  }

 /**
   * Lounge access information
   * @return lounges
  **/
  @JsonProperty("lounges")
  public List<BoardingPassLounge> getLounges() {
    return lounges;
  }

  public void setLounges(List<BoardingPassLounge> lounges) {
    this.lounges = lounges;
  }

  public BoardingPassLeg lounges(List<BoardingPassLounge> lounges) {
    this.lounges = lounges;
    return this;
  }

  public BoardingPassLeg addLoungesItem(BoardingPassLounge loungesItem) {
    this.lounges.add(loungesItem);
    return this;
  }

 /**
   * List of services of the traveler
   * @return services
  **/
  @JsonProperty("services")
  public List<BoardingPassService> getServices() {
    return services;
  }

  public void setServices(List<BoardingPassService> services) {
    this.services = services;
  }

  public BoardingPassLeg services(List<BoardingPassService> services) {
    this.services = services;
    return this;
  }

  public BoardingPassLeg addServicesItem(BoardingPassService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassLeg {\n");
    
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    boardingDateTime: ").append(toIndentedString(boardingDateTime)).append("\n");
    sb.append("    boardingGate: ").append(toIndentedString(boardingGate)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    lounges: ").append(toIndentedString(lounges)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

