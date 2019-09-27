package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.CheckInFlight;
import com.koreanair.external.dx.vo.CurrencyDictionaryItem;
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

public class JourneyUnpaidItemsDictionary  {
  
  @ApiModelProperty(value = "Traveler information corresponding to a traveler id.")
 /**
   * Traveler information corresponding to a traveler id.
  **/
  private Map<String, Traveler> traveler = null;

  @ApiModelProperty(value = "Flight information corresponding to a flight id.")
 /**
   * Flight information corresponding to a flight id.
  **/
  private Map<String, CheckInFlight> flight = null;

  @ApiModelProperty(value = "Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, CurrencyDictionaryItem> currency = null;
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

  public JourneyUnpaidItemsDictionary traveler(Map<String, Traveler> traveler) {
    this.traveler = traveler;
    return this;
  }

  public JourneyUnpaidItemsDictionary putTravelerItem(String key, Traveler travelerItem) {
    this.traveler.put(key, travelerItem);
    return this;
  }

 /**
   * Flight information corresponding to a flight id.
   * @return flight
  **/
  @JsonProperty("flight")
  public Map<String, CheckInFlight> getFlight() {
    return flight;
  }

  public void setFlight(Map<String, CheckInFlight> flight) {
    this.flight = flight;
  }

  public JourneyUnpaidItemsDictionary flight(Map<String, CheckInFlight> flight) {
    this.flight = flight;
    return this;
  }

  public JourneyUnpaidItemsDictionary putFlightItem(String key, CheckInFlight flightItem) {
    this.flight.put(key, flightItem);
    return this;
  }

 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return currency
  **/
  @JsonProperty("currency")
  public Map<String, CurrencyDictionaryItem> getCurrency() {
    return currency;
  }

  public void setCurrency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
  }

  public JourneyUnpaidItemsDictionary currency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
    return this;
  }

  public JourneyUnpaidItemsDictionary putCurrencyItem(String key, CurrencyDictionaryItem currencyItem) {
    this.currency.put(key, currencyItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyUnpaidItemsDictionary {\n");
    
    sb.append("    traveler: ").append(toIndentedString(traveler)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

