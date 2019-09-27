package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirBoundsAiroffer;
import com.koreanair.external.dx.vo.AirBoundsCheapestAiroffer;
import com.koreanair.external.dx.vo.AirPricingRecords;
import com.koreanair.external.dx.vo.AvailabilityInfoItem;
import com.koreanair.external.dx.vo.FareInfo;
import com.koreanair.external.dx.vo.Status;
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
  * The air bound will consist fare family and price information for a given bound offer.
 **/
@ApiModel(description="The air bound will consist fare family and price information for a given bound offer.")
public class AirBoundItem  {
  
  @ApiModelProperty(value = "The unique airbound Id, which will be finally used to select the bound offer and will be used to shop for construction mode shopping.")
 /**
   * The unique airbound Id, which will be finally used to select the bound offer and will be used to shop for construction mode shopping.
  **/
  private String airBoundId = null;

  @ApiModelProperty(value = "In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey")
 /**
   * In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey
  **/
  private String fareFamilyCode = null;

  @ApiModelProperty(value = "")
  private List<AvailabilityInfoItem> availabilityDetails = null;

  @ApiModelProperty(value = "")
  private List<FareInfo> fareInfos = null;

  @ApiModelProperty(value = "")
  private AirPricingRecords prices = null;

  @ApiModelProperty(value = "")
  private AirBoundsCheapestAiroffer cheapestAirOffer = null;

  @ApiModelProperty(value = "")
  private AirBoundsAiroffer airOffer = null;

  @ApiModelProperty(value = "Indicates if the AirBound has a specific status such as soldOut, waitList, etc.")
 /**
   * Indicates if the AirBound has a specific status such as soldOut, waitList, etc.
  **/
  private Status status = null;
 /**
   * The unique airbound Id, which will be finally used to select the bound offer and will be used to shop for construction mode shopping.
   * @return airBoundId
  **/
  @JsonProperty("airBoundId")
  public String getAirBoundId() {
    return airBoundId;
  }

  public void setAirBoundId(String airBoundId) {
    this.airBoundId = airBoundId;
  }

  public AirBoundItem airBoundId(String airBoundId) {
    this.airBoundId = airBoundId;
    return this;
  }

 /**
   * In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey
   * @return fareFamilyCode
  **/
  @JsonProperty("fareFamilyCode")
  public String getFareFamilyCode() {
    return fareFamilyCode;
  }

  public void setFareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
  }

  public AirBoundItem fareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
    return this;
  }

 /**
   * Get availabilityDetails
   * @return availabilityDetails
  **/
  @JsonProperty("availabilityDetails")
  public List<AvailabilityInfoItem> getAvailabilityDetails() {
    return availabilityDetails;
  }

  public void setAvailabilityDetails(List<AvailabilityInfoItem> availabilityDetails) {
    this.availabilityDetails = availabilityDetails;
  }

  public AirBoundItem availabilityDetails(List<AvailabilityInfoItem> availabilityDetails) {
    this.availabilityDetails = availabilityDetails;
    return this;
  }

  public AirBoundItem addAvailabilityDetailsItem(AvailabilityInfoItem availabilityDetailsItem) {
    this.availabilityDetails.add(availabilityDetailsItem);
    return this;
  }

 /**
   * Get fareInfos
   * @return fareInfos
  **/
  @JsonProperty("fareInfos")
  public List<FareInfo> getFareInfos() {
    return fareInfos;
  }

  public void setFareInfos(List<FareInfo> fareInfos) {
    this.fareInfos = fareInfos;
  }

  public AirBoundItem fareInfos(List<FareInfo> fareInfos) {
    this.fareInfos = fareInfos;
    return this;
  }

  public AirBoundItem addFareInfosItem(FareInfo fareInfosItem) {
    this.fareInfos.add(fareInfosItem);
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

  public AirBoundItem prices(AirPricingRecords prices) {
    this.prices = prices;
    return this;
  }

 /**
   * Get cheapestAirOffer
   * @return cheapestAirOffer
  **/
  @JsonProperty("cheapestAirOffer")
  public AirBoundsCheapestAiroffer getCheapestAirOffer() {
    return cheapestAirOffer;
  }

  public void setCheapestAirOffer(AirBoundsCheapestAiroffer cheapestAirOffer) {
    this.cheapestAirOffer = cheapestAirOffer;
  }

  public AirBoundItem cheapestAirOffer(AirBoundsCheapestAiroffer cheapestAirOffer) {
    this.cheapestAirOffer = cheapestAirOffer;
    return this;
  }

 /**
   * Get airOffer
   * @return airOffer
  **/
  @JsonProperty("airOffer")
  public AirBoundsAiroffer getAirOffer() {
    return airOffer;
  }

  public void setAirOffer(AirBoundsAiroffer airOffer) {
    this.airOffer = airOffer;
  }

  public AirBoundItem airOffer(AirBoundsAiroffer airOffer) {
    this.airOffer = airOffer;
    return this;
  }

 /**
   * Indicates if the AirBound has a specific status such as soldOut, waitList, etc.
   * @return status
  **/
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public AirBoundItem status(Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirBoundItem {\n");
    
    sb.append("    airBoundId: ").append(toIndentedString(airBoundId)).append("\n");
    sb.append("    fareFamilyCode: ").append(toIndentedString(fareFamilyCode)).append("\n");
    sb.append("    availabilityDetails: ").append(toIndentedString(availabilityDetails)).append("\n");
    sb.append("    fareInfos: ").append(toIndentedString(fareInfos)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    cheapestAirOffer: ").append(toIndentedString(cheapestAirOffer)).append("\n");
    sb.append("    airOffer: ").append(toIndentedString(airOffer)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

