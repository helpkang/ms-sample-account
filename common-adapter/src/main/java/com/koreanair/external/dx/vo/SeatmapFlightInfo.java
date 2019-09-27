package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightBasicEndPoint;
import com.koreanair.external.dx.vo.FlightCommon;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatmapFlightInfo  {
  
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

  @ApiModelProperty(value = "")
  private FlightBasicEndPoint departure = null;

  @ApiModelProperty(value = "")
  private FlightBasicEndPoint arrival = null;

  @ApiModelProperty(value = "IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)")
 /**
   * IATA aircraft code (http://www.flugzeuginfo.net/table_accodes_iata_en.php)
  **/
  private String aircraftCode = null;

  @ApiModelProperty(example = "2C1", value = "Physical configuration, also called ACV code (aircraft type + fitted configuration)")
 /**
   * Physical configuration, also called ACV code (aircraft type + fitted configuration)
  **/
  private String aircraftConfigurationVersion = null;

  @ApiModelProperty(value = "Cabin used to build availibity and price. Either taken from the Cart, from the Order or determined from booking class")
 /**
   * Cabin used to build availibity and price. Either taken from the Cart, from the Order or determined from booking class
  **/
  private String cabin = null;
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

  public SeatmapFlightInfo marketingAirlineCode(String marketingAirlineCode) {
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

  public SeatmapFlightInfo operatingAirlineCode(String operatingAirlineCode) {
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

  public SeatmapFlightInfo operatingAirlineName(String operatingAirlineName) {
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

  public SeatmapFlightInfo marketingFlightNumber(String marketingFlightNumber) {
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

  public SeatmapFlightInfo operatingAirlineFlightNumber(String operatingAirlineFlightNumber) {
    this.operatingAirlineFlightNumber = operatingAirlineFlightNumber;
    return this;
  }

 /**
   * Get departure
   * @return departure
  **/
  @JsonProperty("departure")
  public FlightBasicEndPoint getDeparture() {
    return departure;
  }

  public void setDeparture(FlightBasicEndPoint departure) {
    this.departure = departure;
  }

  public SeatmapFlightInfo departure(FlightBasicEndPoint departure) {
    this.departure = departure;
    return this;
  }

 /**
   * Get arrival
   * @return arrival
  **/
  @JsonProperty("arrival")
  public FlightBasicEndPoint getArrival() {
    return arrival;
  }

  public void setArrival(FlightBasicEndPoint arrival) {
    this.arrival = arrival;
  }

  public SeatmapFlightInfo arrival(FlightBasicEndPoint arrival) {
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

  public SeatmapFlightInfo aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }

 /**
   * Physical configuration, also called ACV code (aircraft type + fitted configuration)
   * @return aircraftConfigurationVersion
  **/
  @JsonProperty("aircraftConfigurationVersion")
  public String getAircraftConfigurationVersion() {
    return aircraftConfigurationVersion;
  }

  public void setAircraftConfigurationVersion(String aircraftConfigurationVersion) {
    this.aircraftConfigurationVersion = aircraftConfigurationVersion;
  }

  public SeatmapFlightInfo aircraftConfigurationVersion(String aircraftConfigurationVersion) {
    this.aircraftConfigurationVersion = aircraftConfigurationVersion;
    return this;
  }

 /**
   * Cabin used to build availibity and price. Either taken from the Cart, from the Order or determined from booking class
   * @return cabin
  **/
  @JsonProperty("cabin")
  public String getCabin() {
    return cabin;
  }

  public void setCabin(String cabin) {
    this.cabin = cabin;
  }

  public SeatmapFlightInfo cabin(String cabin) {
    this.cabin = cabin;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatmapFlightInfo {\n");
    
    sb.append("    marketingAirlineCode: ").append(toIndentedString(marketingAirlineCode)).append("\n");
    sb.append("    operatingAirlineCode: ").append(toIndentedString(operatingAirlineCode)).append("\n");
    sb.append("    operatingAirlineName: ").append(toIndentedString(operatingAirlineName)).append("\n");
    sb.append("    marketingFlightNumber: ").append(toIndentedString(marketingFlightNumber)).append("\n");
    sb.append("    operatingAirlineFlightNumber: ").append(toIndentedString(operatingAirlineFlightNumber)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    arrival: ").append(toIndentedString(arrival)).append("\n");
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
    sb.append("    aircraftConfigurationVersion: ").append(toIndentedString(aircraftConfigurationVersion)).append("\n");
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
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

