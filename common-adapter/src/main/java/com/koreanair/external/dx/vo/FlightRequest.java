package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FareClassSelection;
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
  * Flight related input required to perform a search
 **/
@ApiModel(description="Flight related input required to perform a search")
public class FlightRequest  {
  
  @ApiModelProperty(example = "AY", required = true, value = "IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)")
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
  **/
  private String marketingAirlineCode = null;

  @ApiModelProperty(example = "827", required = true, value = "Marketing flight number")
 /**
   * Marketing flight number
  **/
  private String marketingFlightNumber = null;

  @ApiModelProperty(example = "HEL", required = true, value = "Departure location code of the flight (airport code)")
 /**
   * Departure location code of the flight (airport code)
  **/
  private String originLocationCode = null;

  @ApiModelProperty(example = "LON", required = true, value = "Destination location code of the flight (airport code), in case of a round trip this is also the departure location code of second bound")
 /**
   * Destination location code of the flight (airport code), in case of a round trip this is also the departure location code of second bound
  **/
  private String destinationLocationCode = null;

  @ApiModelProperty(example = "2016-07-01", required = true, value = "Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone")
 /**
   * Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone
  **/
  private LocalDate departureDate = null;

  @ApiModelProperty(example = "J", value = "Booking class for seat reservation. Used to refine seat map results. If not specified, \"Y\" (Economy) booking class is used by default")
 /**
   * Booking class for seat reservation. Used to refine seat map results. If not specified, \"Y\" (Economy) booking class is used by default
  **/
  private String bookingClass = null;

  @ApiModelProperty(required = true, value = "Defines which flight should be used for the seatmap computation. Only one flight can have isRequestedFlight = true.")
 /**
   * Defines which flight should be used for the seatmap computation. Only one flight can have isRequestedFlight = true.
  **/
  private Boolean isRequestedFlight = null;

  @ApiModelProperty(value = "Defines the association between the fare basis to be used for the travelers while computing the seatmap for this flight")
 /**
   * Defines the association between the fare basis to be used for the travelers while computing the seatmap for this flight
  **/
  private List<FareClassSelection> fareClassSelections = null;
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
   * @return marketingAirlineCode
  **/
  @JsonProperty("marketingAirlineCode")
  public String getMarketingAirlineCode() {
    return marketingAirlineCode;
  }

  public void setMarketingAirlineCode(String marketingAirlineCode) {
    this.marketingAirlineCode = marketingAirlineCode;
  }

  public FlightRequest marketingAirlineCode(String marketingAirlineCode) {
    this.marketingAirlineCode = marketingAirlineCode;
    return this;
  }

 /**
   * Marketing flight number
   * @return marketingFlightNumber
  **/
  @JsonProperty("marketingFlightNumber")
  public String getMarketingFlightNumber() {
    return marketingFlightNumber;
  }

  public void setMarketingFlightNumber(String marketingFlightNumber) {
    this.marketingFlightNumber = marketingFlightNumber;
  }

  public FlightRequest marketingFlightNumber(String marketingFlightNumber) {
    this.marketingFlightNumber = marketingFlightNumber;
    return this;
  }

 /**
   * Departure location code of the flight (airport code)
   * @return originLocationCode
  **/
  @JsonProperty("originLocationCode")
  public String getOriginLocationCode() {
    return originLocationCode;
  }

  public void setOriginLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
  }

  public FlightRequest originLocationCode(String originLocationCode) {
    this.originLocationCode = originLocationCode;
    return this;
  }

 /**
   * Destination location code of the flight (airport code), in case of a round trip this is also the departure location code of second bound
   * @return destinationLocationCode
  **/
  @JsonProperty("destinationLocationCode")
  public String getDestinationLocationCode() {
    return destinationLocationCode;
  }

  public void setDestinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
  }

  public FlightRequest destinationLocationCode(String destinationLocationCode) {
    this.destinationLocationCode = destinationLocationCode;
    return this;
  }

 /**
   * Departure flight date in ISO 8601 (http://www.w3.org/TR/NOTE-datetime) without timezone
   * @return departureDate
  **/
  @JsonProperty("departureDate")
  public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public FlightRequest departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

 /**
   * Booking class for seat reservation. Used to refine seat map results. If not specified, \&quot;Y\&quot; (Economy) booking class is used by default
   * @return bookingClass
  **/
  @JsonProperty("bookingClass")
  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

  public FlightRequest bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

 /**
   * Defines which flight should be used for the seatmap computation. Only one flight can have isRequestedFlight &#x3D; true.
   * @return isRequestedFlight
  **/
  @JsonProperty("isRequestedFlight")
  public Boolean isIsRequestedFlight() {
    return isRequestedFlight;
  }

  public void setIsRequestedFlight(Boolean isRequestedFlight) {
    this.isRequestedFlight = isRequestedFlight;
  }

  public FlightRequest isRequestedFlight(Boolean isRequestedFlight) {
    this.isRequestedFlight = isRequestedFlight;
    return this;
  }

 /**
   * Defines the association between the fare basis to be used for the travelers while computing the seatmap for this flight
   * @return fareClassSelections
  **/
  @JsonProperty("fareClassSelections")
  public List<FareClassSelection> getFareClassSelections() {
    return fareClassSelections;
  }

  public void setFareClassSelections(List<FareClassSelection> fareClassSelections) {
    this.fareClassSelections = fareClassSelections;
  }

  public FlightRequest fareClassSelections(List<FareClassSelection> fareClassSelections) {
    this.fareClassSelections = fareClassSelections;
    return this;
  }

  public FlightRequest addFareClassSelectionsItem(FareClassSelection fareClassSelectionsItem) {
    this.fareClassSelections.add(fareClassSelectionsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightRequest {\n");
    
    sb.append("    marketingAirlineCode: ").append(toIndentedString(marketingAirlineCode)).append("\n");
    sb.append("    marketingFlightNumber: ").append(toIndentedString(marketingFlightNumber)).append("\n");
    sb.append("    originLocationCode: ").append(toIndentedString(originLocationCode)).append("\n");
    sb.append("    destinationLocationCode: ").append(toIndentedString(destinationLocationCode)).append("\n");
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    isRequestedFlight: ").append(toIndentedString(isRequestedFlight)).append("\n");
    sb.append("    fareClassSelections: ").append(toIndentedString(fareClassSelections)).append("\n");
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

