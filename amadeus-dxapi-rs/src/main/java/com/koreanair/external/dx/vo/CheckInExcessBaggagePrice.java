package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
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
  * Price of the Nth excess baggage, identified by an ordinal number. Example: if my price has ordinalNumber = 2, it means that it holds the price of the second excess baggage. 
 **/
@ApiModel(description="Price of the Nth excess baggage, identified by an ordinal number. Example: if my price has ordinalNumber = 2, it means that it holds the price of the second excess baggage. ")
public class CheckInExcessBaggagePrice  {
  
  @ApiModelProperty(value = "Ordinal number to which the price applies to.")
 /**
   * Ordinal number to which the price applies to.
  **/
  private Integer ordinalNumber = null;

  @ApiModelProperty(value = "Price of the excess baggage.")
 /**
   * Price of the excess baggage.
  **/
  private Amount price = null;
 /**
   * Ordinal number to which the price applies to.
   * minimum: 0
   * @return ordinalNumber
  **/
  @JsonProperty("ordinalNumber")
  public Integer getOrdinalNumber() {
    return ordinalNumber;
  }

  public void setOrdinalNumber(Integer ordinalNumber) {
    this.ordinalNumber = ordinalNumber;
  }

  public CheckInExcessBaggagePrice ordinalNumber(Integer ordinalNumber) {
    this.ordinalNumber = ordinalNumber;
    return this;
  }

 /**
   * Price of the excess baggage.
   * @return price
  **/
  @JsonProperty("price")
  public Amount getPrice() {
    return price;
  }

  public void setPrice(Amount price) {
    this.price = price;
  }

  public CheckInExcessBaggagePrice price(Amount price) {
    this.price = price;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInExcessBaggagePrice {\n");
    
    sb.append("    ordinalNumber: ").append(toIndentedString(ordinalNumber)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

