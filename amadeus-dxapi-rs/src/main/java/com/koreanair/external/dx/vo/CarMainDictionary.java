package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarAcrissCodeDictionaryItem;
import com.koreanair.external.dx.vo.CarCompanyDictionaryItem;
import com.koreanair.external.dx.vo.CarDictionary;
import com.koreanair.external.dx.vo.CarLocationDictionaryItem;
import com.koreanair.external.dx.vo.CurrencyDictionaryItem;
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

public class CarMainDictionary  {
  
  @ApiModelProperty(value = "Car location details corresponding to a car location id. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Car location details corresponding to a car location id. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, CarLocationDictionaryItem> location = null;

  @ApiModelProperty(value = "Car company details map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Car company details map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, CarCompanyDictionaryItem> company = null;

  @ApiModelProperty(value = "Car acriss codes map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Car acriss codes map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, CarAcrissCodeDictionaryItem> acriss = null;

  @ApiModelProperty(value = "Car shuttle information map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Car shuttle information map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, String> shuttle = null;

  @ApiModelProperty(value = "Description of a rating criterion")
 /**
   * Description of a rating criterion
  **/
  private Map<String, String> ratingCriterion = null;

  @ApiModelProperty(value = "Coverage types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Coverage types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, String> coverage = null;

  @ApiModelProperty(value = "Special equipment types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Special equipment types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, String> specialEquipment = null;

  @ApiModelProperty(value = "Surcharge types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Surcharge types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, String> surcharge = null;

  @ApiModelProperty(value = "Tax types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Tax types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, String> tax = null;

  @ApiModelProperty(value = "Fuel policy map used in rate info. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Fuel policy map used in rate info. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, String> fuelPolicy = null;

  @ApiModelProperty(value = "Currencies map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, CurrencyDictionaryItem> currency = null;
 /**
   * Car location details corresponding to a car location id. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return location
  **/
  @JsonProperty("location")
  public Map<String, CarLocationDictionaryItem> getLocation() {
    return location;
  }

  public void setLocation(Map<String, CarLocationDictionaryItem> location) {
    this.location = location;
  }

  public CarMainDictionary location(Map<String, CarLocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public CarMainDictionary putLocationItem(String key, CarLocationDictionaryItem locationItem) {
    this.location.put(key, locationItem);
    return this;
  }

 /**
   * Car company details map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return company
  **/
  @JsonProperty("company")
  public Map<String, CarCompanyDictionaryItem> getCompany() {
    return company;
  }

  public void setCompany(Map<String, CarCompanyDictionaryItem> company) {
    this.company = company;
  }

  public CarMainDictionary company(Map<String, CarCompanyDictionaryItem> company) {
    this.company = company;
    return this;
  }

  public CarMainDictionary putCompanyItem(String key, CarCompanyDictionaryItem companyItem) {
    this.company.put(key, companyItem);
    return this;
  }

 /**
   * Car acriss codes map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return acriss
  **/
  @JsonProperty("acriss")
  public Map<String, CarAcrissCodeDictionaryItem> getAcriss() {
    return acriss;
  }

  public void setAcriss(Map<String, CarAcrissCodeDictionaryItem> acriss) {
    this.acriss = acriss;
  }

  public CarMainDictionary acriss(Map<String, CarAcrissCodeDictionaryItem> acriss) {
    this.acriss = acriss;
    return this;
  }

  public CarMainDictionary putAcrissItem(String key, CarAcrissCodeDictionaryItem acrissItem) {
    this.acriss.put(key, acrissItem);
    return this;
  }

 /**
   * Car shuttle information map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return shuttle
  **/
  @JsonProperty("shuttle")
  public Map<String, String> getShuttle() {
    return shuttle;
  }

  public void setShuttle(Map<String, String> shuttle) {
    this.shuttle = shuttle;
  }

  public CarMainDictionary shuttle(Map<String, String> shuttle) {
    this.shuttle = shuttle;
    return this;
  }

  public CarMainDictionary putShuttleItem(String key, String shuttleItem) {
    this.shuttle.put(key, shuttleItem);
    return this;
  }

 /**
   * Description of a rating criterion
   * @return ratingCriterion
  **/
  @JsonProperty("ratingCriterion")
  public Map<String, String> getRatingCriterion() {
    return ratingCriterion;
  }

  public void setRatingCriterion(Map<String, String> ratingCriterion) {
    this.ratingCriterion = ratingCriterion;
  }

  public CarMainDictionary ratingCriterion(Map<String, String> ratingCriterion) {
    this.ratingCriterion = ratingCriterion;
    return this;
  }

  public CarMainDictionary putRatingCriterionItem(String key, String ratingCriterionItem) {
    this.ratingCriterion.put(key, ratingCriterionItem);
    return this;
  }

 /**
   * Coverage types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return coverage
  **/
  @JsonProperty("coverage")
  public Map<String, String> getCoverage() {
    return coverage;
  }

  public void setCoverage(Map<String, String> coverage) {
    this.coverage = coverage;
  }

  public CarMainDictionary coverage(Map<String, String> coverage) {
    this.coverage = coverage;
    return this;
  }

  public CarMainDictionary putCoverageItem(String key, String coverageItem) {
    this.coverage.put(key, coverageItem);
    return this;
  }

 /**
   * Special equipment types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return specialEquipment
  **/
  @JsonProperty("specialEquipment")
  public Map<String, String> getSpecialEquipment() {
    return specialEquipment;
  }

  public void setSpecialEquipment(Map<String, String> specialEquipment) {
    this.specialEquipment = specialEquipment;
  }

  public CarMainDictionary specialEquipment(Map<String, String> specialEquipment) {
    this.specialEquipment = specialEquipment;
    return this;
  }

  public CarMainDictionary putSpecialEquipmentItem(String key, String specialEquipmentItem) {
    this.specialEquipment.put(key, specialEquipmentItem);
    return this;
  }

 /**
   * Surcharge types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return surcharge
  **/
  @JsonProperty("surcharge")
  public Map<String, String> getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Map<String, String> surcharge) {
    this.surcharge = surcharge;
  }

  public CarMainDictionary surcharge(Map<String, String> surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  public CarMainDictionary putSurchargeItem(String key, String surchargeItem) {
    this.surcharge.put(key, surchargeItem);
    return this;
  }

 /**
   * Tax types map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return tax
  **/
  @JsonProperty("tax")
  public Map<String, String> getTax() {
    return tax;
  }

  public void setTax(Map<String, String> tax) {
    this.tax = tax;
  }

  public CarMainDictionary tax(Map<String, String> tax) {
    this.tax = tax;
    return this;
  }

  public CarMainDictionary putTaxItem(String key, String taxItem) {
    this.tax.put(key, taxItem);
    return this;
  }

 /**
   * Fuel policy map used in rate info. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return fuelPolicy
  **/
  @JsonProperty("fuelPolicy")
  public Map<String, String> getFuelPolicy() {
    return fuelPolicy;
  }

  public void setFuelPolicy(Map<String, String> fuelPolicy) {
    this.fuelPolicy = fuelPolicy;
  }

  public CarMainDictionary fuelPolicy(Map<String, String> fuelPolicy) {
    this.fuelPolicy = fuelPolicy;
    return this;
  }

  public CarMainDictionary putFuelPolicyItem(String key, String fuelPolicyItem) {
    this.fuelPolicy.put(key, fuelPolicyItem);
    return this;
  }

 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return currency
  **/
  @JsonProperty("currency")
  public Map<String, CurrencyDictionaryItem> getCurrency() {
    return currency;
  }

  public void setCurrency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
  }

  public CarMainDictionary currency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
    return this;
  }

  public CarMainDictionary putCurrencyItem(String key, CurrencyDictionaryItem currencyItem) {
    this.currency.put(key, currencyItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarMainDictionary {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    acriss: ").append(toIndentedString(acriss)).append("\n");
    sb.append("    shuttle: ").append(toIndentedString(shuttle)).append("\n");
    sb.append("    ratingCriterion: ").append(toIndentedString(ratingCriterion)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    specialEquipment: ").append(toIndentedString(specialEquipment)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    fuelPolicy: ").append(toIndentedString(fuelPolicy)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

