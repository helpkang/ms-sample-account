package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CurrencyDictionaryItem;
import com.koreanair.external.dx.vo.Hotel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelDictionary  {
  
  @ApiModelProperty(value = "Hotel details corresponding to a hotel id.")
 /**
   * Hotel details corresponding to a hotel id.
  **/
  private Map<String, Hotel> hotelDetails = null;

  @ApiModelProperty(value = "- Used to convey the number of decimal places of the amounts retuned by a hotel - Used to convey rate conversions in case the requested currency differs from the currency returned by a hotel - target_amount = rate x origin_amount - Example:         currencyDictionary: {           USD: {                 decimalPlaces: 2,                 conversionRate: [                       {                       \"rate\": \"0.8762838000000001\",                       \"target\": \"EUR\",                       \"targetDecimalPlaces\": 2                       },           GBP: {                 decimalPlaces: 2,                 conversionRate: [                       {                       \"rate\": \"1.3107280000000001\",                       \"target\": \"EUR\",                       \"targetDecimalPlaces\": 2             }         }         ")
 /**
   * - Used to convey the number of decimal places of the amounts retuned by a hotel - Used to convey rate conversions in case the requested currency differs from the currency returned by a hotel - target_amount = rate x origin_amount - Example:         currencyDictionary: {           USD: {                 decimalPlaces: 2,                 conversionRate: [                       {                       \"rate\": \"0.8762838000000001\",                       \"target\": \"EUR\",                       \"targetDecimalPlaces\": 2                       },           GBP: {                 decimalPlaces: 2,                 conversionRate: [                       {                       \"rate\": \"1.3107280000000001\",                       \"target\": \"EUR\",                       \"targetDecimalPlaces\": 2             }         }         
  **/
  private Map<String, CurrencyDictionaryItem> currencyDictionary = null;
 /**
   * Hotel details corresponding to a hotel id.
   * @return hotelDetails
  **/
  @JsonProperty("hotelDetails")
  public Map<String, Hotel> getHotelDetails() {
    return hotelDetails;
  }

  public void setHotelDetails(Map<String, Hotel> hotelDetails) {
    this.hotelDetails = hotelDetails;
  }

  public HotelDictionary hotelDetails(Map<String, Hotel> hotelDetails) {
    this.hotelDetails = hotelDetails;
    return this;
  }

  public HotelDictionary putHotelDetailsItem(String key, Hotel hotelDetailsItem) {
    this.hotelDetails.put(key, hotelDetailsItem);
    return this;
  }

 /**
   * - Used to convey the number of decimal places of the amounts retuned by a hotel - Used to convey rate conversions in case the requested currency differs from the currency returned by a hotel - target_amount &#x3D; rate x origin_amount - Example:         currencyDictionary: {           USD: {                 decimalPlaces: 2,                 conversionRate: [                       {                       \&quot;rate\&quot;: \&quot;0.8762838000000001\&quot;,                       \&quot;target\&quot;: \&quot;EUR\&quot;,                       \&quot;targetDecimalPlaces\&quot;: 2                       },           GBP: {                 decimalPlaces: 2,                 conversionRate: [                       {                       \&quot;rate\&quot;: \&quot;1.3107280000000001\&quot;,                       \&quot;target\&quot;: \&quot;EUR\&quot;,                       \&quot;targetDecimalPlaces\&quot;: 2             }         }         
   * @return currencyDictionary
  **/
  @JsonProperty("currencyDictionary")
  public Map<String, CurrencyDictionaryItem> getCurrencyDictionary() {
    return currencyDictionary;
  }

  public void setCurrencyDictionary(Map<String, CurrencyDictionaryItem> currencyDictionary) {
    this.currencyDictionary = currencyDictionary;
  }

  public HotelDictionary currencyDictionary(Map<String, CurrencyDictionaryItem> currencyDictionary) {
    this.currencyDictionary = currencyDictionary;
    return this;
  }

  public HotelDictionary putCurrencyDictionaryItem(String key, CurrencyDictionaryItem currencyDictionaryItem) {
    this.currencyDictionary.put(key, currencyDictionaryItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDictionary {\n");
    
    sb.append("    hotelDetails: ").append(toIndentedString(hotelDetails)).append("\n");
    sb.append("    currencyDictionary: ").append(toIndentedString(currencyDictionary)).append("\n");
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

