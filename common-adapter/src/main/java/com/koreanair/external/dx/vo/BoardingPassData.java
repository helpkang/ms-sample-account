package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BoardingPassBaggage;
import com.koreanair.external.dx.vo.BoardingPassLeg;
import com.koreanair.external.dx.vo.BoardingPriorities;
import com.koreanair.external.dx.vo.Flight;
import com.koreanair.external.dx.vo.FrequentFlyerCard;
import com.koreanair.external.dx.vo.Traveler;
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
  * Boarding pass data to be able to create a boarding pass for a traveler on a flight. A Boarding Pass Dictionary will always contain a single traveler on a single flight. However the flight might have multiple legs/stops. For each leg, the traveler should have a boarding pass so that he can leave the plane and board back if the airline allows it. 
 **/
@ApiModel(description="Boarding pass data to be able to create a boarding pass for a traveler on a flight. A Boarding Pass Dictionary will always contain a single traveler on a single flight. However the flight might have multiple legs/stops. For each leg, the traveler should have a boarding pass so that he can leave the plane and board back if the airline allows it. ")
public class BoardingPassData  {
  
  @ApiModelProperty(value = "")
  private Traveler traveler = null;

  @ApiModelProperty(value = "")
  private Flight flight = null;

  @ApiModelProperty(value = "Frequent flyer cards used to redeem or accrue miles")
 /**
   * Frequent flyer cards used to redeem or accrue miles
  **/
  private List<FrequentFlyerCard> frequentFlyerCards = null;

  @ApiModelProperty(value = "Number indicating the order of check-in. It should be printed on the Boarding Pass with 'Seq' displayed before")
 /**
   * Number indicating the order of check-in. It should be printed on the Boarding Pass with 'Seq' displayed before
  **/
  private String sequenceNumber = null;

  @ApiModelProperty(value = "Record locator of a PNR")
 /**
   * Record locator of a PNR
  **/
  private String orderId = null;

  @ApiModelProperty(value = "Ticket number for the traveler on this flight")
 /**
   * Ticket number for the traveler on this flight
  **/
  private String ticketNumber = null;

  @ApiModelProperty(value = "Barcode Stream to generate a 2D barcode following the IATA (International Air Transport Association) standards : Resolution 792 IATA requires PDF417 barcode format for printed document and Aztec, Datamatrix or QR code formats for mobile boarding pass. ")
 /**
   * Barcode Stream to generate a 2D barcode following the IATA (International Air Transport Association) standards : Resolution 792 IATA requires PDF417 barcode format for printed document and Aztec, Datamatrix or QR code formats for mobile boarding pass. 
  **/
  private String barcodeStream = null;

  @ApiModelProperty(value = "")
  private BoardingPriorities priorities = null;

  @ApiModelProperty(value = "Indicate if the traveler has been selected for a Secondary Security Screening Selection (SSSS) If the value is set to 'true', the letters 'SSSS' (all caps) must be clearly visible on the boarding pass. ")
 /**
   * Indicate if the traveler has been selected for a Secondary Security Screening Selection (SSSS) If the value is set to 'true', the letters 'SSSS' (all caps) must be clearly visible on the boarding pass. 
  **/
  private Boolean secondarySecurityScreeningSelection = null;

  @ApiModelProperty(value = "All the flight's leg information and the relevant traveler information")
 /**
   * All the flight's leg information and the relevant traveler information
  **/
  private List<BoardingPassLeg> legs = null;

  @ApiModelProperty(value = "")
  private BoardingPassBaggage baggageInformation = null;
 /**
   * Get traveler
   * @return traveler
  **/
  @JsonProperty("traveler")
  public Traveler getTraveler() {
    return traveler;
  }

  public void setTraveler(Traveler traveler) {
    this.traveler = traveler;
  }

  public BoardingPassData traveler(Traveler traveler) {
    this.traveler = traveler;
    return this;
  }

 /**
   * Get flight
   * @return flight
  **/
  @JsonProperty("flight")
  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public BoardingPassData flight(Flight flight) {
    this.flight = flight;
    return this;
  }

 /**
   * Frequent flyer cards used to redeem or accrue miles
   * @return frequentFlyerCards
  **/
  @JsonProperty("frequentFlyerCards")
  public List<FrequentFlyerCard> getFrequentFlyerCards() {
    return frequentFlyerCards;
  }

