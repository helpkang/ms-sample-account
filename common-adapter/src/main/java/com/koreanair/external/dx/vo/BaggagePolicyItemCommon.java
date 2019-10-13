package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggagePolicyDetails;
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
  * This object contains common information regarding the baggage policy for a certain flight(s) and passenger(s) association
 **/
@ApiModel(description="This object contains common information regarding the baggage policy for a certain flight(s) and passenger(s) association")
public class BaggagePolicyItemCommon  {
  
  @ApiModelProperty(value = "List of flights associated to the baggage policy")
 /**
   * List of flights associated to the baggage policy
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "List of travelers associated to the baggage policy")
 /**
   * List of travelers associated to the baggage policy
  **/
  private List<String> travelerIds = null;

  @ApiModelProperty(value = "Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). For a codeshare segment that has been merged into a single element, this can be the marketing or the operating airline code")
 /**
   * Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). For a codeshare segment that has been merged into a single element, this can be the marketing or the operating airline code
  **/
  private String airlineCode = null;

  @ApiModelProperty(value = "Baggage policy details for a specific recommendation")
 /**
   * Baggage policy details for a specific recommendation
  **/
  private BaggagePolicyDetails details = null;
 /**
   * List of flights associated to the baggage policy
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public BaggagePolicyItemCommon flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public BaggagePolicyItemCommon addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * List of travelers associated to the baggage policy
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public BaggagePolicyItemCommon travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public BaggagePolicyItemCommon addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }

 /**
   * Two letter airline code defined for the OSI message. IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx). For a codeshare segment that has been merged into a single element, this can be the marketing or the operating airline code
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public BaggagePolicyItemCommon airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * Baggage policy details for a specific recommendation
   * @return details
  **/
  @JsonProperty("details")
  public BaggagePolicyDetails getDetails() {
    return details;
  }

  public void setDetails(BaggagePolicyDetails details) {
    this.details = details;
  }

  public BaggagePolicyItemCommon details(BaggagePolicyDetails details) {
    this.details = details;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggagePolicyItemCommon {\n");
    
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
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

