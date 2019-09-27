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
  * Contains practical information about the displayed Alternative Payment Method. 
 **/
@ApiModel(description="Contains practical information about the displayed Alternative Payment Method. ")
public class AlternativePaymentMethodProperties  {
  
  @ApiModelProperty(value = "Boolean value to indicate if the Alternative Payment Method needs web redirection")
 /**
   * Boolean value to indicate if the Alternative Payment Method needs web redirection
  **/
  private Boolean needsRedirection = null;

  @ApiModelProperty(value = "Boolean value to indicate if the Alternative Payment Method is refundable online")
 /**
   * Boolean value to indicate if the Alternative Payment Method is refundable online
  **/
  private Boolean isRefundableOnline = null;

  @ApiModelProperty(value = "Boolean value to indicate if the Alternative Payment Method  needs asynchronous payment confirmation process. Asynchronous payments do not require calling the API confirmation  endpoint. The Payment Service Provider (PSP) will notify Amadeus  Payment Platform when the payment has been completed, which will  in turn issue the travel documents.")
 /**
   * Boolean value to indicate if the Alternative Payment Method  needs asynchronous payment confirmation process. Asynchronous payments do not require calling the API confirmation  endpoint. The Payment Service Provider (PSP) will notify Amadeus  Payment Platform when the payment has been completed, which will  in turn issue the travel documents.
  **/
  private Boolean isAsynchronous = null;
 /**
   * Boolean value to indicate if the Alternative Payment Method needs web redirection
   * @return needsRedirection
  **/
  @JsonProperty("needsRedirection")
  public Boolean isNeedsRedirection() {
    return needsRedirection;
  }

  public void setNeedsRedirection(Boolean needsRedirection) {
    this.needsRedirection = needsRedirection;
  }

  public AlternativePaymentMethodProperties needsRedirection(Boolean needsRedirection) {
    this.needsRedirection = needsRedirection;
    return this;
  }

 /**
   * Boolean value to indicate if the Alternative Payment Method is refundable online
   * @return isRefundableOnline
  **/
  @JsonProperty("isRefundableOnline")
  public Boolean isIsRefundableOnline() {
    return isRefundableOnline;
  }

  public void setIsRefundableOnline(Boolean isRefundableOnline) {
    this.isRefundableOnline = isRefundableOnline;
  }

  public AlternativePaymentMethodProperties isRefundableOnline(Boolean isRefundableOnline) {
    this.isRefundableOnline = isRefundableOnline;
    return this;
  }

 /**
   * Boolean value to indicate if the Alternative Payment Method  needs asynchronous payment confirmation process. Asynchronous payments do not require calling the API confirmation  endpoint. The Payment Service Provider (PSP) will notify Amadeus  Payment Platform when the payment has been completed, which will  in turn issue the travel documents.
   * @return isAsynchronous
  **/
  @JsonProperty("isAsynchronous")
  public Boolean isIsAsynchronous() {
    return isAsynchronous;
  }

  public void setIsAsynchronous(Boolean isAsynchronous) {
    this.isAsynchronous = isAsynchronous;
  }

  public AlternativePaymentMethodProperties isAsynchronous(Boolean isAsynchronous) {
    this.isAsynchronous = isAsynchronous;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativePaymentMethodProperties {\n");
    
    sb.append("    needsRedirection: ").append(toIndentedString(needsRedirection)).append("\n");
    sb.append("    isRefundableOnline: ").append(toIndentedString(isRefundableOnline)).append("\n");
    sb.append("    isAsynchronous: ").append(toIndentedString(isAsynchronous)).append("\n");
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

