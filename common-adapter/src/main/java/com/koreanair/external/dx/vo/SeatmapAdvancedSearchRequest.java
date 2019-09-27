package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightRequest;
import com.koreanair.external.dx.vo.Promotion;
import com.koreanair.external.dx.vo.SeatmapAdvancedSearchTraveler;
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
  * Inputs needed to perform an advanced seatmap search
 **/
@ApiModel(description="Inputs needed to perform an advanced seatmap search")
public class SeatmapAdvancedSearchRequest  {
  
  @ApiModelProperty(required = true, value = "All flights being part of the itinerary")
 /**
   * All flights being part of the itinerary
  **/
  private List<FlightRequest> flights = new ArrayList<>();

  @ApiModelProperty(value = "All travelers being part of the itinerary")
 /**
   * All travelers being part of the itinerary
  **/
  private List<SeatmapAdvancedSearchTraveler> travelers = null;

  @ApiModelProperty(value = "Promotion code and related airline code.  When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. ")
 /**
   * Promotion code and related airline code.  When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. 
  **/
  private Promotion promotion = null;
 /**
   * All flights being part of the itinerary
   * @return flights
  **/
  @JsonProperty("flights")
  public List<FlightRequest> getFlights() {
    return flights;
  }

  public void setFlights(List<FlightRequest> flights) {
    this.flights = flights;
  }

  public SeatmapAdvancedSearchRequest flights(List<FlightRequest> flights) {
    this.flights = flights;
    return this;
  }

  public SeatmapAdvancedSearchRequest addFlightsItem(FlightRequest flightsItem) {
    this.flights.add(flightsItem);
    return this;
  }

 /**
   * All travelers being part of the itinerary
   * @return travelers
  **/
  @JsonProperty("travelers")
  public List<SeatmapAdvancedSearchTraveler> getTravelers() {
    return travelers;
  }

  public void setTravelers(List<SeatmapAdvancedSearchTraveler> travelers) {
    this.travelers = travelers;
  }

  public SeatmapAdvancedSearchRequest travelers(List<SeatmapAdvancedSearchTraveler> travelers) {
    this.travelers = travelers;
    return this;
  }

  public SeatmapAdvancedSearchRequest addTravelersItem(SeatmapAdvancedSearchTraveler travelersItem) {
    this.travelers.add(travelersItem);
    return this;
  }

 /**
   * Promotion code and related airline code.  When a Promotion is injected and is applied, then the price will be discounted accordingly and the applied promotion will appear in the Discount dictionary associated. 
   * @return promotion
  **/
  @JsonProperty("promotion")
  public Promotion getPromotion() {
    return promotion;
  }

  public void setPromotion(Promotion promotion) {
    this.promotion = promotion;
  }

  public SeatmapAdvancedSearchRequest promotion(Promotion promotion) {
    this.promotion = promotion;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapAdvancedSearchRequest {\n");
    
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
    sb.append("    travelers: ").append(toIndentedString(travelers)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
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

