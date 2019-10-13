package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggagePolicyItem;
import com.koreanair.external.dx.vo.BaggagePolicyItemCommon;
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
  * Baggage policies organized by category that apply for a specific set of passengers, itinerary and fare basis. E.g: a traveler is entitled to have one checked bag for free, with a maximum weight of 23kg and maximum size of 158cm. 
 **/
@ApiModel(description="Baggage policies organized by category that apply for a specific set of passengers, itinerary and fare basis. E.g: a traveler is entitled to have one checked bag for free, with a maximum weight of 23kg and maximum size of 158cm. ")
public class BaggagePolicies  {
  
  @ApiModelProperty(value = "Air offer id used to get the baggage policies. Only available in get baggage policies from cart")
 /**
   * Air offer id used to get the baggage policies. Only available in get baggage policies from cart
  **/
  private String airOfferId = null;

  @ApiModelProperty(value = "Baggage policies' source of law compliancy")
 /**
   * Baggage policies' source of law compliancy
  **/
  private List<String> policyRegulations = null;

  @ApiModelProperty(value = "Baggage allowance specific for frequent flyers")
 /**
   * Baggage allowance specific for frequent flyers
  **/
  private List<BaggagePolicyItemCommon> freeFrequentFlyerBaggageAllowance = null;

  @ApiModelProperty(value = "Allowance for checked baggage that is free of charge ")
 /**
   * Allowance for checked baggage that is free of charge 
  **/
  private List<BaggagePolicyItemCommon> freeCheckedBaggageAllowance = null;

  @ApiModelProperty(value = "Baggage allowed to be carried on the cabin free of charge")
 /**
   * Baggage allowed to be carried on the cabin free of charge
  **/
  private List<BaggagePolicyItemCommon> freeCarryOnAllowance = null;

  @ApiModelProperty(value = "Allowance for extra checked baggage")
 /**
   * Allowance for extra checked baggage
  **/
  private List<BaggagePolicyItem> checkedBaggageAllowanceCharges = null;

  @ApiModelProperty(value = "Baggage allowed to be carried on the cabin")
 /**
   * Baggage allowed to be carried on the cabin
  **/
  private List<BaggagePolicyItem> carryOnAllowanceCharges = null;

  @ApiModelProperty(value = "Excess baggage not allowed")
 /**
   * Excess baggage not allowed
  **/
  private List<BaggagePolicyItemCommon> notAllowedExcessBaggage = null;
 /**
   * Air offer id used to get the baggage policies. Only available in get baggage policies from cart
   * @return airOfferId
  **/
  @JsonProperty("airOfferId")
  public String getAirOfferId() {
    return airOfferId;
  }

