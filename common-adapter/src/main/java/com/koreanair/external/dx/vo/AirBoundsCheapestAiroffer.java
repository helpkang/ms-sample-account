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
  * Cheapest air offer you can get while selecting this bound
 **/
@ApiModel(description="Cheapest air offer you can get while selecting this bound")
public class AirBoundsCheapestAiroffer  {
  
  @ApiModelProperty(value = "Best total price you can get while selecting this bound")
 /**
   * Best total price you can get while selecting this bound
  **/
  private Amount totalPrice = null;

  @ApiModelProperty(value = "Identifier of the cheapest air offer that could be generated while selecting this bound")
 /**
   * Identifier of the cheapest air offer that could be generated while selecting this bound
  **/
  private String airOfferId = null;
 /**
   * Best total price you can get while selecting this bound
   * @return totalPrice
  **/
  @JsonProperty("totalPrice")
  public Amount getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
  }

  public AirBoundsCheapestAiroffer totalPrice(Amount totalPrice) {
    this.totalPrice = totalPrice;
    return this;
  }

 /**
   * Identifier of the cheapest air offer that could be generated while selecting this bound
   * @return airOfferId
  **/
  @JsonProperty("airOfferId")
  public String getAirOfferId() {
    return airOfferId;
  }

  public void setAirOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
  }

  public AirBoundsCheapestAiroffer airOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBoundsCheapestAiroffer {\n");
    
    sb.append("    totalPrice: ").append(toIndentedString(totalPrice)).append("\n");
    sb.append("    airOfferId: ").append(toIndentedString(airOfferId)).append("\n");
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

