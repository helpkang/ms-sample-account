package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CurrencyConversionRateItem;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;

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
  * Currency dictionary
 **/
@ApiModel(description="Currency dictionary")
public class CurrencyDictionaryItem  {
  
  @ApiModelProperty(required = true, value = "Localized currency name")
 /**
   * Localized currency name
  **/
  private String name = null;

  @ApiModelProperty(required = true, value = "Number of digits to the right of the decimal point used for the amounts in this specific currency (e.g. 50.00 EUR uses 2 decimal places)")
 /**
   * Number of digits to the right of the decimal point used for the amounts in this specific currency (e.g. 50.00 EUR uses 2 decimal places)
  **/
  private Integer decimalPlaces = null;

  @ApiModelProperty(value = "List of currency conversions rates associated to this currency")
 /**
   * List of currency conversions rates associated to this currency
  **/
  private List<CurrencyConversionRateItem> conversionRates = null;
 /**
   * Localized currency name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CurrencyDictionaryItem name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Number of digits to the right of the decimal point used for the amounts in this specific currency (e.g. 50.00 EUR uses 2 decimal places)
   * @return decimalPlaces
  **/
  @JsonProperty("decimalPlaces")
  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }

  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }

  public CurrencyDictionaryItem decimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
    return this;
  }

 /**
   * List of currency conversions rates associated to this currency
   * @return conversionRates
  **/
  @JsonProperty("conversionRates")
  public List<CurrencyConversionRateItem> getConversionRates() {
    return conversionRates;
  }

  public void setConversionRates(List<CurrencyConversionRateItem> conversionRates) {
    this.conversionRates = conversionRates;
  }

  public CurrencyDictionaryItem conversionRates(List<CurrencyConversionRateItem> conversionRates) {
    this.conversionRates = conversionRates;
    return this;
  }

  public CurrencyDictionaryItem addConversionRatesItem(CurrencyConversionRateItem conversionRatesItem) {
    this.conversionRates.add(conversionRatesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyDictionaryItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    conversionRates: ").append(toIndentedString(conversionRates)).append("\n");
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

