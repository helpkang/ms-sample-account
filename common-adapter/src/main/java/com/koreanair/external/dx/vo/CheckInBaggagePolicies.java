package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggagePolicyDetails;
import com.koreanair.external.dx.vo.CheckInExcessBaggagePrice;
import com.koreanair.external.dx.vo.CheckInSpecialBaggageItem;
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
  * Baggage policies organized by category that apply to a specific group of travelers. All the policies apply to all the flights in the journey. E.g: a traveler is entitled to have one checked bag for free, with a maximum weight of 23kg and maximum size of 158cm. 
 **/
@ApiModel(description="Baggage policies organized by category that apply to a specific group of travelers. All the policies apply to all the flights in the journey. E.g: a traveler is entitled to have one checked bag for free, with a maximum weight of 23kg and maximum size of 158cm. ")
public class CheckInBaggagePolicies  {
  
  @ApiModelProperty(required = true, value = "List of travelers to which the policies apply.")
 /**
   * List of travelers to which the policies apply.
  **/
  private List<String> travelerIds = new ArrayList<>();

  @ApiModelProperty(value = "Total limit on number of checked bags for the traveler group (free or paid)")
 /**
   * Total limit on number of checked bags for the traveler group (free or paid)
  **/
  private Integer bagAmountLimit = null;

  @ApiModelProperty(value = "Total free baggage allowance of the traveler group in the journey")
 /**
   * Total free baggage allowance of the traveler group in the journey
  **/
  private BaggagePolicyDetails totalAllowance = null;

  @ApiModelProperty(value = "Free baggage allowance for adults in the traveler group in this journey")
 /**
   * Free baggage allowance for adults in the traveler group in this journey
  **/
  private BaggagePolicyDetails adultBaggageAllowance = null;

  @ApiModelProperty(value = "Free baggage allowance for infants in the traveler group in this journey")
 /**
   * Free baggage allowance for infants in the traveler group in this journey
  **/
  private BaggagePolicyDetails infantBaggageAllowance = null;

  @ApiModelProperty(value = "Free baggage allowance added by an agent for the traveler group in this journey")
 /**
   * Free baggage allowance added by an agent for the traveler group in this journey
  **/
  private BaggagePolicyDetails agentWaiver = null;

  @ApiModelProperty(value = "Number of free baggages allowed in the cabin for the traveler group in this journey")
 /**
   * Number of free baggages allowed in the cabin for the traveler group in this journey
  **/
  private BaggagePolicyDetails cabinAllowance = null;

  @ApiModelProperty(value = "Number of free baggages related to the frequent flyer status of travelers in the group in this journey")
 /**
   * Number of free baggages related to the frequent flyer status of travelers in the group in this journey
  **/
  private BaggagePolicyDetails frequentFlyerBaggageAllowance = null;

  @ApiModelProperty(value = "Number of free baggages related to the fare type or the traveler group in this journey")
 /**
   * Number of free baggages related to the fare type or the traveler group in this journey
  **/
  private BaggagePolicyDetails fareTypeAllowance = null;

  @ApiModelProperty(value = "Number of baggages paid during booking / manage my booking or the traveler group in this journey")
 /**
   * Number of baggages paid during booking / manage my booking or the traveler group in this journey
  **/
  private BaggagePolicyDetails prepaidAllowance = null;

  @ApiModelProperty(value = "Extra allowance (usually weight) to handle scale imprecision at the check-in desk, speed up check-in or increase customer satisfaction.")
 /**
   * Extra allowance (usually weight) to handle scale imprecision at the check-in desk, speed up check-in or increase customer satisfaction.
  **/
  private BaggagePolicyDetails discretionaryWaiver = null;

  @ApiModelProperty(value = "Extra allowance to allow customers to have bags accepted that are heavier than the maximum allowed weight without charging them a fee.")
 /**
   * Extra allowance to allow customers to have bags accepted that are heavier than the maximum allowed weight without charging them a fee.
  **/
  private BaggagePolicyDetails excessWaiver = null;

  @ApiModelProperty(value = "Number of excess bags which have already been paid")
 /**
   * Number of excess bags which have already been paid
  **/
  private BaggagePolicyDetails previouslyPaidDiscount = null;

