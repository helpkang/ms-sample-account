package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.JourneyUnpaidBaggageItem;
import com.koreanair.external.dx.vo.JourneyUnpaidSeatItem;
import com.koreanair.external.dx.vo.ServiceItem;
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
  * Unpaid items associated to a journey, as well as the total price
 **/
@ApiModel(description="Unpaid items associated to a journey, as well as the total price")
public class JourneyUnpaidItems  {
  
  @ApiModelProperty(required = true, value = "Total price of unpaid items")
 /**
   * Total price of unpaid items
  **/
  private Amount total = null;

  @ApiModelProperty(value = "")
  private List<JourneyUnpaidSeatItem> seats = null;

  @ApiModelProperty(value = "")
  private List<JourneyUnpaidBaggageItem> baggage = null;

  @ApiModelProperty(value = "")
  private List<ServiceItem> services = null;
 /**
   * Total price of unpaid items
   * @return total
  **/
  @JsonProperty("total")
  public Amount getTotal() {
    return total;
  }

  public void setTotal(Amount total) {
    this.total = total;
  }

  public JourneyUnpaidItems total(Amount total) {
    this.total = total;
    return this;
  }

 /**
   * Get seats
   * @return seats
  **/
  @JsonProperty("seats")
  public List<JourneyUnpaidSeatItem> getSeats() {
    return seats;
  }

  public void setSeats(List<JourneyUnpaidSeatItem> seats) {
    this.seats = seats;
  }

  public JourneyUnpaidItems seats(List<JourneyUnpaidSeatItem> seats) {
    this.seats = seats;
    return this;
  }

  public JourneyUnpaidItems addSeatsItem(JourneyUnpaidSeatItem seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

 /**
   * Get baggage
   * @return baggage
  **/
  @JsonProperty("baggage")
  public List<JourneyUnpaidBaggageItem> getBaggage() {
    return baggage;
  }

  public void setBaggage(List<JourneyUnpaidBaggageItem> baggage) {
    this.baggage = baggage;
  }

  public JourneyUnpaidItems baggage(List<JourneyUnpaidBaggageItem> baggage) {
    this.baggage = baggage;
    return this;
  }

  public JourneyUnpaidItems addBaggageItem(JourneyUnpaidBaggageItem baggageItem) {
    this.baggage.add(baggageItem);
    return this;
  }

 /**
   * Get services
   * @return services
  **/
  @JsonProperty("services")
  public List<ServiceItem> getServices() {
    return services;
  }

  public void setServices(List<ServiceItem> services) {
    this.services = services;
  }

  public JourneyUnpaidItems services(List<ServiceItem> services) {
    this.services = services;
    return this;
  }

  public JourneyUnpaidItems addServicesItem(ServiceItem servicesItem) {
    this.services.add(servicesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyUnpaidItems {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
    sb.append("    baggage: ").append(toIndentedString(baggage)).append("\n");
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

