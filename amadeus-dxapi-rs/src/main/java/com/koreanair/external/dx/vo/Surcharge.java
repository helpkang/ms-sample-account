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

public class Surcharge  {
  
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

  @ApiModelProperty(value = "Surcharge code")
 /**
   * Surcharge code
  **/
  private String code = null;

  @ApiModelProperty(value = "flag indicating if the surcharge has been exempted")
 /**
   * flag indicating if the surcharge has been exempted
  **/
  private Boolean isExempted = null;


@XmlType(name="PricingTimeWindowEnum")
@XmlEnum(String.class)
public enum PricingTimeWindowEnum {

@XmlEnumValue("hourly") HOURLY(String.valueOf("hourly")), @XmlEnumValue("daily") DAILY(String.valueOf("daily")), @XmlEnumValue("monthly") MONTHLY(String.valueOf("monthly")), @XmlEnumValue("weekend") WEEKEND(String.valueOf("weekend")), @XmlEnumValue("weekly") WEEKLY(String.valueOf("weekly")), @XmlEnumValue("fullPeriod") FULLPERIOD(String.valueOf("fullPeriod"));


    private String value;

    PricingTimeWindowEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PricingTimeWindowEnum fromValue(String v) {
        for (PricingTimeWindowEnum b : PricingTimeWindowEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Period for which the surcharge pricing applies")
 /**
   * Period for which the surcharge pricing applies
  **/
  private PricingTimeWindowEnum pricingTimeWindow = null;

  @ApiModelProperty(value = "Information available only when used in the context of car-offers. Percentage based on which the surcharge is calculated. ")
 /**
   * Information available only when used in the context of car-offers. Percentage based on which the surcharge is calculated. 
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

  public Surcharge value(Long value) {
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

  public Surcharge currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
   * Surcharge code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Surcharge code(String code) {
    this.code = code;
    return this;
  }

 /**
   * flag indicating if the surcharge has been exempted
   * @return isExempted
  **/
  @JsonProperty("isExempted")
  public Boolean isIsExempted() {
    return isExempted;
  }

  public void setIsExempted(Boolean isExempted) {
    this.isExempted = isExempted;
  }

  public Surcharge isExempted(Boolean isExempted) {
    this.isExempted = isExempted;
    return this;
  }

 /**
   * Period for which the surcharge pricing applies
   * @return pricingTimeWindow
  **/
  @JsonProperty("pricingTimeWindow")
  public String getPricingTimeWindow() {
    if (pricingTimeWindow == null) {
      return null;
    }
    return pricingTimeWindow.value();
  }

  public void setPricingTimeWindow(PricingTimeWindowEnum pricingTimeWindow) {
    this.pricingTimeWindow = pricingTimeWindow;
  }

  public Surcharge pricingTimeWindow(PricingTimeWindowEnum pricingTimeWindow) {
    this.pricingTimeWindow = pricingTimeWindow;
    return this;
  }

 /**
   * Information available only when used in the context of car-offers. Percentage based on which the surcharge is calculated. 
   * @return percentage
  **/
  @JsonProperty("percentage")
  public Long getPercentage() {
    return percentage;
  }

  public void setPercentage(Long percentage) {
    this.percentage = percentage;
  }

  public Surcharge percentage(Long percentage) {
    this.percentage = percentage;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Surcharge {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isExempted: ").append(toIndentedString(isExempted)).append("\n");
    sb.append("    pricingTimeWindow: ").append(toIndentedString(pricingTimeWindow)).append("\n");
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

