package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatCharacteristic;
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
  * Confirmed seat selection for a single traveler
 **/
@ApiModel(description="Confirmed seat selection for a single traveler")
public class SeatRecord  {
  
  @ApiModelProperty(value = "Concatenation of the row id and the column id, for example 12B")
 /**
   * Concatenation of the row id and the column id, for example 12B
  **/
  private String seatNumber = null;

  @ApiModelProperty(value = "Traveler id associated to the seat")
 /**
   * Traveler id associated to the seat
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "Flight to which the seat is attached to")
 /**
   * Flight to which the seat is attached to
  **/
  private String flightId = null;

  @ApiModelProperty(value = "Characteristics of the selected seat. They refer to the seatCharacteristic dictionary")
 /**
   * Characteristics of the selected seat. They refer to the seatCharacteristic dictionary
  **/
  private List<SeatCharacteristic> seatCharacteristics = null;

  @ApiModelProperty(value = "Display recommendation ; true if the seat is exempted        ")
 /**
   * Display recommendation ; true if the seat is exempted        
  **/
  private Boolean isExempted = null;
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

  public SeatRecord seatNumber(String seatNumber) {
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

  public SeatRecord travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Flight to which the seat is attached to
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public SeatRecord flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * Characteristics of the selected seat. They refer to the seatCharacteristic dictionary
   * @return seatCharacteristics
  **/
  @JsonProperty("seatCharacteristics")
  public List<SeatCharacteristic> getSeatCharacteristics() {
    return seatCharacteristics;
  }

  public void setSeatCharacteristics(List<SeatCharacteristic> seatCharacteristics) {
    this.seatCharacteristics = seatCharacteristics;
  }

  public SeatRecord seatCharacteristics(List<SeatCharacteristic> seatCharacteristics) {
    this.seatCharacteristics = seatCharacteristics;
    return this;
  }

  public SeatRecord addSeatCharacteristicsItem(SeatCharacteristic seatCharacteristicsItem) {
    this.seatCharacteristics.add(seatCharacteristicsItem);
    return this;
  }

 /**
   * Display recommendation ; true if the seat is exempted        
   * @return isExempted
  **/
  @JsonProperty("isExempted")
  public Boolean isIsExempted() {
    return isExempted;
  }

  public void setIsExempted(Boolean isExempted) {
    this.isExempted = isExempted;
  }

  public SeatRecord isExempted(Boolean isExempted) {
    this.isExempted = isExempted;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatRecord {\n");
    
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    seatCharacteristics: ").append(toIndentedString(seatCharacteristics)).append("\n");
    sb.append("    isExempted: ").append(toIndentedString(isExempted)).append("\n");
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

