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
  * Conveys the order of the rate.
 **/
@ApiModel(description="Conveys the order of the rate.")
public class CarRateRanking  {
  
  @ApiModelProperty(example = "1", value = "The relative order among all the returned rates for this provider. For example Rental Cars sorts the rates based on a custom algorithm. This algorithm takes into account the popularity of the rate, the point of sale or any other specific criteria. The lower the ranking is, the most recommended the recommendation is.")
 /**
   * The relative order among all the returned rates for this provider. For example Rental Cars sorts the rates based on a custom algorithm. This algorithm takes into account the popularity of the rate, the point of sale or any other specific criteria. The lower the ranking is, the most recommended the recommendation is.
  **/
  private Integer providerOrder = null;
 /**
   * The relative order among all the returned rates for this provider. For example Rental Cars sorts the rates based on a custom algorithm. This algorithm takes into account the popularity of the rate, the point of sale or any other specific criteria. The lower the ranking is, the most recommended the recommendation is.
   * @return providerOrder
  **/
  @JsonProperty("providerOrder")
  public Integer getProviderOrder() {
    return providerOrder;
  }

  public void setProviderOrder(Integer providerOrder) {
    this.providerOrder = providerOrder;
  }

  public CarRateRanking providerOrder(Integer providerOrder) {
    this.providerOrder = providerOrder;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRateRanking {\n");
    
    sb.append("    providerOrder: ").append(toIndentedString(providerOrder)).append("\n");
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

