package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tax  {
  
  @ApiModelProperty(required = true, value = "Amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. ")
 /**
   * Amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \"EUR 100.85\" will be represented as `10085`, with the currency `decimalPlaces` = 2. 
  **/
  private Long value = null;

  @ApiModelProperty(required = true, value = "ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For points (or miles) the code associated is `MIL`, for compensation/upgrade credits `ECR`")
 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For points (or miles) the code associated is `MIL`, for compensation/upgrade credits `ECR`
  **/
  private String currencyCode = null;

  @ApiModelProperty(value = "Tax code")
 /**
   * Tax code
  **/
  private String code = null;

  @ApiModelProperty(value = "flag indicating if the tax has been exempted")
 /**
   * flag indicating if the tax has been exempted
  **/
  private Boolean isExempted = null;

  @ApiModelProperty(value = "Information available only when used in the context of car-offers. Percentage based on which the tax is calculated. ")
 /**
   * Information available only when used in the context of car-offers. Percentage based on which the tax is calculated. 
  **/
  private Long percentage = null;
 /**
   * Amount value expressed as numerical information. The decimal places are defined at currency level. e.g. \&quot;EUR 100.85\&quot; will be represented as &#x60;10085&#x60;, with the currency &#x60;decimalPlaces&#x60; &#x3D; 2. 
   * minimum: 0
   * @return value
  **/
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public Tax value(Long value) {
    this.value = value;
    return this;
  }

 /**
   * ISO currency code (http://www.iso.org/iso/home/standards/currency_codes.htm). For points (or miles) the code associated is &#x60;MIL&#x60;, for compensation/upgrade credits &#x60;ECR&#x60;
   * @return currencyCode
  **/
  @JsonProperty("currencyCode")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Tax currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
   * Tax code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Tax code(String code) {
    this.code = code;
    return this;
  }

 /**
   * flag indicating if the tax has been exempted
   * @return isExempted
  **/
  @JsonProperty("isExempted")
  public Boolean isIsExempted() {
    return isExempted;
  }

  public void setIsExempted(Boolean isExempted) {
    this.isExempted = isExempted;
  }

  public Tax isExempted(Boolean isExempted) {
    this.isExempted = isExempted;
    return this;
  }

 /**
   * Information available only when used in the context of car-offers. Percentage based on which the tax is calculated. 
   * @return percentage
  **/
  @JsonProperty("percentage")
  public Long getPercentage() {
    return percentage;
  }

  public void setPercentage(Long percentage) {
    this.percentage = percentage;
  }

  public Tax percentage(Long percentage) {
    this.percentage = percentage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isExempted: ").append(toIndentedString(isExempted)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

