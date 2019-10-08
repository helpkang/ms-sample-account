package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AirPricingRecords;
import com.koreanair.external.dx.vo.BoundCommon;
import com.koreanair.external.dx.vo.DisruptionStatus;
import com.koreanair.external.dx.vo.FlightItem;
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
  * Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound). Only flight reference ids are provided: for the full flight content please refer to the flightDictionary 
 **/
@ApiModel(description="Each bound corresponds to a group of flights. A one way trip contains one single bound. A round trip or open jaw trip contains two bounds (outbound and inbound). Only flight reference ids are provided: for the full flight content please refer to the flightDictionary ")
public class Bound  {
  
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

  @ApiModelProperty(required = true, value = "Flights, and for each flight, associated services")
 /**
   * Flights, and for each flight, associated services
  **/
  private List<FlightItem> flights = new ArrayList<>();

  @ApiModelProperty(value = "Duration of the entire journey expressed in seconds")
 /**
   * Duration of the entire journey expressed in seconds
  **/
  private Integer duration = null;

  @ApiModelProperty(value = "Information related to the disruption that occurred on this bound")
 /**
   * Information related to the disruption that occurred on this bound
  **/
  private DisruptionStatus disruptionStatus = null;

  @ApiModelProperty(value = "Ranking of the flight bound based on Carrier Preferred Display rules defined by airline, numbering starts from 1 which indicates the preferred bound solution. ")
 /**
   * Ranking of the flight bound based on Carrier Preferred Display rules defined by airline, numbering starts from 1 which indicates the preferred bound solution. 
  **/
  private Integer ranking = null;
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

  public Bound airBoundId(String airBoundId) {
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

  public Bound fareFamilyCode(String fareFamilyCode) {
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

  public Bound prices(AirPricingRecords prices) {
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

  public Bound originLocationCode(String originLocationCode) {
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

  public Bound destinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
    return this;
  }

 /**
   * Flights, and for each flight, associated services
   * @return flights
  **/
  @JsonProperty("flights")
  public List<FlightItem> getFlights() {
    return flights;
  }

  public void setFlights(List<FlightItem> flights) {
    this.flights = flights;
  }

  public Bound flights(List<FlightItem> flights) {
    this.flights = flights;
    return this;
  }

  public Bound addFlightsItem(FlightItem flightsItem) {
    this.flights.add(flightsItem);
    return this;
  }

 /**
   * Duration of the entire journey expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Bound duration(Integer duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Information related to the disruption that occurred on this bound
   * @return disruptionStatus
  **/
  @JsonProperty("disruptionStatus")
  public DisruptionStatus getDisruptionStatus() {
    return disruptionStatus;
  }

  public void setDisruptionStatus(DisruptionStatus disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
  }

  public Bound disruptionStatus(DisruptionStatus disruptionStatus) {
    this.disruptionStatus = disruptionStatus;
    return this;
  }

 /**
   * Ranking of the flight bound based on Carrier Preferred Display rules defined by airline, numbering starts from 1 which indicates the preferred bound solution. 
   * @return ranking
  **/
  @JsonProperty("ranking")
  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }

  public Bound ranking(Integer ranking) {
    this.ranking = ranking;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bound {\n");
    
    sb.append("    airBoundId: ").append(toIndentedString(airBoundId)).append("\n");
    sb.append("    fareFamilyCode: ").append(toIndentedString(fareFamilyCode)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    disruptionStatus: ").append(toIndentedString(disruptionStatus)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
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

