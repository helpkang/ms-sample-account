package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.InsuranceCommon;
import com.koreanair.external.dx.vo.InsuranceDetails;
import com.koreanair.external.dx.vo.InsurancePricingRecords;
import com.koreanair.external.dx.vo.InsuranceProductDescription;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuranceOffer  {
  
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

  @ApiModelProperty(example = "TGC-STC-123456", required = true, value = "The insuranceOfferId is the unique id refering to one offer. It contains all necessary information to make the correlation between the offer at shopping and booking time")
 /**
   * The insuranceOfferId is the unique id refering to one offer. It contains all necessary information to make the correlation between the offer at shopping and booking time
  **/
  private String id = null;

  @ApiModelProperty(value = "")
  private InsuranceDetails details = null;
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

  public InsuranceOffer insuranceProviderCode(String insuranceProviderCode) {
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

  public InsuranceOffer countryCode(String countryCode) {
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

  public InsuranceOffer product(InsuranceProductDescription product) {
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

  public InsuranceOffer extension(InsuranceProductDescription extension) {
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

  public InsuranceOffer prices(InsurancePricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * The insuranceOfferId is the unique id refering to one offer. It contains all necessary information to make the correlation between the offer at shopping and booking time
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InsuranceOffer id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public InsuranceDetails getDetails() {
    return details;
  }

  public void setDetails(InsuranceDetails details) {
    this.details = details;
  }

  public InsuranceOffer details(InsuranceDetails details) {
    this.details = details;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceOffer {\n");
    
    sb.append("    insuranceProviderCode: ").append(toIndentedString(insuranceProviderCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