  @ApiModelProperty(value = "Array of prices of excess baggages. Since an excess baggage price varies depending if it's the first, second or third and beyond, this property holds an array of prices associated to an ordinal number. The price associated to the highest ordinal number N is to be used for excess baggage Nth and beyond. Example:  this property defines a price of 20EUR for the first baggage and 25EUR for the second and the user wants to add 3 excess baggages. The price will be 20 + 25 + 25 = 70EUR ")
 /**
   * Array of prices of excess baggages. Since an excess baggage price varies depending if it's the first, second or third and beyond, this property holds an array of prices associated to an ordinal number. The price associated to the highest ordinal number N is to be used for excess baggage Nth and beyond. Example:  this property defines a price of 20EUR for the first baggage and 25EUR for the second and the user wants to add 3 excess baggages. The price will be 20 + 25 + 25 = 70EUR 
  **/
  private List<CheckInExcessBaggagePrice> excessBaggagePrices = null;

  @ApiModelProperty(value = "List of allowed special bag types with their associated price, if known.")
 /**
   * List of allowed special bag types with their associated price, if known.
  **/
  private List<CheckInSpecialBaggageItem> allowedSpecialBags = null;
 /**
   * List of travelers to which the policies apply.
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public CheckInBaggagePolicies travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public CheckInBaggagePolicies addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Total limit on number of checked bags for the traveler group (free or paid)
   * @return bagAmountLimit
  **/
  @JsonProperty("bagAmountLimit")
  public Integer getBagAmountLimit() {
    return bagAmountLimit;
  }

  public void setBagAmountLimit(Integer bagAmountLimit) {
    this.bagAmountLimit = bagAmountLimit;
  }

  public CheckInBaggagePolicies bagAmountLimit(Integer bagAmountLimit) {
    this.bagAmountLimit = bagAmountLimit;
    return this;
  }

 /**
   * Total free baggage allowance of the traveler group in the journey
   * @return totalAllowance
  **/
  @JsonProperty("totalAllowance")
  public BaggagePolicyDetails getTotalAllowance() {
    return totalAllowance;
  }

  public void setTotalAllowance(BaggagePolicyDetails totalAllowance) {
    this.totalAllowance = totalAllowance;
  }

  public CheckInBaggagePolicies totalAllowance(BaggagePolicyDetails totalAllowance) {
    this.totalAllowance = totalAllowance;
    return this;
  }

 /**
   * Free baggage allowance for adults in the traveler group in this journey
   * @return adultBaggageAllowance
  **/
  @JsonProperty("adultBaggageAllowance")
  public BaggagePolicyDetails getAdultBaggageAllowance() {
    return adultBaggageAllowance;
  }

  public void setAdultBaggageAllowance(BaggagePolicyDetails adultBaggageAllowance) {
    this.adultBaggageAllowance = adultBaggageAllowance;
  }

  public CheckInBaggagePolicies adultBaggageAllowance(BaggagePolicyDetails adultBaggageAllowance) {
    this.adultBaggageAllowance = adultBaggageAllowance;
    return this;
  }

 /**
   * Free baggage allowance for infants in the traveler group in this journey
   * @return infantBaggageAllowance
  **/
  @JsonProperty("infantBaggageAllowance")
  public BaggagePolicyDetails getInfantBaggageAllowance() {
    return infantBaggageAllowance;
  }

  public void setInfantBaggageAllowance(BaggagePolicyDetails infantBaggageAllowance) {
    this.infantBaggageAllowance = infantBaggageAllowance;
  }

  public CheckInBaggagePolicies infantBaggageAllowance(BaggagePolicyDetails infantBaggageAllowance) {
    this.infantBaggageAllowance = infantBaggageAllowance;
    return this;
  }

 /**
   * Free baggage allowance added by an agent for the traveler group in this journey
   * @return agentWaiver
  **/
  @JsonProperty("agentWaiver")
  public BaggagePolicyDetails getAgentWaiver() {
    return agentWaiver;
  }

  public void setAgentWaiver(BaggagePolicyDetails agentWaiver) {
    this.agentWaiver = agentWaiver;
  }

  public CheckInBaggagePolicies agentWaiver(BaggagePolicyDetails agentWaiver) {
    this.agentWaiver = agentWaiver;
    return this;
  }

