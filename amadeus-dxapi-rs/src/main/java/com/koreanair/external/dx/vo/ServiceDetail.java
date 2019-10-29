package com.koreanair.external.dx.vo;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceDetail  {
  
  @ApiModelProperty(value = "Flight to which the service selection is attached to")
 /**
   * Flight to which the service selection is attached to
  **/
  private String flightId = null;

  @ApiModelProperty(value = "Quantity of service requested (e.g. Number of bags)")
 /**
   * Quantity of service requested (e.g. Number of bags)
  **/
  private Integer quantity = null;
 /**
   * Flight to which the service selection is attached to
   * @return flightId
  **/
  @JsonProperty("flightId")
  public String getFlightId() {
    return flightId;
  }

  public void setFlightId(String flightId) {
    this.flightId = flightId;
  }

  public ServiceDetail flightId(String flightId) {
    this.flightId = flightId;
    return this;
  }

 /**
   * Quantity of service requested (e.g. Number of bags)
   * minimum: 1
   * maximum: 99
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ServiceDetail quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDetail {\n");
    
    sb.append("    flightId: ").append(toIndentedString(flightId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

