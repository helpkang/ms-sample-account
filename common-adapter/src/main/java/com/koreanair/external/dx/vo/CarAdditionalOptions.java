package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarAdditionalOptionsPrice;
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
  * This object includes all the additional options that can be selected at booking time.  Each of them could be part of the options to be paid at booking time (payNow) or at pickupTime (payLater)
 **/
@ApiModel(description="This object includes all the additional options that can be selected at booking time.  Each of them could be part of the options to be paid at booking time (payNow) or at pickupTime (payLater)")
public class CarAdditionalOptions  {
  
  @ApiModelProperty(value = "")
  private CarAdditionalOptionsPrice payNow = null;

  @ApiModelProperty(value = "")
  private CarAdditionalOptionsPrice payLater = null;
 /**
   * Get payNow
   * @return payNow
  **/
  @JsonProperty("payNow")
  public CarAdditionalOptionsPrice getPayNow() {
    return payNow;
  }

  public void setPayNow(CarAdditionalOptionsPrice payNow) {
    this.payNow = payNow;
  }

  public CarAdditionalOptions payNow(CarAdditionalOptionsPrice payNow) {
    this.payNow = payNow;
    return this;
  }

 /**
   * Get payLater
   * @return payLater
  **/
  @JsonProperty("payLater")
  public CarAdditionalOptionsPrice getPayLater() {
    return payLater;
  }

  public void setPayLater(CarAdditionalOptionsPrice payLater) {
    this.payLater = payLater;
  }

  public CarAdditionalOptions payLater(CarAdditionalOptionsPrice payLater) {
    this.payLater = payLater;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarAdditionalOptions {\n");
    
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