 /**
   * Number of free baggages allowed in the cabin for the traveler group in this journey
   * @return cabinAllowance
  **/
  @JsonProperty("cabinAllowance")
  public BaggagePolicyDetails getCabinAllowance() {
    return cabinAllowance;
  }

  public void setCabinAllowance(BaggagePolicyDetails cabinAllowance) {
    this.cabinAllowance = cabinAllowance;
  }

  public CheckInBaggagePolicies cabinAllowance(BaggagePolicyDetails cabinAllowance) {
    this.cabinAllowance = cabinAllowance;
    return this;
  }

 /**
   * Number of free baggages related to the frequent flyer status of travelers in the group in this journey
   * @return frequentFlyerBaggageAllowance
  **/
  @JsonProperty("frequentFlyerBaggageAllowance")
  public BaggagePolicyDetails getFrequentFlyerBaggageAllowance() {
    return frequentFlyerBaggageAllowance;
  }

  public void setFrequentFlyerBaggageAllowance(BaggagePolicyDetails frequentFlyerBaggageAllowance) {
    this.frequentFlyerBaggageAllowance = frequentFlyerBaggageAllowance;
  }

  public CheckInBaggagePolicies frequentFlyerBaggageAllowance(BaggagePolicyDetails frequentFlyerBaggageAllowance) {
    this.frequentFlyerBaggageAllowance = frequentFlyerBaggageAllowance;
    return this;
  }

 /**
   * Number of free baggages related to the fare type or the traveler group in this journey
   * @return fareTypeAllowance
  **/
  @JsonProperty("fareTypeAllowance")
  public BaggagePolicyDetails getFareTypeAllowance() {
    return fareTypeAllowance;
  }

  public void setFareTypeAllowance(BaggagePolicyDetails fareTypeAllowance) {
    this.fareTypeAllowance = fareTypeAllowance;
  }

  public CheckInBaggagePolicies fareTypeAllowance(BaggagePolicyDetails fareTypeAllowance) {
    this.fareTypeAllowance = fareTypeAllowance;
    return this;
  }

 /**
   * Number of baggages paid during booking / manage my booking or the traveler group in this journey
   * @return prepaidAllowance
  **/
  @JsonProperty("prepaidAllowance")
  public BaggagePolicyDetails getPrepaidAllowance() {
    return prepaidAllowance;
  }

  public void setPrepaidAllowance(BaggagePolicyDetails prepaidAllowance) {
    this.prepaidAllowance = prepaidAllowance;
  }

  public CheckInBaggagePolicies prepaidAllowance(BaggagePolicyDetails prepaidAllowance) {
    this.prepaidAllowance = prepaidAllowance;
    return this;
  }

 /**
   * Extra allowance (usually weight) to handle scale imprecision at the check-in desk, speed up check-in or increase customer satisfaction.
   * @return discretionaryWaiver
  **/
  @JsonProperty("discretionaryWaiver")
  public BaggagePolicyDetails getDiscretionaryWaiver() {
    return discretionaryWaiver;
  }

  public void setDiscretionaryWaiver(BaggagePolicyDetails discretionaryWaiver) {
    this.discretionaryWaiver = discretionaryWaiver;
  }

  public CheckInBaggagePolicies discretionaryWaiver(BaggagePolicyDetails discretionaryWaiver) {
    this.discretionaryWaiver = discretionaryWaiver;
    return this;
  }

 /**
   * Extra allowance to allow customers to have bags accepted that are heavier than the maximum allowed weight without charging them a fee.
   * @return excessWaiver
  **/
  @JsonProperty("excessWaiver")
  public BaggagePolicyDetails getExcessWaiver() {
    return excessWaiver;
  }

  public void setExcessWaiver(BaggagePolicyDetails excessWaiver) {
    this.excessWaiver = excessWaiver;
  }

  public CheckInBaggagePolicies excessWaiver(BaggagePolicyDetails excessWaiver) {
    this.excessWaiver = excessWaiver;
    return this;
  }

 /**
   * Number of excess bags which have already been paid
   * @return previouslyPaidDiscount
  **/
  @JsonProperty("previouslyPaidDiscount")
  public BaggagePolicyDetails getPreviouslyPaidDiscount() {
    return previouslyPaidDiscount;
  }

