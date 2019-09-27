package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.BaggageAllowanceDetail;
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
  * Definition of free checked baggage allowance associated to a list of flights
 **/
@ApiModel(description="Definition of free checked baggage allowance associated to a list of flights")
public class FreeCheckedBaggageAllowanceItem  {
  
  @ApiModelProperty(value = "")
  private BaggageAllowanceDetail details = null;

  @ApiModelProperty(value = "Ids of the flights for which the baggage allowance is valid")
 /**
   * Ids of the flights for which the baggage allowance is valid
  **/
  private List<String> flightIds = null;

  @ApiModelProperty(value = "")
  private List<String> travelerIds = null;
 /**
   * Get details
   * @return details
  **/
  @JsonProperty("details")
  public BaggageAllowanceDetail getDetails() {
    return details;
  }

  public void setDetails(BaggageAllowanceDetail details) {
    this.details = details;
  }

  public FreeCheckedBaggageAllowanceItem details(BaggageAllowanceDetail details) {
    this.details = details;
    return this;
  }

 /**
   * Ids of the flights for which the baggage allowance is valid
   * @return flightIds
  **/
  @JsonProperty("flightIds")
  public List<String> getFlightIds() {
    return flightIds;
  }

  public void setFlightIds(List<String> flightIds) {
    this.flightIds = flightIds;
  }

  public FreeCheckedBaggageAllowanceItem flightIds(List<String> flightIds) {
    this.flightIds = flightIds;
    return this;
  }

  public FreeCheckedBaggageAllowanceItem addFlightIdsItem(String flightIdsItem) {
    this.flightIds.add(flightIdsItem);
    return this;
  }

 /**
   * Get travelerIds
   * @return travelerIds
  **/
  @JsonProperty("travelerIds")
  public List<String> getTravelerIds() {
    return travelerIds;
  }

  public void setTravelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
  }

  public FreeCheckedBaggageAllowanceItem travelerIds(List<String> travelerIds) {
    this.travelerIds = travelerIds;
    return this;
  }

  public FreeCheckedBaggageAllowanceItem addTravelerIdsItem(String travelerIdsItem) {
    this.travelerIds.add(travelerIdsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeCheckedBaggageAllowanceItem {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    flightIds: ").append(toIndentedString(flightIds)).append("\n");
    sb.append("    travelerIds: ").append(toIndentedString(travelerIds)).append("\n");
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

