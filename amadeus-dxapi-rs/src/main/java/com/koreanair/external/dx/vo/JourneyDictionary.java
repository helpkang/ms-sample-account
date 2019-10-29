package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CheckInFlight;
import com.koreanair.external.dx.vo.JourneyElement;
import com.koreanair.external.dx.vo.JourneyElementDictionary;
import com.koreanair.external.dx.vo.LocationDictionaryItem;
import com.koreanair.external.dx.vo.Traveler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneyDictionary  {
  
  @ApiModelProperty(value = "Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, CheckInFlight> flight = null;

  @ApiModelProperty(value = "Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> airline = null;

  @ApiModelProperty(value = "Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> aircraft = null;

  @ApiModelProperty(value = "Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, LocationDictionaryItem> location = null;

  @ApiModelProperty(value = "Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> country = null;

  @ApiModelProperty(value = "Traveler information corresponding to a traveler id.")
 /**
   * Traveler information corresponding to a traveler id.
  **/
  private Map<String, Traveler> traveler = null;

  @ApiModelProperty(value = "JourneyElement information corresponding to a journeyElement id.")
 /**
   * JourneyElement information corresponding to a journeyElement id.
  **/
  private Map<String, JourneyElement> journeyElement = null;
 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return flight
  **/
  @JsonProperty("flight")
  public Map<String, CheckInFlight> getFlight() {
    return flight;
  }

  public void setFlight(Map<String, CheckInFlight> flight) {
    this.flight = flight;
  }

  public JourneyDictionary flight(Map<String, CheckInFlight> flight) {
    this.flight = flight;
    return this;
  }

  public JourneyDictionary putFlightItem(String key, CheckInFlight flightItem) {
    this.flight.put(key, flightItem);
    return this;
  }

 /**
   * Airlines map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return airline
  **/
  @JsonProperty("airline")
  public Map<String, String> getAirline() {
    return airline;
  }

  public void setAirline(Map<String, String> airline) {
    this.airline = airline;
  }

  public JourneyDictionary airline(Map<String, String> airline) {
    this.airline = airline;
    return this;
  }

  public JourneyDictionary putAirlineItem(String key, String airlineItem) {
    this.airline.put(key, airlineItem);
    return this;
  }

 /**
   * Aircrafts map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return aircraft
  **/
  @JsonProperty("aircraft")
  public Map<String, String> getAircraft() {
    return aircraft;
  }

  public void setAircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
  }

  public JourneyDictionary aircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
    return this;
  }

  public JourneyDictionary putAircraftItem(String key, String aircraftItem) {
    this.aircraft.put(key, aircraftItem);
    return this;
  }

 /**
   * Locations map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return location
  **/
  @JsonProperty("location")
  public Map<String, LocationDictionaryItem> getLocation() {
    return location;
  }

  public void setLocation(Map<String, LocationDictionaryItem> location) {
    this.location = location;
  }

  public JourneyDictionary location(Map<String, LocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public JourneyDictionary putLocationItem(String key, LocationDictionaryItem locationItem) {
    this.location.put(key, locationItem);
    return this;
  }

 /**
   * Countries map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return country
  **/
  @JsonProperty("country")
  public Map<String, String> getCountry() {
    return country;
  }

  public void setCountry(Map<String, String> country) {
    this.country = country;
  }

  public JourneyDictionary country(Map<String, String> country) {
    this.country = country;
    return this;
  }

  public JourneyDictionary putCountryItem(String key, String countryItem) {
    this.country.put(key, countryItem);
    return this;
  }

 /**
   * Traveler information corresponding to a traveler id.
   * @return traveler
  **/
  @JsonProperty("traveler")
  public Map<String, Traveler> getTraveler() {
    return traveler;
  }

  public void setTraveler(Map<String, Traveler> traveler) {
    this.traveler = traveler;
  }

  public JourneyDictionary traveler(Map<String, Traveler> traveler) {
    this.traveler = traveler;
    return this;
  }

  public JourneyDictionary putTravelerItem(String key, Traveler travelerItem) {
    this.traveler.put(key, travelerItem);
    return this;
  }

 /**
   * JourneyElement information corresponding to a journeyElement id.
   * @return journeyElement
  **/
  @JsonProperty("journeyElement")
  public Map<String, JourneyElement> getJourneyElement() {
    return journeyElement;
  }

  public void setJourneyElement(Map<String, JourneyElement> journeyElement) {
    this.journeyElement = journeyElement;
  }

  public JourneyDictionary journeyElement(Map<String, JourneyElement> journeyElement) {
    this.journeyElement = journeyElement;
    return this;
  }

  public JourneyDictionary putJourneyElementItem(String key, JourneyElement journeyElementItem) {
    this.journeyElement.put(key, journeyElementItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyDictionary {\n");
    
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    aircraft: ").append(toIndentedString(aircraft)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    traveler: ").append(toIndentedString(traveler)).append("\n");
    sb.append("    journeyElement: ").append(toIndentedString(journeyElement)).append("\n");
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

