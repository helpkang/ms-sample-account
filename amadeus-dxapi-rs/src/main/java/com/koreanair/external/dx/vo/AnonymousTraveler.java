package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.TravelerCommon;
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
  * Anonymous traveler taking part to a journey
 **/
@ApiModel(description="Anonymous traveler taking part to a journey")
public class AnonymousTraveler  {
  
  @ApiModelProperty(example = "ADT", required = true, value = "traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)")
 /**
   * traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)
  **/
  private String passengerTypeCode = null;

  @ApiModelProperty(value = "Discount codes associated to the traveler")
 /**
   * Discount codes associated to the traveler
  **/
  private List<String> discounts = null;
 /**
   * traveler type (http://api.dev.amadeus.net/api/Development/common/codelist/PNR_PassengerType.htm)
   * @return passengerTypeCode
  **/
  @JsonProperty("passengerTypeCode")
  public String getPassengerTypeCode() {
    return passengerTypeCode;
  }

  public void setPassengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
  }

  public AnonymousTraveler passengerTypeCode(String passengerTypeCode) {
    this.passengerTypeCode = passengerTypeCode;
    return this;
  }

 /**
   * Discount codes associated to the traveler
   * @return discounts
  **/
  @JsonProperty("discounts")
  public List<String> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<String> discounts) {
    this.discounts = discounts;
  }

  public AnonymousTraveler discounts(List<String> discounts) {
    this.discounts = discounts;
    return this;
  }

  public AnonymousTraveler addDiscountsItem(String discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnonymousTraveler {\n");
    
    sb.append("    passengerTypeCode: ").append(toIndentedString(passengerTypeCode)).append("\n");
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

