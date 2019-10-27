package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightCommon;
import com.koreanair.external.dx.vo.FlightEndPoint;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LightFlight  {
  
  @ApiModelProperty(required = true, value = "IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)")
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
  **/
  private String marketingAirlineCode = null;

  @ApiModelProperty(value = "IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)")
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
  **/
  private String operatingAirlineCode = null;

  @ApiModelProperty(value = "Airline name if there is no airline code for the operating carrier")
 /**
   * Airline name if there is no airline code for the operating carrier
  **/
  private String operatingAirlineName = null;

  @ApiModelProperty(example = "123", required = true, value = "Marketing flight number")
 /**
   * Marketing flight number
  **/
  private String marketingFlightNumber = null;

  @ApiModelProperty(example = "123", value = "Operating airline flight number")
 /**
   * Operating airline flight number
  **/
  private String operatingAirlineFlightNumber = null;

  @ApiModelProperty(value = "Flight id")
 /**
   * Flight id
  **/
  private String id = null;

  @ApiModelProperty(value = "Open segment")
 /**
   * Open segment
  **/
  private Boolean isOpenSegment = false;

  @ApiModelProperty(value = "Flag indicating if the flight has already been flown.")
 /**
   * Flag indicating if the flight has already been flown.
  **/
  private Boolean isFlown = null;

  @ApiModelProperty(value = "")
  private FlightEndPoint departure = null;

  @ApiModelProperty(value = "")
  private FlightEndPoint arrival = null;

  @ApiModelProperty(value = "Booking class")
 /**
   * Booking class
  **/
  private String bookingClass = null;

  @ApiModelProperty(value = "Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. At shopping time, the only status that can be returned is HL=Wailist ")
 /**
   * Operational status. HK = confirmed, HL = waitlist, TK = schedule change confirmed, schedule change waitlist, UN = unable to confirm not operating, UC = unable to confirm, HX = have cancelled, NO = no action taken. At shopping time, the only status that can be returned is HL=Wailist 
  **/
  private String statusCode = null;
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

  public LightFlight marketingAirlineCode(String marketingAirlineCode) {
    this.marketingAirlineCode = marketingAirlineCode;
    return this;
  }

 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
   * @return operatingAirlineCode
  **/
  @JsonProperty("operatingAirlineCode")
  public String getOperatingAirlineCode() {
    return operatingAirlineCode;
  }

  public void setOperatingAirlineCode(String operatingAirlineCode) {
    this.operatingAirlineCode = operatingAirlineCode;
  }

  public LightFlight operatingAirlineCode(String operatingAirlineCode) {
    this.operatingAirlineCode = operatingAirlineCode;
    return this;
  }

 /**
   * Airline name if there is no airline code for the operating carrier
   * @return operatingAirlineName
  **/
  @JsonProperty("operatingAirlineName")
  public String getOperatingAirlineName() {
    return operatingAirlineName;
  }

  public void setOperatingAirlineName(String operatingAirlineName) {
    this.operatingAirlineName = operatingAirlineName;
  }

  public LightFlight operatingAirlineName(String operatingAirlineName) {
    this.operatingAirlineName = operatingAirlineName;
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

  public LightFlight marketingFlightNumber(String marketingFlightNumber) {
    this.marketingFlightNumber = marketingFlightNumber;
    return this;
  }

 /**
   * Operating airline flight number
   * @return operatingAirlineFlightNumber
  **/
  @JsonProperty("operatingAirlineFlightNumber")
  public String getOperatingAirlineFlightNumber() {
    return operatingAirlineFlightNumber;
  }

  public void setOperatingAirlineFlightNumber(String operatingAirlineFlightNumber) {
    this.operatingAirlineFlightNumber = operatingAirlineFlightNumber;
  }

  public LightFlight operatingAirlineFlightNumber(String operatingAirlineFlightNumber) {
    this.operatingAirlineFlightNumber = operatingAirlineFlightNumber;
    return this;
  }

 /**
   * Flight id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LightFlight id(String id) {
    this.id = id;
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

  public LightFlight isOpenSegment(Boolean isOpenSegment) {
    this.isOpenSegment = isOpenSegment;
    return this;
  }

 /**
   * Flag indicating if the flight has already been flown.
   * @return isFlown
  **/
  @JsonProperty("isFlown")
  public Boolean isIsFlown() {
    return isFlown;
  }

  public void setIsFlown(Boolean isFlown) {
    this.isFlown = isFlown;
  }

  public LightFlight isFlown(Boolean isFlown) {
    this.isFlown = isFlown;
    return this;
  }

 /**
   * Get departure
   * @return departure
  **/
  @JsonProperty("departure")
  public FlightEndPoint getDeparture() {
    return departure;
  }

  public void setDeparture(FlightEndPoint departure) {
    this.departure = departure;
  }

  public LightFlight departure(FlightEndPoint departure) {
    this.departure = departure;
    return this;
  }

 /**
   * Get arrival
   * @return arrival
  **/
  @JsonProperty("arrival")
  public FlightEndPoint getArrival() {
    return arrival;
  }

  public void setArrival(FlightEndPoint arrival) {
    this.arrival = arrival;
  }

  public LightFlight arrival(FlightEndPoint arrival) {
    this.arrival = arrival;
    return this;
  }

 /**
   * Booking class
   * @return bookingClass
  **/
  @JsonProperty("bookingClass")
  public String getBookingClass() {
    return bookingClass;
  }

  public void setBookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
  }

  public LightFlight bookingClass(String bookingClass) {
    this.bookingClass = bookingClass;
    return this;
  }

 /**
   * Operational status. HK &#x3D; confirmed, HL &#x3D; waitlist, TK &#x3D; schedule change confirmed, schedule change waitlist, UN &#x3D; unable to confirm not operating, UC &#x3D; unable to confirm, HX &#x3D; have cancelled, NO &#x3D; no action taken. At shopping time, the only status that can be returned is HL&#x3D;Wailist 
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public LightFlight statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightFlight {\n");
    
    sb.append("    marketingAirlineCode: ").append(toIndentedString(marketingAirlineCode)).append("\n");
    sb.append("    operatingAirlineCode: ").append(toIndentedString(operatingAirlineCode)).append("\n");
    sb.append("    operatingAirlineName: ").append(toIndentedString(operatingAirlineName)).append("\n");
    sb.append("    marketingFlightNumber: ").append(toIndentedString(marketingFlightNumber)).append("\n");
    sb.append("    operatingAirlineFlightNumber: ").append(toIndentedString(operatingAirlineFlightNumber)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOpenSegment: ").append(toIndentedString(isOpenSegment)).append("\n");
    sb.append("    isFlown: ").append(toIndentedString(isFlown)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    bookingClass: ").append(toIndentedString(bookingClass)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

