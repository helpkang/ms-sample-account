package com.koreanair.external.dx.vo;

import java.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneyTravelerPostRequest  {
  
  @ApiModelProperty(value = "Last name of one traveler part of the order")
 /**
   * Last name of one traveler part of the order
  **/
  private String lastName = null;

  @ApiModelProperty(value = "First name of one traveler part of the order")
 /**
   * First name of one traveler part of the order
  **/
  private String firstName = null;

  @ApiModelProperty(value = "Record locator of a PNR")
 /**
   * Record locator of a PNR
  **/
  private String orderId = null;

  @ApiModelProperty(value = "E-ticket number")
 /**
   * E-ticket number
  **/
  private String eTicketNumber = null;

  @ApiModelProperty(value = "Identifier of a frequent flyer card, whatever its usage [redeem miles, accrue miles...]")
 /**
   * Identifier of a frequent flyer card, whatever its usage [redeem miles, accrue miles...]
  **/
  private String frequentFlyerCardId = null;

  @ApiModelProperty(value = "Staff number. No pattern is defined here, as can vary by airline")
 /**
   * Staff number. No pattern is defined here, as can vary by airline
  **/
  private String staffNumber = null;

  @ApiModelProperty(value = "Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone. Ex : 2016-07-01")
 /**
   * Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone. Ex : 2016-07-01
  **/
  private LocalDate departureDate = null;

  @ApiModelProperty(value = "Departure location code of outbound (city or airport code)")
 /**
   * Departure location code of outbound (city or airport code)
  **/
  private String originLocationCode = null;

  @ApiModelProperty(value = "Id of the (Journey element) traveler on the flight.")
 /**
   * Id of the (Journey element) traveler on the flight.
  **/
  private String journeyElementId = null;
 /**
   * Last name of one traveler part of the order
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public JourneyTravelerPostRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * First name of one traveler part of the order
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public JourneyTravelerPostRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * Record locator of a PNR
   * @return orderId
  **/
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public JourneyTravelerPostRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * E-ticket number
   * @return eTicketNumber
  **/
  @JsonProperty("eTicketNumber")
  public String getETicketNumber() {
    return eTicketNumber;
  }

  public void setETicketNumber(String eTicketNumber) {
    this.eTicketNumber = eTicketNumber;
  }

  public JourneyTravelerPostRequest eTicketNumber(String eTicketNumber) {
    this.eTicketNumber = eTicketNumber;
    return this;
  }

 /**
   * Identifier of a frequent flyer card, whatever its usage [redeem miles, accrue miles...]
   * @return frequentFlyerCardId
  **/
  @JsonProperty("frequentFlyerCardId")
  public String getFrequentFlyerCardId() {
    return frequentFlyerCardId;
  }

  public void setFrequentFlyerCardId(String frequentFlyerCardId) {
    this.frequentFlyerCardId = frequentFlyerCardId;
  }

  public JourneyTravelerPostRequest frequentFlyerCardId(String frequentFlyerCardId) {
    this.frequentFlyerCardId = frequentFlyerCardId;
    return this;
  }

 /**
   * Staff number. No pattern is defined here, as can vary by airline
   * @return staffNumber
  **/
  @JsonProperty("staffNumber")
  public String getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
  }

  public JourneyTravelerPostRequest staffNumber(String staffNumber) {
    this.staffNumber = staffNumber;
    return this;
  }

 /**
   * Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone. Ex : 2016-07-01
   * @return departureDate
  **/
  @JsonProperty("departureDate")
  public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public JourneyTravelerPostRequest departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

 /**
   * Departure location code of outbound (city or airport code)
   * @return originLocationCode
  **/
  @JsonProperty("originLocationCode")
  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public JourneyTravelerPostRequest originLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
    return this;
  }

 /**
   * Id of the (Journey element) traveler on the flight.
   * @return journeyElementId
  **/
  @JsonProperty("journeyElementId")
  public String getJourneyElementId() {
    return journeyElementId;
  }

  public void setJourneyElementId(String journeyElementId) {
    this.journeyElementId = journeyElementId;
  }

  public JourneyTravelerPostRequest journeyElementId(String journeyElementId) {
    this.journeyElementId = journeyElementId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyTravelerPostRequest {\n");
    
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    eTicketNumber: ").append(toIndentedString(eTicketNumber)).append("\n");
    sb.append("    frequentFlyerCardId: ").append(toIndentedString(frequentFlyerCardId)).append("\n");
    sb.append("    staffNumber: ").append(toIndentedString(staffNumber)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    journeyElementId: ").append(toIndentedString(journeyElementId)).append("\n");
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