  public void setFrequentFlyerCards(List<FrequentFlyerCard> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
  }

  public BoardingPassData frequentFlyerCards(List<FrequentFlyerCard> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
    return this;
  }

  public BoardingPassData addFrequentFlyerCardsItem(FrequentFlyerCard frequentFlyerCardsItem) {
    this.frequentFlyerCards.add(frequentFlyerCardsItem);
    return this;
  }

 /**
   * Number indicating the order of check-in. It should be printed on the Boarding Pass with &#39;Seq&#39; displayed before
   * @return sequenceNumber
  **/
  @JsonProperty("sequenceNumber")
  public String getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public BoardingPassData sequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
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

  public BoardingPassData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Ticket number for the traveler on this flight
   * @return ticketNumber
  **/
  @JsonProperty("ticketNumber")
  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }

  public BoardingPassData ticketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
    return this;
  }

 /**
   * Barcode Stream to generate a 2D barcode following the IATA (International Air Transport Association) standards : Resolution 792 IATA requires PDF417 barcode format for printed document and Aztec, Datamatrix or QR code formats for mobile boarding pass. 
   * @return barcodeStream
  **/
  @JsonProperty("barcodeStream")
  public String getBarcodeStream() {
    return barcodeStream;
  }

  public void setBarcodeStream(String barcodeStream) {
    this.barcodeStream = barcodeStream;
  }

  public BoardingPassData barcodeStream(String barcodeStream) {
    this.barcodeStream = barcodeStream;
    return this;
  }

 /**
   * Get priorities
   * @return priorities
  **/
  @JsonProperty("priorities")
  public BoardingPriorities getPriorities() {
    return priorities;
  }

  public void setPriorities(BoardingPriorities priorities) {
    this.priorities = priorities;
  }

  public BoardingPassData priorities(BoardingPriorities priorities) {
    this.priorities = priorities;
    return this;
  }

 /**
   * Indicate if the traveler has been selected for a Secondary Security Screening Selection (SSSS) If the value is set to &#39;true&#39;, the letters &#39;SSSS&#39; (all caps) must be clearly visible on the boarding pass. 
   * @return secondarySecurityScreeningSelection
  **/
  @JsonProperty("secondarySecurityScreeningSelection")
  public Boolean isSecondarySecurityScreeningSelection() {
    return secondarySecurityScreeningSelection;
  }

  public void setSecondarySecurityScreeningSelection(Boolean secondarySecurityScreeningSelection) {
    this.secondarySecurityScreeningSelection = secondarySecurityScreeningSelection;
  }

  public BoardingPassData secondarySecurityScreeningSelection(Boolean secondarySecurityScreeningSelection) {
    this.secondarySecurityScreeningSelection = secondarySecurityScreeningSelection;
    return this;
  }

 /**
   * All the flight&#39;s leg information and the relevant traveler information
   * @return legs
  **/
  @JsonProperty("legs")
  public List<BoardingPassLeg> getLegs() {
    return legs;
  }

  public void setLegs(List<BoardingPassLeg> legs) {
    this.legs = legs;
  }

  public BoardingPassData legs(List<BoardingPassLeg> legs) {
    this.legs = legs;
    return this;
  }

  public BoardingPassData addLegsItem(BoardingPassLeg legsItem) {
    this.legs.add(legsItem);
    return this;
  }

 /**
   * Get baggageInformation
   * @return baggageInformation
  **/
  @JsonProperty("baggageInformation")
  public BoardingPassBaggage getBaggageInformation() {
    return baggageInformation;
  }

  public void setBaggageInformation(BoardingPassBaggage baggageInformation) {
    this.baggageInformation = baggageInformation;
  }

  public BoardingPassData baggageInformation(BoardingPassBaggage baggageInformation) {
    this.baggageInformation = baggageInformation;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardingPassData {\n");
    
    sb.append("    traveler: ").append(toIndentedString(traveler)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    frequentFlyerCards: ").append(toIndentedString(frequentFlyerCards)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    ticketNumber: ").append(toIndentedString(ticketNumber)).append("\n");
    sb.append("    barcodeStream: ").append(toIndentedString(barcodeStream)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
    sb.append("    secondarySecurityScreeningSelection: ").append(toIndentedString(secondarySecurityScreeningSelection)).append("\n");
    sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    sb.append("    baggageInformation: ").append(toIndentedString(baggageInformation)).append("\n");
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

