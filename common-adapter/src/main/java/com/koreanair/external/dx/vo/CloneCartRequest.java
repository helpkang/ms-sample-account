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
  * This element provides the elements to repeat the cart from order
 **/
@ApiModel(description="This element provides the elements to repeat the cart from order")
public class CloneCartRequest  {
  
  @ApiModelProperty(value = "Identifier of the source order from which the content is used to populate the new cart")
 /**
   * Identifier of the source order from which the content is used to populate the new cart
  **/
  private String orderId = null;

  @ApiModelProperty(value = "offerId to be added in to the newly created cart")
 /**
   * offerId to be added in to the newly created cart
  **/
  private String airOfferId = null;
 /**
   * Identifier of the source order from which the content is used to populate the new cart
   * @return orderId
  **/
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public CloneCartRequest orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * offerId to be added in to the newly created cart
   * @return airOfferId
  **/
  @JsonProperty("airOfferId")
  public String getAirOfferId() {
    return airOfferId;
  }

  public void setAirOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
  }

  public CloneCartRequest airOfferId(String airOfferId) {
    this.airOfferId = airOfferId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneCartRequest {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

