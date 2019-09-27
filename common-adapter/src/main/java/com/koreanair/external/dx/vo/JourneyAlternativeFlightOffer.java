package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.Amount;
import com.koreanair.external.dx.vo.CheckInFlightIdObject;
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
  * Alternative flight offer for this journey
 **/
@ApiModel(description="Alternative flight offer for this journey")
public class JourneyAlternativeFlightOffer  {
  
  @ApiModelProperty(required = true, value = "Identifier of this offer")
 /**
   * Identifier of this offer
  **/
  private String id = null;

  @ApiModelProperty(value = "Price of this offer. There may be multiple amounts involved,  e.g. miles + cash")
 /**
   * Price of this offer. There may be multiple amounts involved,  e.g. miles + cash
  **/
  private List<Amount> prices = null;

  @ApiModelProperty(value = "Ordered list of the original flights that would be replaced.")
 /**
   * Ordered list of the original flights that would be replaced.
  **/
  private List<CheckInFlightIdObject> originalFlights = null;

  @ApiModelProperty(required = true, value = "Ordered list of new flights in this alternative offer.")
 /**
   * Ordered list of new flights in this alternative offer.
  **/
  private List<CheckInFlightIdObject> flights = new ArrayList<>();
 /**
   * Identifier of this offer
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JourneyAlternativeFlightOffer id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Price of this offer. There may be multiple amounts involved,  e.g. miles + cash
   * @return prices
  **/
  @JsonProperty("prices")
  public List<Amount> getPrices() {
    return prices;
  }

  public void setPrices(List<Amount> prices) {
    this.prices = prices;
  }

  public JourneyAlternativeFlightOffer prices(List<Amount> prices) {
    this.prices = prices;
    return this;
  }

  public JourneyAlternativeFlightOffer addPricesItem(Amount pricesItem) {
    this.prices.add(pricesItem);
    return this;
  }

 /**
   * Ordered list of the original flights that would be replaced.
   * @return originalFlights
  **/
  @JsonProperty("originalFlights")
  public List<CheckInFlightIdObject> getOriginalFlights() {
    return originalFlights;
  }

  public void setOriginalFlights(List<CheckInFlightIdObject> originalFlights) {
    this.originalFlights = originalFlights;
  }

  public JourneyAlternativeFlightOffer originalFlights(List<CheckInFlightIdObject> originalFlights) {
    this.originalFlights = originalFlights;
    return this;
  }

  public JourneyAlternativeFlightOffer addOriginalFlightsItem(CheckInFlightIdObject originalFlightsItem) {
    this.originalFlights.add(originalFlightsItem);
    return this;
  }

 /**
   * Ordered list of new flights in this alternative offer.
   * @return flights
  **/
  @JsonProperty("flights")
  public List<CheckInFlightIdObject> getFlights() {
    return flights;
  }

  public void setFlights(List<CheckInFlightIdObject> flights) {
    this.flights = flights;
  }

  public JourneyAlternativeFlightOffer flights(List<CheckInFlightIdObject> flights) {
    this.flights = flights;
    return this;
  }

  public JourneyAlternativeFlightOffer addFlightsItem(CheckInFlightIdObject flightsItem) {
    this.flights.add(flightsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAlternativeFlightOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    originalFlights: ").append(toIndentedString(originalFlights)).append("\n");
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
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

