package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.ItemCommon;
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
  * Frequent flyer card that can be used to accrue or redeem miles (only mileage accrual supported so far). The Frequent Flyer Card can be associated to a Shopping cart as well as a Journey.
 **/
@ApiModel(description="Frequent flyer card that can be used to accrue or redeem miles (only mileage accrual supported so far). The Frequent Flyer Card can be associated to a Shopping cart as well as a Journey.")
public class FrequentFlyerCard  {
  
  @ApiModelProperty(value = "Identifier of the resource. not read / taken into account when creating a resource")
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
  **/
  private String id = null;

  @ApiModelProperty(value = "Temporary id that can be used to associate requested and returned frequent flyer cards. Valid only for the time of the transaction.")
 /**
   * Temporary id that can be used to associate requested and returned frequent flyer cards. Valid only for the time of the transaction.
  **/
  private String tid = null;

  @ApiModelProperty(example = "6X", required = true, value = "Code of the company emitting the card")
 /**
   * Code of the company emitting the card
  **/
  private String companyCode = null;

  @ApiModelProperty(example = "992003172079000", required = true, value = "Card number")
 /**
   * Card number
  **/
  private String cardNumber = null;

  @ApiModelProperty(value = "Id of the traveler, if present in the cart / order")
 /**
   * Id of the traveler, if present in the cart / order
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "It can be used when both the frequent flyer and its associated traveler are added simultanuously")
 /**
   * It can be used when both the frequent flyer and its associated traveler are added simultanuously
  **/
  private String travelerTId = null;

  @ApiModelProperty(example = "GOLD", value = "Frequent flyer card tier level code")
 /**
   * Frequent flyer card tier level code
  **/
  private String tierLevel = null;

  @ApiModelProperty(value = "Frequent flyer card tier level description Eg: \"Platinum\"")
 /**
   * Frequent flyer card tier level description Eg: \"Platinum\"
  **/
  private String tierLevelName = null;

  @ApiModelProperty(example = "3", value = "Frequent flyer priority code within the Loyalty system. Both tier level and priority codes are unique identifiers of a Frequent Flyer.")
 /**
   * Frequent flyer priority code within the Loyalty system. Both tier level and priority codes are unique identifiers of a Frequent Flyer.
  **/
  private String priorityCode = null;

  @ApiModelProperty(value = "Frequent flyer card alliance tier level code")
 /**
   * Frequent flyer card alliance tier level code
  **/
  private String allianceTierLevel = null;

  @ApiModelProperty(value = "Tier level description name. Eg: \"Platinum\"")
 /**
   * Tier level description name. Eg: \"Platinum\"
  **/
  private String allianceTierLevelName = null;

  @ApiModelProperty(example = "3", value = "Frequent flyer alliance priority code within the Loyalty system.")
 /**
   * Frequent flyer alliance priority code within the Loyalty system.
  **/
  private String alliancePriorityCode = null;

  @ApiModelProperty(example = "3", value = "Provide the customer value defined by the airline according the customer profile (frequent traveller) e.g. 500. It can be determined according the revenue realized by the airline for this customer.")
 /**
   * Provide the customer value defined by the airline according the customer profile (frequent traveller) e.g. 500. It can be determined according the revenue realized by the airline for this customer.
  **/
  private String airlineCustomerValue = null;
 /**
   * Identifier of the resource. not read / taken into account when creating a resource
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FrequentFlyerCard id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Temporary id that can be used to associate requested and returned frequent flyer cards. Valid only for the time of the transaction.
   * @return tid
  **/
  @JsonProperty("tid")
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public FrequentFlyerCard tid(String tid) {
    this.tid = tid;
    return this;
  }

 /**
   * Code of the company emitting the card
   * @return companyCode
  **/
  @JsonProperty("companyCode")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public FrequentFlyerCard companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

 /**
   * Card number
   * @return cardNumber
  **/
  @JsonProperty("cardNumber")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public FrequentFlyerCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

 /**
   * Id of the traveler, if present in the cart / order
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public FrequentFlyerCard travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * It can be used when both the frequent flyer and its associated traveler are added simultanuously
   * @return travelerTId
  **/
  @JsonProperty("travelerTId")
  public String getTravelerTId() {
    return travelerTId;
  }

