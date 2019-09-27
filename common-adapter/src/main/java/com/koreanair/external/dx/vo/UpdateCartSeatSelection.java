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
  * Seat selection for a single traveler Depending on the use-case, a seat can be associated to: - An existing traveler in the Cart using travelerId - A traveler being added at the same time using travelerTId 
 **/
@ApiModel(description="Seat selection for a single traveler Depending on the use-case, a seat can be associated to: - An existing traveler in the Cart using travelerId - A traveler being added at the same time using travelerTId ")
public class UpdateCartSeatSelection  {
  
  @ApiModelProperty(value = "Temporary id of the traveler associated to the seat. To be used when the traveler is being added to the Cart in the same transaction")
 /**
   * Temporary id of the traveler associated to the seat. To be used when the traveler is being added to the Cart in the same transaction
  **/
  private String travelerTId = null;

  @ApiModelProperty(required = true, value = "Concatenation of the row id and the column id, for example 12B")
 /**
   * Concatenation of the row id and the column id, for example 12B
  **/
  private String seatNumber = null;

  @ApiModelProperty(value = "Traveler id associated to the seat")
 /**
   * Traveler id associated to the seat
  **/
  private String travelerId = null;
 /**
   * Temporary id of the traveler associated to the seat. To be used when the traveler is being added to the Cart in the same transaction
   * @return travelerTId
  **/
  @JsonProperty("travelerTId")
  public String getTravelerTId() {
    return travelerTId;
  }

  public void setTravelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
  }

  public UpdateCartSeatSelection travelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
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

  public UpdateCartSeatSelection seatNumber(String seatNumber) {
    this.seatNumber = seatNumber;
    return this;
  }

 /**
   * Traveler id associated to the seat
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public UpdateCartSeatSelection travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCartSeatSelection {\n");
    
    sb.append("    travelerTId: ").append(toIndentedString(travelerTId)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
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

