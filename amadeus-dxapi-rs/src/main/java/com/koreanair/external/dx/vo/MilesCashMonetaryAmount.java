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
  * Specific amount information for Miles & Cash
 **/
@ApiModel(description="Specific amount information for Miles & Cash")
public class MilesCashMonetaryAmount  {
  
  @ApiModelProperty(required = true, value = "By redeeming miles, the monetary amount has been reduced by this amount. The amount value expressed as numerical information. The decimale places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.")
 /**
   * By redeeming miles, the monetary amount has been reduced by this amount. The amount value expressed as numerical information. The decimale places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.
  **/
  private Long convertedAmount = null;

  @ApiModelProperty(required = true, value = "This amount will not be paid in miles, it denotes the amount to be paid using a monetary payment method, e.g. Credit Card. The amount value expressed as numerical information. The decimale places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.")
 /**
   * This amount will not be paid in miles, it denotes the amount to be paid using a monetary payment method, e.g. Credit Card. The amount value expressed as numerical information. The decimale places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2.
  **/
  private Long nonConvertedAmount = null;

  @ApiModelProperty(required = true, value = "ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm).")
 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm).
  **/
  private String currencyCode = null;
 /**
   * By redeeming miles, the monetary amount has been reduced by this amount. The amount value expressed as numerical information. The decimale places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2.
   * minimum: 0
   * @return convertedAmount
  **/
  @JsonProperty("convertedAmount")
  public Long getConvertedAmount() {
    return convertedAmount;
  }

  public void setConvertedAmount(Long convertedAmount) {
    this.convertedAmount = convertedAmount;
  }

  public MilesCashMonetaryAmount convertedAmount(Long convertedAmount) {
    this.convertedAmount = convertedAmount;
    return this;
  }

 /**
   * This amount will not be paid in miles, it denotes the amount to be paid using a monetary payment method, e.g. Credit Card. The amount value expressed as numerical information. The decimale places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2.
   * minimum: 0
   * @return nonConvertedAmount
  **/
  @JsonProperty("nonConvertedAmount")
  public Long getNonConvertedAmount() {
    return nonConvertedAmount;
  }

  public void setNonConvertedAmount(Long nonConvertedAmount) {
    this.nonConvertedAmount = nonConvertedAmount;
  }

  public MilesCashMonetaryAmount nonConvertedAmount(Long nonConvertedAmount) {
    this.nonConvertedAmount = nonConvertedAmount;
    return this;
  }

 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm).
   * @return currencyCode
  **/
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public MilesCashMonetaryAmount currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilesCashMonetaryAmount {\n");
    
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    nonConvertedAmount: ").append(toIndentedString(nonConvertedAmount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

