package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CarMileage;
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
  * Extra information of the rate
 **/
@ApiModel(description="Extra information of the rate")
public class CarRateDetails  {
  
  @ApiModelProperty(value = "Reference number identifying the car rate. e.g. N3LRPD2KV2E7OTSL.")
 /**
   * Reference number identifying the car rate. e.g. N3LRPD2KV2E7OTSL.
  **/
  private String identifier = null;

  @ApiModelProperty(required = true, value = "Car rate category original code")
 /**
   * Car rate category original code
  **/
  private String category = null;

  @ApiModelProperty(required = true, value = "Code corresponding to the car and associated location. e.g. 86IA.")
 /**
   * Code corresponding to the car and associated location. e.g. 86IA.
  **/
  private String code = null;

  @ApiModelProperty(value = "The specific date and time until which the rate is valid.")
 /**
   * The specific date and time until which the rate is valid.
  **/
  private LocalDateTime expirationTime = null;

  @ApiModelProperty(required = true, value = "")
  private CarMileage mileage = null;

  @ApiModelProperty(value = "Conveys if the rate can be cancelled without an extra cost for the customer. If this information is not returned by the provider, this attribute will not be present nor filled.")
 /**
   * Conveys if the rate can be cancelled without an extra cost for the customer. If this information is not returned by the provider, this attribute will not be present nor filled.
  **/
  private Boolean freeCancellation = null;

  @ApiModelProperty(value = "Conveys if the rate can be modified (i.e. Pick-up / Drop-off dates) without an extra cost for the customer. If this information is not returned by the provider, this attribute will not be present nor filled.")
 /**
   * Conveys if the rate can be modified (i.e. Pick-up / Drop-off dates) without an extra cost for the customer. If this information is not returned by the provider, this attribute will not be present nor filled.
  **/
  private Boolean freeModification = null;

  @ApiModelProperty(value = "Fuel policy applying to the offer e.g. FTF stand for `Fuel To Fuel`")
 /**
   * Fuel policy applying to the offer e.g. FTF stand for `Fuel To Fuel`
  **/
  private String fuelPolicy = null;
 /**
   * Reference number identifying the car rate. e.g. N3LRPD2KV2E7OTSL.
   * @return identifier
  **/
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public CarRateDetails identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

 /**
   * Car rate category original code
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CarRateDetails category(String category) {
    this.category = category;
    return this;
  }

 /**
   * Code corresponding to the car and associated location. e.g. 86IA.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CarRateDetails code(String code) {
    this.code = code;
    return this;
  }

 /**
   * The specific date and time until which the rate is valid.
   * @return expirationTime
  **/
  @JsonProperty("expirationTime")
  public LocalDateTime getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(LocalDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }

  public CarRateDetails expirationTime(LocalDateTime expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

 /**
   * Get mileage
   * @return mileage
  **/
  @JsonProperty("mileage")
  public CarMileage getMileage() {
    return mileage;
  }

  public void setMileage(CarMileage mileage) {
    this.mileage = mileage;
  }

  public CarRateDetails mileage(CarMileage mileage) {
    this.mileage = mileage;
    return this;
  }

 /**
   * Conveys if the rate can be cancelled without an extra cost for the customer. If this information is not returned by the provider, this attribute will not be present nor filled.
   * @return freeCancellation
  **/
  @JsonProperty("freeCancellation")
  public Boolean isFreeCancellation() {
    return freeCancellation;
  }

  public void setFreeCancellation(Boolean freeCancellation) {
    this.freeCancellation = freeCancellation;
  }

  public CarRateDetails freeCancellation(Boolean freeCancellation) {
    this.freeCancellation = freeCancellation;
    return this;
  }

 /**
   * Conveys if the rate can be modified (i.e. Pick-up / Drop-off dates) without an extra cost for the customer. If this information is not returned by the provider, this attribute will not be present nor filled.
   * @return freeModification
  **/
  @JsonProperty("freeModification")
  public Boolean isFreeModification() {
    return freeModification;
  }

  public void setFreeModification(Boolean freeModification) {
    this.freeModification = freeModification;
  }

  public CarRateDetails freeModification(Boolean freeModification) {
    this.freeModification = freeModification;
    return this;
  }

 /**
   * Fuel policy applying to the offer e.g. FTF stand for &#x60;Fuel To Fuel&#x60;
   * @return fuelPolicy
  **/
  @JsonProperty("fuelPolicy")
  public String getFuelPolicy() {
    return fuelPolicy;
  }

  public void setFuelPolicy(String fuelPolicy) {
    this.fuelPolicy = fuelPolicy;
  }

  public CarRateDetails fuelPolicy(String fuelPolicy) {
    this.fuelPolicy = fuelPolicy;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRateDetails {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    freeCancellation: ").append(toIndentedString(freeCancellation)).append("\n");
    sb.append("    freeModification: ").append(toIndentedString(freeModification)).append("\n");
    sb.append("    fuelPolicy: ").append(toIndentedString(fuelPolicy)).append("\n");
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

