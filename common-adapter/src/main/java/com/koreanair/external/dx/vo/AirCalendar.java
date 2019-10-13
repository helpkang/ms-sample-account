package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirPricingRecords;
import com.koreanair.external.dx.vo.BoundCommon;
import com.koreanair.external.dx.vo.FareInfo;
import com.koreanair.external.dx.vo.Status;
import io.swagger.annotations.ApiModel;
import java.time.LocalDate;
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
  * return best price per day in the calendar
 **/
@ApiModel(description="return best price per day in the calendar")
public class AirCalendar  {
  
  @ApiModelProperty(example = "2016-07-01", required = true, value = "departure date without timezone (local time)")
 /**
   * departure date without timezone (local time)
  **/
  private LocalDate departureDate = null;

  @ApiModelProperty(example = "2016-07-01", value = "return date without timezone (local time)")
 /**
   * return date without timezone (local time)
  **/
  private LocalDate returnDate = null;

  @ApiModelProperty(value = "best prices for the entry")
 /**
   * best prices for the entry
  **/
  private AirPricingRecords prices = null;

  @ApiModelProperty(value = "")
  private List<FareInfo> fareInfos = null;

  @ApiModelProperty(value = "In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey")
 /**
   * In case of different fare families returned for the different bounds, it corresponds to the most restrictive fare family for the whole journey
  **/
  private String fareFamilyCode = null;

  @ApiModelProperty(required = true, value = "Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound). In calendar mode, flights and services information are not returned")
 /**
   * Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound). In calendar mode, flights and services information are not returned
  **/
  private List<BoundCommon> bounds = new ArrayList<>();

  @ApiModelProperty(value = "Indicates if flight solution is unavailable and provides more specific reasons")
 /**
   * Indicates if flight solution is unavailable and provides more specific reasons
  **/
  private Status status = null;
 /**
   * departure date without timezone (local time)
   * @return departureDate
  **/
  @JsonProperty("departureDate")
  public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public AirCalendar departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

 /**
   * return date without timezone (local time)
   * @return returnDate
  **/
  @JsonProperty("returnDate")
  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public AirCalendar returnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
    return this;
  }

 /**
   * best prices for the entry
   * @return prices
  **/
  @JsonProperty("prices")
  public AirPricingRecords getPrices() {
    return prices;
  }

  public void setPrices(AirPricingRecords prices) {
    this.prices = prices;
  }

  public AirCalendar prices(AirPricingRecords prices) {
    this.prices = prices;
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

  public AirCalendar fareInfos(List<FareInfo> fareInfos) {
    this.fareInfos = fareInfos;
    return this;
  }

  public AirCalendar addFareInfosItem(FareInfo fareInfosItem) {
    this.fareInfos.add(fareInfosItem);
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

  public AirCalendar fareFamilyCode(String fareFamilyCode) {
    this.fareFamilyCode = fareFamilyCode;
    return this;
  }

 /**
   * Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound). In calendar mode, flights and services information are not returned
   * @return bounds
  **/
  @JsonProperty("bounds")
  public List<BoundCommon> getBounds() {
    return bounds;
  }

  public void setBounds(List<BoundCommon> bounds) {
    this.bounds = bounds;
  }

  public AirCalendar bounds(List<BoundCommon> bounds) {
    this.bounds = bounds;
    return this;
  }

  public AirCalendar addBoundsItem(BoundCommon boundsItem) {
    this.bounds.add(boundsItem);
    return this;
  }

 /**
   * Indicates if flight solution is unavailable and provides more specific reasons
   * @return status
  **/
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public AirCalendar status(Status status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirCalendar {\n");
    
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    fareInfos: ").append(toIndentedString(fareInfos)).append("\n");
    sb.append("    fareFamilyCode: ").append(toIndentedString(fareFamilyCode)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
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

