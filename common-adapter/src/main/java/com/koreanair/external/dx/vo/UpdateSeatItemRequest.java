package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatSelection;
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
  * Object used to specify the seat(s) selection that will be part of the add or update request
 **/
@ApiModel(description="Object used to specify the seat(s) selection that will be part of the add or update request")
public class UpdateSeatItemRequest  {
  
  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned seats. It is only valid the time of the transaction")
 /**
   * Temporary id that can be used to associate requested and returned seats. It is only valid the time of the transaction
  **/
  private String tid = null;

  @ApiModelProperty(value = "Flight to which the seat selection is associated to")
 /**
   * Flight to which the seat selection is associated to
  **/
  private String flightId = null;

  @ApiModelProperty(value = "It allows to define the list of seat selections for a group of travelers")
 /**
   * It allows to define the list of seat selections for a group of travelers
  **/
  private List<SeatSelection> seatSelections = null;
 /**
   * Temporary id that can be used to associate requested and returned seats. It is only valid the time of the transaction
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public UpdateSeatItemRequest tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Flight to which the seat selection is associated to
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public UpdateSeatItemRequest flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * It allows to define the list of seat selections for a group of travelers
   * @return seatSelections
  **/
  @JsonProperty("seatSelections")
  public List<SeatSelection> getSeatSelections() {
    return seatSelections;
  }

  public void setSeatSelections(List<SeatSelection> seatSelections) {
    this.seatSelections = seatSelections;
  }

  public UpdateSeatItemRequest seatSelections(List<SeatSelection> seatSelections) {
    this.seatSelections = seatSelections;
    return this;
  }

  public UpdateSeatItemRequest addSeatSelectionsItem(SeatSelection seatSelectionsItem) {
    this.seatSelections.add(seatSelectionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSeatItemRequest {\n");
    
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    seatSelections: ").append(toIndentedString(seatSelections)).append("\n");
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

