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
  * Contain all the information for the monetary amount
 **/
@ApiModel(description="Contain all the information for the monetary amount")
public class PaymentCurrencyConversionProposalAmount  {
  
  @ApiModelProperty(required = true, value = "Amount value after the conversion. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. ")
 /**
   * Amount value after the conversion. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. 
  **/
  private Amount convertedAmount = null;

  @ApiModelProperty(value = "Exchange rate including the provider margin")
 /**
   * Exchange rate including the provider margin
  **/
  private Float conversionRate = null;

  @ApiModelProperty(value = "Local amount of the airline. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.")
 /**
   * Local amount of the airline. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.
  **/
  private Amount originalAmount = null;
 /**
   * Amount value after the conversion. The decimal places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2. 
   * @return convertedAmount
  **/
  @JsonProperty("convertedAmount")
  public Amount getConvertedAmount() {
    return convertedAmount;
  }

  public void setConvertedAmount(Amount convertedAmount) {
    this.convertedAmount = convertedAmount;
  }

  public PaymentCurrencyConversionProposalAmount convertedAmount(Amount convertedAmount) {
    this.convertedAmount = convertedAmount;
    return this;
  }

 /**
   * Exchange rate including the provider margin
   * @return conversionRate
  **/
  @JsonProperty("conversionRate")
  public Float getConversionRate() {
    return conversionRate;
  }

  public void setConversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
  }

  public PaymentCurrencyConversionProposalAmount conversionRate(Float conversionRate) {
    this.conversionRate = conversionRate;
    return this;
  }

 /**
   * Local amount of the airline. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2.
   * @return originalAmount
  **/
  @JsonProperty("originalAmount")
  public Amount getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
  }

  public PaymentCurrencyConversionProposalAmount originalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCurrencyConversionProposalAmount {\n");
    
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
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

