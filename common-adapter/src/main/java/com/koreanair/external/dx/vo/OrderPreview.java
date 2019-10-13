package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.LightFlight;
import com.koreanair.external.dx.vo.Traveler;
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
  * Essential information that can characterize an order
 **/
@ApiModel(description="Essential information that can characterize an order")
public class OrderPreview  {
  
  @ApiModelProperty(required = true, value = "Order id (record locator)")
 /**
   * Order id (record locator)
  **/
  private String id = null;

  @ApiModelProperty(value = "Flag indicating if the order is a booking for a group. In such case traveler information is not displayed.")
 /**
   * Flag indicating if the order is a booking for a group. In such case traveler information is not displayed.
  **/
  private Boolean isGroupBooking = null;

  @ApiModelProperty(value = "Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)")
 /**
   * Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)
  **/
  private LocalDateTime creationDateTime = null;

  @ApiModelProperty(value = "Flights included in the order")
 /**
   * Flights included in the order
  **/
  private List<LightFlight> flights = null;

  @ApiModelProperty(value = "Travelers taking part in the flights of the order")
 /**
   * Travelers taking part in the flights of the order
  **/
  private List<Traveler> travelers = null;
 /**
   * Order id (record locator)
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderPreview id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Flag indicating if the order is a booking for a group. In such case traveler information is not displayed.
   * @return isGroupBooking
  **/
  @JsonProperty("isGroupBooking")
  public Boolean isIsGroupBooking() {
    return isGroupBooking;
  }

  public void setIsGroupBooking(Boolean isGroupBooking) {
    this.isGroupBooking = isGroupBooking;
  }

  public OrderPreview isGroupBooking(Boolean isGroupBooking) {
    this.isGroupBooking = isGroupBooking;
    return this;
  }

 /**
   * Creation date of the order in GMT (Example: 2018-02-10T20:40:12Z)
   * @return creationDateTime
  **/
  @JsonProperty("creationDateTime")
  public LocalDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OrderPreview creationDateTime(LocalDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

 /**
   * Flights included in the order
   * @return flights
  **/
  @JsonProperty("flights")
  public List<LightFlight> getFlights() {
    return flights;
  }

  public void setFlights(List<LightFlight> flights) {
    this.flights = flights;
  }

  public OrderPreview flights(List<LightFlight> flights) {
    this.flights = flights;
    return this;
  }

  public OrderPreview addFlightsItem(LightFlight flightsItem) {
    this.flights.add(flightsItem);
    return this;
  }

 /**
   * Travelers taking part in the flights of the order
   * @return travelers
  **/
  @JsonProperty("travelers")
  public List<Traveler> getTravelers() {
    return travelers;
  }

  public void setTravelers(List<Traveler> travelers) {
    this.travelers = travelers;
  }

  public OrderPreview travelers(List<Traveler> travelers) {
    this.travelers = travelers;
    return this;
  }

  public OrderPreview addTravelersItem(Traveler travelersItem) {
    this.travelers.add(travelersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPreview {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGroupBooking: ").append(toIndentedString(isGroupBooking)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
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

