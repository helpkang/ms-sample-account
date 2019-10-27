package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.MilesConversion;
import com.koreanair.external.dx.vo.Price;
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
  * Price per traveler expressed using multiple currencies. e.g. in case of 2 adults and 1 child, it contains the price for 1 adult and the price for 1 child. 
 **/
@ApiModel(description="Price per traveler expressed using multiple currencies. e.g. in case of 2 adults and 1 child, it contains the price for 1 adult and the price for 1 child. ")
public class UnitPrice  {
  
  @ApiModelProperty(value = "")
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "")
  private List<String> flightIds = null;

  @ApiModelProperty(value = "")
  private List<Price> prices = null;

  @ApiModelProperty(value = "Contains information about converted miles and non converted cash when Award converter is used")
 /**
   * Contains information about converted miles and non converted cash when Award converter is used
  **/
  private MilesConversion milesConversion = null;
 /**
   * Get travelerIds
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public UnitPrice travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public UnitPrice addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Get flightIds
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public UnitPrice flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public UnitPrice addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Get prices
   * @return prices
  **/
  @JsonProperty("prices")
  public List<Price> getPrices() {
    return prices;
  }

  public void setPrices(List<Price> prices) {
    this.prices = prices;
  }

  public UnitPrice prices(List<Price> prices) {
    this.prices = prices;
    return this;
  }

  public UnitPrice addPricesItem(Price pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

 /**
   * Contains information about converted miles and non converted cash when Award converter is used
   * @return milesConversion
  **/
  @JsonProperty("milesConversion")
  public MilesConversion getMilesConversion() {
    return milesConversion;
  }

  public void setMilesConversion(MilesConversion milesConversion) {
    this.milesConversion = milesConversion;
  }

  public UnitPrice milesConversion(MilesConversion milesConversion) {
    this.milesConversion = milesConversion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitPrice {\n");
    
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    milesConversion: ").append(toIndentedString(milesConversion)).append("\n");
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