  public void setPreviouslyPaidDiscount(BaggagePolicyDetails previouslyPaidDiscount) {
    this.previouslyPaidDiscount = previouslyPaidDiscount;
  }

  public CheckInBaggagePolicies previouslyPaidDiscount(BaggagePolicyDetails previouslyPaidDiscount) {
    this.previouslyPaidDiscount = previouslyPaidDiscount;
    return this;
  }

 /**
   * Array of prices of excess baggages. Since an excess baggage price varies depending if it&#39;s the first, second or third and beyond, this property holds an array of prices associated to an ordinal number. The price associated to the highest ordinal number N is to be used for excess baggage Nth and beyond. Example:  this property defines a price of 20EUR for the first baggage and 25EUR for the second and the user wants to add 3 excess baggages. The price will be 20 + 25 + 25 &#x3D; 70EUR 
   * @return excessBaggagePrices
  **/
  @JsonProperty("excessBaggagePrices")
  public List<CheckInExcessBaggagePrice> getExcessBaggagePrices() {
    return excessBaggagePrices;
  }

  public void setExcessBaggagePrices(List<CheckInExcessBaggagePrice> excessBaggagePrices) {
    this.excessBaggagePrices = excessBaggagePrices;
  }

  public CheckInBaggagePolicies excessBaggagePrices(List<CheckInExcessBaggagePrice> excessBaggagePrices) {
    this.excessBaggagePrices = excessBaggagePrices;
    return this;
  }

  public CheckInBaggagePolicies addExcessBaggagePricesItem(CheckInExcessBaggagePrice excessBaggagePricesItem) {
    this.excessBaggagePrices.add(excessBaggagePricesItem);
    return this;
  }

 /**
   * List of allowed special bag types with their associated price, if known.
   * @return allowedSpecialBags
  **/
  @JsonProperty("allowedSpecialBags")
  public List<CheckInSpecialBaggageItem> getAllowedSpecialBags() {
    return allowedSpecialBags;
  }

  public void setAllowedSpecialBags(List<CheckInSpecialBaggageItem> allowedSpecialBags) {
    this.allowedSpecialBags = allowedSpecialBags;
  }

  public CheckInBaggagePolicies allowedSpecialBags(List<CheckInSpecialBaggageItem> allowedSpecialBags) {
    this.allowedSpecialBags = allowedSpecialBags;
    return this;
  }

  public CheckInBaggagePolicies addAllowedSpecialBagsItem(CheckInSpecialBaggageItem allowedSpecialBagsItem) {
    this.allowedSpecialBags.add(allowedSpecialBagsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInBaggagePolicies {\n");
    
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    bagAmountLimit: ").append(toIndentedString(bagAmountLimit)).append("\n");
    sb.append("    totalAllowance: ").append(toIndentedString(totalAllowance)).append("\n");
    sb.append("    adultBaggageAllowance: ").append(toIndentedString(adultBaggageAllowance)).append("\n");
    sb.append("    infantBaggageAllowance: ").append(toIndentedString(infantBaggageAllowance)).append("\n");
    sb.append("    agentWaiver: ").append(toIndentedString(agentWaiver)).append("\n");
    sb.append("    cabinAllowance: ").append(toIndentedString(cabinAllowance)).append("\n");
    sb.append("    frequentFlyerBaggageAllowance: ").append(toIndentedString(frequentFlyerBaggageAllowance)).append("\n");
    sb.append("    fareTypeAllowance: ").append(toIndentedString(fareTypeAllowance)).append("\n");
    sb.append("    prepaidAllowance: ").append(toIndentedString(prepaidAllowance)).append("\n");
    sb.append("    discretionaryWaiver: ").append(toIndentedString(discretionaryWaiver)).append("\n");
    sb.append("    excessWaiver: ").append(toIndentedString(excessWaiver)).append("\n");
    sb.append("    previouslyPaidDiscount: ").append(toIndentedString(previouslyPaidDiscount)).append("\n");
    sb.append("    excessBaggagePrices: ").append(toIndentedString(excessBaggagePrices)).append("\n");
    sb.append("    allowedSpecialBags: ").append(toIndentedString(allowedSpecialBags)).append("\n");
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

