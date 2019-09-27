package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AddressBase;
import com.koreanair.external.dx.vo.CarLocationDictionaryItemContact;
import com.koreanair.external.dx.vo.CarLocationDictionaryItemGeoLocalization;
import com.koreanair.external.dx.vo.CarLocationDictionaryItemLocation;
import com.koreanair.external.dx.vo.CarTermsAndCondition;
import com.koreanair.external.dx.vo.OpeningHours;
import com.koreanair.external.dx.vo.PaymentPolicy;
import com.koreanair.external.dx.vo.Rating;
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
  * Location information
 **/
@ApiModel(description="Location information")
public class CarLocationDictionaryItem  {
  
  @ApiModelProperty(value = "")
  private AddressBase address = null;

  @ApiModelProperty(required = true, value = "")
  private CarLocationDictionaryItemLocation location = null;

  @ApiModelProperty(value = "2 letters provider code")
 /**
   * 2 letters provider code
  **/
  private String companyCode = null;

  @ApiModelProperty(value = "")
  private CarLocationDictionaryItemGeoLocalization geoLocalization = null;

  @ApiModelProperty(value = "")
  private List<OpeningHours> openingTimes = null;

  @ApiModelProperty(value = "Delivery option available")
 /**
   * Delivery option available
  **/
  private Boolean isDeliverable = null;

  @ApiModelProperty(value = "Collection option available")
 /**
   * Collection option available
  **/
  private Boolean isCollectable = null;

  @ApiModelProperty(value = "Out of hours option available")
 /**
   * Out of hours option available
  **/
  private Boolean outOfHours = null;

  @ApiModelProperty(value = "filled only if location is airport with possible values: AS: Airport shuttle CALL: Call for shuttle CRS:  Car Rental shuttle CRSAS: Shuttle to vehicle MULT: Multiple shuttles needed NON: No shuttle-walk to vehicle")
 /**
   * filled only if location is airport with possible values: AS: Airport shuttle CALL: Call for shuttle CRS:  Car Rental shuttle CRSAS: Shuttle to vehicle MULT: Multiple shuttles needed NON: No shuttle-walk to vehicle
  **/
  private String shuttle = null;

  @ApiModelProperty(value = "")
  private List<String> airportTerminals = null;

  @ApiModelProperty(value = "")
  private CarLocationDictionaryItemContact contact = null;

  @ApiModelProperty(value = "The payment methods accepted at shopping time by a Car Provider in the location")
 /**
   * The payment methods accepted at shopping time by a Car Provider in the location
  **/
  private List<PaymentPolicy> paymentPolicies = null;

  @ApiModelProperty(value = "Customers feedback returned by provider. It is composed of a global score and different service categories in which the valoration was given. ")
 /**
   * Customers feedback returned by provider. It is composed of a global score and different service categories in which the valoration was given. 
  **/
  private Rating rating = null;

  @ApiModelProperty(value = "Terms and Conditions URLs The documents are requested to the provider in the preferred language used on the request. However, they might be returned in a different one depending on the available translations on provider side.")
 /**
   * Terms and Conditions URLs The documents are requested to the provider in the preferred language used on the request. However, they might be returned in a different one depending on the available translations on provider side.
  **/
  private List<CarTermsAndCondition> termsAndConditions = null;

  @ApiModelProperty(value = "Location marketing text")
 /**
   * Location marketing text
  **/
  private String marketingText = null;
 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public AddressBase getAddress() {
    return address;
  }

  public void setAddress(AddressBase address) {
    this.address = address;
  }

  public CarLocationDictionaryItem address(AddressBase address) {
    this.address = address;
    return this;
  }

 /**
   * Get location
   * @return location
  **/
  @JsonProperty("location")
  public CarLocationDictionaryItemLocation getLocation() {
    return location;
  }

  public void setLocation(CarLocationDictionaryItemLocation location) {
    this.location = location;
  }

  public CarLocationDictionaryItem location(CarLocationDictionaryItemLocation location) {
    this.location = location;
    return this;
  }

 /**
   * 2 letters provider code
   * @return companyCode
  **/
  @JsonProperty("companyCode")
  public String getCompanyCode() {
    return companyCode;
  }

  public void setCompanyCode(String companyCode) {
    this.companyCode = companyCode;
  }

  public CarLocationDictionaryItem companyCode(String companyCode) {
    this.companyCode = companyCode;
    return this;
  }

 /**
   * Get geoLocalization
   * @return geoLocalization
  **/
  @JsonProperty("geoLocalization")
  public CarLocationDictionaryItemGeoLocalization getGeoLocalization() {
    return geoLocalization;
  }

  public void setGeoLocalization(CarLocationDictionaryItemGeoLocalization geoLocalization) {
    this.geoLocalization = geoLocalization;
  }

  public CarLocationDictionaryItem geoLocalization(CarLocationDictionaryItemGeoLocalization geoLocalization) {
    this.geoLocalization = geoLocalization;
    return this;
  }

 /**
   * Get openingTimes
   * @return openingTimes
  **/
  @JsonProperty("openingTimes")
  public List<OpeningHours> getOpeningTimes() {
    return openingTimes;
  }

  public void setOpeningTimes(List<OpeningHours> openingTimes) {
    this.openingTimes = openingTimes;
  }

  public CarLocationDictionaryItem openingTimes(List<OpeningHours> openingTimes) {
    this.openingTimes = openingTimes;
    return this;
  }

  public CarLocationDictionaryItem addOpeningTimesItem(OpeningHours openingTimesItem) {
    this.openingTimes.add(openingTimesItem);
    return this;
  }

 /**
   * Delivery option available
   * @return isDeliverable
  **/
  @JsonProperty("isDeliverable")
  public Boolean isIsDeliverable() {
    return isDeliverable;
  }

