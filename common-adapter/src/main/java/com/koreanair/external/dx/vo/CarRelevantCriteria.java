package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.Provider;
import io.swagger.annotations.ApiModel;
import java.time.LocalDateTime;
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
  * Set of search criteria applied to generate the recommendation, based on the AAM filing. These information can be re-used to search, in standalone mode, for car offers.
 **/
@ApiModel(description="Set of search criteria applied to generate the recommendation, based on the AAM filing. These information can be re-used to search, in standalone mode, for car offers.")
public class CarRelevantCriteria  {
  
  @ApiModelProperty(required = true, value = "Date time to pick-up the car in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]")
 /**
   * Date time to pick-up the car in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]
  **/
  private LocalDateTime pickupDateTime = null;

  @ApiModelProperty(required = true, value = "Date time to drop-off the car in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]")
 /**
   * Date time to drop-off the car in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]
  **/
  private LocalDateTime dropoffDateTime = null;

  @ApiModelProperty(required = true, value = "Car pick-up location code (airport code)")
 /**
   * Car pick-up location code (airport code)
  **/
  private String pickupLocationCode = null;

  @ApiModelProperty(required = true, value = "Car drop-off location code (airport code)")
 /**
   * Car drop-off location code (airport code)
  **/
  private String dropoffLocationCode = null;

  @ApiModelProperty(value = "List of Amadeus car providers to filter the response by.")
 /**
   * List of Amadeus car providers to filter the response by.
  **/
  private List<Provider> providers = null;

  @ApiModelProperty(value = "This is to request only unlimited mileage rates")
 /**
   * This is to request only unlimited mileage rates
  **/
  private Boolean isUnlimitedMileage = null;

  @ApiModelProperty(value = "This is to define a maximum total price to be returned. Rates with prices above this will not be returned Example: 150 EUR")
 /**
   * This is to define a maximum total price to be returned. Rates with prices above this will not be returned Example: 150 EUR
  **/
  private Amount maxPriceAmount = null;

  @ApiModelProperty(value = "Car ACRISS codes to filter the results. Wildcards can be used e.g. *CMR, CD**. Please see here for more details [http://www.acriss.org/car-codes.asp]")
 /**
   * Car ACRISS codes to filter the results. Wildcards can be used e.g. *CMR, CD**. Please see here for more details [http://www.acriss.org/car-codes.asp]
  **/
  private List<String> acrissCodes = null;
 /**
   * Date time to pick-up the car in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]
   * @return pickupDateTime
  **/
  @JsonProperty("pickupDateTime")
  public LocalDateTime getPickupDateTime() {
    return pickupDateTime;
  }

  public void setPickupDateTime(LocalDateTime pickupDateTime) {
    this.pickupDateTime = pickupDateTime;
  }

  public CarRelevantCriteria pickupDateTime(LocalDateTime pickupDateTime) {
    this.pickupDateTime = pickupDateTime;
    return this;
  }

 /**
   * Date time to drop-off the car in ISO 8601 [http://www.w3.org/TR/NOTE-datetime]
   * @return dropoffDateTime
  **/
  @JsonProperty("dropoffDateTime")
  public LocalDateTime getDropoffDateTime() {
    return dropoffDateTime;
  }

  public void setDropoffDateTime(LocalDateTime dropoffDateTime) {
    this.dropoffDateTime = dropoffDateTime;
  }

  public CarRelevantCriteria dropoffDateTime(LocalDateTime dropoffDateTime) {
    this.dropoffDateTime = dropoffDateTime;
    return this;
  }

 /**
   * Car pick-up location code (airport code)
   * @return pickupLocationCode
  **/
  @JsonProperty("pickupLocationCode")
  public String getPickupLocationCode() {
    return pickupLocationCode;
  }

  public void setPickupLocationCode(String pickupLocationCode) {
    this.pickupLocationCode = pickupLocationCode;
  }