  public void setTravelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
  }

  public FrequentFlyerCard travelerTId(String travelerTId) {
    this.travelerTId = travelerTId;
    return this;
  }

 /**
   * Frequent flyer card tier level code
   * @return tierLevel
  **/
  @JsonProperty("tierLevel")
  public String getTierLevel() {
    return tierLevel;
  }

  public void setTierLevel(String tierLevel) {
    this.tierLevel = tierLevel;
  }

  public FrequentFlyerCard tierLevel(String tierLevel) {
    this.tierLevel = tierLevel;
    return this;
  }

 /**
   * Frequent flyer card tier level description Eg: \&quot;Platinum\&quot;
   * @return tierLevelName
  **/
  @JsonProperty("tierLevelName")
  public String getTierLevelName() {
    return tierLevelName;
  }

  public void setTierLevelName(String tierLevelName) {
    this.tierLevelName = tierLevelName;
  }

  public FrequentFlyerCard tierLevelName(String tierLevelName) {
    this.tierLevelName = tierLevelName;
    return this;
  }

 /**
   * Frequent flyer priority code within the Loyalty system. Both tier level and priority codes are unique identifiers of a Frequent Flyer.
   * @return priorityCode
  **/
  @JsonProperty("priorityCode")
  public String getPriorityCode() {
    return priorityCode;
  }

  public void setPriorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
  }

  public FrequentFlyerCard priorityCode(String priorityCode) {
    this.priorityCode = priorityCode;
    return this;
  }

 /**
   * Frequent flyer card alliance tier level code
   * @return allianceTierLevel
  **/
  @JsonProperty("allianceTierLevel")
  public String getAllianceTierLevel() {
    return allianceTierLevel;
  }

  public void setAllianceTierLevel(String allianceTierLevel) {
    this.allianceTierLevel = allianceTierLevel;
  }

  public FrequentFlyerCard allianceTierLevel(String allianceTierLevel) {
    this.allianceTierLevel = allianceTierLevel;
    return this;
  }

 /**
   * Tier level description name. Eg: \&quot;Platinum\&quot;
   * @return allianceTierLevelName
  **/
  @JsonProperty("allianceTierLevelName")
  public String getAllianceTierLevelName() {
    return allianceTierLevelName;
  }

  public void setAllianceTierLevelName(String allianceTierLevelName) {
    this.allianceTierLevelName = allianceTierLevelName;
  }

  public FrequentFlyerCard allianceTierLevelName(String allianceTierLevelName) {
    this.allianceTierLevelName = allianceTierLevelName;
    return this;
  }

 /**
   * Frequent flyer alliance priority code within the Loyalty system.
   * @return alliancePriorityCode
  **/
  @JsonProperty("alliancePriorityCode")
  public String getAlliancePriorityCode() {
    return alliancePriorityCode;
  }

  public void setAlliancePriorityCode(String alliancePriorityCode) {
    this.alliancePriorityCode = alliancePriorityCode;
  }

  public FrequentFlyerCard alliancePriorityCode(String alliancePriorityCode) {
    this.alliancePriorityCode = alliancePriorityCode;
    return this;
  }

 /**
   * Provide the customer value defined by the airline according the customer profile (frequent traveller) e.g. 500. It can be determined according the revenue realized by the airline for this customer.
   * @return airlineCustomerValue
  **/
  @JsonProperty("airlineCustomerValue")
  public String getAirlineCustomerValue() {
    return airlineCustomerValue;
  }

  public void setAirlineCustomerValue(String airlineCustomerValue) {
    this.airlineCustomerValue = airlineCustomerValue;
  }

  public FrequentFlyerCard airlineCustomerValue(String airlineCustomerValue) {
    this.airlineCustomerValue = airlineCustomerValue;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FrequentFlyerCard {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    travelerTId: ").append(toIndentedString(travelerTId)).append("\n");
    sb.append("    tierLevel: ").append(toIndentedString(tierLevel)).append("\n");
    sb.append("    tierLevelName: ").append(toIndentedString(tierLevelName)).append("\n");
    sb.append("    priorityCode: ").append(toIndentedString(priorityCode)).append("\n");
    sb.append("    allianceTierLevel: ").append(toIndentedString(allianceTierLevel)).append("\n");
    sb.append("    allianceTierLevelName: ").append(toIndentedString(allianceTierLevelName)).append("\n");
    sb.append("    alliancePriorityCode: ").append(toIndentedString(alliancePriorityCode)).append("\n");
    sb.append("    airlineCustomerValue: ").append(toIndentedString(airlineCustomerValue)).append("\n");
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

