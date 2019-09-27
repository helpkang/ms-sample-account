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

public class HotelTax  {
  
  @ApiModelProperty(value = "")
  private Amount amount = null;

  @ApiModelProperty(value = "The tax code which identifies the tax.   Examples:   1=BED_TAX   2=CITY_TAX ")
 /**
   * The tax code which identifies the tax.   Examples:   1=BED_TAX   2=CITY_TAX 
  **/
  private String code = null;

  @ApiModelProperty(value = "")
  private String percentage = null;

  @ApiModelProperty(value = "")
  private Boolean included = null;

  @ApiModelProperty(value = "")
  private String description = null;

  @ApiModelProperty(value = "Specifies if the tax applies per stay or per night  - PER_STAY  - PER_NIGHT ")
 /**
   * Specifies if the tax applies per stay or per night  - PER_STAY  - PER_NIGHT 
  **/
  private String pricingFrequency = null;

  @ApiModelProperty(value = "Specifies if the tax applies per occupant or per room  - PER_OCCUPANT  - PER_PRODUCT ")
 /**
   * Specifies if the tax applies per occupant or per room  - PER_OCCUPANT  - PER_PRODUCT 
  **/
  private String pricingMode = null;
 /**
   * Get amount
   * @return amount
  **/
  @JsonProperty("amount")
  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public HotelTax amount(Amount amount) {
    this.amount = amount;
    return this;
  }

 /**
   * The tax code which identifies the tax.   Examples:   1&#x3D;BED_TAX   2&#x3D;CITY_TAX 
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public HotelTax code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get percentage
   * @return percentage
  **/
  @JsonProperty("percentage")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }

  public HotelTax percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

 /**
   * Get included
   * @return included
  **/
  @JsonProperty("included")
  public Boolean isIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public HotelTax included(Boolean included) {
    this.included = included;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HotelTax description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Specifies if the tax applies per stay or per night  - PER_STAY  - PER_NIGHT 
   * @return pricingFrequency
  **/
  @JsonProperty("pricingFrequency")
  public String getPricingFrequency() {
    return pricingFrequency;
  }

  public void setPricingFrequency(String pricingFrequency) {
    this.pricingFrequency = pricingFrequency;
  }

  public HotelTax pricingFrequency(String pricingFrequency) {
    this.pricingFrequency = pricingFrequency;
    return this;
  }

 /**
   * Specifies if the tax applies per occupant or per room  - PER_OCCUPANT  - PER_PRODUCT 
   * @return pricingMode
  **/
  @JsonProperty("pricingMode")
  public String getPricingMode() {
    return pricingMode;
  }

  public void setPricingMode(String pricingMode) {
    this.pricingMode = pricingMode;
  }

  public HotelTax pricingMode(String pricingMode) {
    this.pricingMode = pricingMode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelTax {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pricingFrequency: ").append(toIndentedString(pricingFrequency)).append("\n");
    sb.append("    pricingMode: ").append(toIndentedString(pricingMode)).append("\n");
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

