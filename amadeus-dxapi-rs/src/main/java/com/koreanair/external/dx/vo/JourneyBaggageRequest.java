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
  * Object used when adding baggages to a journey
 **/
@ApiModel(description="Object used when adding baggages to a journey")
public class JourneyBaggageRequest  {
  
  @ApiModelProperty(required = true, value = "Id of the traveler to add the baggages to")
 /**
   * Id of the traveler to add the baggages to
  **/
  private String travelerId = null;

  @ApiModelProperty(value = "Quantity of baggages to add")
 /**
   * Quantity of baggages to add
  **/
  private Integer quantity = null;

  @ApiModelProperty(value = "In case of special baggage, the type to add as filed by the airline and returned by the baggage policies.")
 /**
   * In case of special baggage, the type to add as filed by the airline and returned by the baggage policies.
  **/
  private String type = null;
 /**
   * Id of the traveler to add the baggages to
   * @return travelerId
  **/
  @JsonProperty("travelerId")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public JourneyBaggageRequest travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

 /**
   * Quantity of baggages to add
   * minimum: 0
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public JourneyBaggageRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * In case of special baggage, the type to add as filed by the airline and returned by the baggage policies.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public JourneyBaggageRequest type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyBaggageRequest {\n");
    
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

