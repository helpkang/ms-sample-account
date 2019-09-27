package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirPricingRecords;
import io.swagger.annotations.ApiModel;

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
  * Bound common information (contains everything except flights). Note: not meaningful in the context of an Order
 **/
@ApiModel(description="Bound common information (contains everything except flights). Note: not meaningful in the context of an Order")
public class BoundCommon  {
  
  @ApiModelProperty(value = "Identifier of the bound")
 /**
   * Identifier of the bound
  **/
  private String airBoundId = null;

  @ApiModelProperty(value = "")
  private String fareFamilyCode = null;

  @ApiModelProperty(value = "")
  private AirPricingRecords prices = null;

  @ApiModelProperty(required = true, value = "Departure location (airport code) of the flight bound")
 /**
   * Departure location (airport code) of the flight bound
  **/
  private String originLocationCode = null;

  @ApiModelProperty(required = true, value = "Arrival location (airport code) of the flight bound")
 /**
   * Arrival location (airport code) of the flight bound
  **/
  private String destinationLocationCode = null;
 /**
   * Identifier of the bound
   * @return airBoundId
  **/
  @JsonProperty("airBoundId")
  public String getAirBoundId() {
    return airBoundId;
  }

  public void setAirBoundId(String airBoundId) {
    this.airBoundId = airBoundId;
  }

  public BoundCommon airBoundId(String airBoundId) {
    this.airBoundId = airBoundId;
    return this;
  }

 /**
   * Get fareFamilyCode
   * @return fareFamilyCode
  **/
  @JsonProperty("fareFamilyCode")
  public String getFareFamilyCode() {
    return fareFamilyCode;
  }

  public void setFareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
  }

  public BoundCommon fareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
    return this;
  }

 /**
   * Get prices
   * @return prices
  **/
  @JsonProperty("prices")
  public AirPricingRecords getPrices() {
    return prices;
  }

  public void setPrices(AirPricingRecords prices) {
    this.prices = prices;
  }

  public BoundCommon prices(AirPricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Departure location (airport code) of the flight bound
   * @return originLocationCode
  **/
  @JsonProperty("originLocationCode")
  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public BoundCommon originLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
    return this;
  }

 /**
   * Arrival location (airport code) of the flight bound
   * @return destinationLocationCode
  **/
  @JsonProperty("destinationLocationCode")
  public String getDestinationLocationCode() {
    return destinationLocationCode;
  }

  public void setDestinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
  }

  public BoundCommon destinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoundCommon {\n");
    
    sb.append("    airBoundId: ").append(toIndentedString(airBoundId)).append("\n");
    sb.append("    fareFamilyCode: ").append(toIndentedString(fareFamilyCode)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
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

