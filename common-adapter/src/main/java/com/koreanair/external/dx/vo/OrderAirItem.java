package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Bound;
import com.koreanair.external.dx.vo.FreeCheckedBaggageAllowanceItem;
import com.koreanair.external.dx.vo.MultiCurrencyAirPricingRecords;
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
  * Air item containing bounds information
 **/
@ApiModel(description="Air item containing bounds information")
public class OrderAirItem  {
  
  @ApiModelProperty(value = "Identifier of the resource")
 /**
   * Identifier of the resource
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  private String fareFamilyCode = null;

  @ApiModelProperty(value = "")
  private MultiCurrencyAirPricingRecords prices = null;

  @ApiModelProperty(value = "Travelers associated to the air item")
 /**
   * Travelers associated to the air item
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "Itinerary (bounds)")
 /**
   * Itinerary (bounds)
  **/
  private List<Bound> bounds = null;

  @ApiModelProperty(value = "Free baggage allowance definitions corresponding to the flights in the Order")
 /**
   * Free baggage allowance definitions corresponding to the flights in the Order
  **/
  private List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems = null;
 /**
   * Identifier of the resource
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderAirItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get fareFamilyCode
   * @return fareFamilyCode
  **/
  @JsonProperty("fareFamilyCode")
  public String getFareFamilyCode() {
    return fareFamilyCode;
  }

  public void setFareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
  }

  public OrderAirItem fareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
    return this;
  }

 /**
   * Get prices
   * @return prices
  **/
  @JsonProperty("prices")
  public MultiCurrencyAirPricingRecords getPrices() {
    return prices;
  }

  public void setPrices(MultiCurrencyAirPricingRecords prices) {
    this.prices = prices;
  }

  public OrderAirItem prices(MultiCurrencyAirPricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Travelers associated to the air item
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public OrderAirItem travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public OrderAirItem addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Itinerary (bounds)
   * @return bounds
  **/
  @JsonProperty("bounds")
  public List<Bound> getBounds() {
    return bounds;
  }

  public void setBounds(List<Bound> bounds) {
    this.bounds = bounds;
  }

  public OrderAirItem bounds(List<Bound> bounds) {
    this.bounds = bounds;
    return this;
  }

  public OrderAirItem addBoundsItem(Bound boundsItem) {
    this.bounds.add(boundsItem);
    return this;
  }

 /**
   * Free baggage allowance definitions corresponding to the flights in the Order
   * @return freeCheckedBaggageAllowanceItems
  **/
  @JsonProperty("freeCheckedBaggageAllowanceItems")
  public List<FreeCheckedBaggageAllowanceItem> getFreeCheckedBaggageAllowanceItems() {
    return freeCheckedBaggageAllowanceItems;
  }

  public void setFreeCheckedBaggageAllowanceItems(List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems) {
    this.freeCheckedBaggageAllowanceItems = freeCheckedBaggageAllowanceItems;
  }

  public OrderAirItem freeCheckedBaggageAllowanceItems(List<FreeCheckedBaggageAllowanceItem> freeCheckedBaggageAllowanceItems) {
    this.freeCheckedBaggageAllowanceItems = freeCheckedBaggageAllowanceItems;
    return this;
  }

  public OrderAirItem addFreeCheckedBaggageAllowanceItemsItem(FreeCheckedBaggageAllowanceItem freeCheckedBaggageAllowanceItemsItem) {
    this.freeCheckedBaggageAllowanceItems.add(freeCheckedBaggageAllowanceItemsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAirItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fareFamilyCode: ").append(toIndentedString(fareFamilyCode)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
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

