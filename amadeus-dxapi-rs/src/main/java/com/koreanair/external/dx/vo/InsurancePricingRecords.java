package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Price;
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
  * It stores the price for Insurance.
 **/
@ApiModel(description="It stores the price for Insurance.")
public class InsurancePricingRecords  {
  
  @ApiModelProperty(required = true, value = "Insurance total price for all passenger")
 /**
   * Insurance total price for all passenger
  **/
  private Price totalPrice = null;
 /**
   * Insurance total price for all passenger
   * @return totalPrice
  **/
  @JsonProperty("totalPrice")
  public Price getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
  }

  public InsurancePricingRecords totalPrice(Price totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsurancePricingRecords {\n");
    
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
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

