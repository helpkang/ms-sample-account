package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirPricingRecords;
import com.koreanair.external.dx.vo.Bound;
import com.koreanair.external.dx.vo.FareInfo;
import com.koreanair.external.dx.vo.FreeCheckedBaggageAllowanceItem;
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

public class AirItem  {
  
  @ApiModelProperty(required = true, value = "Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound)")
 /**
   * Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound)
  **/
  private List<Bound> bounds = new ArrayList<>();

  @ApiModelProperty(value = "")
  private AirPricingRecords prices = null;

  @ApiModelProperty(value = "Air segments are applicable to this traveler or group of travelers. In case of a transaction either cart-free or based on a cart that does not contain travelers, travelers ids are defined in anonymousTraveler dictionary. Otherwise travelers ids are defined in cart")
 /**
   * Air segments are applicable to this traveler or group of travelers. In case of a transaction either cart-free or based on a cart that does not contain travelers, travelers ids are defined in anonymousTraveler dictionary. Otherwise travelers ids are defined in cart
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey")
 /**
   * In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey
  **/
  private String fareFamilyCode = null;

  @ApiModelProperty(value = "")
  private List<FareInfo> fareInfos = null;

  @ApiModelProperty(value = "Free baggage allowance definitions corresponding to the selected flights")
 /**
   * Free baggage allowance definitions corresponding to the selected flights
  **/
  private List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems = null;
 /**
   * Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound)
   * @return bounds
  **/
  @JsonProperty("bounds")
  public List<Bound> getBounds() {
    return bounds;
  }

  public void setBounds(List<Bound> bounds) {
    this.bounds = bounds;
  }

  public AirItem bounds(List<Bound> bounds) {
    this.bounds = bounds;
    return this;
  }

  public AirItem addBoundsItem(Bound boundsItem) {
    this.bounds.add(boundsItem);
    return this;
  }

 /**
   * Get prices
   * @return prices
  **/
  @JsonProperty("prices")
  public AirPricingRecords getPrices() {
    return prices;
  }

  public void setPrices(AirPricingRecords prices) {
    this.prices = prices;
  }

  public AirItem prices(AirPricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Air segments are applicable to this traveler or group of travelers. In case of a transaction either cart-free or based on a cart that does not contain travelers, travelers ids are defined in anonymousTraveler dictionary. Otherwise travelers ids are defined in cart
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public AirItem travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public AirItem addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey
   * @return fareFamilyCode
  **/
  @JsonProperty("fareFamilyCode")
  public String getFareFamilyCode() {
    return fareFamilyCode;
  }

  public void setFareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
  }

  public AirItem fareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
    return this;
  }

 /**
   * Get fareInfos
   * @return fareInfos
  **/
  @JsonProperty("fareInfos")
  public List<FareInfo> getFareInfos() {
    return fareInfos;
  }

  public void setFareInfos(List<FareInfo> fareInfos) {
    this.fareInfos = fareInfos;
  }

  public AirItem fareInfos(List<FareInfo> fareInfos) {
    this.fareInfos = fareInfos;
    return this;
  }

  public AirItem addFareInfosItem(FareInfo fareInfosItem) {
    this.fareInfos.add(fareInfosItem);
    return this;
  }

 /**
   * Free baggage allowance definitions corresponding to the selected flights
   * @return freeCheckedBaggageAllowanceItems
  **/
  @JsonProperty("freeCheckedBaggageAllowanceItems")
  public List<FreeCheckedBaggageAllowanceItem> getFreeCheckedBaggageAllowanceItems() {
    return freeCheckedBaggageAllowanceItems;
  }

  public void setFreeCheckedBaggageAllowanceItems(List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems) {
    this.freeCheckedBaggageAllowanceItems = freeCheckedBaggageAllowanceItems;
  }

  public AirItem freeCheckedBaggageAllowanceItems(List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems) {
    this.freeCheckedBaggageAllowanceItems = freeCheckedBaggageAllowanceItems;
    return this;
  }

  public AirItem addFreeCheckedBaggageAllowanceItemsItem(FreeCheckedBaggageAllowanceItem freeCheckedBaggageAllowanceItemsItem) {
    this.freeCheckedBaggageAllowanceItems.add(freeCheckedBaggageAllowanceItemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirItem {\n");
    
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    fareFamilyCode: ").append(toIndentedString(fareFamilyCode)).append("\n");
    sb.append("    fareInfos: ").append(toIndentedString(fareInfos)).append("\n");
    sb.append("    freeCheckedBaggageAllowanceItems: ").append(toIndentedString(freeCheckedBaggageAllowanceItems)).append("\n");
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

