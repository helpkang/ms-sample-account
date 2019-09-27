package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CountryDictionary;
import com.koreanair.external.dx.vo.InsuranceProviderDictionaryItem;
import com.koreanair.external.dx.vo.LocationDictionaryItem;
import io.swagger.annotations.ApiModel;
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

/**
  * The dictionary is used to store all common data repreated among insurance offers. It is made of the country description and the provider description.
 **/
@ApiModel(description="The dictionary is used to store all common data repreated among insurance offers. It is made of the country description and the provider description.")
public class InsuranceDictionaryCommon  {
  
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

  public InsuranceDictionaryCommon location(Map<String, LocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public InsuranceDictionaryCommon putLocationItem(String key, LocationDictionaryItem locationItem) {
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

  public InsuranceDictionaryCommon country(Map<String, String> country) {
    this.country = country;
    return this;
  }

  public InsuranceDictionaryCommon putCountryItem(String key, String countryItem) {
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

  public InsuranceDictionaryCommon insuranceProvider(Map<String, InsuranceProviderDictionaryItem> insuranceProvider) {
    this.insuranceProvider = insuranceProvider;
    return this;
  }

  public InsuranceDictionaryCommon putInsuranceProviderItem(String key, InsuranceProviderDictionaryItem insuranceProviderItem) {
    this.insuranceProvider.put(key, insuranceProviderItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceDictionaryCommon {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    insuranceProvider: ").append(toIndentedString(insuranceProvider)).append("\n");
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

