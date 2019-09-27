package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarPrice;
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
  * Total prices and associated breakdowns to be paid at booking time  and later at either pick up or drop off of the car
 **/
@ApiModel(description="Total prices and associated breakdowns to be paid at booking time  and later at either pick up or drop off of the car")
public class CarDueTimePrice  {
  
  @ApiModelProperty(value = "Price to be paid at booking time.")
 /**
   * Price to be paid at booking time.
  **/
  private CarPrice payNow = null;

  @ApiModelProperty(value = "Price to be paid at pick up or drop off time.")
 /**
   * Price to be paid at pick up or drop off time.
  **/
  private CarPrice payLater = null;
 /**
   * Price to be paid at booking time.
   * @return payNow
  **/
  @JsonProperty("payNow")
  public CarPrice getPayNow() {
    return payNow;
  }

  public void setPayNow(CarPrice payNow) {
    this.payNow = payNow;
  }

  public CarDueTimePrice payNow(CarPrice payNow) {
    this.payNow = payNow;
    return this;
  }

 /**
   * Price to be paid at pick up or drop off time.
   * @return payLater
  **/
  @JsonProperty("payLater")
  public CarPrice getPayLater() {
    return payLater;
  }

  public void setPayLater(CarPrice payLater) {
    this.payLater = payLater;
  }

  public CarDueTimePrice payLater(CarPrice payLater) {
    this.payLater = payLater;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarDueTimePrice {\n");
    
    sb.append("    payNow: ").append(toIndentedString(payNow)).append("\n");
    sb.append("    payLater: ").append(toIndentedString(payLater)).append("\n");
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

