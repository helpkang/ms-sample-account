package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SeatRecord;
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
  * This object contains the information regarding the seats selection for a single traveler or a group of travelers
 **/
@ApiModel(description="This object contains the information regarding the seats selection for a single traveler or a group of travelers")
public class SeatItemCommon  {
  
  @ApiModelProperty(value = "Seat id to be used for the interaction with cart")
 /**
   * Seat id to be used for the interaction with cart
  **/
  private String id = null;

  @ApiModelProperty(value = "temporary id that can be used to associate requested and returned seats. It is only valid the time of the transaction.")
 /**
   * temporary id that can be used to associate requested and returned seats. It is only valid the time of the transaction.
  **/
  private String tid = null;

  @ApiModelProperty(value = "Flight to which the seat selection is attached to")
 /**
   * Flight to which the seat selection is attached to
  **/
  private String flightId = null;

  @ApiModelProperty(value = "")
  private List<SeatRecord> seatSelections = null;

  @ApiModelProperty(value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. Status code is not returned at shopping time")
 /**
   * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. Status code is not returned at shopping time
  **/
  private String statusCode = null;
 /**
   * Seat id to be used for the interaction with cart
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SeatItemCommon id(String id) {
    this.id = id;
    return this;
  }

 /**
   * temporary id that can be used to associate requested and returned seats. It is only valid the time of the transaction.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SeatItemCommon tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Flight to which the seat selection is attached to
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public SeatItemCommon flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * Get seatSelections
   * @return seatSelections
  **/
  @JsonProperty("seatSelections")
  public List<SeatRecord> getSeatSelections() {
    return seatSelections;
  }

  public void setSeatSelections(List<SeatRecord> seatSelections) {
    this.seatSelections = seatSelections;
  }

  public SeatItemCommon seatSelections(List<SeatRecord> seatSelections) {
    this.seatSelections = seatSelections;
    return this;
  }

  public SeatItemCommon addSeatSelectionsItem(SeatRecord seatSelectionsItem) {
    this.seatSelections.add(seatSelectionsItem);
    return this;
  }

 /**
   * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken. Status code is not returned at shopping time
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public SeatItemCommon statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatItemCommon {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    seatSelections: ").append(toIndentedString(seatSelections)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