  public void setAirOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
  }

  public BaggagePolicies airOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
    return this;
  }

 /**
   * Baggage policies&#39; source of law compliancy
   * @return policyRegulations
  **/
  @JsonProperty("policyRegulations")
  public List<String> getPolicyRegulations() {
    return policyRegulations;
  }

  public void setPolicyRegulations(List<String> policyRegulations) {
    this.policyRegulations = policyRegulations;
  }

  public BaggagePolicies policyRegulations(List<String> policyRegulations) {
    this.policyRegulations = policyRegulations;
    return this;
  }

  public BaggagePolicies addPolicyRegulationsItem(String policyRegulationsItem) {
    this.policyRegulations.add(policyRegulationsItem);
    return this;
  }

 /**
   * Baggage allowance specific for frequent flyers
   * @return freeFrequentFlyerBaggageAllowance
  **/
  @JsonProperty("freeFrequentFlyerBaggageAllowance")
  public List<BaggagePolicyItemCommon> getFreeFrequentFlyerBaggageAllowance() {
    return freeFrequentFlyerBaggageAllowance;
  }

  public void setFreeFrequentFlyerBaggageAllowance(List<BaggagePolicyItemCommon> freeFrequentFlyerBaggageAllowance) {
    this.freeFrequentFlyerBaggageAllowance = freeFrequentFlyerBaggageAllowance;
  }

  public BaggagePolicies freeFrequentFlyerBaggageAllowance(List<BaggagePolicyItemCommon> freeFrequentFlyerBaggageAllowance) {
    this.freeFrequentFlyerBaggageAllowance = freeFrequentFlyerBaggageAllowance;
    return this;
  }

  public BaggagePolicies addFreeFrequentFlyerBaggageAllowanceItem(BaggagePolicyItemCommon freeFrequentFlyerBaggageAllowanceItem) {
    this.freeFrequentFlyerBaggageAllowance.add(freeFrequentFlyerBaggageAllowanceItem);
    return this;
  }

 /**
   * Allowance for checked baggage that is free of charge 
   * @return freeCheckedBaggageAllowance
  **/
  @JsonProperty("freeCheckedBaggageAllowance")
  public List<BaggagePolicyItemCommon> getFreeCheckedBaggageAllowance() {
    return freeCheckedBaggageAllowance;
  }

  public void setFreeCheckedBaggageAllowance(List<BaggagePolicyItemCommon> freeCheckedBaggageAllowance) {
    this.freeCheckedBaggageAllowance = freeCheckedBaggageAllowance;
  }

  public BaggagePolicies freeCheckedBaggageAllowance(List<BaggagePolicyItemCommon> freeCheckedBaggageAllowance) {
    this.freeCheckedBaggageAllowance = freeCheckedBaggageAllowance;
    return this;
  }

  public BaggagePolicies addFreeCheckedBaggageAllowanceItem(BaggagePolicyItemCommon freeCheckedBaggageAllowanceItem) {
    this.freeCheckedBaggageAllowance.add(freeCheckedBaggageAllowanceItem);
    return this;
  }

 /**
   * Baggage allowed to be carried on the cabin free of charge
   * @return freeCarryOnAllowance
  **/
  @JsonProperty("freeCarryOnAllowance")
  public List<BaggagePolicyItemCommon> getFreeCarryOnAllowance() {
    return freeCarryOnAllowance;
  }

  public void setFreeCarryOnAllowance(List<BaggagePolicyItemCommon> freeCarryOnAllowance) {
    this.freeCarryOnAllowance = freeCarryOnAllowance;
  }

  public BaggagePolicies freeCarryOnAllowance(List<BaggagePolicyItemCommon> freeCarryOnAllowance) {
    this.freeCarryOnAllowance = freeCarryOnAllowance;
    return this;
  }

  public BaggagePolicies addFreeCarryOnAllowanceItem(BaggagePolicyItemCommon freeCarryOnAllowanceItem) {
    this.freeCarryOnAllowance.add(freeCarryOnAllowanceItem);
    return this;
  }

 /**
   * Allowance for extra checked baggage
   * @return checkedBaggageAllowanceCharges
  **/
  @JsonProperty("checkedBaggageAllowanceCharges")
  public List<BaggagePolicyItem> getCheckedBaggageAllowanceCharges() {
    return checkedBaggageAllowanceCharges;
  }

  public void setCheckedBaggageAllowanceCharges(List<BaggagePolicyItem> checkedBaggageAllowanceCharges) {
    this.checkedBaggageAllowanceCharges = checkedBaggageAllowanceCharges;
  }

  public BaggagePolicies checkedBaggageAllowanceCharges(List<BaggagePolicyItem> checkedBaggageAllowanceCharges) {
    this.checkedBaggageAllowanceCharges = checkedBaggageAllowanceCharges;
    return this;
  }

  public BaggagePolicies addCheckedBaggageAllowanceChargesItem(BaggagePolicyItem checkedBaggageAllowanceChargesItem) {
    this.checkedBaggageAllowanceCharges.add(checkedBaggageAllowanceChargesItem);
    return this;
  }

 /**
   * Baggage allowed to be carried on the cabin
   * @return carryOnAllowanceCharges
  **/
  @JsonProperty("carryOnAllowanceCharges")
  public List<BaggagePolicyItem> getCarryOnAllowanceCharges() {
    return carryOnAllowanceCharges;
  }

  public void setCarryOnAllowanceCharges(List<BaggagePolicyItem> carryOnAllowanceCharges) {
    this.carryOnAllowanceCharges = carryOnAllowanceCharges;
  }

  public BaggagePolicies carryOnAllowanceCharges(List<BaggagePolicyItem> carryOnAllowanceCharges) {
    this.carryOnAllowanceCharges = carryOnAllowanceCharges;
    return this;
  }

  public BaggagePolicies addCarryOnAllowanceChargesItem(BaggagePolicyItem carryOnAllowanceChargesItem) {
    this.carryOnAllowanceCharges.add(carryOnAllowanceChargesItem);
    return this;
  }

 /**
   * Excess baggage not allowed
   * @return notAllowedExcessBaggage
  **/
  @JsonProperty("notAllowedExcessBaggage")
  public List<BaggagePolicyItemCommon> getNotAllowedExcessBaggage() {
    return notAllowedExcessBaggage;
  }

  public void setNotAllowedExcessBaggage(List<BaggagePolicyItemCommon> notAllowedExcessBaggage) {
    this.notAllowedExcessBaggage = notAllowedExcessBaggage;
  }

  public BaggagePolicies notAllowedExcessBaggage(List<BaggagePolicyItemCommon> notAllowedExcessBaggage) {
    this.notAllowedExcessBaggage = notAllowedExcessBaggage;
    return this;
  }

  public BaggagePolicies addNotAllowedExcessBaggageItem(BaggagePolicyItemCommon notAllowedExcessBaggageItem) {
    this.notAllowedExcessBaggage.add(notAllowedExcessBaggageItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggagePolicies {\n");
    
    sb.append("    airOfferId: ").append(toIndentedString(airOfferId)).append("\n");
    sb.append("    policyRegulations: ").append(toIndentedString(policyRegulations)).append("\n");
    sb.append("    freeFrequentFlyerBaggageAllowance: ").append(toIndentedString(freeFrequentFlyerBaggageAllowance)).append("\n");
    sb.append("    freeCheckedBaggageAllowance: ").append(toIndentedString(freeCheckedBaggageAllowance)).append("\n");
    sb.append("    freeCarryOnAllowance: ").append(toIndentedString(freeCarryOnAllowance)).append("\n");
    sb.append("    checkedBaggageAllowanceCharges: ").append(toIndentedString(checkedBaggageAllowanceCharges)).append("\n");
    sb.append("    carryOnAllowanceCharges: ").append(toIndentedString(carryOnAllowanceCharges)).append("\n");
    sb.append("    notAllowedExcessBaggage: ").append(toIndentedString(notAllowedExcessBaggage)).append("\n");
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