  public CarRelevantCriteria pickupLocationCode(String pickupLocationCode) {
    this.pickupLocationCode = pickupLocationCode;
    return this;
  }

 /**
   * Car drop-off location code (airport code)
   * @return dropoffLocationCode
  **/
  @JsonProperty("dropoffLocationCode")
  public String getDropoffLocationCode() {
    return dropoffLocationCode;
  }

  public void setDropoffLocationCode(String dropoffLocationCode) {
    this.dropoffLocationCode = dropoffLocationCode;
  }

  public CarRelevantCriteria dropoffLocationCode(String dropoffLocationCode) {
    this.dropoffLocationCode = dropoffLocationCode;
    return this;
  }

 /**
   * List of Amadeus car providers to filter the response by.
   * @return providers
  **/
  @JsonProperty("providers")
  public List<Provider> getProviders() {
    return providers;
  }

  public void setProviders(List<Provider> providers) {
    this.providers = providers;
  }

  public CarRelevantCriteria providers(List<Provider> providers) {
    this.providers = providers;
    return this;
  }

  public CarRelevantCriteria addProvidersItem(Provider providersItem) {
    this.providers.add(providersItem);
    return this;
  }

 /**
   * This is to request only unlimited mileage rates
   * @return isUnlimitedMileage
  **/
  @JsonProperty("isUnlimitedMileage")
  public Boolean isIsUnlimitedMileage() {
    return isUnlimitedMileage;
  }

  public void setIsUnlimitedMileage(Boolean isUnlimitedMileage) {
    this.isUnlimitedMileage = isUnlimitedMileage;
  }

  public CarRelevantCriteria isUnlimitedMileage(Boolean isUnlimitedMileage) {
    this.isUnlimitedMileage = isUnlimitedMileage;
    return this;
  }

 /**
   * This is to define a maximum total price to be returned. Rates with prices above this will not be returned Example: 150 EUR
   * @return maxPriceAmount
  **/
  @JsonProperty("maxPriceAmount")
  public Amount getMaxPriceAmount() {
    return maxPriceAmount;
  }

  public void setMaxPriceAmount(Amount maxPriceAmount) {
    this.maxPriceAmount = maxPriceAmount;
  }

  public CarRelevantCriteria maxPriceAmount(Amount maxPriceAmount) {
    this.maxPriceAmount = maxPriceAmount;
    return this;
  }

 /**
   * Car ACRISS codes to filter the results. Wildcards can be used e.g. *CMR, CD**. Please see here for more details [http://www.acriss.org/car-codes.asp]
   * @return acrissCodes
  **/
  @JsonProperty("acrissCodes")
  public List<String> getAcrissCodes() {
    return acrissCodes;
  }

  public void setAcrissCodes(List<String> acrissCodes) {
    this.acrissCodes = acrissCodes;
  }

  public CarRelevantCriteria acrissCodes(List<String> acrissCodes) {
    this.acrissCodes = acrissCodes;
    return this;
  }

  public CarRelevantCriteria addAcrissCodesItem(String acrissCodesItem) {
    this.acrissCodes.add(acrissCodesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRelevantCriteria {\n");
    
    sb.append("    pickupDateTime: ").append(toIndentedString(pickupDateTime)).append("\n");
    sb.append("    dropoffDateTime: ").append(toIndentedString(dropoffDateTime)).append("\n");
    sb.append("    pickupLocationCode: ").append(toIndentedString(pickupLocationCode)).append("\n");
    sb.append("    dropoffLocationCode: ").append(toIndentedString(dropoffLocationCode)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    isUnlimitedMileage: ").append(toIndentedString(isUnlimitedMileage)).append("\n");
    sb.append("    maxPriceAmount: ").append(toIndentedString(maxPriceAmount)).append("\n");
    sb.append("    acrissCodes: ").append(toIndentedString(acrissCodes)).append("\n");
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

