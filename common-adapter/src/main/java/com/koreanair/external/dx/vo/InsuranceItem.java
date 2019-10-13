package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FrequentFlyer;
import com.koreanair.external.dx.vo.InsuranceCommon;
import com.koreanair.external.dx.vo.InsurancePricingRecords;
import com.koreanair.external.dx.vo.InsuranceProductDescription;
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

public class InsuranceItem  {
  
  @ApiModelProperty(example = "TGC", required = true, value = "the insurance provider code")
 /**
   * the insurance provider code
  **/
  private String insuranceProviderCode = null;

  @ApiModelProperty(example = "GB", required = true, value = "ISO 3166-1 country code")
 /**
   * ISO 3166-1 country code
  **/
  private String countryCode = null;

  @ApiModelProperty(required = true, value = "The code and the name of the product")
 /**
   * The code and the name of the product
  **/
  private InsuranceProductDescription product = null;

  @ApiModelProperty(value = "The code and the name of the product extension (if existing)")
 /**
   * The code and the name of the product extension (if existing)
  **/
  private InsuranceProductDescription extension = null;

  @ApiModelProperty(required = true, value = "Price details associated to the insurance offer")
 /**
   * Price details associated to the insurance offer
  **/
  private InsurancePricingRecords prices = null;

  @ApiModelProperty(required = true, value = "Id to be used for the interaction with order")
 /**
   * Id to be used for the interaction with order
  **/
  private String id = null;

  @ApiModelProperty(value = "List of traveler(s) associated to the insurance item. If not specified,the insurance applies to all travelers part of the order.  This information is available only at Order retrieve operation (GET /purchase/orders/{orderId}). ")
 /**
   * List of traveler(s) associated to the insurance item. If not specified,the insurance applies to all travelers part of the order.  This information is available only at Order retrieve operation (GET /purchase/orders/{orderId}). 
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(required = true, value = "Confirmation number related to the insurance booking")
 /**
   * Confirmation number related to the insurance booking
  **/
  private String confirmationNumber = null;

  @ApiModelProperty(required = true, value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken.")
 /**
   * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken.
  **/
  private String statusCode = null;

  @ApiModelProperty(value = "Frequent flyer card on which the miles were credited after insurance booking. If no miles accrual has taken place then this field will not be returned.")
 /**
   * Frequent flyer card on which the miles were credited after insurance booking. If no miles accrual has taken place then this field will not be returned.
  **/
  private FrequentFlyer frequentFlyer = null;
 /**
   * the insurance provider code
   * @return insuranceProviderCode
  **/
  @JsonProperty("insuranceProviderCode")
  public String getInsuranceProviderCode() {
    return insuranceProviderCode;
  }

  public void setInsuranceProviderCode(String insuranceProviderCode) {
    this.insuranceProviderCode = insuranceProviderCode;
  }

  public InsuranceItem insuranceProviderCode(String insuranceProviderCode) {
    this.insuranceProviderCode = insuranceProviderCode;
    return this;
  }

 /**
   * ISO 3166-1 country code
   * @return countryCode
  **/
  @JsonProperty("countryCode")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public InsuranceItem countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

 /**
   * The code and the name of the product
   * @return product
  **/
  @JsonProperty("product")
  public InsuranceProductDescription getProduct() {
    return product;
  }

  public void setProduct(InsuranceProductDescription product) {
    this.product = product;
  }

  public InsuranceItem product(InsuranceProductDescription product) {
    this.product = product;
    return this;
  }

 /**
   * The code and the name of the product extension (if existing)
   * @return extension
  **/
  @JsonProperty("extension")
  public InsuranceProductDescription getExtension() {
    return extension;
  }

  public void setExtension(InsuranceProductDescription extension) {
    this.extension = extension;
  }

  public InsuranceItem extension(InsuranceProductDescription extension) {
    this.extension = extension;
    return this;
  }

 /**
   * Price details associated to the insurance offer
   * @return prices
  **/
  @JsonProperty("prices")
  public InsurancePricingRecords getPrices() {
    return prices;
  }

  public void setPrices(InsurancePricingRecords prices) {
    this.prices = prices;
  }

  public InsuranceItem prices(InsurancePricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Id to be used for the interaction with order
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InsuranceItem id(String id) {
    this.id = id;
    return this;
  }

 /**
   * List of traveler(s) associated to the insurance item. If not specified,the insurance applies to all travelers part of the order.  This information is available only at Order retrieve operation (GET /purchase/orders/{orderId}). 
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public InsuranceItem travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public InsuranceItem addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Confirmation number related to the insurance booking
   * @return confirmationNumber
  **/
  @JsonProperty("confirmationNumber")
  public String getConfirmationNumber() {
    return confirmationNumber;
  }

  public void setConfirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
  }

  public InsuranceItem confirmationNumber(String confirmationNumber) {
    this.confirmationNumber = confirmationNumber;
    return this;
  }

 /**
   * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken.
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public InsuranceItem statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
   * Frequent flyer card on which the miles were credited after insurance booking. If no miles accrual has taken place then this field will not be returned.
   * @return frequentFlyer
  **/
  @JsonProperty("frequentFlyer")
  public FrequentFlyer getFrequentFlyer() {
    return frequentFlyer;
  }

  public void setFrequentFlyer(FrequentFlyer frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
  }

  public InsuranceItem frequentFlyer(FrequentFlyer frequentFlyer) {
    this.frequentFlyer = frequentFlyer;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceItem {\n");
    
    sb.append("    insuranceProviderCode: ").append(toIndentedString(insuranceProviderCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    confirmationNumber: ").append(toIndentedString(confirmationNumber)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    frequentFlyer: ").append(toIndentedString(frequentFlyer)).append("\n");
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

