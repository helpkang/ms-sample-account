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

public class VariationAmount  {
  
  @ApiModelProperty(required = true, value = "Amount value expressed as numerical information. The value can be negative to reflect a cheaper price variation. The decimal places are defined at currency level. For example: \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. \"EUR -16.3\" will be represented as `-163`, with the currency `decimalPlaces` = 1. ")
 /**
   * Amount value expressed as numerical information. The value can be negative to reflect a cheaper price variation. The decimal places are defined at currency level. For example: \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. \"EUR -16.3\" will be represented as `-163`, with the currency `decimalPlaces` = 1. 
  **/
  private Long value = null;

  @ApiModelProperty(required = true, value = "ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For miles the code associated is `MIL`.")
 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For miles the code associated is `MIL`.
  **/
  private String currencyCode = null;
 /**
   * Amount value expressed as numerical information. The value can be negative to reflect a cheaper price variation. The decimal places are defined at currency level. For example: \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2. \&quot;EUR -16.3\&quot; will be represented as &#x60;-163&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 1. 
   * @return value
  **/
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public VariationAmount value(Long value) {
    this.value = value;
    return this;
  }

 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For miles the code associated is &#x60;MIL&#x60;.
   * @return currencyCode
  **/
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public VariationAmount currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariationAmount {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

