package com.koreanair.external.dx.vo;

import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;

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
  * Currency conversion rate dictionary
 **/
@ApiModel(description="Currency conversion rate dictionary")
public class CurrencyConversionRateItem  {
  
  @ApiModelProperty(required = true, value = "The conversion factor to apply against the source currency to obtain the requested currency")
 /**
   * The conversion factor to apply against the source currency to obtain the requested currency
  **/
  private String rate = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Local start date and time for the validity of the rate with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Local start date and time for the validity of the rate with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime startValidityDateTime = null;

  @ApiModelProperty(example = "2018-02-10T20:40:00+02:00", value = "Local end date and time for the validity of the rate with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)")
 /**
   * Local end date and time for the validity of the rate with the following format \"yyyy-MM-dd'T'HH:mm:ssZ\" (e.g. 2018-02-10T20:40:00+02:00)
  **/
  private LocalDateTime endValidityDateTime = null;

  @ApiModelProperty(required = true, value = "Requested currency code")
 /**
   * Requested currency code
  **/
  private String target = null;

  @ApiModelProperty(required = true, value = "Indicates the number of decimal places for the target currency")
 /**
   * Indicates the number of decimal places for the target currency
  **/
  private Integer targetDecimalPlaces = null;
 /**
   * The conversion factor to apply against the source currency to obtain the requested currency
   * @return rate
  **/
  @JsonProperty("rate")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public CurrencyConversionRateItem rate(String rate) {
    this.rate = rate;
    return this;
  }

 /**
   * Local start date and time for the validity of the rate with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return startValidityDateTime
  **/
  @JsonProperty("startValidityDateTime")
  public LocalDateTime getStartValidityDateTime() {
    return startValidityDateTime;
  }

  public void setStartValidityDateTime(LocalDateTime startValidityDateTime) {
    this.startValidityDateTime = startValidityDateTime;
  }

  public CurrencyConversionRateItem startValidityDateTime(LocalDateTime startValidityDateTime) {
    this.startValidityDateTime = startValidityDateTime;
    return this;
  }

 /**
   * Local end date and time for the validity of the rate with the following format \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (e.g. 2018-02-10T20:40:00+02:00)
   * @return endValidityDateTime
  **/
  @JsonProperty("endValidityDateTime")
  public LocalDateTime getEndValidityDateTime() {
    return endValidityDateTime;
  }

  public void setEndValidityDateTime(LocalDateTime endValidityDateTime) {
    this.endValidityDateTime = endValidityDateTime;
  }

  public CurrencyConversionRateItem endValidityDateTime(LocalDateTime endValidityDateTime) {
    this.endValidityDateTime = endValidityDateTime;
    return this;
  }

 /**
   * Requested currency code
   * @return target
  **/
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public CurrencyConversionRateItem target(String target) {
    this.target = target;
    return this;
  }

 /**
   * Indicates the number of decimal places for the target currency
   * @return targetDecimalPlaces
  **/
  @JsonProperty("targetDecimalPlaces")
  public Integer getTargetDecimalPlaces() {
    return targetDecimalPlaces;
  }

  public void setTargetDecimalPlaces(Integer targetDecimalPlaces) {
    this.targetDecimalPlaces = targetDecimalPlaces;
  }

  public CurrencyConversionRateItem targetDecimalPlaces(Integer targetDecimalPlaces) {
    this.targetDecimalPlaces = targetDecimalPlaces;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyConversionRateItem {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    startValidityDateTime: ").append(toIndentedString(startValidityDateTime)).append("\n");
    sb.append("    endValidityDateTime: ").append(toIndentedString(endValidityDateTime)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetDecimalPlaces: ").append(toIndentedString(targetDecimalPlaces)).append("\n");
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

