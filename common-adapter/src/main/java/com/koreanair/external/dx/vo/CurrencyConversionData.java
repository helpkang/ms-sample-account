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
  * Currency conversion results.
 **/
@ApiModel(description="Currency conversion results.")
public class CurrencyConversionData  {
  
  @ApiModelProperty(value = "Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.")
 /**
   * Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.
  **/
  private Amount convertedAmount = null;

  @ApiModelProperty(value = "Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.")
 /**
   * Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.
  **/
  private Amount originalAmount = null;
 /**
   * Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2.
   * @return convertedAmount
  **/
  @JsonProperty("convertedAmount")
  public Amount getConvertedAmount() {
    return convertedAmount;
  }

  public void setConvertedAmount(Amount convertedAmount) {
    this.convertedAmount = convertedAmount;
  }

  public CurrencyConversionData convertedAmount(Amount convertedAmount) {
    this.convertedAmount = convertedAmount;
    return this;
  }

 /**
   * Amount to be converted. The amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2.
   * @return originalAmount
  **/
  @JsonProperty("originalAmount")
  public Amount getOriginalAmount() {
    return originalAmount;
  }

  public void setOriginalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
  }

  public CurrencyConversionData originalAmount(Amount originalAmount) {
    this.originalAmount = originalAmount;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyConversionData {\n");
    
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
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

