package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BookingStatusDictionaryItem;
import com.koreanair.external.dx.vo.CurrencyDictionaryItem;
import com.koreanair.external.dx.vo.InsuranceDictionary;
import com.koreanair.external.dx.vo.InsuranceProviderDictionaryItem;
import com.koreanair.external.dx.vo.LocationDictionaryItem;
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

public class InsuranceOrderDictionary  {
  
  @ApiModelProperty(value = "Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, LocationDictionaryItem> location = null;

  @ApiModelProperty(value = "Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> country = null;

  @ApiModelProperty(value = "Insurance Providers map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Insurance Providers map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, InsuranceProviderDictionaryItem> insuranceProvider = null;

  @ApiModelProperty(value = "Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, CurrencyDictionaryItem> currency = null;

  @ApiModelProperty(value = "Status map for insurances. For more details please see [Maps in dictionary documentation] (http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Status map for insurances. For more details please see [Maps in dictionary documentation] (http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, BookingStatusDictionaryItem> bookingStatus = null;
 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return location
  **/
  @JsonProperty("location")
  public Map<String, LocationDictionaryItem> getLocation() {
    return location;
  }

  public void setLocation(Map<String, LocationDictionaryItem> location) {
    this.location = location;
  }

  public InsuranceOrderDictionary location(Map<String, LocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public InsuranceOrderDictionary putLocationItem(String key, LocationDictionaryItem locationItem) {
    this.location.put(key, locationItem);
    return this;
  }

 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return country
  **/
  @JsonProperty("country")
  public Map<String, String> getCountry() {
    return country;
  }

  public void setCountry(Map<String, String> country) {
    this.country = country;
  }

  public InsuranceOrderDictionary country(Map<String, String> country) {
    this.country = country;
    return this;
  }

  public InsuranceOrderDictionary putCountryItem(String key, String countryItem) {
    this.country.put(key, countryItem);
    return this;
  }

 /**
   * Insurance Providers map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return insuranceProvider
  **/
  @JsonProperty("insuranceProvider")
  public Map<String, InsuranceProviderDictionaryItem> getInsuranceProvider() {
    return insuranceProvider;
  }

  public void setInsuranceProvider(Map<String, InsuranceProviderDictionaryItem> insuranceProvider) {
    this.insuranceProvider = insuranceProvider;
  }

  public InsuranceOrderDictionary insuranceProvider(Map<String, InsuranceProviderDictionaryItem> insuranceProvider) {
    this.insuranceProvider = insuranceProvider;
    return this;
  }

  public InsuranceOrderDictionary putInsuranceProviderItem(String key, InsuranceProviderDictionaryItem insuranceProviderItem) {
    this.insuranceProvider.put(key, insuranceProviderItem);
    return this;
  }

 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return currency
  **/
  @JsonProperty("currency")
  public Map<String, CurrencyDictionaryItem> getCurrency() {
    return currency;
  }

  public void setCurrency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
  }

  public InsuranceOrderDictionary currency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
    return this;
  }

  public InsuranceOrderDictionary putCurrencyItem(String key, CurrencyDictionaryItem currencyItem) {
    this.currency.put(key, currencyItem);
    return this;
  }

 /**
   * Status map for insurances. For more details please see [Maps in dictionary documentation] (http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return bookingStatus
  **/
  @JsonProperty("bookingStatus")
  public Map<String, BookingStatusDictionaryItem> getBookingStatus() {
    return bookingStatus;
  }

  public void setBookingStatus(Map<String, BookingStatusDictionaryItem> bookingStatus) {
    this.bookingStatus = bookingStatus;
  }

  public InsuranceOrderDictionary bookingStatus(Map<String, BookingStatusDictionaryItem> bookingStatus) {
    this.bookingStatus = bookingStatus;
    return this;
  }

  public InsuranceOrderDictionary putBookingStatusItem(String key, BookingStatusDictionaryItem bookingStatusItem) {
    this.bookingStatus.put(key, bookingStatusItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceOrderDictionary {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    insuranceProvider: ").append(toIndentedString(insuranceProvider)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    bookingStatus: ").append(toIndentedString(bookingStatus)).append("\n");
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

