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
  * Item that represents a special bag.
 **/
@ApiModel(description="Item that represents a special bag.")
public class CheckInSpecialBaggageItem  {
  
  @ApiModelProperty(required = true, value = "Type of the special bag as filed by the airline.")
 /**
   * Type of the special bag as filed by the airline.
  **/
  private String type = null;

  @ApiModelProperty(value = "Readable description of the special baggage type, usually only in english. Example: Hunting trophy")
 /**
   * Readable description of the special baggage type, usually only in english. Example: Hunting trophy
  **/
  private String description = null;

  @ApiModelProperty(value = "Price of the special bag, if known.")
 /**
   * Price of the special bag, if known.
  **/
  private Amount price = null;
 /**
   * Type of the special bag as filed by the airline.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CheckInSpecialBaggageItem type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Readable description of the special baggage type, usually only in english. Example: Hunting trophy
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CheckInSpecialBaggageItem description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Price of the special bag, if known.
   * @return price
  **/
  @JsonProperty("price")
  public Amount getPrice() {
    return price;
  }

  public void setPrice(Amount price) {
    this.price = price;
  }

  public CheckInSpecialBaggageItem price(Amount price) {
    this.price = price;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckInSpecialBaggageItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

