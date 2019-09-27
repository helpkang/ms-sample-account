package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * Unpaid seat associated to a journey
 **/
@ApiModel(description="Unpaid seat associated to a journey")
public class JourneyUnpaidSeatItem  {
  
  @ApiModelProperty(required = true, value = "Traveler for whom this seat is assigned")
 /**
   * Traveler for whom this seat is assigned
  **/
  private String travelerId = null;

  @ApiModelProperty(required = true, value = "Concatenation of the row id and the column id, for example 12B")
 /**
   * Concatenation of the row id and the column id, for example 12B
  **/
  private String seatNumber = null;

  @ApiModelProperty(required = true, value = "Flight on which this seat is assigned")
 /**
   * Flight on which this seat is assigned
  **/
  private String flightId = null;

  @ApiModelProperty(required = true, value = "Price of this seat")
 /**
   * Price of this seat
  **/
  private Amount amount = null;
 /**
   * Traveler for whom this seat is assigned
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public JourneyUnpaidSeatItem travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Concatenation of the row id and the column id, for example 12B
   * @return seatNumber
  **/
  @JsonProperty("seatNumber")
  public String getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
  }

  public JourneyUnpaidSeatItem seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

 /**
   * Flight on which this seat is assigned
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public JourneyUnpaidSeatItem flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * Price of this seat
   * @return amount
  **/
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public JourneyUnpaidSeatItem amount(Amount amount) {
    this.amount = amount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyUnpaidSeatItem {\n");
    
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

