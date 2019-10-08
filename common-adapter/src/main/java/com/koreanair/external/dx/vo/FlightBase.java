package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightCommon;
import com.koreanair.external.dx.vo.FlightEndPoint;
import io.swagger.annotations.ApiModel;

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
  * Flight basic information corresponding to a flight id. A flight element may be composed of several legs (FlightEndPoint). 
 **/
@ApiModel(description="Flight basic information corresponding to a flight id. A flight element may be composed of several legs (FlightEndPoint). ")
public class FlightBase  {
  
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

  @ApiModelProperty(required = true, value = "")
  private FlightEndPoint departure = null;

  @ApiModelProperty(required = true, value = "")
  private FlightEndPoint arrival = null;

  @ApiModelProperty(value = "IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)")
 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
  **/
  private String aircraftCode = null;

  @ApiModelProperty(value = "Duration time expressed in seconds")
 /**
   * Duration time expressed in seconds
  **/
  private Integer duration = null;
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

  public FlightBase marketingAirlineCode(String marketingAirlineCode) {
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

  public FlightBase operatingAirlineCode(String operatingAirlineCode) {
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

  public FlightBase operatingAirlineName(String operatingAirlineName) {
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

  public FlightBase marketingFlightNumber(String marketingFlightNumber) {
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

  public FlightBase operatingAirlineFlightNumber(String operatingAirlineFlightNumber) {
    this.operatingAirlineFlightNumber = operatingAirlineFlightNumber;
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

  public FlightBase departure(FlightEndPoint departure) {
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

  public FlightBase arrival(FlightEndPoint arrival) {
    this.arrival = arrival;
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

  public FlightBase aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
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

  public FlightBase duration(Integer duration) {
    this.duration = duration;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightBase {\n");
    
    sb.append("    marketingAirlineCode: ").append(toIndentedString(marketingAirlineCode)).append("\n");
    sb.append("    operatingAirlineCode: ").append(toIndentedString(operatingAirlineCode)).append("\n");
    sb.append("    operatingAirlineName: ").append(toIndentedString(operatingAirlineName)).append("\n");
    sb.append("    marketingFlightNumber: ").append(toIndentedString(marketingFlightNumber)).append("\n");
    sb.append("    operatingAirlineFlightNumber: ").append(toIndentedString(operatingAirlineFlightNumber)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
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

