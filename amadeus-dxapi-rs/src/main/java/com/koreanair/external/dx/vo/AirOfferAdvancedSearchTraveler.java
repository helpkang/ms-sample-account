package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.SearchFrequentFlyer;
import com.koreanair.external.dx.vo.SearchTraveler;
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
  * Object used to define the travelers in input
 **/
@ApiModel(description="Object used to define the travelers in input")
public class AirOfferAdvancedSearchTraveler  {
  
  @ApiModelProperty(example = "ADT", required = true, value = "It corresponds to a [Passenger type code](http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm) 'INF' corresponds to an infant without seat automatically associated to the first eligible traveler provided in the list ")
 /**
   * It corresponds to a [Passenger type code](http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm) 'INF' corresponds to an infant without seat automatically associated to the first eligible traveler provided in the list 
  **/
  private String passengerTypeCode = null;

  @ApiModelProperty(value = "Frequent flyer accounts information")
 /**
   * Frequent flyer accounts information
  **/
  private List<SearchFrequentFlyer> frequentFlyerCards = null;

  @ApiModelProperty(value = "Discount codes that can be used to biase the air offers pricing")
 /**
   * Discount codes that can be used to biase the air offers pricing
  **/
  private List<String> discounts = null;
 /**
   * It corresponds to a [Passenger type code](http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm) &#39;INF&#39; corresponds to an infant without seat automatically associated to the first eligible traveler provided in the list 
   * @return passengerTypeCode
  **/
  @JsonProperty("passengerTypeCode")
  public String getPassengerTypeCode() {
    return passengerTypeCode;
  }

  public void setPassengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
  }

  public AirOfferAdvancedSearchTraveler passengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
    return this;
  }

 /**
   * Frequent flyer accounts information
   * @return frequentFlyerCards
  **/
  @JsonProperty("frequentFlyerCards")
  public List<SearchFrequentFlyer> getFrequentFlyerCards() {
    return frequentFlyerCards;
  }

  public void setFrequentFlyerCards(List<SearchFrequentFlyer> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
  }

  public AirOfferAdvancedSearchTraveler frequentFlyerCards(List<SearchFrequentFlyer> frequentFlyerCards) {
    this.frequentFlyerCards = frequentFlyerCards;
    return this;
  }

  public AirOfferAdvancedSearchTraveler addFrequentFlyerCardsItem(SearchFrequentFlyer frequentFlyerCardsItem) {
    this.frequentFlyerCards.add(frequentFlyerCardsItem);
    return this;
  }

 /**
   * Discount codes that can be used to biase the air offers pricing
   * @return discounts
  **/
  @JsonProperty("discounts")
  public List<String> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<String> discounts) {
    this.discounts = discounts;
  }

  public AirOfferAdvancedSearchTraveler discounts(List<String> discounts) {
    this.discounts = discounts;
    return this;
  }

  public AirOfferAdvancedSearchTraveler addDiscountsItem(String discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirOfferAdvancedSearchTraveler {\n");
    
    sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
    sb.append("    frequentFlyerCards: ").append(toIndentedString(frequentFlyerCards)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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

