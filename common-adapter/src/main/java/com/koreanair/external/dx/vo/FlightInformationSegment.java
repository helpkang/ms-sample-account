package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightInformationAirlineCommon;
import com.koreanair.external.dx.vo.FlightInformationArrivalEndPoint;
import com.koreanair.external.dx.vo.FlightInformationDepartureEndPoint;
import com.koreanair.external.dx.vo.FlightInformationFlightStop;
import com.koreanair.external.dx.vo.FlightInformationOperatingFlight;
import com.koreanair.external.dx.vo.FlightPerformanceIndicator;
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
  * Flight information corresponding to a flight id. A flight element may be composed of several legs (FlightEndPoint). 
 **/
@ApiModel(description="Flight information corresponding to a flight id. A flight element may be composed of several legs (FlightEndPoint). ")
public class FlightInformationSegment  {
  
  @ApiModelProperty(value = "")
  private FlightInformationDepartureEndPoint departure = null;

  @ApiModelProperty(value = "")
  private FlightInformationArrivalEndPoint arrival = null;

  @ApiModelProperty(value = "Information about the flight")
 /**
   * Information about the flight
  **/
  private FlightInformationAirlineCommon marketingFlight = null;

  @ApiModelProperty(value = "Information about the operating flight")
 /**
   * Information about the operating flight
  **/
  private FlightInformationOperatingFlight operatingFlight = null;

  @ApiModelProperty(value = "Open segment")
 /**
   * Open segment
  **/
  private Boolean isOpenSegment = false;

  @ApiModelProperty(value = "Flag indicating if some travel documents are needed for this flight")
 /**
   * Flag indicating if some travel documents are needed for this flight
  **/
  private Boolean secureFlightIndicator = false;

  @ApiModelProperty(value = "")
  private FlightPerformanceIndicator performanceIndicator = null;

  @ApiModelProperty(value = "IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)")
 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
  **/
  private String aircraftCode = null;

  @ApiModelProperty(value = "Details of stops for direct or change of gauge flights")
 /**
   * Details of stops for direct or change of gauge flights
  **/
  private List<FlightInformationFlightStop> stops = null;

  @ApiModelProperty(value = "Duration time expressed in seconds")
 /**
   * Duration time expressed in seconds
  **/
  private Integer duration = null;
 /**
   * Get departure
   * @return departure
  **/
  @JsonProperty("departure")
  public FlightInformationDepartureEndPoint getDeparture() {
    return departure;
  }

  public void setDeparture(FlightInformationDepartureEndPoint departure) {
    this.departure = departure;
  }

  public FlightInformationSegment departure(FlightInformationDepartureEndPoint departure) {
    this.departure = departure;
    return this;
  }

 /**
   * Get arrival
   * @return arrival
  **/
  @JsonProperty("arrival")
  public FlightInformationArrivalEndPoint getArrival() {
    return arrival;
  }

  public void setArrival(FlightInformationArrivalEndPoint arrival) {
    this.arrival = arrival;
  }

  public FlightInformationSegment arrival(FlightInformationArrivalEndPoint arrival) {
    this.arrival = arrival;
    return this;
  }

 /**
   * Information about the flight
   * @return marketingFlight
  **/
  @JsonProperty("marketingFlight")
  public FlightInformationAirlineCommon getMarketingFlight() {
    return marketingFlight;
  }

  public void setMarketingFlight(FlightInformationAirlineCommon marketingFlight) {
    this.marketingFlight = marketingFlight;
  }

  public FlightInformationSegment marketingFlight(FlightInformationAirlineCommon marketingFlight) {
    this.marketingFlight = marketingFlight;
    return this;
  }

 /**
   * Information about the operating flight
   * @return operatingFlight
  **/
  @JsonProperty("operatingFlight")
  public FlightInformationOperatingFlight getOperatingFlight() {
    return operatingFlight;
  }

  public void setOperatingFlight(FlightInformationOperatingFlight operatingFlight) {
    this.operatingFlight = operatingFlight;
  }

  public FlightInformationSegment operatingFlight(FlightInformationOperatingFlight operatingFlight) {
    this.operatingFlight = operatingFlight;
    return this;
  }

 /**
   * Open segment
   * @return isOpenSegment
  **/
  @JsonProperty("isOpenSegment")
  public Boolean isIsOpenSegment() {
    return isOpenSegment;
  }

  public void setIsOpenSegment(Boolean isOpenSegment) {
    this.isOpenSegment = isOpenSegment;
  }

  public FlightInformationSegment isOpenSegment(Boolean isOpenSegment) {
    this.isOpenSegment = isOpenSegment;
    return this;
  }

 /**
   * Flag indicating if some travel documents are needed for this flight
   * @return secureFlightIndicator
  **/
  @JsonProperty("secureFlightIndicator")
  public Boolean isSecureFlightIndicator() {
    return secureFlightIndicator;
  }

  public void setSecureFlightIndicator(Boolean secureFlightIndicator) {
    this.secureFlightIndicator = secureFlightIndicator;
  }

  public FlightInformationSegment secureFlightIndicator(Boolean secureFlightIndicator) {
    this.secureFlightIndicator = secureFlightIndicator;
    return this;
  }

 /**
   * Get performanceIndicator
   * @return performanceIndicator
  **/
  @JsonProperty("performanceIndicator")
  public FlightPerformanceIndicator getPerformanceIndicator() {
    return performanceIndicator;
  }

  public void setPerformanceIndicator(FlightPerformanceIndicator performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
  }

  public FlightInformationSegment performanceIndicator(FlightPerformanceIndicator performanceIndicator) {
    this.performanceIndicator = performanceIndicator;
    return this;
  }

 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
   * @return aircraftCode
  **/
  @JsonProperty("aircraftCode")
  public String getAircraftCode() {
    return aircraftCode;
  }

  public void setAircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
  }

  public FlightInformationSegment aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }

 /**
   * Details of stops for direct or change of gauge flights
   * @return stops
  **/
  @JsonProperty("stops")
  public List<FlightInformationFlightStop> getStops() {
    return stops;
  }

  public void setStops(List<FlightInformationFlightStop> stops) {
    this.stops = stops;
  }

  public FlightInformationSegment stops(List<FlightInformationFlightStop> stops) {
    this.stops = stops;
    return this;
  }

  public FlightInformationSegment addStopsItem(FlightInformationFlightStop stopsItem) {
    this.stops.add(stopsItem);
    return this;
  }

 /**
   * Duration time expressed in seconds
   * @return duration
  **/
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public FlightInformationSegment duration(Integer duration) {
    this.duration = duration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformationSegment {\n");
    
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    marketingFlight: ").append(toIndentedString(marketingFlight)).append("\n");
    sb.append("    operatingFlight: ").append(toIndentedString(operatingFlight)).append("\n");
    sb.append("    isOpenSegment: ").append(toIndentedString(isOpenSegment)).append("\n");
    sb.append("    secureFlightIndicator: ").append(toIndentedString(secureFlightIndicator)).append("\n");
    sb.append("    performanceIndicator: ").append(toIndentedString(performanceIndicator)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

