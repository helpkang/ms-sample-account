package com.koreanair.external.dx.vo;

import com.koreanair.external.dx.vo.AnonymousTraveler;
import com.koreanair.external.dx.vo.CurrencyDictionaryItem;
import com.koreanair.external.dx.vo.DictionaryCommon;
import com.koreanair.external.dx.vo.DiscountDictionaryItem;
import com.koreanair.external.dx.vo.FareFamilyDictionaryItem;
import com.koreanair.external.dx.vo.Flight;
import com.koreanair.external.dx.vo.Hotel;
import com.koreanair.external.dx.vo.LocationDictionaryItem;
import com.koreanair.external.dx.vo.SeatCharacteristicDictionaryItem;
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

public class CartDictionary  {
  
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

  @ApiModelProperty(value = "Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, Flight> flight = null;

  @ApiModelProperty(value = "Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> tax = null;

  @ApiModelProperty(value = "Surcharges map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Surcharges map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, String> surcharge = null;

  @ApiModelProperty(value = "Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Currencies map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, CurrencyDictionaryItem> currency = null;

  @ApiModelProperty(value = "Basic information about an anonymous traveler such as the passenger type code and the frequent flyer card(s). Frequent flyer cards applies only for a particular case: a transaction based on a cart already containing frequent flyer card(s) but not yet traveler(s). For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Basic information about an anonymous traveler such as the passenger type code and the frequent flyer card(s). Frequent flyer cards applies only for a particular case: a transaction based on a cart already containing frequent flyer card(s) but not yet traveler(s). For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, AnonymousTraveler> anonymousTraveler = null;

  @ApiModelProperty(value = "Details about the discounts. The reference currency is the one defined at Price level. ")
 /**
   * Details about the discounts. The reference currency is the one defined at Price level. 
  **/
  private Map<String, DiscountDictionaryItem> discount = null;

  @ApiModelProperty(value = "Information about a traveler such as first and last name. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Information about a traveler such as first and last name. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, Traveler> traveler = null;

  @ApiModelProperty(value = "Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic = null;

  @ApiModelProperty(value = "Fare families map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)")
 /**
   * Fare families map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
  **/
  private Map<String, FareFamilyDictionaryItem> fareFamily = null;

  @ApiModelProperty(value = "Hotel details information map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)")
 /**
   * Hotel details information map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
  **/
  private Map<String, Hotel> hotelDetails = null;
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

  public CartDictionary location(Map<String, LocationDictionaryItem> location) {
    this.location = location;
    return this;
  }

  public CartDictionary putLocationItem(String key, LocationDictionaryItem locationItem) {
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

  public CartDictionary country(Map<String, String> country) {
    this.country = country;
    return this;
  }

  public CartDictionary putCountryItem(String key, String countryItem) {
    this.country.put(key, countryItem);
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

  public CartDictionary airline(Map<String, String> airline) {
    this.airline = airline;
    return this;
  }

  public CartDictionary putAirlineItem(String key, String airlineItem) {
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

  public CartDictionary aircraft(Map<String, String> aircraft) {
    this.aircraft = aircraft;
    return this;
  }

  public CartDictionary putAircraftItem(String key, String aircraftItem) {
    this.aircraft.put(key, aircraftItem);
    return this;
  }

 /**
   * Flight information corresponding to a flight id. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return flight
  **/
  @JsonProperty("flight")
  public Map<String, Flight> getFlight() {
    return flight;
  }

  public void setFlight(Map<String, Flight> flight) {
    this.flight = flight;
  }

  public CartDictionary flight(Map<String, Flight> flight) {
    this.flight = flight;
    return this;
  }

  public CartDictionary putFlightItem(String key, Flight flightItem) {
    this.flight.put(key, flightItem);
    return this;
  }

 /**
   * Taxes map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return tax
  **/
  @JsonProperty("tax")
  public Map<String, String> getTax() {
    return tax;
  }

  public void setTax(Map<String, String> tax) {
    this.tax = tax;
  }

  public CartDictionary tax(Map<String, String> tax) {
    this.tax = tax;
    return this;
  }

  public CartDictionary putTaxItem(String key, String taxItem) {
    this.tax.put(key, taxItem);
    return this;
  }

 /**
   * Surcharges map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return surcharge
  **/
  @JsonProperty("surcharge")
  public Map<String, String> getSurcharge() {
    return surcharge;
  }

  public void setSurcharge(Map<String, String> surcharge) {
    this.surcharge = surcharge;
  }

  public CartDictionary surcharge(Map<String, String> surcharge) {
    this.surcharge = surcharge;
    return this;
  }

  public CartDictionary putSurchargeItem(String key, String surchargeItem) {
    this.surcharge.put(key, surchargeItem);
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

  public CartDictionary currency(Map<String, CurrencyDictionaryItem> currency) {
    this.currency = currency;
    return this;
  }

  public CartDictionary putCurrencyItem(String key, CurrencyDictionaryItem currencyItem) {
    this.currency.put(key, currencyItem);
    return this;
  }

 /**
   * Basic information about an anonymous traveler such as the passenger type code and the frequent flyer card(s). Frequent flyer cards applies only for a particular case: a transaction based on a cart already containing frequent flyer card(s) but not yet traveler(s). For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return anonymousTraveler
  **/
  @JsonProperty("anonymousTraveler")
  public Map<String, AnonymousTraveler> getAnonymousTraveler() {
    return anonymousTraveler;
  }

  public void setAnonymousTraveler(Map<String, AnonymousTraveler> anonymousTraveler) {
    this.anonymousTraveler = anonymousTraveler;
  }

  public CartDictionary anonymousTraveler(Map<String, AnonymousTraveler> anonymousTraveler) {
    this.anonymousTraveler = anonymousTraveler;
    return this;
  }

  public CartDictionary putAnonymousTravelerItem(String key, AnonymousTraveler anonymousTravelerItem) {
    this.anonymousTraveler.put(key, anonymousTravelerItem);
    return this;
  }

 /**
   * Details about the discounts. The reference currency is the one defined at Price level. 
   * @return discount
  **/
  @JsonProperty("discount")
  public Map<String, DiscountDictionaryItem> getDiscount() {
    return discount;
  }

  public void setDiscount(Map<String, DiscountDictionaryItem> discount) {
    this.discount = discount;
  }

  public CartDictionary discount(Map<String, DiscountDictionaryItem> discount) {
    this.discount = discount;
    return this;
  }

  public CartDictionary putDiscountItem(String key, DiscountDictionaryItem discountItem) {
    this.discount.put(key, discountItem);
    return this;
  }

 /**
   * Information about a traveler such as first and last name. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return traveler
  **/
  @JsonProperty("traveler")
  public Map<String, Traveler> getTraveler() {
    return traveler;
  }

  public void setTraveler(Map<String, Traveler> traveler) {
    this.traveler = traveler;
  }

  public CartDictionary traveler(Map<String, Traveler> traveler) {
    this.traveler = traveler;
    return this;
  }

  public CartDictionary putTravelerItem(String key, Traveler travelerItem) {
    this.traveler.put(key, travelerItem);
    return this;
  }

 /**
   * Seat characteristics map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return seatCharacteristic
  **/
  @JsonProperty("seatCharacteristic")
  public Map<String, SeatCharacteristicDictionaryItem> getSeatCharacteristic() {
    return seatCharacteristic;
  }

  public void setSeatCharacteristic(Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic) {
    this.seatCharacteristic = seatCharacteristic;
  }

  public CartDictionary seatCharacteristic(Map<String, SeatCharacteristicDictionaryItem> seatCharacteristic) {
    this.seatCharacteristic = seatCharacteristic;
    return this;
  }

  public CartDictionary putSeatCharacteristicItem(String key, SeatCharacteristicDictionaryItem seatCharacteristicItem) {
    this.seatCharacteristic.put(key, seatCharacteristicItem);
    return this;
  }

 /**
   * Fare families map. For more details please see [Maps in dictionary documentation](http://e-travel.mkt.amadeus.net/dxapi/display/documentation.html#!/Maps/get)
   * @return fareFamily
  **/
  @JsonProperty("fareFamily")
  public Map<String, FareFamilyDictionaryItem> getFareFamily() {
    return fareFamily;
  }

  public void setFareFamily(Map<String, FareFamilyDictionaryItem> fareFamily) {
    this.fareFamily = fareFamily;
  }

  public CartDictionary fareFamily(Map<String, FareFamilyDictionaryItem> fareFamily) {
    this.fareFamily = fareFamily;
    return this;
  }

  public CartDictionary putFareFamilyItem(String key, FareFamilyDictionaryItem fareFamilyItem) {
    this.fareFamily.put(key, fareFamilyItem);
    return this;
  }

 /**
   * Hotel details information map. For more details please see [Maps in dictionary documentation](http://aek.lon.amadeus.net/swagger/ui/documentation.html#!/Maps/get)
   * @return hotelDetails
  **/
  @JsonProperty("hotelDetails")
  public Map<String, Hotel> getHotelDetails() {
    return hotelDetails;
  }

  public void setHotelDetails(Map<String, Hotel> hotelDetails) {
    this.hotelDetails = hotelDetails;
  }

  public CartDictionary hotelDetails(Map<String, Hotel> hotelDetails) {
    this.hotelDetails = hotelDetails;
    return this;
  }

  public CartDictionary putHotelDetailsItem(String key, Hotel hotelDetailsItem) {
    this.hotelDetails.put(key, hotelDetailsItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartDictionary {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
    sb.append("    aircraft: ").append(toIndentedString(aircraft)).append("\n");
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    surcharge: ").append(toIndentedString(surcharge)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    anonymousTraveler: ").append(toIndentedString(anonymousTraveler)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    traveler: ").append(toIndentedString(traveler)).append("\n");
    sb.append("    seatCharacteristic: ").append(toIndentedString(seatCharacteristic)).append("\n");
    sb.append("    fareFamily: ").append(toIndentedString(fareFamily)).append("\n");
    sb.append("    hotelDetails: ").append(toIndentedString(hotelDetails)).append("\n");
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

