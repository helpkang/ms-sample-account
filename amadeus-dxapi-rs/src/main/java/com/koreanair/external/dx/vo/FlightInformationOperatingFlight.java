package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.FlightInformationAirlineCommon;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightInformationOperatingFlight  {
  
  @ApiModelProperty(required = true, value = "IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)")
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
  **/
  private String airlineCode = null;

  @ApiModelProperty(example = "123", required = true, value = "flight number")
 /**
   * flight number
  **/
  private String flightNumber = null;
 /**
   * IATA airline code (http://www.iata.org/publications/Pages/code-search.aspx)
   * @return airlineCode
  **/
  @JsonProperty("airlineCode")
  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public FlightInformationOperatingFlight airlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
    return this;
  }

 /**
   * flight number
   * @return flightNumber
  **/
  @JsonProperty("flightNumber")
  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public FlightInformationOperatingFlight flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightInformationOperatingFlight {\n");
    
    sb.append("    airlineCode: ").append(toIndentedString(airlineCode)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
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

