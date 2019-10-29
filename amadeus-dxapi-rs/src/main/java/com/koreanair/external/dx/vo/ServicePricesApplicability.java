package com.koreanair.external.dx.vo;

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
  * It describes the way the prices have to be calculated, based on the unit and value of a characteristic of the service to be priced. This said, the total prices and unit prices will be influenced by the prices applicability. All prices will have to take into account the unit and the value to reflect the real service prices. For example to price a baggage per weight if unit = KG, all the prices have to be multiplied by the number of kilos chosen by the user and divided by the value of the pricesApplicability. Let's suppose that: price per KG = 1 euro and the user wants to buy 10 kgs baggage. The servicePricesApplicability in this case is: unit = kg and value = 1. In the end the total price is 10 euros.
 **/
@ApiModel(description="It describes the way the prices have to be calculated, based on the unit and value of a characteristic of the service to be priced. This said, the total prices and unit prices will be influenced by the prices applicability. All prices will have to take into account the unit and the value to reflect the real service prices. For example to price a baggage per weight if unit = KG, all the prices have to be multiplied by the number of kilos chosen by the user and divided by the value of the pricesApplicability. Let's suppose that: price per KG = 1 euro and the user wants to buy 10 kgs baggage. The servicePricesApplicability in this case is: unit = kg and value = 1. In the end the total price is 10 euros.")
public class ServicePricesApplicability  {
  
  @ApiModelProperty(value = "Represents the unit of measurement of the characteristic of the service. For example the characteristic for which baggage is priced is weight then the unit will be KG.")
 /**
   * Represents the unit of measurement of the characteristic of the service. For example the characteristic for which baggage is priced is weight then the unit will be KG.
  **/
  private String unit = null;

  @ApiModelProperty(value = "Basic value of the unit of measurement. Indicates what's the basic value that the price will apply for. For example, if unit = KG and value = 5, it will mean that the minimum price is the price per 5 KGs unit. The final price will be based on the input of the user. ")
 /**
   * Basic value of the unit of measurement. Indicates what's the basic value that the price will apply for. For example, if unit = KG and value = 5, it will mean that the minimum price is the price per 5 KGs unit. The final price will be based on the input of the user. 
  **/
  private Long value = null;
 /**
   * Represents the unit of measurement of the characteristic of the service. For example the characteristic for which baggage is priced is weight then the unit will be KG.
   * @return unit
  **/
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public ServicePricesApplicability unit(String unit) {
    this.unit = unit;
    return this;
  }

 /**
   * Basic value of the unit of measurement. Indicates what&#39;s the basic value that the price will apply for. For example, if unit &#x3D; KG and value &#x3D; 5, it will mean that the minimum price is the price per 5 KGs unit. The final price will be based on the input of the user. 
   * minimum: 0
   * @return value
  **/
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public ServicePricesApplicability value(Long value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePricesApplicability {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