  public void setIsDeliverable(Boolean isDeliverable) {
    this.isDeliverable = isDeliverable;
  }

  public CarLocationDictionaryItem isDeliverable(Boolean isDeliverable) {
    this.isDeliverable = isDeliverable;
    return this;
  }

 /**
   * Collection option available
   * @return isCollectable
  **/
  @JsonProperty("isCollectable")
  public Boolean isIsCollectable() {
    return isCollectable;
  }

  public void setIsCollectable(Boolean isCollectable) {
    this.isCollectable = isCollectable;
  }

  public CarLocationDictionaryItem isCollectable(Boolean isCollectable) {
    this.isCollectable = isCollectable;
    return this;
  }

 /**
   * Out of hours option available
   * @return outOfHours
  **/
  @JsonProperty("outOfHours")
  public Boolean isOutOfHours() {
    return outOfHours;
  }

  public void setOutOfHours(Boolean outOfHours) {
    this.outOfHours = outOfHours;
  }

  public CarLocationDictionaryItem outOfHours(Boolean outOfHours) {
    this.outOfHours = outOfHours;
    return this;
  }

 /**
   * filled only if location is airport with possible values: AS: Airport shuttle CALL: Call for shuttle CRS:  Car Rental shuttle CRSAS: Shuttle to vehicle MULT: Multiple shuttles needed NON: No shuttle-walk to vehicle
   * @return shuttle
  **/
  @JsonProperty("shuttle")
  public String getShuttle() {
    return shuttle;
  }

  public void setShuttle(String shuttle) {
    this.shuttle = shuttle;
  }

  public CarLocationDictionaryItem shuttle(String shuttle) {
    this.shuttle = shuttle;
    return this;
  }

 /**
   * Get airportTerminals
   * @return airportTerminals
  **/
  @JsonProperty("airportTerminals")
  public List<String> getAirportTerminals() {
    return airportTerminals;
  }

  public void setAirportTerminals(List<String> airportTerminals) {
    this.airportTerminals = airportTerminals;
  }

  public CarLocationDictionaryItem airportTerminals(List<String> airportTerminals) {
    this.airportTerminals = airportTerminals;
    return this;
  }

  public CarLocationDictionaryItem addAirportTerminalsItem(String airportTerminalsItem) {
    this.airportTerminals.add(airportTerminalsItem);
    return this;
  }

 /**
   * Get contact
   * @return contact
  **/
  @JsonProperty("contact")
  public CarLocationDictionaryItemContact getContact() {
    return contact;
  }

  public void setContact(CarLocationDictionaryItemContact contact) {
    this.contact = contact;
  }

  public CarLocationDictionaryItem contact(CarLocationDictionaryItemContact contact) {
    this.contact = contact;
    return this;
  }

 /**
   * The payment methods accepted at shopping time by a Car Provider in the location
   * @return paymentPolicies
  **/
  @JsonProperty("paymentPolicies")
  public List<PaymentPolicy> getPaymentPolicies() {
    return paymentPolicies;
  }

  public void setPaymentPolicies(List<PaymentPolicy> paymentPolicies) {
    this.paymentPolicies = paymentPolicies;
  }

  public CarLocationDictionaryItem paymentPolicies(List<PaymentPolicy> paymentPolicies) {
    this.paymentPolicies = paymentPolicies;
    return this;
  }

  public CarLocationDictionaryItem addPaymentPoliciesItem(PaymentPolicy paymentPoliciesItem) {
    this.paymentPolicies.add(paymentPoliciesItem);
    return this;
  }

 /**
   * Customers feedback returned by provider. It is composed of a global score and different service categories in which the valoration was given. 
   * @return rating
  **/
  @JsonProperty("rating")
  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  public CarLocationDictionaryItem rating(Rating rating) {
    this.rating = rating;
    return this;
  }

 /**
   * Terms and Conditions URLs The documents are requested to the provider in the preferred language used on the request. However, they might be returned in a different one depending on the available translations on provider side.
   * @return termsAndConditions
  **/
  @JsonProperty("termsAndConditions")
  public List<CarTermsAndCondition> getTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(List<CarTermsAndCondition> termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  public CarLocationDictionaryItem termsAndConditions(List<CarTermsAndCondition> termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
    return this;
  }

  public CarLocationDictionaryItem addTermsAndConditionsItem(CarTermsAndCondition termsAndConditionsItem) {
    this.termsAndConditions.add(termsAndConditionsItem);
    return this;
  }

 /**
   * Location marketing text
   * @return marketingText
  **/
  @JsonProperty("marketingText")
  public String getMarketingText() {
    return marketingText;
  }

  public void setMarketingText(String marketingText) {
    this.marketingText = marketingText;
  }

  public CarLocationDictionaryItem marketingText(String marketingText) {
    this.marketingText = marketingText;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarLocationDictionaryItem {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    companyCode: ").append(toIndentedString(companyCode)).append("\n");
    sb.append("    geoLocalization: ").append(toIndentedString(geoLocalization)).append("\n");
    sb.append("    openingTimes: ").append(toIndentedString(openingTimes)).append("\n");
    sb.append("    isDeliverable: ").append(toIndentedString(isDeliverable)).append("\n");
    sb.append("    isCollectable: ").append(toIndentedString(isCollectable)).append("\n");
    sb.append("    outOfHours: ").append(toIndentedString(outOfHours)).append("\n");
    sb.append("    shuttle: ").append(toIndentedString(shuttle)).append("\n");
    sb.append("    airportTerminals: ").append(toIndentedString(airportTerminals)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    paymentPolicies: ").append(toIndentedString(paymentPolicies)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    marketingText: ").append(toIndentedString(marketingText)).append("\n");
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

